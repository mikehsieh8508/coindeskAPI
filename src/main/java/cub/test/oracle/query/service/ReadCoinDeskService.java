package cub.test.oracle.query.service;

import cub.test.oracle.query.dto.CoinTranrs;

/**
 * <pre>
 * 類別名稱:ReadCoinDeskService.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:查詢幣別服務
 * 程式設計人員:謝鎮全
 * </pre>
 */
public interface ReadCoinDeskService {

	/**
	 * 查詢幣別
	 * 
	 * @param request
	 * @return
	 */
	public CoinTranrs getReadCoinDesk(String code);

}
