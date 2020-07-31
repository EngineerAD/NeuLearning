package com.google.chapter07;

public class Triangle {
	private int bc1;
	private int bc2;
	private int bc3;

	public Triangle(int bc1, int bc2, int bc3) {
		if (bc1 + bc2 > bc3 && bc1 + bc3 > bc2 && bc2 + bc3 > bc1) {
			this.bc1 = bc1;
			this.bc2 = bc2;
			this.bc3 = bc3;
			System.out.println("是三角形");
		} else {
			System.out.println("不是三角形");
		}
	}
public Triangle(){}
	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 10, 30);
	}

}
