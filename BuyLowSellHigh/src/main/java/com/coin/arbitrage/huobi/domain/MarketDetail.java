/**
 * 
 */
package com.coin.arbitrage.huobi.domain;

import java.math.BigDecimal;

/**
 * @author Frank
 *
 */
public class MarketDetail {
	private long id;
	private long ts;
	private BigDecimal amount;
	private BigDecimal open;
	private BigDecimal close;
	private BigDecimal high;
	private BigDecimal count;
	private BigDecimal low;
	private BigDecimal vol;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTs() {
		return ts;
	}

	public void setTs(long ts) {
		this.ts = ts;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getOpen() {
		return open;
	}

	public void setOpen(BigDecimal open) {
		this.open = open;
	}

	public BigDecimal getClose() {
		return close;
	}

	public void setClose(BigDecimal close) {
		this.close = close;
	}

	public BigDecimal getHigh() {
		return high;
	}

	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	public BigDecimal getCount() {
		return count;
	}

	public void setCount(BigDecimal count) {
		this.count = count;
	}

	public BigDecimal getLow() {
		return low;
	}

	public void setLow(BigDecimal low) {
		this.low = low;
	}

	public BigDecimal getVol() {
		return vol;
	}

	public void setVol(BigDecimal vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "MarketDetail [id=" + id + ", ts=" + ts + ", amount=" + amount + ", open=" + open + ", close=" + close
				+ ", high=" + high + ", count=" + count + ", low=" + low + ", vol=" + vol + "]";
	}

}
