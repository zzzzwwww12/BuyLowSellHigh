/**
 * 
 */
package com.coin.arbitrage.huobi.service.impl;

import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_HOST;
import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL;
import static com.coin.arbitrage.huobi.util.HuobiConstants.JSON;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.xml.bind.DatatypeConverter;

import com.coin.arbitrage.huobi.domain.ApiResponse;
import com.coin.arbitrage.huobi.domain.ApiSignature;
import com.coin.arbitrage.huobi.domain.CreateOrderRequest;
import com.coin.arbitrage.huobi.exception.HuoBiException;
import com.coin.arbitrage.huobi.service.OkHttpClientHelper;
import com.coin.arbitrage.huobi.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * @author Frank
 *
 */
public class JsonTransfer {

	

	public static final OkHttpClient client = OkHttpClientHelper.createOkHttpClient();

	private final String accessKeyId;
	private final String accessKeySecret;
	private final String assetPassword;

	/**
	 * 创建一个ApiClient实例
	 * 
	 * @param accessKeyId
	 *            AccessKeyId
	 * @param accessKeySecret
	 *            AccessKeySecret
	 */
	public JsonTransfer(String accessKeyId, String accessKeySecret) {
		this.accessKeyId = accessKeyId;
		this.accessKeySecret = accessKeySecret;
		this.assetPassword = null;
	}

	/**
	 * 创建一个ApiClient实例
	 * 
	 * @param accessKeyId
	 *            AccessKeyId
	 * @param accessKeySecret
	 *            AccessKeySecret
	 * @param assetPassword
	 *            AssetPassword
	 */
	public JsonTransfer(String accessKeyId, String accessKeySecret, String assetPassword) {
		this.accessKeyId = accessKeyId;
		this.accessKeySecret = accessKeySecret;
		this.assetPassword = assetPassword;
	}
	
	
	//get market history
	
	

	/**
	 * 创建订单（未执行)
	 * 
	 * @param request
	 *            CreateOrderRequest object.
	 * @return Order id.
	 */
	public Long createOrder(CreateOrderRequest request) {
		ApiResponse<Long> resp = post("/v1/order/orders", request, new TypeReference<ApiResponse<Long>>() {
		});
		return resp.checkAndReturn();
	}

	/**
	 * 执行订单
	 * 
	 * @param orderId
	 *            The id of created order.
	 * @return Order id.
	 */
	public String placeOrder(long orderId) {
		ApiResponse<String> resp = post("/v1/order/orders/" + orderId + "/place", null,
				new TypeReference<ApiResponse<String>>() {
				});
		return resp.checkAndReturn();
	}

	// send a GET request.
	private <T> T get(String uri, Map<String, String> params, TypeReference<T> ref) {
		if (params == null) {
			params = new HashMap<>();
		}
		return call("GET", uri, null, params, ref);
	}

	// send a POST request.
	private <T> T post(String uri, Object object, TypeReference<T> ref) {
		return call("POST", uri, object, new HashMap<String, String>(), ref);
	}

	// call api by endpoint.
	private <T> T call(String method, String uri, Object object, Map<String, String> params, TypeReference<T> ref) {
		ApiSignature sign = new ApiSignature();
		sign.createSignature(this.accessKeyId, this.accessKeySecret, method, API_MARKET_HOST, uri, params);
		try {
			Request.Builder builder = null;
			if ("POST".equals(method)) {
				RequestBody body = RequestBody.create(JSON, JsonUtil.writeValue(object));
				builder = new Request.Builder().url(API_MARKET_URL + uri + "?" + toQueryString(params)).post(body);
			} else {
				builder = new Request.Builder().url(API_MARKET_URL + uri + "?" + toQueryString(params)).get();
			}
			if (this.assetPassword != null) {
				builder.addHeader("AuthData", authData());
			}
			Request request = builder.build();
			Response response = client.newCall(request).execute();
			String s = response.body().string();
			return JsonUtil.readValue(s, ref);
		} catch (IOException e) {
			throw new HuoBiException(e);
		}
	}

	private String authData() {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
		md.update(this.assetPassword.getBytes(StandardCharsets.UTF_8));
		md.update("hello, moto".getBytes(StandardCharsets.UTF_8));
		Map<String, String> map = new HashMap<>();
		map.put("assetPwd", DatatypeConverter.printHexBinary(md.digest()).toLowerCase());
		try {
			return ApiSignature.urlEncode(JsonUtil.writeValue(map));
		} catch (IOException e) {
			throw new RuntimeException("Get json failed: " + e.getMessage());
		}
	}

	// Encode as "a=1&b=%20&c=&d=AAA"
	private String toQueryString(Map<String, String> params) {
		return String.join("&", params.entrySet().stream().map((entry) -> {
			return entry.getKey() + "=" + ApiSignature.urlEncode(entry.getValue());
		}).collect(Collectors.toList()));
	}

	// create OkHttpClient:
	

}
