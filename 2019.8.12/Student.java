package com.neuedu.test4;

/**
* @ClassName: Student
* @Description: TODO(������һ�仰��������������)
* @author ��������Ϊ�洢�ṹ�ļ��׵�ѧ������ϵͳ
* ����һ��student��,���������˽�л��ĳ�Ա������ͨ��getter��setter�������е���
* @date 2019��8��11�� ����10:08:48
*
*/
public class Student {

	//ѧ�ţ��������Ա����䣬�ɼ�
	private String stuNo;
	private String stuName;
	private String gender;
	private int age;
	private int num;
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "[" + stuNo + "\t|" + stuName + "\t|" + gender + "\t|" + age + "\t|" + num + "]";
	}
	
}
