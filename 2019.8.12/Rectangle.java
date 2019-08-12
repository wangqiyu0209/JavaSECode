package com.neuedu.test2;

/**
* @ClassName: Rectangle
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wqy
* @date 2019年8月10日 下午5:12:53
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
	
    // 子类Rectangle覆盖父类 area 方法
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
