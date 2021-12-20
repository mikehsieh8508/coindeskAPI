package cub.test.oracle.query.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <pre>
 * 類別名稱:TimeVo.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:對應下行物件
 * 程式設計人員:謝鎮全
 * </pre>
 */
public class TimeVo {

	@JsonProperty("updated")
	public String updated;

	@JsonProperty("updateISO")
	public String updatedISO;

	@JsonProperty("updateduk")
	public String updateduk;

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getUpdatedISO() {
		return updatedISO;
	}

	public void setUpdatedISO(String updatedISO) {
		this.updatedISO = updatedISO;
	}

	public String getUpdateduk() {
		return updateduk;
	}

	public void setUpdateduk(String updateduk) {
		this.updateduk = updateduk;
	}

}
