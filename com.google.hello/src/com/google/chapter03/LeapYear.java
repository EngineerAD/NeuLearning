package com.google.chapter03;

public class LeapYear {

	public static void main(int year) {
		// int year = 2023;
		if (year % 400 != 0 && year % 100 == 0) {
			System.out.print(year + "年不是闰年");
		} else if (year % 4 == 0 || year % 400 == 0) {
			System.out.print(year + "年是闰年");
		} else {
			System.out.print(year + "年不是闰年");
		}

	}

}
