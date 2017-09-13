/**
 * 
 */
package com.coin.arbitrage.huobi.service.account;

import java.util.List;

import com.coin.arbitrage.huobi.domain.account.AccountBalance;
import com.coin.arbitrage.huobi.domain.account.AccountBalanceResponse;
import com.coin.arbitrage.huobi.service.BaseMarketHelper;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Frank
 *
 */
public class MarketAccountBalanceHelper extends BaseMarketHelper {

	public static List<AccountBalance> getAccountBalance(long id) {

		AccountBalanceResponse resp = get("/v1/account/accounts/" + id + "/balance", null,
				new TypeReference<AccountBalanceResponse>() {
				});
		return resp.checkAndReturn();
	}

}
