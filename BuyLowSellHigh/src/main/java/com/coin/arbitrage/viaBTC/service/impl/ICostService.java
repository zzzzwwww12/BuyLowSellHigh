package com.coin.arbitrage.viaBTC.service.impl;

public interface ICostService {
	double getSellPrice(double buyPrice);

	double getBuyPrice(double sellPrice);
}
