package com.neuedu.test3;

import java.util.Calendar;
import java.util.Date;

/**
* @ClassName: Demo
* @Description: ���㵱ǰ���ڼ���100��֮�������
* @author wqy
* @date 2019��8��12�� ����11:32:20
*
*/
public class Demo {

	public static void main(String[] args) {
		Date date = new Date();
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		ca.add(Calendar.DAY_OF_WEEK, 100);// numΪ���ӵ����������Ըı��
		System.out.println("���������Ժ�����ڣ�"+ca.getTime());
	}
}
