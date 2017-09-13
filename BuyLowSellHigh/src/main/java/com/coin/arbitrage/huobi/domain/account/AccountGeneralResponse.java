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
public class AccountGeneralResponse {

	private String status;
	private String errCode;
	private String errMsg;
	private List<AccountGeneral> data;

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

	public List<AccountGeneral> getData() {
		return data;
	}

	public void setData(List<AccountGeneral> data) {
		this.data = data;
	}

	public List<AccountGeneral> checkAndReturn() {
		if ("ok".equals(status)) {
			return data;
		}
		throw new HuoBiException(errCode, errMsg);
	}

	@Override
	public String toString() {
		return "AccountGeneralResponse [status=" + status + ", errCode=" + errCode + ", errMsg=" + errMsg + ", data="
				+ data + "]";
	}

}
