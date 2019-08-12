package com.neuedu.test2;

/**
* @ClassName: Shape
* @Description: 设计图形（Shape）类
* @author wqy
* @date 2019年8月10日 下午5:13:00
*
*/
public class Shape {

	public Point p;
	
	public Shape() {
		super();
	}

	public Shape(Point p) {
		this.p = p;
	}
	
	public double area() {
		return 0;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
	
	
}
