package cub.test.oracle.query.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <pre>
 * 類別名稱:UpdateTranrq.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:更新系統上行物件
 * 程式設計人員:謝鎮全
 * </pre>
 */
public class UpdateTranrq {

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

	@JsonProperty("update")
	private String update;

	@JsonProperty("disclaimer")
	private String disclaimer;

	@JsonProperty("chartName")
	private String chartName;

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

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	public String getDisclaimer() {
		return disclaimer;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public String getChartName() {
		return chartName;
	}

	public void setChartName(String chartName) {
		this.chartName = chartName;
	}

}
