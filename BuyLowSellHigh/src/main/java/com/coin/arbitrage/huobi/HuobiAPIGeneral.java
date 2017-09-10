/**
 * 
 */
package com.coin.arbitrage.huobi;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.coin.arbitrage.huobi.domain.Depth;
import com.coin.arbitrage.huobi.domain.Kline;
import com.coin.arbitrage.huobi.exception.HuoBiException;
import com.coin.arbitrage.huobi.service.MarketDepthHelper;
import com.coin.arbitrage.huobi.service.MarketHistoryKlineHelper;
import com.coin.arbitrage.huobi.util.CoinType;
import com.coin.arbitrage.huobi.util.DepthType;
import com.coin.arbitrage.huobi.util.JsonUtil;
import com.coin.arbitrage.huobi.util.KlinePeriod;

public class HuobiAPIGeneral {

//	private static final String API_KEY = "";
//	private static final String API_SECRET = "";

	private static final Logger log = LoggerFactory.getLogger(HuobiAPIGeneral.class);

	public static void main(String args[]) {
		try {
			apiSample();
		} catch (HuoBiException e) {
			System.err.println("API Error! err-code: " + e.getErrCode() + ", err-msg: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	static void apiSample() {
//		List<Kline> klines = MarketHistoryKlineHelper.getMarketHistoryKline(CoinType.ETHCNY, KlinePeriod.FIVE_MUNITE,10);
//		log.info("market history is : " + klines);
		
		List<Depth> depths = MarketDepthHelper.getMarketDepth(CoinType.ETHCNY, DepthType.STEP1);
		log.info("market depth is: " + depths);
	}

	public static void print(Object obj) {
		try {
			System.out.println(JsonUtil.writeValue(obj));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
