package com.neuedu.test3;

import java.util.Calendar;

public class DateDemo1 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year+"年"+month+"月"+day+"日"+" "+hour+"时"+minute+"分"+second+"秒");
	}
}
