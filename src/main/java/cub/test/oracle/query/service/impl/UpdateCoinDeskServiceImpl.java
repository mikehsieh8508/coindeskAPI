package cub.test.oracle.query.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cub.test.oracle.query.dto.UpdateTranrq;
import cub.test.oracle.query.entity.CoinDesk;
import cub.test.oracle.query.repository.CoinDeskRepository;
import cub.test.oracle.query.service.UpdateCoinDeskService;

/**
 * <pre>
 * 類別名稱:UpdateCoinDeskServiceImpl.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:更新幣別服務實作
 * 程式設計人員:謝鎮全
 * </pre>
 */
@Service
public class UpdateCoinDeskServiceImpl implements UpdateCoinDeskService {

	@Autowired
	private CoinDeskRepository coinDeskRepository;

	@Override
	public String getUpdateCoinDesk(UpdateTranrq request) {
		String result = null;
		try {
			CoinDesk entity = new CoinDesk();
			entity.setCode(request.getCode());
			entity.setChartName(request.getChartName());
			entity.setDescription(request.getDescription());
			entity.setDisclaimer(request.getDisclaimer());
			entity.setRate(request.getRate());
			entity.setRateFloat(request.getRateFloat());
			entity.setSymbol(request.getSymbol());
			entity.setUpdate(request.getUpdate());

			coinDeskRepository.save(entity);
			result = "更新成功";
		} catch (Exception e) {
			result = "更新失敗";
		}

		return result;
	}

}
