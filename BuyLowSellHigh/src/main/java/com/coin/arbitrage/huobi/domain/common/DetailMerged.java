package com.coin.arbitrage.huobi.domain.common;

import java.math.BigDecimal;
import java.util.Arrays;

public class DetailMerged {
	private long id;
	private long ts;
	private BigDecimal close;
	private BigDecimal open;
	private BigDecimal high;
	private BigDecimal low;
	private BigDecimal amount;
	private BigDecimal count;
	private BigDecimal vol;
	private BigDecimal[][] ask;
	private BigDecimal[][] bid;

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

	public BigDecimal getClose() {
		return close;
	}

	public void setClose(BigDecimal close) {
		this.close = close;
	}

	public BigDecimal getOpen() {
		return open;
	}

	public void setOpen(BigDecimal open) {
		this.open = open;
	}

	public BigDecimal getHigh() {
		return high;
	}

	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	public BigDecimal getLow() {
		return low;
	}

	public void setLow(BigDecimal low) {
		this.low = low;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCount() {
		return count;
	}

	public void setCount(BigDecimal count) {
		this.count = count;
	}

	public BigDecimal getVol() {
		return vol;
	}

	public void setVol(BigDecimal vol) {
		this.vol = vol;
	}

	public BigDecimal[][] getAsk() {
		return ask;
	}

	public void setAsk(BigDecimal[][] ask) {
		this.ask = ask;
	}

	public BigDecimal[][] getBid() {
		return bid;
	}

	public void setBid(BigDecimal[][] bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "DetailMerged [id=" + id + ", ts=" + ts + ", close=" + close + ", open=" + open + ", high=" + high
				+ ", low=" + low + ", amount=" + amount + ", count=" + count + ", vol=" + vol + ", ask="
				+ Arrays.toString(ask) + ", bid=" + Arrays.toString(bid) + "]";
	}

}