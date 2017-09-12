/**
 * 
 */
package com.coin.arbitrage.huobi.domain;

import java.math.BigDecimal;

/**
 * @author Frank
 *
 */
public class HistoryTradeDetailMetadata {
	private long id;
	private BigDecimal amount;
	private BigDecimal price;
	private String direction;
	private long ts;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public long getTs() {
		return ts;
	}

	public void setTs(long ts) {
		this.ts = ts;
	}

	@Override
	public String toString() {
		return "HistoryTradeDetail [id=" + id + ", amount=" + amount + ", price=" + price + ", direction=" + direction
				+ ", ts=" + ts + "]";
	}

}
