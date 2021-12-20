package cub.test.oracle.query.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <pre>
 * 類別名稱:CoinDesk.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:取得幣別資訊
 * 程式設計人員:謝鎮全
 * </pre>
 */
@Entity
@Table(name = "COINDESK")
public class CoinDesk implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "code")
	private String code;

	@Column(name = "symbol")
	private String symbol;

	@Column(name = "rate")
	private String rate;

	@Column(name = "description")
	private String description;

	@Column(name = "rate_float")
	private BigDecimal rateFloat;

	@Column(name = "update")
	private String update;

	@Column(name = "disclaimer")
	private String disclaimer;

	@Column(name = "chartName")
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
