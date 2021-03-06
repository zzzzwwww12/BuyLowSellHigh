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
public class MarketDetailResponse {

	private String status;
	private String errCode;
	private String errMsg;
	private long ts;
	private String ch;
	private List<MarketDetail> tick;

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

	public List<MarketDetail> getTick() {
		return tick;
	}

	public void setTick(List<MarketDetail> tick) {
		this.tick = tick;
	}

	public List<MarketDetail> checkAndReturn() {
		if ("ok".equals(status)) {
			return tick;
		}
		throw new HuoBiException(errCode, errMsg);
	}

	@Override
	public String toString() {
		return "MarketDetailResponse [status=" + status + ", errCode=" + errCode + ", errMsg=" + errMsg + ", ts=" + ts
				+ ", ch=" + ch + ", tick=" + tick + "]";
	}

}
