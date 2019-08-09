package com.neuedu.test2;

/**
* @ClassName: Car
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wqy
* @date 2019年8月9日 下午1:57:30
*
*/
public class Car extends Vehicle{

	private int loader;
	
	public Car() {
		super();
	}

	// 构造方法的重载
	public Car(String brand,String color,int loader,double speed) {
		super(brand,color,speed);
		this.loader = loader;
	}
	
	// 重写方法run()
	@Override
	public void run() {
		System.out.println("一俩"+super.getColor()+"的"+super.getBrand()
		+"载着"+ loader+"个人，以"+super.getSpeed()+"km/h的速度，在飞驰");
	}
	
	public static void main(String[] args) {
		Car car = new Car("benz","black",0,2);
		car.run();
	}
	
	
}
