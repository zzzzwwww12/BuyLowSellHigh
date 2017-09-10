/**
 * 
 */
package com.coin.arbitrage.huobi.util;

/**
 * @author Frank
 *
 */
public enum KlinePeriod {
	ONE_MINUTE("1min"),
	FIVE_MUNITE("5min"),
	FIFTEEN_MINUTE("15min"),
	THIRTY_MINUTE("30min"),
	SIXTY_MINUTE("60min"),
	ONE_DAY("1day"),
	ONE_WEEK("1week"),
	ONE_MONTH("1mon"),
	ONE_YEAR("1year");
	
	private String klinePeriod;

	private KlinePeriod(String klinePeriod) {
		this.klinePeriod = klinePeriod;
	}
	
	public String getKlinePeriod() {
		return klinePeriod;
	}
	
}
