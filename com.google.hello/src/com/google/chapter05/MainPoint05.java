package com.google.chapter05;

import com.google.chapter03.PrimeNumber;

/**
 * @author 吴昇 Encoding:GBK
 * @version 1.0
 * @since 1.8
 * Bug：Integer.toString(n).charAt()方法取值失败，以n=153为例子，会分别取出49，53，55
 * 欢迎反馈更多bug
 */
public class MainPoint05 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 1、编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。 [必做题]
		System.out.println(countFactorial(5));
		// 2、编写一个方法，判断该年份是平年还是闰年。[必做题]
		isLeapYear(2020);
		// 1、编写一个方法，输出大于200的最小的质数。[选做题]
		minPrimeBiggerThan200();
		// 2、写一个方法，功能：定义一个一维的int
		// 数组，长度任意,然后将它们按从小到大的顺序输出（使用冒泡排序）（知识点：方法的定义和访问）。[选做题]
		a();
		// 3.设计一个方法，入参是是一个整数，返回值是一个boolean. 判断入参是不是水仙花数。
		int n = 153;
		if (isNarcissisticNumber(n))
			System.out.println(n + "是一个水仙花数");
		else
			System.out.println(n + "不是一个水仙花数");
	}

	public static void a() {
		int a[] = { 9, 5, 8, 7, 6, 4, 3, 2, 1 };
		bobSort(a);
	}

	public static boolean isNarcissisticNumber(int n) {
		int n1, n2, n3;
		if (Integer.toString(n).length() == 3) {
			n1 = n / 100;
			n2 = n / 10 % 10;
			n3 = n % 100 % 10;
			if (Math.pow(n1, 3) + Math.pow(n2, 3) + Math.pow(n3, 3) == n)
				return true;
		}
		return false;
	}

	public static void bobSort(int a[]) {
		// int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static void minPrimeBiggerThan200() {
		for (int i = 200; i > 0; i++) {
			if (PrimeNumber.isPrime(i)) {
				System.out.println("大于200的最小质数:" + i);
				break;
			}
		}
	}
//算阶乘
	public static int countFactorial(int n) {
		int sum = 1;
		for (int i = n; i > 0; i--) {
			sum *= i;
		}
		return sum;
	}

	public static int recursionFactorial(int n) {
		// 递归解算阶乘
		// 该解法容易引起内存的大量占用，尽量少用
		if (n == 2) {
			return 2;
		}

		return n * recursionFactorial(n - 1);

	}

	public static void isLeapYear(int year) {
		// int year = 2023;
		if (year % 400 != 0 && year % 100 == 0) {
			System.out.println(year + "年不是闰年");
		} else if (year % 4 == 0 || year % 400 == 0) {
			System.out.println(year + "年是闰年");
		} else {
			System.out.println(year + "年不是闰年");
		}
	}
}
