/**
 * 
 */
package com.coin.arbitrage.huobi.domain.account;

/**
 * @author Frank
 *
 */
public class AccountGeneral {
	private long id;
	private String type;
	private String state;
	private long userId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "AccountGeneral [id=" + id + ", type=" + type + ", state=" + state + ", userId=" + userId + "]";
	}

}
