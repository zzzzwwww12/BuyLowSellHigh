/**
 * 
 */
package com.coin.arbitrage.huobi.service;

import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL;
import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL2;

import java.util.ArrayList;
import java.util.List;

import com.coin.arbitrage.huobi.domain.Kline;
import com.coin.arbitrage.huobi.domain.KlineResponse;
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
		String hostURL = "";
		if (isCNYBased(coinType)) {
			hostURL = API_MARKET_URL;
		} else if (isBTCBased(coinType)) {
			hostURL = API_MARKET_URL2;
		} else {
			return new ArrayList<>();
		}

		KlineResponse resp = get(hostURL + "/history/kline?period=" + klinePeriod.getKlinePeriod() + "&size=" + size
				+ "&symbol=" + coinType.getCoinType(), null, new TypeReference<KlineResponse>() {
				});
		return resp.checkAndReturn();

	}
}
