/**
 * 
 */
package com.coin.arbitrage.huobi.domain;

import java.util.List;

/**
 * @author Frank
 *
 */
public class Response<T> {
	private String status;
	private long ts;
	private String ch;
	private List<T> ticks;

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

	public List<T> getTicks() {
		return ticks;
	}

	public void setTicks(List<T> ticks) {
		this.ticks = ticks;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", ts=" + ts + ", ch=" + ch + ", ticks=" + ticks + "]";
	}

}
