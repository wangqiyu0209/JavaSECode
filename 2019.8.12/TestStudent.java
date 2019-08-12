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
		System.out.println("*-------------- ��ӭ��½ѧ������ϵͳ-------------*");
		System.out.println("*   1.��½                           2.�˳�      * ");
		System.out.println("***************************************************");
		System.out.println("��ѡ��");
		int nextInt = scanner.nextInt();
		switch(nextInt) {
		case 1:
			//
			System.out.println("��½�ɹ���");
			while(tag) {
				System.out.println("1.����ѧ������");
				System.out.println("2.ɾ��ѧ������");
				System.out.println("3.�޸�ѧ������");
				System.out.println("4.��ѯѧ������");
				System.out.println("5.�˳�ѧ������ϵͳ");
				
				int scanner_num = scanner.nextInt();
				System.out.println("�����룺");
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
			System.out.println("�˳���");
			break;
		default:
			//
			System.out.println("�����������������룡");
			welcome();
		}
		
	}

	public static void add() {
		while (tag_1) {
			
			stu[num] = new Student();
			System.out.println("����������ѧ�ţ��������Ա����䣬�ɼ�");
			stu[num].setStuNo(scanner.next());
			stu[num].setStuName(scanner.next());
			stu[num].setGender(scanner.next());
			stu[num].setAge(scanner.nextInt());
			stu[num].setNum(scanner.nextInt());
			
			num++;
			
			System.out.println("��������������true����������false");
			tag_1 = scanner.hasNextBoolean();
		}
		
		sort();		
		query();
		
	}
	// ��ѧ����Ϣ�������򣬸÷����˵��в���ѡ�񣬵��������������е���
	public static void sort() {
		int i = num - 1;
		for(int j = 0 ; j < i ; j++) {
			for(int k = 0 ; k <i - j; k++) {
				// ���αȽ����ڵ�����Ԫ��,ʹ�ϴ���Ǹ������
				if(stu[k].getNum() > stu[k+1].getNum()) {
					int temp = stu[k].getNum();
					stu[k].setNum(stu[k].getNum()) ;
					stu[k+1].setNum(temp);
				}
			}		
		}
	}
	
	static boolean delete = false;
	
	// ɾ��ѧ�����ݵķ���
	public static void delete() {
		System.out.println("��������Ҫɾ����ѧ��");
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
			System.out.println("���޴���");
		}
		
		num--;
	}
	
	static boolean update = false;
	
	// �޸�ѧ����Ϣ�ķ���
	public static void update() {
		System.out.println("��������Ҫ�޸ĵ�ѧ��");
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
			System.out.println("���޴���");
		}
		sort();
		query();
	}
	
	// ��ѯѧ����Ϣ����ӡ
	public static void query() {
		System.out.println("[ѧ��  |����    |�Ա�   |����   |�ɼ�]");
		for(int i = 0 ; i < num;i++) {
			System.out.println(stu[i]);
		}
	}
}
