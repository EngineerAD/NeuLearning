package com.google.chapter06;

import java.util.Scanner;

public class BankBook {

	String name;
	double money;

	public static void main(String[] args) {
		// 1.����һ�����飬������3��������װBankBook����name��money�ֶ�����
		BankBook[] array = new BankBook[3];

		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			BankBook b = new BankBook();
			System.out.println("�������" + (i + 1) + "�û�������");
			b.name = sc.nextLine();
			System.out.println("�������" + (i + 1) + "�û���Ǯ");
			b.money = sc.nextDouble();
			// ��b��������
			array[i] = b;
			sc.close();
		}

		// 2.����money���򣬰���˳�����ÿ���������Ϣ
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
