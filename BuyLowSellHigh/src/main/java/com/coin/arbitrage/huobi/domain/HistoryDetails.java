package com.coin.arbitrage.huobi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Frank
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoryDetails {

	private DailyDetails HistoryDetails;

	public DailyDetails getHistoryDetails() {
		return HistoryDetails;
	}

	public void setHistoryDetails(DailyDetails historyDetails) {
		HistoryDetails = historyDetails;
	}

	// private List<DailyDetails> history;
	// public List<DailyDetails> getHistory() {
	// return history;
	// }
	//
	// public void setHistory(List<DailyDetails> history) {
	// this.history = history;
	// }

	@Override
	public String toString() {
		return "HistoryDetails [history=" + HistoryDetails + "]";
	}

}
