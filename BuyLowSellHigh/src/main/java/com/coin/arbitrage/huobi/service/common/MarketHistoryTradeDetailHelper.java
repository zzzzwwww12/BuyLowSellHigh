/**
 * 
 */
package com.coin.arbitrage.huobi.service.common;

import java.util.List;

import com.coin.arbitrage.huobi.domain.common.HistoryTradeDetail;
import com.coin.arbitrage.huobi.domain.common.HistoryTradeDetailResponse;
import com.coin.arbitrage.huobi.service.BaseMarketHelper;
import com.coin.arbitrage.huobi.util.CoinType;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Frank
 *
 */
public class MarketHistoryTradeDetailHelper extends BaseMarketHelper {

	public static List<HistoryTradeDetail> getMarketHistoryTradeDetail(CoinType coinType) {
		return getMarketHistoryTradeDetail(coinType, 1);
	}

	// size is limited from 1-2000
	public static List<HistoryTradeDetail> getMarketHistoryTradeDetail(CoinType coinType, int size) {
		// CoinType validation
		String hostURL = getHostURL(coinType);

		HistoryTradeDetailResponse resp = get(
				hostURL + "/history/trade?symbol=" + coinType.getCoinType() + "&size=" + size,
				new TypeReference<HistoryTradeDetailResponse>() {
				});
		return resp.checkAndReturn();
	}

}
