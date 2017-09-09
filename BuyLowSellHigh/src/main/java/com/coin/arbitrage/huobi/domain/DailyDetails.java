package com.coin.arbitrage.huobi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Frank
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyDetails {

	private String date;
	private double openingPrice;
	private double highestPrice;
	private double lowestPrice;
	private double closingPrice;
	private double volumn;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getOpeningPrice() {
		return openingPrice;
	}

	public void setOpeningPrice(double openingPrice) {
		this.openingPrice = openingPrice;
	}

	public double getHighestPrice() {
		return highestPrice;
	}

	public void setHighestPrice(double highestPrice) {
		this.highestPrice = highestPrice;
	}

	public double getLowestPrice() {
		return lowestPrice;
	}

	public void setLowestPrice(double lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

	public double getClosingPrice() {
		return closingPrice;
	}

	public void setClosingPrice(double closingPrice) {
		this.closingPrice = closingPrice;
	}

	public double getVolumn() {
		return volumn;
	}

	public void setVolumn(double volumn) {
		this.volumn = volumn;
	}

	@Override
	public String toString() {
		return "DailyDetails [date=" + date + ", openingPrice=" + openingPrice + ", highestPrice=" + highestPrice
				+ ", lowestPrice=" + lowestPrice + ", closingPrice=" + closingPrice + ", volumn=" + volumn + "]";
	}

}
