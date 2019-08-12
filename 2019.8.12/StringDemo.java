package com.neuedu.test4;
/**
* @ClassName: StringDemo
* @Description: String�е�API
* @author wqy
* @date 2019��8��12�� ����4:18:14
*
*/
public class StringDemo {

	public static void main(String[] args) {
		
		// charAt()�����ַ����������ַ�
		String string = new String("�Ұ����");
		char c = string.charAt(2);
		System.out.println(c);
		
		// trim()ȥ���ַ�����λĩβ�Ŀո�
		String string1 = new String("  �Ұ����  �Ұ�java  ");
		String string2 = string1.trim();
		System.out.println(string2);
		
		// toLowerCase()��дתСд
		String string3 = new String("I LoVe YoU");
		String string4 = string3.toLowerCase();
		System.out.println(string4);
		
		// indexOf() �����������ַ� 
		String string5 = new String("LoVe");
		int string6 = string5.indexOf("e");
		System.out.println(string6);
		
		// endsWith() ��...����������ֵ����Boolean
		String string7 = new String("�ú�ѧϰ��������.java");
		Boolean end = string7.endsWith(".java");
		System.out.println(end);// ���Ϊtrue
		
		// startsWith()��...��ʼ������ֵ����Boolean
		String string8 = new String("�ú�ѧϰ��������.java");
		Boolean start = string8.startsWith("�ú�");
		System.out.println(start);// ���Ϊtrue
		
		// substring(int start, int end)�ַ����Ľ�ȡ��һ�㶼������ҿ�
		String string9 = new String("�ú�ѧϰ��������.java");
		String string10 = string9.substring(1, 4);
		System.out.println(string10);
		
		// substring(int start)�ӵڼ�λ��ʼ֮��Ķ�ȡ
		String string11 = new String("�ú�ѧϰ��������.java");
		String string12 = string11.substring(2)	;
		System.out.println(string12);
		
		//getChars() ȡ�ַ���������
		String string13 = "�ú�ѧϰ��������.java";
			//ȡ�����ݣ�����λ���������
		char[] string14 = new char[4];
	            //��ʼλ //����λ //ȡ������ 
		string13.getChars(0, 4, string14, 0);
		String string15 = new String(string14);
		System.out.println(string14);
		
		// toCharArray() �ַ������ַ������໥ת��
		String string16 = "�ú�ѧϰ��������";
		char[] ch = string16.toCharArray();
		// foreach��ǿforѭ��
		for(char cha:ch) {
			System.out.println(cha);
		}
		
		// isEmpty()�ж��Ƿ�Ϊ�գ��Ƿ���ֵ
		String string17 = "�ú�ѧϰ��������";
		Boolean bool = string17.isEmpty();
		System.out.println(bool);
		
		//LastIndexOf()�ַ�������ͬ�ַ����һ�γ��ֵ��ַ���λ��
		String string18  = "�����ǲ�һ���һ��";
		int num = string18.lastIndexOf("��");
		System.out.println(num);
		
		// split()�ַ������з֣��зֳ�����
		String string19  = "�����ǲ�һ���һ�죬̨���Ҫ��¼�ˣ��µĺô����";
		String[] string20 = string19.split("��");
		for(int i=0;i<string20.length;i++) {
			System.out.println(string20[i]);
		}
		
		//foreachѭ�� ��ǿforѭ��
		 // ������
//		for(String string21 : string20) {
//			System.out.println(string21);
//		}
		
		//valueOf()����������תΪString����
		int number = 100;
		String string21 = String.valueOf(number);
		System.out.println(string21+100);
	}
}
