package com.google.testing;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactor {
	/**
	 * @author 吴昇
	 * @Encode GBK
	 * @version 1.0
	 * @since 1.8 欢迎反馈更多bug
	 * @function 完成课后习题
	 * @bug 目前计算到6位数时有十分明显的性能缺陷
	 */
	public static void main(String[] args) {
		// 用于分解质因数
		int x, ox, ux;
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		x = sc.nextInt();
		// x = 12;
		ox = x;
		ux = x;
		Doit: while (true) {
			search: for (int i = x; i > 0; i--) {
				for (int j = i; j > 0; j--)
					// 找质数
					if (i % j == 0 && j != 1 && j != i)
						continue search;
				// 判断该质数是否为因数
				if (x % i == 0) {
					answer.add(i);
					// 记录本次计算的初始值，防止死循环
					ux = x;
					// 记录本次除以因数计算结果
					x /= i;
					break;
				} else
					continue;
			}
			// 当进入死循环时退出循环
			if (ux == x)
				break Doit;
		}
		System.out.print(ox + "=1");
		for (int i : answer) {
			if (i != 1)
				System.out.print("*" + i);
		}
		System.out.println();
		sc.close();
	}
}
