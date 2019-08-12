package com.neuedu.test4;

import java.util.Scanner;

public class TestStudent {

	static int num = 0;
	static boolean tag = true;
	static boolean tag_1 = true;
	
	static Student[] stu = new Student[100];
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		welcome();
		
	}
	
	public static void welcome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("**************************************************");
		System.out.println("*-------------- 欢迎登陆学生管理系统-------------*");
		System.out.println("*   1.登陆                           2.退出      * ");
		System.out.println("***************************************************");
		System.out.println("请选择：");
		int nextInt = scanner.nextInt();
		switch(nextInt) {
		case 1:
			//
			System.out.println("登陆成功！");
			while(tag) {
				System.out.println("1.增加学生数据");
				System.out.println("2.删除学生数据");
				System.out.println("3.修改学生数据");
				System.out.println("4.查询学生数据");
				System.out.println("5.退出学生管理系统");
				
				int scanner_num = scanner.nextInt();
				System.out.println("请输入：");
				switch(scanner_num) {
				case 1:
					add();
					break;
				case 2:
					delete();
					break;
				case 3:
					update();
					break;
				case 4:
					query();
					break;
				case 5:
					tag = false;
					break;
				default:
					break;
				}
				
			}
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

	public static void add() {
		while (tag_1) {
			
			stu[num] = new Student();
			System.out.println("请依次输入学号，姓名，性别，年龄，成绩");
			stu[num].setStuNo(scanner.next());
			stu[num].setStuName(scanner.next());
			stu[num].setGender(scanner.next());
			stu[num].setAge(scanner.nextInt());
			stu[num].setNum(scanner.nextInt());
			
			num++;
			
			System.out.println("继续输入请输入true，否者输入false");
			tag_1 = scanner.hasNextBoolean();
		}
		
		sort();		
		query();
		
	}
	// 对学生信息进行排序，该方法菜单中不可选择，但会在其他方法中调用
	public static void sort() {
		int i = num - 1;
		for(int j = 0 ; j < i ; j++) {
			for(int k = 0 ; k <i - j; k++) {
				// 依次比较相邻的两个元素,使较大的那个向后移
				if(stu[k].getNum() > stu[k+1].getNum()) {
					int temp = stu[k].getNum();
					stu[k].setNum(stu[k].getNum()) ;
					stu[k+1].setNum(temp);
				}
			}		
		}
	}
	
	static boolean delete = false;
	
	// 删除学生数据的方法
	public static void delete() {
		System.out.println("请输入你要删除的学号");
		String stuNumber = scanner.next();
		
		for(int i = 0 ; i< num;i++) {
			if(stuNumber.equals(stu[i].getStuNo())) {
				delete = true ;
				break;
			}
		}
		
		if(delete) {
			for(int j = 0; j<num;j++) {
				stu[j].setStuNo(stu[j+1].getStuNo());
				stu[j].setStuName(stu[j+1].getStuName());
				stu[j].setGender(stu[j+1].getGender());
				stu[j].setAge(stu[j+1].getAge());
				stu[j].setNum(stu[j+1].getNum());
			}
		}else {
			System.out.println("查无此人");
		}
		
		num--;
	}
	
	static boolean update = false;
	
	// 修改学生信息的方法
	public static void update() {
		System.out.println("请输入你要修改的学号");
		String stuNumber = scanner.next();
		for(int i = 0 ; i< num;i++) {
			if(stuNumber.equals(stu[i].getStuNo())) {
				update = true ;
				break;
			}
		}
		
		if(update) {
			for(int j = 0; j<num;j++) {
				stu[j].setStuNo(stu[j+1].getStuNo());
				stu[j].setStuName(stu[j+1].getStuName());
				stu[j].setGender(stu[j+1].getGender());
				stu[j].setAge(stu[j+1].getAge());
				stu[j].setNum(stu[j+1].getNum());
			}
		}else {
			System.out.println("查无此人");
		}
		sort();
		query();
	}
	
	// 查询学生信息并打印
	public static void query() {
		System.out.println("[学号  |姓名    |性别   |年龄   |成绩]");
		for(int i = 0 ; i < num;i++) {
			System.out.println(stu[i]);
		}
	}
}
