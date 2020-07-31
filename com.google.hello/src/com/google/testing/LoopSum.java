package com.google.testing;

import java.util.Scanner;

/**
 * @author 吴昇
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8
 * @function 求n位的数字x相加和
 */
public class LoopSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入变量（以x,n的形式的整数）：");
		String[] temp = sc.nextLine().split(",");
		sc.close();
		int[] variables = new int[2];
		variables[0] = Integer.parseInt(temp[0]);
		variables[1] = Integer.parseInt(temp[1]);
		System.out.println("和为" + sum(variables[0], variables[1]));

	}

	public static int sum(int x, int n) {
		int org=x;//记录原始x
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("循环:"+(i+1));
			System.out.println("当前x="+x);
			System.out.println("-----------");
			sum += x;
			//System.out.println("当前和 "+sum);
			x = x * 10+org;
		}
		return sum;
	}
}
