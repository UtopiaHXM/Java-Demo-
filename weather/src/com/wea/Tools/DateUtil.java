package com.wea.Tools;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DateUtil {

	public static java.sql.Date getAfterDay(Date date){
		return new java.sql.Date(date.getTime()+24*3600*1000);
	}
	
	public static int getSerchDaysNums(Date date1,Date date2){
		long time1 = date1.getTime();
		long time2 = date2.getTime();
		int days = (int)(time2-time1)/(3600*24*1000);
		System.out.println("days=="+days);
		return days;
		
	}
	@SuppressWarnings("deprecation")
	public static Date getFormatDate(String dateString){
	
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date inputDate = null;
        Date date = null;
		try {
			inputDate = dateFormat.parse(dateString);
			Calendar cal = Calendar.getInstance();
			cal.setTime(inputDate);
			long seconds = cal.getTimeInMillis();
			date = new Date(seconds);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	public static Date getDate(Date date, int days) {
		long current = date.getTime();
		java.sql.Date currentDate = new java.sql.Date(current);
		String dateString = currentDate.toString();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date inputDate = null;
		Date preDate = null;
		try {
			inputDate = dateFormat.parse(dateString);
			Calendar cal = Calendar.getInstance();
			cal.setTime(inputDate);
			int inputDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
			cal.set(Calendar.DAY_OF_YEAR, inputDayOfYear - days);
			long pre = cal.getTimeInMillis();
			preDate = new java.sql.Date(pre);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preDate;
	}

	public static List<Date> getDateList(Date date, int days){
		List<Date> list = new ArrayList<Date>();
		for(int i=days;i>0;i--){
			Date currentDate = getDate(date, i);
			list.add(currentDate);
		}
		return list;
	}

	public static List<java.sql.Date> orderDateList (Map<java.sql.Date, Float> map){
		
		List<java.sql.Date> list = new ArrayList<java.sql.Date>();
		int i=0;
		Set<java.sql.Date> set = map.keySet();
		long[] longKeys = new long[set.size()];
		Iterator<java.sql.Date> iterator = set.iterator();
		while(iterator.hasNext()){
			java.sql.Date date = iterator.next();
			System.out.println(date);
			longKeys[i] = date.getTime();
			i++;
		}
		java.util.Arrays.sort(longKeys);
		for(int j=0;j<longKeys.length;j++){
			java.sql.Date date = new java.sql.Date(longKeys[j]);
			list.add(date);
		}
		return list;
	}
	
}