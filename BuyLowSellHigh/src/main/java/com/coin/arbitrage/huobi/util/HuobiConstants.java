/**
 * 
 */
package com.coin.arbitrage.huobi.util;

import okhttp3.MediaType;

/**
 * @author Frank
 *
 */
public class HuobiConstants {

	public static final String accessKeyId = "";
	public static final String accessKeySecret = "";

	public static final String assetPassword = "";

	public static final int CONN_TIMEOUT = 5;
	public static final int READ_TIMEOUT = 5;
	public static final int WRITE_TIMEOUT = 5;

	public static final String API_HOST = "be.huobi.com";
	public static final String API_HOST2 = "api.huobi.pro";

	public static final String API_URL = "https://be.huobi.com";
	public static final String API_URL2 = "https://api.huobi.pro";
	public static final String API_MARKET_URL = API_URL + "/market";
	public static final String API_MARKET_URL2 = API_URL2 + "/market";

	public static final MediaType JSON = MediaType.parse("application/json");

	public static final String HISTORY_PREFIX = "http://api.huobi.com/staticmarket/";
	public static final String HISTORY_MIDDLE = "_kline_";
	public static final String HISTORY_SUFFIX = "_json.js";
	public static final String RECORD_COUNT = "?history=";

	public static final String BTC = "btc";
	public static final String LTC = "ltc";

}
