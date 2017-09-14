package com.coin.arbitrage.okcoin.util;

public enum OkCoinCoinType {
	BTCCNY("btc_cny"),
	LTCCNY("ltc_cny"),
	ETHCNY("eth_cny"),
	ETCCNY("etc_cny"),
	BCCCNY("bcc_cny");
	
	private String coinType;

	private OkCoinCoinType(String coinType) {
		this.coinType = coinType;
	}
	
	public String getCoinType() {
		return coinType;
	}
	
}
