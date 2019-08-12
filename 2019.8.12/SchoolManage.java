package com.neuedu.test2;

import java.util.Scanner;

/**
* @ClassName: SchoolManage
* @Description: 系统启动时，创建一个学校.
* @author wqy
* @date 2019年8月9日 下午7:32:50
*
*/
public class SchoolManage {

	public static void main(String[] args) {
		welcome();
	}
	public static void welcome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("**************************************************");
		System.out.println("*-------------- 欢迎登陆学生管理系统----------------");
		System.out.println("*   1.登陆                                                               2.退出       * ");
		System.out.println("***************************************************");
		System.out.println("请选择：");
		int nextInt = scanner.nextInt();
		switch(nextInt) {
		case 1:
			//
			System.out.println("登陆成功！");
			break;
		case 2:
			//
			System.out.println("退出！");
			break;
		default:
			//
			System.out.println("输入有误，请重新输入！");
			welcome();
		}
	}
	
	// 请输入用户名和密码
	public String user;
	private int[] psw;
	
	
}
