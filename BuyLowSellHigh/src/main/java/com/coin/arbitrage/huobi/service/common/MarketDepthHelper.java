/**
 * 
 */
package com.coin.arbitrage.huobi.service.common;

import java.util.List;

import com.coin.arbitrage.huobi.domain.common.Depth;
import com.coin.arbitrage.huobi.domain.common.DepthResponse;
import com.coin.arbitrage.huobi.service.BaseMarketHelper;
import com.coin.arbitrage.huobi.util.CoinType;
import com.coin.arbitrage.huobi.util.DepthType;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Frank
 *
 */
public class MarketDepthHelper extends BaseMarketHelper {

	public static List<Depth> getMarketDepth(CoinType coinType, DepthType depthType) {

		String hostURL = getHostURL(coinType);

		DepthResponse resp = get(hostURL + "/depth?symbol=" + coinType.getCoinType() + "&type=" + depthType.getDepth(),
				new TypeReference<DepthResponse>() {
				});
		return resp.checkAndReturn();

	}
}
