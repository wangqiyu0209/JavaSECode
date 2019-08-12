package com.neuedu.test4;

/**
* @ClassName: Student
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 用数组作为存储结构的简易的学生管理系统
* 定义一个student类,在其中添加私有化的成员变量，通过getter和setter方法进行调用
* @date 2019年8月11日 下午10:08:48
*
*/
public class Student {

	//学号，姓名，性别，年龄，成绩
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
