package com.google.chapter06;

public class Laptop {
	private char color;
	private int cpu;

	public Laptop() {
	}

	public Laptop(char color, int cpu) {
		this.color = color;
		this.cpu = cpu;
	}

	public void laptopInfo() {
		System.out.println("CPU:" + cpu + " Color:" + color);
	}
}
