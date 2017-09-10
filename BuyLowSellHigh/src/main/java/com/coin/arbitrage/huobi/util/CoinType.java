package com.coin.arbitrage.huobi.util;

public enum CoinType {
	ETHCNY("ethcny"),
	ETCCNY("etccny"),
	BCCCNY("bcccny"),
	LTCCNY("ltccny"),
	BTCCNY("btccny"),
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
