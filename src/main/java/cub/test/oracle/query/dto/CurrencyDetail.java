package cub.test.oracle.query.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <pre>
 * 類別名稱:CurrencyDetail.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:下行物件明細
 * 程式設計人員:謝鎮全
 * </pre>
 */
public class CurrencyDetail {

	@JsonProperty("code")
	private String code;

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("rate")
	private String rate;

	@JsonProperty("description")
	private String description;

	@JsonProperty("rateFloat")
	private BigDecimal rateFloat;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getRateFloat() {
		return rateFloat;
	}

	public void setRateFloat(BigDecimal rateFloat) {
		this.rateFloat = rateFloat;
	}

}
