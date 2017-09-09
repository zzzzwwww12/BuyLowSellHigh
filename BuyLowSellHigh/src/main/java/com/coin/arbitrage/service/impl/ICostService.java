package com.coin.arbitrage.service.impl;

public interface ICostService {
	double getSellPrice(double buyPrice);

	double getBuyPrice(double sellPrice);
}
