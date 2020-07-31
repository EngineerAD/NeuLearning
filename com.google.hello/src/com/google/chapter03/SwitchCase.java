package com.google.chapter03;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入百分制成绩");
		int score = sc.nextInt();
		if (score <= 100 && score >= 0) {
			switch (score / 10) {
			case 10:

			case 9:
				System.out.println("优秀");
				break;
			case 8:

			case 7:
				System.out.println("良好");
				break;
			case 6:
				System.out.println("及格");
				break;
			default:
				System.out.println("不及格");
				break;
			}
		} else {
			System.out.println("数字不合法，请输入百分制有效成绩");
		}
		sc.close();
	}

}
