package com.google.testing;

import java.util.Scanner;

/**
 * @author 吴昇
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 欢迎反馈更多bug
 * @function 利用栈实现性能优化来判断回文数
 */
public class Palindrome {

	public static void main(String[] args) {
		System.out.println("请输入一个数字，将会告知你该数字是否为回文数：");

		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		sc.close();

		char[] oragin = number.toCharArray();// 获取原始数组
		boolean flag = true;// 标识是否为回文数
		char[] stack = new char[number.length() / 2];// 根据原始数组长度设定栈深度
		
		long startTime = System.nanoTime(); // 获取开始时间

		// 入栈
		for (int i = 0; i < number.length() / 2; i++) {
			stack[i] = oragin[i];
		}

		// 出栈并比对
		int index = number.length() / 2;
		if (number.length() % 2 != 0)
			index = 1 + number.length() / 2;
		for (; index < oragin.length; index++) {
			if (oragin[index] != stack[oragin.length - 1 - index]) {
				flag = false;
				break;
			}
		}
		long endTime = System.nanoTime(); // 获取结束时间

		// 输出结果
		if (flag)
			System.out.println(number + "是回文数");
		else
			System.out.println(number + "不是回文数");
		// 打印性能指标
		System.out.println();
		System.out.println("程序运行时间： " + (endTime - startTime) + "ns");
	}

}
