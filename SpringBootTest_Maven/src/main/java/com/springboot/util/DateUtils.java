package com.springboot.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @date 2016年1月12日
 *
 * @author zhangqiang6
 *
 * @Description: TODO
 *
 **/
public class DateUtils {
	public static String getCurrectTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = new Date();
		return formatter.format(d);
	}

	public static String getTimeByDate(Date d) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(d);
	}

	public static int daysBetween(String begindate, String enddate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(begindate));
		long time1 = cal.getTimeInMillis();
		cal.setTime(sdf.parse(enddate));
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);
		int days = Integer.parseInt(String.valueOf(between_days));
		return days > 0 ? days : 0;
	}

	public static String getDate(String date) {
		return date.substring(0, 10);
	}

	public static String getDateAfter(String date, int days) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(date));
		cal.add(Calendar.DATE, days);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(cal.getTime());

	}

	public static boolean after(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(date));
		Calendar today = Calendar.getInstance();
		return cal.after(today);
	}

	public static boolean before(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(date));
		Calendar today = Calendar.getInstance();
		return cal.before(today);
	}

	public static boolean isValidDate(String dataString) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			sdf.parse(dataString);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
}
