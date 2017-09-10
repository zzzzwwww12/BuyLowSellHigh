package com.coin.arbitrage.huobi.domain;

import com.coin.arbitrage.huobi.exception.HuoBiException;

public class ApiResponse<T> {

	public String status;
	public String errCode;
	public String errMsg;
	public T data;

	public T checkAndReturn() {
		if ("ok".equals(status)) {
			return data;
		}
		throw new HuoBiException(errCode, errMsg);
	}
}
