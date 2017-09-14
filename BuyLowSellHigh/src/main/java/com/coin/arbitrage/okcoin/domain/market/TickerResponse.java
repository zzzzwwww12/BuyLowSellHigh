package com.coin.arbitrage.okcoin.domain.market;

import java.util.List;

import com.coin.arbitrage.huobi.domain.account.AccountBalance;

public class TickerResponse {
	private String status;
	private String errCode;
	private String errMsg;
	private List<Ticker> ticker;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public List<Ticker> getTicker() {
		return ticker;
	}
	public void setTicker(List<Ticker> ticker) {
		this.ticker = ticker;
	}
	
	
	
}
