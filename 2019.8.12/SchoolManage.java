package com.neuedu.test2;

import java.util.Scanner;

/**
* @ClassName: SchoolManage
* @Description: ϵͳ����ʱ������һ��ѧУ.
* @author wqy
* @date 2019��8��9�� ����7:32:50
*
*/
public class SchoolManage {

	public static void main(String[] args) {
		welcome();
	}
	public static void welcome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("**************************************************");
		System.out.println("*-------------- ��ӭ��½ѧ������ϵͳ----------------");
		System.out.println("*   1.��½                                                               2.�˳�       * ");
		System.out.println("***************************************************");
		System.out.println("��ѡ��");
		int nextInt = scanner.nextInt();
		switch(nextInt) {
		case 1:
			//
			System.out.println("��½�ɹ���");
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
	
	// �������û���������
	public String user;
	private int[] psw;
	
	
}
