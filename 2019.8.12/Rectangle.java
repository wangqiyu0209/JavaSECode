package com.neuedu.test2;

/**
* @ClassName: Rectangle
* @Description: TODO(������һ�仰��������������)
* @author wqy
* @date 2019��8��10�� ����5:12:53
*
*/
public class Rectangle extends Shape{

	private int width;
	private int height;
	
	public  Rectangle () {
		super();
	}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
    // ����Rectangle���Ǹ��� area ����
	@Override 
	public double area() {
		return width*height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
