package cub.test.oracle.query.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cub.test.oracle.query.repository.CoinDeskRepository;
import cub.test.oracle.query.service.DeleteCoinDeskService;

/**
 * <pre>
 * 類別名稱:DeleteCoinDeskServiceImpl.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:刪除幣別服務實作
 * 程式設計人員:謝鎮全
 * </pre>
 */
@Service
public class DeleteCoinDeskServiceImpl implements DeleteCoinDeskService {

	@Autowired
	private CoinDeskRepository coinDeskRepository;

	@Override
	public String getDeleteCoinDesk(String code) {
		String result = null;
		try {
			coinDeskRepository.deleteById(code);
			result = "刪除成功";
		} catch (Exception e) {
			result = "刪除失敗";
		}

		return result;
	}

}
