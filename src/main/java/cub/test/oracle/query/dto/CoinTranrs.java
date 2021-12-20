package cub.test.oracle.query.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <pre>
 * 類別名稱:CoinTranrs.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:下行物件
 * 程式設計人員:謝鎮全
 * </pre>
 */
public class CoinTranrs {

	@JsonProperty("time")
	public TimeVo time;

	@JsonProperty("disclaimer")
	public String disclaimer;

	@JsonProperty("chartName")
	public String chartName;

	@JsonProperty("bpi")
	public Map<String, CurrencyDetail> bpi;

	public TimeVo getTime() {
		return time;
	}

	public void setTime(TimeVo time) {
		this.time = time;
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

	public Map<String, CurrencyDetail> getBpi() {
		return bpi;
	}

	public void setBpi(Map<String, CurrencyDetail> bpi) {
		this.bpi = bpi;
	}

}
