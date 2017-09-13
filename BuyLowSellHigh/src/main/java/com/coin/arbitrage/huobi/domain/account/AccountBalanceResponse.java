/**
 * 
 */
package com.coin.arbitrage.huobi.domain.account;

import java.util.List;

import com.coin.arbitrage.huobi.exception.HuoBiException;

/**
 * @author Frank
 *
 */
public class AccountBalanceResponse {

	private String status;
	private String errCode;
	private String errMsg;
	private List<AccountBalance> data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public List<AccountBalance> getData() {
		return data;
	}

	public void setData(List<AccountBalance> data) {
		this.data = data;
	}

	public List<AccountBalance> checkAndReturn() {
		if ("ok".equals(status)) {
			return data;
		}
		throw new HuoBiException(errCode, errMsg);
	}

	@Override
	public String toString() {
		return "AccountBalanceResponse [status=" + status + ", errCode=" + errCode + ", errMsg=" + errMsg + ", data="
				+ data + "]";
	}

}
