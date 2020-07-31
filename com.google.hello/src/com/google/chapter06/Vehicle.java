package com.google.chapter06;

public class Vehicle {
	/**
	 * @author ��N Encode=GBK
	 * @version 1.0
	 * @since 1.8 ��ӭ��������bug function:��ɿκ�ϰ��
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
		System.out.println("������ʼ�����");
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
			System.err.print("���ٶȲ�����������Χ�ڣ��������趨�ٶ�\n");
		else
			this.speed = speed;
	}

	public void run() {
		System.out.println("Ŀǰ" + this.getColor() + " " + this.getBrand() + "��ʻ�ٶȣ�" + this.getSpeed());
	}

}
