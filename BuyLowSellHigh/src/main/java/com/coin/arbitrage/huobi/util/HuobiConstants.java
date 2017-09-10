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

	public static final int CONN_TIMEOUT = 5;
	public static final int READ_TIMEOUT = 5;
	public static final int WRITE_TIMEOUT = 5;

	public static final String API_MARKET_HOST = "be.huobi.com/market";
	public static final String API_MARKET_HOST2 = "api.huobi.pro/market";
	public static final String API_MARKET_URL = "https://" + API_MARKET_HOST;
	public static final String API_MARKET_URL2 = "https://" + API_MARKET_HOST2;
	
	public static final MediaType JSON = MediaType.parse("application/json");

	public static final String HISTORY_PREFIX = "http://api.huobi.com/staticmarket/";
	public static final String HISTORY_MIDDLE = "_kline_";
	public static final String HISTORY_SUFFIX = "_json.js";
	public static final String RECORD_COUNT = "?history=";

	public static final String BTC = "btc";
	public static final String LTC = "ltc";

	public static final  String _1_MINUTE = "001";
	public static final String _5_MINUTE = "005";
	public static final String _15_MINUTE = "015";
	public static final String _30_MINUTE = "030";
	public static final String _60_MINUTE = "060";
	public static final String _1_DAY = "100";
	public static final String _1_WEEK = "200";
	public static final String _1_MONTH = "300";
	public static final String _1_YEAR = "400";
}
