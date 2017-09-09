package com.coin.arbitrage.viaBTC.service;

import com.coin.arbitrage.viaBTC.service.impl.ICostService;
/*BTC	0.20%	0.20%
LTC	0.20%	0.20%
BCC	0.20%	0.20%
ETH	0.20%	0.20%
ETC	0.20%	0.20%*/
public class CostService implements ICostService {
	public double getSellPrice(double buyPrice) {
	return 0.0;	
	}
	
	public double getBuyPrice(double sellPrice) {
		return 0.0;
	}
}
