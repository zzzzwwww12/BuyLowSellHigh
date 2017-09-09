/**
 * 
 */
package com.coin.arbitrage.viaBTC.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Frank
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarketResponse {

	private String code;
	private MarketResponseData data;
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public MarketResponseData getData() {
		return data;
	}

	public void setData(MarketResponseData data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MarketResponse [code=" + code + ", data=" + data.toString() + ", message=" + message + "]";
	}

}
