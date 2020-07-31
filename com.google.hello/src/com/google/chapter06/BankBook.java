package com.google.chapter06;

import java.util.Scanner;

public class BankBook {

	String name;
	double money;

	public static void main(String[] args) {
		// 1.创建一个数组，长度是3，数组中装BankBook对象，name和money手动输入
		BankBook[] array = new BankBook[3];

		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			BankBook b = new BankBook();
			System.out.println("请输入第" + (i + 1) + "用户的姓名");
			b.name = sc.nextLine();
			System.out.println("请输入第" + (i + 1) + "用户的钱");
			b.money = sc.nextDouble();
			// 把b放数组里
			array[i] = b;
			sc.close();
		}

		// 2.根据money排序，按照顺序输出每个对象的信息
		for (int i = 1; i < 3; i++) {
			for (int j = 0; j < 3 - i; j++) {
				if (array[j].money > array[j + 1].money) {
					BankBook temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (BankBook b : array) {
			System.out.println(b.name + b.money);
		}

	}

}
