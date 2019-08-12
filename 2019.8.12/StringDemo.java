package com.neuedu.test4;
/**
* @ClassName: StringDemo
* @Description: String中的API
* @author wqy
* @date 2019年8月12日 下午4:18:14
*
*/
public class StringDemo {

	public static void main(String[] args) {
		
		// charAt()根据字符找索引找字符
		String string = new String("我爱编程");
		char c = string.charAt(2);
		System.out.println(c);
		
		// trim()去除字符串首位末尾的空格
		String string1 = new String("  我爱编程  我爱java  ");
		String string2 = string1.trim();
		System.out.println(string2);
		
		// toLowerCase()大写转小写
		String string3 = new String("I LoVe YoU");
		String string4 = string3.toLowerCase();
		System.out.println(string4);
		
		// indexOf() 根据索引找字符 
		String string5 = new String("LoVe");
		int string6 = string5.indexOf("e");
		System.out.println(string6);
		
		// endsWith() 以...结束，返回值类型Boolean
		String string7 = new String("好好学习天天向上.java");
		Boolean end = string7.endsWith(".java");
		System.out.println(end);// 结果为true
		
		// startsWith()以...开始，返回值类型Boolean
		String string8 = new String("好好学习天天向上.java");
		Boolean start = string8.startsWith("好好");
		System.out.println(start);// 结果为true
		
		// substring(int start, int end)字符串的截取，一般都是左闭右开
		String string9 = new String("好好学习天天向上.java");
		String string10 = string9.substring(1, 4);
		System.out.println(string10);
		
		// substring(int start)从第几位开始之后的都取
		String string11 = new String("好好学习天天向上.java");
		String string12 = string11.substring(2)	;
		System.out.println(string12);
		
		//getChars() 取字符串的内容
		String string13 = "好好学习天天向上.java";
			//取的内容，多少位用数组接收
		char[] string14 = new char[4];
	            //开始位 //结束位 //取的内容 
		string13.getChars(0, 4, string14, 0);
		String string15 = new String(string14);
		System.out.println(string14);
		
		// toCharArray() 字符串和字符可以相互转换
		String string16 = "好好学习天天向上";
		char[] ch = string16.toCharArray();
		// foreach加强for循环
		for(char cha:ch) {
			System.out.println(cha);
		}
		
		// isEmpty()判断是否为空，是否有值
		String string17 = "好好学习天天向上";
		Boolean bool = string17.isEmpty();
		System.out.println(bool);
		
		//LastIndexOf()字符串中相同字符最后一次出现的字符的位置
		String string18  = "今天是不一般的一天";
		int num = string18.lastIndexOf("天");
		System.out.println(num);
		
		// split()字符串的切分，切分成数组
		String string19  = "今天是不一般的一天，台风就要登录了，下的好大的雨";
		String[] string20 = string19.split("，");
		for(int i=0;i<string20.length;i++) {
			System.out.println(string20[i]);
		}
		
		//foreach循环 增强for循环
		 // 迭代器
//		for(String string21 : string20) {
//			System.out.println(string21);
//		}
		
		//valueOf()将其他类型转为String类型
		int number = 100;
		String string21 = String.valueOf(number);
		System.out.println(string21+100);
	}
}
