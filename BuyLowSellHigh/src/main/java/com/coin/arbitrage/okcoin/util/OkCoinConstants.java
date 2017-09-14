package com.coin.arbitrage.okcoin.util;

import okhttp3.MediaType;

public class OkCoinConstants {
	public static final String API_HOST = "https://www.okcoin.cn/api/v1";
	public static final String TICKER_URL = API_HOST + "/ticker.do?symbol=btc_cny";
	public static final MediaType JSON = MediaType.parse("application/json");
}
