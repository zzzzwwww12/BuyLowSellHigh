/**
 * 
 */
package com.coin.arbitrage.huobi.service;

import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL;
import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL2;

import java.util.ArrayList;
import java.util.List;

import com.coin.arbitrage.huobi.domain.DetailMerged;
import com.coin.arbitrage.huobi.domain.DetailMergedResponse;
import com.coin.arbitrage.huobi.util.CoinType;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Frank
 *
 */
public class MarketDetailMergedHelper extends BaseMarketHelper {

	public static List<DetailMerged> getMarketDetailMerged(CoinType coinType) {
		// CoinType validation
		String hostURL = "";
		if (isCNYBased(coinType)) {
			hostURL = API_MARKET_URL;
		} else if (isBTCBased(coinType)) {
			hostURL = API_MARKET_URL2;
		} else {
			return new ArrayList<>();
		}

		DetailMergedResponse resp = get(hostURL + "/detail/merged?symbol=" + coinType.getCoinType(), null,
				new TypeReference<DetailMergedResponse>() {
				});
		return resp.checkAndReturn();

	}
}
