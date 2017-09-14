package com.coin.arbitrage.okcoin.service;

import static com.coin.arbitrage.okcoin.util.OkCoinConstants.API_HOST;
import static com.coin.arbitrage.okcoin.util.OkCoinConstants.JSON;

import java.io.IOException;

import com.coin.arbitrage.okcoin.util.OkCoinCoinType;
import com.coin.arbitrage.huobi.service.HttpClientHelper;
import com.coin.arbitrage.huobi.util.JsonUtil;
import com.coin.arbitrage.okcoin.exception.OkCoinException;
import com.fasterxml.jackson.core.type.TypeReference;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class RequestService {
	
	private static final OkHttpClient client = HttpClientHelper.getInstance();
	
	public static <T> T getReponse(OkCoinCoinType coinType) {
		String hostURL = getHostURL(coinType);
		return get(hostURL, new TypeReference<T>() {});
	}
	
	protected static String getHostURL(OkCoinCoinType coinType) {
		String hostURL = "";
		if (isCNYBased(coinType)) {
			hostURL = API_HOST;
		} else {
			
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
			throw new OkCoinException(e);
		}
	}
	
	protected static boolean isCNYBased(OkCoinCoinType coinType) {
		return OkCoinCoinType.BCCCNY.equals(coinType) || OkCoinCoinType.BTCCNY.equals(coinType) || OkCoinCoinType.LTCCNY.equals(coinType)
				|| OkCoinCoinType.ETCCNY.equals(coinType) || OkCoinCoinType.ETHCNY.equals(coinType);
	}


}
