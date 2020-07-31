package com.google.testing;

import java.util.Scanner;
/**
 * @author 吴昇
 * @Encode GBK
 * @version 1.0
 * @since 1.8 欢迎反馈更多bug
 * @function 完成计算并输出斐波那契数列数列
 * @bug 目前计算到第45个数时有十分明显的性能缺陷
 */
public class RabbitQuestionFibonacci {
	public static void main(String[] args) {
		System.out.println("请输入你想知道的最后一个月月份（以正整数）");
		Scanner sc = new Scanner(System.in);
		int maxLength = sc.nextInt();
		if (maxLength > 0) {
			System.out.println("非递归结果输出中：");
			long startTime = System.nanoTime(); // 获取开始时间
			// 由于不能使用0，因此索引下标从1开始
			for (int i = 1; i < maxLength + 1; i++) {
				long num = fibonacci2(i);
				System.out.print(num + " ");
			}
			long endTime = System.nanoTime(); // 获取结束时间
			System.out.println();
			System.out.println("程序运行时间： " + (endTime - startTime) + "ns");
		} else
			System.out.println("输入数字不正确");
		sc.close();
	}

	public static long fibonacci2(int n) {
		long arr[] = new long[n + 1];
		arr[0] = 0;
		if (n != 0) {
			arr[1] = 1; // n不能为0，因为n为0时，arr大小为1，arr[1]越界。
			for (int i = 2; i <= n; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}
		return arr[n];
	}
}
