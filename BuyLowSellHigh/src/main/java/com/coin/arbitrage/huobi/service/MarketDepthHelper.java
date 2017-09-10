/**
 * 
 */
package com.coin.arbitrage.huobi.service;

import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL;
import static com.coin.arbitrage.huobi.util.HuobiConstants.API_MARKET_URL2;

import java.util.ArrayList;
import java.util.List;

import com.coin.arbitrage.huobi.domain.Depth;
import com.coin.arbitrage.huobi.domain.Response;
import com.coin.arbitrage.huobi.util.CoinType;
import com.coin.arbitrage.huobi.util.DepthType;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Frank
 *
 */
public class MarketDepthHelper extends BaseMarketHelper {

	public static List<Depth> getMarketDepth(CoinType coinType, DepthType depthType) {
		String hostURL = "";
		if (isCNYBased(coinType)) {
			hostURL = API_MARKET_URL;
		} else if (isBTCBased(coinType)) {
			hostURL = API_MARKET_URL2;
		} else {
			return new ArrayList<>();
		}

		Response<Depth> resp = get(
				hostURL + "/depth?symbol=" + coinType.getCoinType() + "&type=" + depthType.getDepth(), null,
				new TypeReference<Response<Depth>>() {
				});
		return resp.checkAndReturn();

	}
}
