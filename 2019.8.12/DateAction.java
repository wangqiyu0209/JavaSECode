package com.neuedu.test3;

import java.util.Calendar;

/**
* @ClassName: DateAction
* @Description: ʹ��Calendar��������ʱ��
* @author wqy
* @date 2019��8��12�� ����12:41:39
*
*/
public class DateAction {

	public static void main(String[] args) {
		
		Calendar c =  Calendar.getInstance(); // ʵ����Calendar����
		int year = c.get(Calendar.YEAR); // ͨ��get������õ�ǰ��
		int month = c.get(Calendar.MONTH)+1; // �·�0-11����Ҫ��1
		int day = c.get(Calendar.DAY_OF_MONTH);// ����
		int hour = c.get(Calendar.HOUR_OF_DAY); // ��ȡСʱ
		int minute = c.get(Calendar.MINUTE); // ��ȡ����
		int second = c.get(Calendar.SECOND); // ��ȡ����
		
		System.out.println("��ǰʱ�䣺"+year+"��"+month+"��"+day+"��"+" "+
		hour+":"+minute+":"+second);
	}	
	
}
