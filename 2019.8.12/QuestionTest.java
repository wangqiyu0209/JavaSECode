package com.neuedu.test4;

/**
* @ClassName: QuestionTest
* @Description: ������
* @author wqy
* @date 2019��8��12�� ����3:09:44
*
*/
public class QuestionTest {

	public static void main(String[] args) {
		// ������ѡ��
		MultiChoice mc = new MultiChoice("java���������ص㣿",new String[] {"1.�̳�","2.��װ","3.��̬","4.��"},new int[]{1,2});
		int[] answer = new int[] {1,2};
		boolean check = mc.check(answer);
		System.out.println(check);
		
		// ������ѡ��
		SingleChoice sc = new SingleChoice("����������ô����",new String[] {"1.��","2.���","3.һ��","4.�ܺ�"},2);
		boolean check2 = sc.check(new int[] {2});
		System.out.println(check2);
;	}
}
