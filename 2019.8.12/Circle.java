package com.neuedu.test2;

/**
* @ClassName: Circle
* @Description: TODO(������һ�仰��������������)
* @author wqy
* @date 2019��8��10�� ����5:12:57
*
*/
public class Circle extends Shape{

	private int radius ;
	
	public Circle() {
		super();
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	//  ����Circle���Ǹ��� area ����
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
