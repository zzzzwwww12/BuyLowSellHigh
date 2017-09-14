package com.coin.arbitrage.okcoin.service.market;

import java.util.List;

import com.coin.arbitrage.okcoin.domain.market.Ticker;
import com.coin.arbitrage.okcoin.domain.market.TickerResponse;
import com.coin.arbitrage.okcoin.exception.OkCoinException;
import com.coin.arbitrage.okcoin.service.RequestService;
import com.coin.arbitrage.okcoin.util.OkCoinCoinType;

public class TickerService extends RequestService {
	
	public static List<Ticker> getTickerData(OkCoinCoinType coinType) {
		TickerResponse reponse = RequestService.getReponse(coinType);
		
		if ("ok".equals(reponse.getStatus())) {
			return reponse.getTicker();
		}
		throw new OkCoinException(reponse.getErrCode(), reponse.getErrMsg());
	}
}
