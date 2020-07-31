package com.google.chapter05;

import com.google.chapter03.PrimeNumber;

/**
 * @author ��N Encoding:GBK
 * @version 1.0
 * @since 1.8
 * Bug��Integer.toString(n).charAt()����ȡֵʧ�ܣ���n=153Ϊ���ӣ���ֱ�ȡ��49��53��55
 * ��ӭ��������bug
 */
public class MainPoint05 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 1����дһ��������������n�Ľ׳ˣ�����5�Ľ׳���1*2*3*4*5�� [������]
		System.out.println(countFactorial(5));
		// 2����дһ���������жϸ������ƽ�껹�����ꡣ[������]
		isLeapYear(2020);
		// 1����дһ���������������200����С��������[ѡ����]
		minPrimeBiggerThan200();
		// 2��дһ�����������ܣ�����һ��һά��int
		// ���飬��������,Ȼ�����ǰ���С�����˳�������ʹ��ð�����򣩣�֪ʶ�㣺�����Ķ���ͷ��ʣ���[ѡ����]
		a();
		// 3.���һ���������������һ������������ֵ��һ��boolean. �ж�����ǲ���ˮ�ɻ�����
		int n = 153;
		if (isNarcissisticNumber(n))
			System.out.println(n + "��һ��ˮ�ɻ���");
		else
			System.out.println(n + "����һ��ˮ�ɻ���");
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
				System.out.println("����200����С����:" + i);
				break;
			}
		}
	}
//��׳�
	public static int countFactorial(int n) {
		int sum = 1;
		for (int i = n; i > 0; i--) {
			sum *= i;
		}
		return sum;
	}

	public static int recursionFactorial(int n) {
		// �ݹ����׳�
		// �ýⷨ���������ڴ�Ĵ���ռ�ã���������
		if (n == 2) {
			return 2;
		}

		return n * recursionFactorial(n - 1);

	}

	public static void isLeapYear(int year) {
		// int year = 2023;
		if (year % 400 != 0 && year % 100 == 0) {
			System.out.println(year + "�겻������");
		} else if (year % 4 == 0 || year % 400 == 0) {
			System.out.println(year + "��������");
		} else {
			System.out.println(year + "�겻������");
		}
	}
}
