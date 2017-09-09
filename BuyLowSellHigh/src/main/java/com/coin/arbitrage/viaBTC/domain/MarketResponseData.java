package com.coin.arbitrage.viaBTC.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Frank
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarketResponseData {
	private String date;
	private MarketResponseDataTicker ticker;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public MarketResponseDataTicker getTicker() {
		return ticker;
	}

	public void setTicker(MarketResponseDataTicker ticker) {
		this.ticker = ticker;
	}

	@Override
	public String toString() {
		return "MarketResponseData [date=" + date + ", ticker=" + ticker.toString() + "]";
	}

}
