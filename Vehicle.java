package com.neuedu.test2;

/**
* @ClassName: Vehicle
* @Description: TODO(这里用一句话描述这个类的作用)
* @author wqy
* @date 2019年8月9日 下午1:48:48
*
*/
public class Vehicle {

	private String brand;
	private String color;
	private double speed;
	
	public Vehicle(){
		super();
	}
	public Vehicle(String brand, String color, double speed) {
		super();
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	
	public void run() {
		System.out.println("一辆颜色为"+color+"的"+brand+"以初速度"+speed+"起步");
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String getBrand() {
		return brand;
	}
	

}
