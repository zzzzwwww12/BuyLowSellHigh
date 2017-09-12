/**
 * 
 */
package com.coin.arbitrage.huobi.service;

import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL;
import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL2;

import java.util.ArrayList;
import java.util.List;

import com.coin.arbitrage.huobi.domain.MarketDetail;
import com.coin.arbitrage.huobi.domain.MarketDetailResponse;
import com.coin.arbitrage.huobi.util.CoinType;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Frank
 *
 */
public class MarketDetailHelper extends BaseMarketHelper{

	public static List<MarketDetail> getMarketDetail(CoinType coinType) {
		// CoinType validation
				String hostURL = "";
				if (isCNYBased(coinType)) {
					hostURL = API_MARKET_URL;
				} else if (isBTCBased(coinType)) {
					hostURL = API_MARKET_URL2;
				} else {
					return new ArrayList<>();
				}

				MarketDetailResponse resp = get(hostURL + "/detail?symbol=" + coinType.getCoinType(), null,
						new TypeReference<MarketDetailResponse>() {
						});
				return resp.checkAndReturn();
	}

}
