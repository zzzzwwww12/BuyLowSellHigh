/**
 * 
 */
package com.coin.arbitrage.huobi.service;

/**
 * @author Frank
 *
 */
public interface IMarketHistoryKline {
	void getMarketHistoryKline(CoinType coinType, KlinePeriod klinePeriod, int size);
}
