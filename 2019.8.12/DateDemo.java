package com.neuedu.test3;

import java.util.Calendar;

public class DateDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // ʵ����Calendar����
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year+"��"+month+"��"+day+"��"+" "+hour+":"+minute+":"+second);
	}
}
