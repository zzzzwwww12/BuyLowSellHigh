package com.coin.arbitrage.huobi.exception;

/**
 * ApiException if api returns error.
 * 
 * @author liaoxuefeng
 */
public class HuoBiException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5178834916717929913L;

	private final String errCode;

	public HuoBiException(String errCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
	}

	public HuoBiException(Exception e) {
		super(e);
		this.errCode = e.getClass().getName();
	}

	public String getErrCode() {
		return this.errCode;
	}

}
