/**
 * 
 */
package com.coin.arbitrage.huobi.domain.account;

import java.math.BigDecimal;

/**
 * @author Frank
 *
 */
public class AccountBalanceMetadata {
	private String currency;
	private String type;
	private BigDecimal balance;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountBalanceMetadata [currency=" + currency + ", type=" + type + ", balance=" + balance + "]";
	}

}
