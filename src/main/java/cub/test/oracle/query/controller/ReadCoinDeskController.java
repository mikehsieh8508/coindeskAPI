package cub.test.oracle.query.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cub.test.oracle.query.dto.CoinTranrq;
import cub.test.oracle.query.dto.CoinTranrs;
import cub.test.oracle.query.service.ReadCoinDeskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <pre>
 * 類別名稱:ReadCoinDeskController.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:查詢幣別系統
 * 程式設計人員:謝鎮全
 * </pre>
 */
@Api(tags = "查詢幣別系統")
@CrossOrigin
@RestController
public class ReadCoinDeskController {

	/** The readCoinDesk service*/
	@Autowired
	private ReadCoinDeskService coinDeskService;

	/**
	 * query coin list by coin id or All.
	 * 
	 * @param request
	 * @return the result info
	 * @throws Exception
	 */
	@ApiOperation(value = "查詢幣別系統", tags = "查詢幣別系統" , notes = "查詢幣別系統")
	@PostMapping(value = "/getReadCoinDesk")
	public CoinTranrs getReadCoinDesk(@RequestBody CoinTranrq request) throws Exception {
		return coinDeskService.getReadCoinDesk(request.getCoin());
	}

}
