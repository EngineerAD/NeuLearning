package com.google.chapter03;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������ٷ��Ƴɼ�");
		int score = sc.nextInt();
		if (score <= 100 && score >= 0) {
			switch (score / 10) {
			case 10:

			case 9:
				System.out.println("����");
				break;
			case 8:

			case 7:
				System.out.println("����");
				break;
			case 6:
				System.out.println("����");
				break;
			default:
				System.out.println("������");
				break;
			}
		} else {
			System.out.println("���ֲ��Ϸ���������ٷ�����Ч�ɼ�");
		}
		sc.close();
	}

}
