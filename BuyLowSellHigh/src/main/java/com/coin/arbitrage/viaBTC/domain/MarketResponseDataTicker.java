package com.coin.arbitrage.viaBTC.domain;

public class MarketResponseDataTicker {
	private String buy;
	private String high;
	private String last;
	private String low;
	private String sell;
	private String vol;

	public String getBuy() {
		return buy;
	}

	public void setBuy(String buy) {
		this.buy = buy;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getSell() {
		return sell;
	}

	public void setSell(String sell) {
		this.sell = sell;
	}

	public String getVol() {
		return vol;
	}

	public void setVol(String vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "MarketResponseDataTicker [buy=" + buy + ", high=" + high + ", last=" + last + ", low=" + low + ", sell=" + sell + ", vol=" + vol + "]";
	}

}
