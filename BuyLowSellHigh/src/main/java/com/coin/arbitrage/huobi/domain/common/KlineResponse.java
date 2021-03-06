/**
 * 
 */
package com.coin.arbitrage.huobi.domain.common;

import java.util.List;

import com.coin.arbitrage.huobi.exception.HuoBiException;

/**
 * @author Frank
 *
 */
public class KlineResponse {
	private String status;
	private String errCode;
	private String errMsg;
	private long ts;
	private String ch;
	private List<Kline> data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getTs() {
		return ts;
	}

	public void setTs(long ts) {
		this.ts = ts;
	}

	public String getCh() {
		return ch;
	}

	public void setCh(String ch) {
		this.ch = ch;
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

	public List<Kline> getData() {
		return data;
	}

	public void setData(List<Kline> data) {
		this.data = data;
	}

	public List<Kline> checkAndReturn() {
		if ("ok".equals(status)) {
			return data;
		}
		throw new HuoBiException(errCode, errMsg);
	}

	@Override
	public String toString() {
		return "KlineResponse [status=" + status + ", errCode=" + errCode + ", errMsg=" + errMsg + ", ts=" + ts
				+ ", ch=" + ch + ", data=" + data + "]";
	}

}
