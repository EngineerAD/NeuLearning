package com.google.chapter05;

import java.util.Random;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		table();
		Random r= new Random();
		
		System.out.println(sum(r.nextInt(),r.nextInt()));
	}

	public static void table() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i + 1; j++)
				System.out.print(i + "*" + j + "=" + i * j + " ");
			System.out.println();
		}
	}

	public static int sum(int x, int y) {
		System.out.println(x+"+"+y+"=");
		return x+y;
	}

}
