package com.coin.arbitrage.okcoin;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.coin.arbitrage.okcoin.domain.market.Ticker;
import com.coin.arbitrage.okcoin.exception.OkCoinException;
import com.coin.arbitrage.okcoin.service.market.TickerService;
import com.coin.arbitrage.okcoin.util.OkCoinCoinType;

public class OkCoinAPIGeneral {
	private static final Logger log = LoggerFactory.getLogger(OkCoinAPIGeneral.class);

	public static void main(String args[]) {
		try {
			apiSample();
		} catch (OkCoinException e) {
			System.err.println("OkCoin API Error! err-code: " + e.getErrCode() + ", err-msg: " + e.getMessage());
			e.printStackTrace();
		}
	}

	static void apiSample() {
		List<Ticker> tickers = TickerService.getTickerData(OkCoinCoinType.BTCCNY);
		log.info("Ticker is : " + tickers);
	}
}
