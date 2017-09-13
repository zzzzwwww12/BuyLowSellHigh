/**
 * 
 */
package com.coin.arbitrage.huobi;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.coin.arbitrage.huobi.domain.account.AccountBalance;
import com.coin.arbitrage.huobi.domain.account.AccountGeneral;
import com.coin.arbitrage.huobi.exception.HuoBiException;
import com.coin.arbitrage.huobi.service.account.MarketAccountBalanceHelper;
import com.coin.arbitrage.huobi.service.account.MarketAccountGeneralHelper;
import com.coin.arbitrage.huobi.util.JsonUtil;

public class HuobiAPIGeneral {

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
//		
//		List<Depth> depths = MarketDepthHelper.getMarketDepth(CoinType.ETHCNY, DepthType.STEP1);
//		log.info("market depth is: " + depths);
//		
//		List<DetailMerged> detailMergeds = MarketDetailMergedHelper.getMarketDetailMerged(CoinType.ETHCNY);
//		log.info("market detail merged is: " + detailMergeds);
//		
//		List<TradeDetail> tradeDetails = MarketTradeDetailHelper.getMarketTradeDetail(CoinType.ETHCNY);
//		log.info("market trade  detail  is: " + tradeDetails);
//		
//		List<HistoryTradeDetail> historyTradeDetails = MarketHistoryTradeDetailHelper.getMarketHistoryTradeDetail(CoinType.ETHCNY, 10);
//		log.info("market history trade detail is: " + historyTradeDetails);
//		
//		List<MarketDetail> marketDetails = MarketDetailHelper.getMarketDetail(CoinType.ETHCNY);
//		log.info("market detail is : " + marketDetails);
		
		List<AccountGeneral> accountGenerals = MarketAccountGeneralHelper.getAccountGeneral();
		log.info("account general is:" + accountGenerals);
		
		List<AccountBalance> accountBalances = MarketAccountBalanceHelper.getAccountBalance(108875L);
		log.info("account balance for ID is: " + accountBalances);
	}

	public static void print(Object obj) {
		try {
			System.out.println(JsonUtil.writeValue(obj));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
