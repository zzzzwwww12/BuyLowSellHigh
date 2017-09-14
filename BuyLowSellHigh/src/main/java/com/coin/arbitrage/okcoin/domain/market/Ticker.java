package com.coin.arbitrage.okcoin.domain.market;

import java.math.BigDecimal;

public class Ticker {
	private Long date; // 返回数据时服务器时间
	private BigDecimal buy; // 买一价
	private BigDecimal high; // 最高价
	private BigDecimal last; // 最新成交价
	private BigDecimal low; // 最低价
	private BigDecimal sel; // 卖一价
	private BigDecimal vol; // 成交量(最近的24小时)

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public BigDecimal getBuy() {
		return buy;
	}

	public void setBuy(BigDecimal buy) {
		this.buy = buy;
	}

	public BigDecimal getHigh() {
		return high;
	}

	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	public BigDecimal getLast() {
		return last;
	}

	public void setLast(BigDecimal last) {
		this.last = last;
	}

	public BigDecimal getLow() {
		return low;
	}

	public void setLow(BigDecimal low) {
		this.low = low;
	}

	public BigDecimal getSel() {
		return sel;
	}

	public void setSel(BigDecimal sel) {
		this.sel = sel;
	}

	public BigDecimal getVol() {
		return vol;
	}

	public void setVol(BigDecimal vol) {
		this.vol = vol;
	}

}
