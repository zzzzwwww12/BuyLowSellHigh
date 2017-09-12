/**
 * 
 */
package com.coin.arbitrage.huobi.domain;

import java.math.BigDecimal;

/**
 * @author Frank
 *
 */
public class TradeDetailMetaData {
	private long id;
	private BigDecimal price;
	private BigDecimal amount;
	private String direction;
	private long ts;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
		return "TradeDetailMetaData [id=" + id + ", price=" + price + ", amount=" + amount + ", direction=" + direction
				+ ", ts=" + ts + "]";
	}

}
