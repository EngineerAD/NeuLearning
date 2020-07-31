package com.google.chapter03;

/*
 * 从控制台中收进来一个数1-200之间，判断是不是素数（质数），除了1和本身，不能被其他数整除。13,17,19
 * 
 * n: n%2.....n%n-1
 * */
public class PrimeNumber {
	public static boolean main(int oNum) {
		// Scanner input = new Scanner(System.in);
		// System.out.println("请输入1-200(含)的一个数");
		// int oNum = input.nextInt();
		boolean flag = isPrime(oNum);
		// 输出
		if (flag) {
			//System.out.println(oNum + "是素数");
			return true;
		} else {
			//System.out.println(oNum + "不是素数");
			return false;
		}
	}

	public static boolean isPrime(int oNum) {
		for (int i = 2; i < Math.sqrt(oNum); i++) {
			if (oNum % i == 0) {
				return false;
			}
		}
		return true;
	}
}
