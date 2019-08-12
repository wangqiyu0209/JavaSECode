package com.neuedu.test3;

import java.util.Calendar;
import java.util.Date;

/**
* @ClassName: Demo
* @Description: 计算当前日期加上100天之后的日期
* @author wqy
* @date 2019年8月12日 上午11:32:20
*
*/
public class Demo {

	public static void main(String[] args) {
		Date date = new Date();
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		ca.add(Calendar.DAY_OF_WEEK, 100);// num为增加的天数，可以改变的
		System.out.println("增加天数以后的日期："+ca.getTime());
	}
}
