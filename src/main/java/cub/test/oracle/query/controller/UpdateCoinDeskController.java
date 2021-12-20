package cub.test.oracle.query.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cub.test.oracle.query.dto.UpdateTranrq;
import cub.test.oracle.query.service.UpdateCoinDeskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <pre>
 * 類別名稱:UpdateCoinDeskController.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:變更幣別系統
 * 程式設計人員:謝鎮全
 * </pre>
 */
@Api(tags = "變更幣別系統")
@CrossOrigin
@RestController
public class UpdateCoinDeskController {

	/** The updateCoinDesk service*/
	@Autowired
	private UpdateCoinDeskService coinDeskService;

	/**
	 * update coindesk by requset.
	 * 
	 * @param request
	 * @return the result info
	 * @throws Exception
	 */
	@ApiOperation(value = "變更幣別系統", tags = "變更幣別系統" , notes = "變更幣別系統")
	@PostMapping(value = "/getUpdateCoinDesk")
	public String getUpdateCoinDesk(@RequestBody UpdateTranrq request) throws Exception {
		return coinDeskService.getUpdateCoinDesk(request);
	}

}
