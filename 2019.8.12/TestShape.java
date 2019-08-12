package com.neuedu.test2;

import com.neuedu.test.Point;

/**
* @ClassName: TestShape
* @Description:测试类
* @author wqy
* @date 2019年8月10日 下午9:39:35
*
*/
public class TestShape {

	public static void main(String[] args) {
		
		Circle circle = new Circle(2);
		System.out.println("圆的面积为："+circle.area());
		
		Rectangle rectangle = new Rectangle(2,4);
		System.out.println("矩形的面积为："+rectangle.area());
    }
}
