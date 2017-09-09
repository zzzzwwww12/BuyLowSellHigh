/**
 * 
 */
package com.coin.arbitrage.huobi.domain;

/**
 * @author Frank
 *
 */
public class Kline {
	private long id;
	private double amount; // trading total price
	private double count; // trading numbers
	private double open; // opening price
	private double close; // closing price
	private double low; // lowest price
	private double high; // highest price
	private double vol; // total trading price

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getVol() {
		return vol;
	}

	public void setVol(double vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "Kline [id=" + id + ", amount=" + amount + ", count=" + count + ", open=" + open + ", close=" + close
				+ ", low=" + low + ", high=" + high + ", vol=" + vol + "]";
	}

}
