/**
 * 
 */
package com.coin.arbitrage.huobi.service;

import static com.coin.arbitrage.huobi.util.HuobiConstants.API_URL;
import static com.coin.arbitrage.huobi.util.HuobiConstants.API_HOST;
import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL;
import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL2;
import static com.coin.arbitrage.huobi.util.HuobiConstants.JSON;
import static com.coin.arbitrage.huobi.util.HuobiConstants.accessKeyId;
import static com.coin.arbitrage.huobi.util.HuobiConstants.accessKeySecret;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.coin.arbitrage.huobi.exception.HuoBiException;
import com.coin.arbitrage.huobi.service.account.HuobiSignatureHelper;
import com.coin.arbitrage.huobi.util.CoinType;
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
public class BaseMarketHelper {

	private static final OkHttpClient client = HttpClientHelper.getInstance();

	protected static String getHostURL(CoinType coinType) {
		String hostURL = "";
		if (isCNYBased(coinType)) {
			hostURL = API_MARKET_URL;
		} else if (isBTCBased(coinType)) {
			hostURL = API_MARKET_URL2;
		}
		return hostURL;
	}

	protected static <T> T get(String uri, TypeReference<T> ref) {
		return call("GET", uri, null, ref);
	}

	private static <T> T call(String method, String uri, Object object, TypeReference<T> ref) {
		try {
			Request.Builder builder = null;
			if ("POST".equals(method)) {
				RequestBody body = RequestBody.create(JSON, JsonUtil.writeValue(object));
				builder = new Request.Builder().url(uri).post(body);
			} else {
				builder = new Request.Builder().url(uri).get();
			}
			Request request = builder.build();
			Response response = client.newCall(request).execute();
			String s = response.body().string();
			return JsonUtil.readValue(s, ref);
		} catch (IOException e) {
			throw new HuoBiException(e);
		}
	}

	protected static <T> T get(String uri, Map<String, String> params, TypeReference<T> ref) {
		if (params == null) {
			params = new HashMap<>();
		}
		return call("GET", uri, null, params, ref);
	}

	private static <T> T call(String method, String uri, Object object, Map<String, String> params,
			TypeReference<T> ref) {
		try {
			Request.Builder builder = null;
			HuobiSignatureHelper sign = new HuobiSignatureHelper();
			sign.createSignature(accessKeyId, accessKeySecret, method, API_HOST, uri, params);
			if ("POST".equals(method)) {
				RequestBody body = RequestBody.create(JSON, JsonUtil.writeValue(object));
				builder = new Request.Builder().url(API_URL + uri + "?" + toQueryString(params)).post(body);
			} else {
				builder = new Request.Builder().url(API_URL + uri + "?" + toQueryString(params)).get();
			}
			Request request = builder.build();
			Response response = client.newCall(request).execute();
			String s = response.body().string();
			return JsonUtil.readValue(s, ref);
		} catch (IOException e) {
			throw new HuoBiException(e);
		}
	}

	protected static boolean isBTCBased(CoinType coinType) {
		return CoinType.BCCBTC.equals(coinType) || CoinType.ETHBTC.equals(coinType) || CoinType.ETCBTC.equals(coinType)
				|| CoinType.LTCBTC.equals(coinType);
	}

	protected static boolean isCNYBased(CoinType coinType) {
		return CoinType.BCCCNY.equals(coinType) || CoinType.BTCCNY.equals(coinType) || CoinType.LTCCNY.equals(coinType)
				|| CoinType.ETCCNY.equals(coinType) || CoinType.ETHCNY.equals(coinType);
	}

	// Encode as "a=1&b=%20&c=&d=AAA"
	private static String toQueryString(Map<String, String> params) {
		return String.join("&", params.entrySet().stream().map((entry) -> {
			return entry.getKey() + "=" + HuobiSignatureHelper.urlEncode(entry.getValue());
		}).collect(Collectors.toList()));
	}
}
