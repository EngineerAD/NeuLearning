package com.google.chapter02;

public class VAOMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 999;

		int bai = a / 100;

		int shi = a % 100 / 10;

		int ge = a % 10;

		int sum = bai + shi + ge;

		System.out.println(sum);
	}

}
