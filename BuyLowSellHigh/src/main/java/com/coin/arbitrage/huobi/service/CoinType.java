package com.coin.arbitrage.huobi.service;

public enum CoinType {
	ETHCNY("ethcny"),
	ETCCNY("etccny"),
	BCCCNY("bcccny"),
	ETHBTC("ethbtc"),
	LTCBTC("ltcbtc"),
	ETCBTC("etcbtc"),
	BCCBTC("bccbtc");
	
	private String coinType;

	private CoinType(String coinType) {
		this.coinType = coinType;
	}
	
	public String getCoinType() {
		return coinType;
	}
	
}
