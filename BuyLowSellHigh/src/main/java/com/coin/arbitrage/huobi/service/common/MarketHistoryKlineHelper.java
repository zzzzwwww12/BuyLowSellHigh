/**
 * 
 */
package com.coin.arbitrage.huobi.service.common;

import java.util.List;

import com.coin.arbitrage.huobi.domain.common.Kline;
import com.coin.arbitrage.huobi.domain.common.KlineResponse;
import com.coin.arbitrage.huobi.service.BaseMarketHelper;
import com.coin.arbitrage.huobi.util.CoinType;
import com.coin.arbitrage.huobi.util.KlinePeriod;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Frank
 *
 */
public class MarketHistoryKlineHelper extends BaseMarketHelper {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.coin.arbitrage.huobi.service.IMarketHistoryKline#
	 * getMarketHistoryKline(com.coin.arbitrage.huobi.util.CoinType,
	 * com.coin.arbitrage.huobi.util.KlinePeriod, int)
	 */
	public static List<Kline> getMarketHistoryKline(CoinType coinType, KlinePeriod klinePeriod, int size) {
		// CoinType validation
		String hostURL = getHostURL(coinType);

		KlineResponse resp = get(hostURL + "/history/kline?period=" + klinePeriod.getKlinePeriod() + "&size=" + size
				+ "&symbol=" + coinType.getCoinType(), new TypeReference<KlineResponse>() {
				});
		return resp.checkAndReturn();

	}
}
