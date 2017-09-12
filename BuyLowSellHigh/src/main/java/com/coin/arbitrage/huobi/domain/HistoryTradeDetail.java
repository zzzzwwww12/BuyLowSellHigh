/**
 * 
 */
package com.coin.arbitrage.huobi.domain;

import java.util.List;

/**
 * @author Frank
 *
 */
public class HistoryTradeDetail {
	private long id;
	private long ts;
	private List<HistoryTradeDetailMetadata> data;

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

	public List<HistoryTradeDetailMetadata> getData() {
		return data;
	}

	public void setData(List<HistoryTradeDetailMetadata> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "HistoryTradeDetail [id=" + id + ", ts=" + ts + ", data=" + data + "]";
	}

}
