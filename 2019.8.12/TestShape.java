package com.neuedu.test2;

import com.neuedu.test.Point;

/**
* @ClassName: TestShape
* @Description:������
* @author wqy
* @date 2019��8��10�� ����9:39:35
*
*/
public class TestShape {

	public static void main(String[] args) {
		
		Circle circle = new Circle(2);
		System.out.println("Բ�����Ϊ��"+circle.area());
		
		Rectangle rectangle = new Rectangle(2,4);
		System.out.println("���ε����Ϊ��"+rectangle.area());
    }
}
