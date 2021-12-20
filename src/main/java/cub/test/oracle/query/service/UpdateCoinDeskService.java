package cub.test.oracle.query.service;

import cub.test.oracle.query.dto.UpdateTranrq;

/**
 * <pre>
 * 類別名稱:UpdateCoinDeskService.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:更新幣別服務
 * 程式設計人員:謝鎮全
 * </pre>
 */
public interface UpdateCoinDeskService {

	/**
	 * 變更幣別
	 * 
	 * @param request
	 * @return
	 */
	String getUpdateCoinDesk(UpdateTranrq request);
}
