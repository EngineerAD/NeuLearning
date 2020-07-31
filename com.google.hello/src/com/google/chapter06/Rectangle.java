package com.google.chapter06;

public class Rectangle {
	private float length=0, width=0;

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public static void main(String[] args) {

	}

	public float getArea() {
		return length*width;
	}

	public float getPer() {
		return (length+width)*2;
	}

	public void showAll() {
		System.out.println("��" + length + " ��" + width + " �ܳ�" + getPer() + " ���" + getArea());
	}
}
