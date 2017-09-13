/**
 * 
 */
package com.coin.arbitrage.huobi.domain.account;

import java.util.List;

/**
 * @author Frank
 *
 */
public class AccountBalance {
	private long id;
	private String type;
	private String state;
	private List<AccountBalanceMetadata> list;
	private String userId;

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

	public List<AccountBalanceMetadata> getList() {
		return list;
	}

	public void setList(List<AccountBalanceMetadata> list) {
		this.list = list;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "AccountBalance [id=" + id + ", type=" + type + ", state=" + state + ", list=" + list + ", userId="
				+ userId + "]";
	}

}
