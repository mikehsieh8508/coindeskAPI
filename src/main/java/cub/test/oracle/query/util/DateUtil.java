package cub.test.oracle.query.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <pre>
 * 類別名稱:DateUtil.java
 * 版本資訊:1.0 / 2021年12月
 * 版本內容:時間格式工具
 * 程式設計人員:謝鎮全
 * </pre>
 */
public class DateUtil {

	public static final String FORMAT_DATE_UTC = "MMM dd, yyyy HH:mm:ss Z";

	public static final String FORMAT_DATE_ISO = "yyyy-MM-dd'T'HH:mm:ss.SSS";

	public static final String FORMAT_DATE_GMT = "MMM dd, yyyy HH:mm:ss Z";

	public static final String FORMAT_DATE = "yyyy/MM/dd HH:mm:ss";

	/**
	 * Date UTC
	 * 
	 * @param dateTime
	 * @return
	 */
	public static String getDateUTC(LocalDateTime dateTime) {
		String utcDate = null;
		if (null != dateTime) {
			ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("UTC"));
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE_UTC);
			utcDate = zonedDateTime.format(formatter);
		}
		return utcDate;
	}

	/**
	 * Date ISO
	 * 
	 * @param dateTime
	 * @return
	 */
	public static String getDateISO(LocalDateTime dateTime) {
		String isoDate = null;
		if (null != dateTime) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE_ISO);
			isoDate = dateTime.format(formatter);
		}
		return isoDate;
	}

	/**
	 * Date GMT
	 * 
	 * @param dateTime
	 * @return
	 */
	public static String getDateGMT(LocalDateTime dateTime) {
		String gmtDate = null;
		if (null != dateTime) {
			ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("GMT"));
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE_GMT);
			gmtDate = zonedDateTime.format(formatter);
		}
		return gmtDate;
	}

	/**
	 * String to LocalDateTime
	 * 
	 * @param dateTime
	 * @return
	 */
	public static LocalDateTime getTime(String dateTime) {
		String timeStr = dateTime;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE);
		LocalDateTime localDate = LocalDateTime.parse(timeStr, formatter);
		return localDate;
	}
	

}
