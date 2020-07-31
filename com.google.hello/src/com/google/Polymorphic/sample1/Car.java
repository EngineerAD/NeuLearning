package com.google.Polymorphic.sample1;

public class Car extends Vehicle{
	
	private int loader;
	
	public Car(String brand, String color, int loader)
	{
		super(brand, color);
		this.loader = loader;		
	}
	
	public static void main(String[] args) {
		
		Car c = new Car("honda","red",2);
		
		System.out.println(c.loader +"\t"+ c.getBrand() + "\t" + c.getColor());
		
	}

}
class Vehicle{
	
	private String brand;
	private String color;
	private int speed = 0;
	
	public Vehicle(String brand, String color)
	{
		this.brand = brand;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}

