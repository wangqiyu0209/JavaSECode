package com.neuedu.test2;

/**
* @ClassName: Circle
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wqy
* @date 2019年8月10日 下午5:12:57
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

	//  子类Circle覆盖父类 area 方法
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
