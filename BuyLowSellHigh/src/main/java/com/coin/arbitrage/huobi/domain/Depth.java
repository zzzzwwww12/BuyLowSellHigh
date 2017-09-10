/**
 * 
 */
package com.coin.arbitrage.huobi.domain;

import java.util.ArrayList;

/**
 * @author Frank
 *
 */
public class Depth {

	private long id;
	private long ts;
	private ArrayList<Bid> bids;
	private ArrayList<Ask> asks;
	private long version;

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

	public ArrayList<Bid> getBids() {
		return bids;
	}

	public void setBids(ArrayList<Bid> bids) {
		this.bids = bids;
	}

	public ArrayList<Ask> getAsks() {
		return asks;
	}

	public void setAsks(ArrayList<Ask> asks) {
		this.asks = asks;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Depth [id=" + id + ", ts=" + ts + ", bids=" + bids + "]";
	}

	public class Bid {
		private double price;
		private double amount;

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		@Override
		public String toString() {
			return "Bid [price=" + price + ", amount=" + amount + "]";
		}

	}

	public class Ask {
		private double price;
		private double amount;

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		@Override
		public String toString() {
			return "Ask [price=" + price + ", amount=" + amount + "]";
		}

	}
}
