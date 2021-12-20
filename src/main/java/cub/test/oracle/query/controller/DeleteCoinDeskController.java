package cub.test.oracle.query.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cub.test.oracle.query.dto.CoinTranrq;
import cub.test.oracle.query.service.DeleteCoinDeskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <pre>
 * 類別名稱:DeleteCoinDeskController.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:刪除幣別系統
 * 程式設計人員:謝鎮全
 * </pre>
 */
@Api(tags = "刪除幣別系統")
@CrossOrigin
@RestController
public class DeleteCoinDeskController {

	/** The deleteCoinDesk service*/
	@Autowired
	private DeleteCoinDeskService coinDeskService;

	/**
	 * Delete coin list by coin id.
	 * 
	 * @param request
	 * @return the result info
	 * @throws Exception
	 */
	@ApiOperation(value = "刪除幣別系統", tags = "刪除幣別系統", notes = "刪除幣別系統")
	@PostMapping(value = "/getDeleteCoinDesk")
	public String getDeleteCoinDesk(@RequestBody CoinTranrq request) throws Exception {
		return coinDeskService.getDeleteCoinDesk(request.getCoin());
	}

}
