/**
 * 
 */
package com.coin.arbitrage.huobi.service.account;

import java.util.List;

import com.coin.arbitrage.huobi.domain.account.AccountGeneral;
import com.coin.arbitrage.huobi.domain.account.AccountGeneralResponse;
import com.coin.arbitrage.huobi.service.BaseMarketHelper;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Frank
 *
 */
public class MarketAccountGeneralHelper extends BaseMarketHelper {

	public static List<AccountGeneral> getAccountGeneral() {

		AccountGeneralResponse resp = get("/v1/account/accounts", null, new TypeReference<AccountGeneralResponse>() {
		});
		return resp.checkAndReturn();
	}

}
