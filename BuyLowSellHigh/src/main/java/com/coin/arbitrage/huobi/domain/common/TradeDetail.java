/**
 * 
 */
package com.coin.arbitrage.huobi.domain.common;

import java.util.List;

/**
 * @author Frank
 *
 */
public class TradeDetail {

	private long id;
	private long ts;
	private List<TradeDetailMetaData> data;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTs() {
		return ts;
	}

	public void setTs(long ts) {
		this.ts = ts;
	}

	public List<TradeDetailMetaData> getData() {
		return data;
	}

	public void setData(List<TradeDetailMetaData> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "TradeDetail [id=" + id + ", ts=" + ts + ", data=" + data + "]";
	}

}
