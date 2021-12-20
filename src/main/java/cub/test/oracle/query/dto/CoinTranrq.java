package cub.test.oracle.query.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinTranrq {

	@NotBlank(message = "coin 不能為空")
	@JsonProperty("coin")
	public String coin;

	public String getCoin() {
		return coin;
	}

	public void setCoin(String coin) {
		this.coin = coin;
	}

}
