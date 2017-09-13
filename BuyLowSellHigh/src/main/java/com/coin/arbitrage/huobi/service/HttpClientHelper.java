/**
 * 
 */
package com.coin.arbitrage.huobi.service;

import static com.coin.arbitrage.huobi.util.HuobiConstants.CONN_TIMEOUT;
import static com.coin.arbitrage.huobi.util.HuobiConstants.READ_TIMEOUT;
import static com.coin.arbitrage.huobi.util.HuobiConstants.WRITE_TIMEOUT;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;

/**
 * @author Frank
 *
 */
public class HttpClientHelper {

	public static OkHttpClient getInstance() {
		return new Builder().connectTimeout(CONN_TIMEOUT, TimeUnit.SECONDS).readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
				.writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS).build();
	}
}
