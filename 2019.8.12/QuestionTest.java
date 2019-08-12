package com.neuedu.test4;

/**
* @ClassName: QuestionTest
* @Description: 测试类
* @author wqy
* @date 2019年8月12日 下午3:09:44
*
*/
public class QuestionTest {

	public static void main(String[] args) {
		// 构建多选题
		MultiChoice mc = new MultiChoice("java面向对象的特点？",new String[] {"1.继承","2.封装","3.多态","4.简单"},new int[]{1,2});
		int[] answer = new int[] {1,2};
		boolean check = mc.check(answer);
		System.out.println(check);
		
		// 构建单选题
		SingleChoice sc = new SingleChoice("今天天气怎么样？",new String[] {"1.好","2.糟糕","3.一般","4.很好"},2);
		boolean check2 = sc.check(new int[] {2});
		System.out.println(check2);
;	}
}
