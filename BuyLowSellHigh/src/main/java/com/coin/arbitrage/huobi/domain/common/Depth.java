package com.coin.arbitrage.huobi.domain.common;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Depth {

	private long id;
	private long ts;

	private BigDecimal[][] bids;
	private BigDecimal[][] asks;

	private long version;

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

	public BigDecimal[][] getAsks() {
		return asks;
	}

	public void setAsks(@JsonProperty("asks") BigDecimal[][] asks) {
		this.asks = asks;
	}

	public BigDecimal[][] getBids() {
		return bids;
	}

	public void setBids(@JsonProperty("asks") BigDecimal[][] bids) {
		this.bids = bids;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Depth [id=" + id + ", ts=" + ts + ", bids=" + bids + "]";
	}

}