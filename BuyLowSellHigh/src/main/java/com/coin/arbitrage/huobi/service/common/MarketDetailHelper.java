/**
 * 
 */
package com.coin.arbitrage.huobi.service.common;

import java.util.List;

import com.coin.arbitrage.huobi.domain.common.MarketDetail;
import com.coin.arbitrage.huobi.domain.common.MarketDetailResponse;
import com.coin.arbitrage.huobi.service.BaseMarketHelper;
import com.coin.arbitrage.huobi.util.CoinType;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Frank
 *
 */
public class MarketDetailHelper extends BaseMarketHelper {

	public static List<MarketDetail> getMarketDetail(CoinType coinType) {
		// CoinType validation
		String hostURL = getHostURL(coinType);

		MarketDetailResponse resp = get(hostURL + "/detail?symbol=" + coinType.getCoinType(),
				new TypeReference<MarketDetailResponse>() {
				});
		return resp.checkAndReturn();
	}

}
