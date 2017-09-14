package com.coin.arbitrage.okcoin.exception;

public class OkCoinException extends RuntimeException {

	private static final long serialVersionUID = -6187419098834920779L;
	
	private final String errCode;

	public OkCoinException(String errCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
	}

	public OkCoinException(Exception e) {
		super(e);
		this.errCode = e.getClass().getName();
	}

	public String getErrCode() {
		return this.errCode;
	}
}
