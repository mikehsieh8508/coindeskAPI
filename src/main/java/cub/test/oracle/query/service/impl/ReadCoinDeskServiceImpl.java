package cub.test.oracle.query.service.impl;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cub.test.oracle.query.dto.CoinTranrs;
import cub.test.oracle.query.dto.CurrencyDetail;
import cub.test.oracle.query.dto.TimeVo;
import cub.test.oracle.query.entity.CoinDesk;
import cub.test.oracle.query.repository.CoinDeskRepository;
import cub.test.oracle.query.service.ReadCoinDeskService;
import cub.test.oracle.query.util.DateUtil;

/**
 * <pre>
 * 類別名稱:ReadCoinDeskServiceImpl.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:查詢幣別服務實作
 * 程式設計人員:謝鎮全
 * </pre>
 */
@Service
public class ReadCoinDeskServiceImpl implements ReadCoinDeskService {

	@Autowired
	private CoinDeskRepository coinDeskRepository;

	@Override
	public CoinTranrs getReadCoinDesk(String code) {
		CoinTranrs tranrs = new CoinTranrs();
		List<CoinDesk> dataList = null;
		List<CurrencyDetail> detailList = new LinkedList<>();
		
		if(StringUtils.equals(code, "All")) {
			dataList = coinDeskRepository.findAll();
		}else {
			dataList = coinDeskRepository.findByCode(code);
		}
		
		if(dataList != null && !dataList.isEmpty()) {
			Map<String, CurrencyDetail> mapObject = new HashMap<>();
			for (CoinDesk data : dataList) {
				CurrencyDetail detail = new CurrencyDetail();
				BeanUtils.copyProperties(data, detail);
				mapObject.put(detail.getCode(), detail);
				detailList.add(detail);
			}
			TimeVo time = new TimeVo();
			LocalDateTime localDateTime = DateUtil.getTime(dataList.get(0).getUpdate());
			time.setUpdated(DateUtil.getDateUTC(localDateTime));
			time.setUpdatedISO(DateUtil.getDateISO(localDateTime));
			time.setUpdateduk(DateUtil.getDateGMT(localDateTime));
			
			tranrs.setTime(time);
			tranrs.setDisclaimer(dataList.get(0).getDisclaimer());
			tranrs.setChartName(dataList.get(0).getChartName());
			tranrs.setBpi(mapObject);
			
		}else {
			tranrs = new CoinTranrs();
		}
		
		return tranrs;
	}

}
