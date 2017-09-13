package com.coin.arbitrage.okcoin.util;

public enum ErrorCode {
	FILED_NOT_NULL(10000);
	
	private int code;

	private ErrorCode(int code) {
		this.code = code;
	}
	
	public int getCode(ErrorCode errorCode) {
		return this.code;
	}
	
	
}
