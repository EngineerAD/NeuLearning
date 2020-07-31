package com.google.chapter06;

public class Vehicle {
	/**
	 * @author 吴昇 Encode=GBK
	 * @version 1.0
	 * @since 1.8 欢迎反馈更多bug function:完成课后习题
	 */
	private String brand, color;
	private double speed;

	public Vehicle() {
		this.setBrand("Maserati");
		this.setColor("white");
	}

	public Vehicle(String brand) {
		this.setBrand(brand);
		this.setColor("white");
	}

	public Vehicle(String brand, String color) {
		this.setBrand(brand);
		this.setColor(color);
	}

	{
		this.setSpeed(0);
	}
	static {
		System.out.println("车辆初始化完成");
	}

	public String getBrand() {
		return brand;
	}

	private void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		if (speed > 300 || speed < 0)
			System.err.print("该速度不属于正常范围内，请重新设定速度\n");
		else
			this.speed = speed;
	}

	public void run() {
		System.out.println("目前" + this.getColor() + " " + this.getBrand() + "行驶速度：" + this.getSpeed());
	}

}
