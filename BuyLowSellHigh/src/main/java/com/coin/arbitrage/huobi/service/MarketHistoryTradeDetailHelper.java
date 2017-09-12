/**
 * 
 */
package com.coin.arbitrage.huobi.service;

import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL;
import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL2;

import java.util.ArrayList;
import java.util.List;

import com.coin.arbitrage.huobi.domain.HistoryTradeDetail;
import com.coin.arbitrage.huobi.domain.HistoryTradeDetailResponse;
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

	//size is limited from 1-2000
	public static List<HistoryTradeDetail> getMarketHistoryTradeDetail(CoinType coinType, int size) {
		// CoinType validation
		String hostURL = "";
		if (isCNYBased(coinType)) {
			hostURL = API_MARKET_URL;
		} else if (isBTCBased(coinType)) {
			hostURL = API_MARKET_URL2;
		} else {
			return new ArrayList<>();
		}

		HistoryTradeDetailResponse resp = get(
				hostURL + "/history/trade?symbol=" + coinType.getCoinType() + "&size=" + size, null,
				new TypeReference<HistoryTradeDetailResponse>() {
				});
		return resp.checkAndReturn();
	}

}
