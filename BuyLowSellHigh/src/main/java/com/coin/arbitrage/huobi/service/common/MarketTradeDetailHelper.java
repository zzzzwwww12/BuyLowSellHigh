/**
 * 
 */
package com.coin.arbitrage.huobi.service.common;

import java.util.List;

import com.coin.arbitrage.huobi.domain.common.TradeDetail;
import com.coin.arbitrage.huobi.domain.common.TradeDetailResponse;
import com.coin.arbitrage.huobi.service.BaseMarketHelper;
import com.coin.arbitrage.huobi.util.CoinType;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Frank
 *
 */
public class MarketTradeDetailHelper extends BaseMarketHelper {

	public static List<TradeDetail> getMarketTradeDetail(CoinType coinType) {
		// CoinType validation
		String hostURL = getHostURL(coinType);

		TradeDetailResponse resp = get(hostURL + "/trade?symbol=" + coinType.getCoinType(),
				new TypeReference<TradeDetailResponse>() {
				});
		return resp.checkAndReturn();
	}

}
