/**
 * 
 */
package com.coin.arbitrage.huobi.service.common;

import java.util.List;

import com.coin.arbitrage.huobi.domain.common.DetailMerged;
import com.coin.arbitrage.huobi.domain.common.DetailMergedResponse;
import com.coin.arbitrage.huobi.service.BaseMarketHelper;
import com.coin.arbitrage.huobi.util.CoinType;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Frank
 *
 */
public class MarketDetailMergedHelper extends BaseMarketHelper {

	public static List<DetailMerged> getMarketDetailMerged(CoinType coinType) {
		// CoinType validation
		String hostURL = getHostURL(coinType);

		DetailMergedResponse resp = get(hostURL + "/detail/merged?symbol=" + coinType.getCoinType(),
				new TypeReference<DetailMergedResponse>() {
				});
		return resp.checkAndReturn();

	}
}
