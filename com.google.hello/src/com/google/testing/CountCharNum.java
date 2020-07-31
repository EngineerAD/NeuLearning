package com.google.testing;

import java.util.Scanner;
/**
 * @author 吴昇
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 欢迎反馈更多bug
 * @function 统计字符数量
 */
public class CountCharNum {
	public static void main(String[] args) {
		System.out.println("请输入内容：");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int bigchar = 0, smallchar = 0, number = 0, blank = 0, other = 0;
		int n = str.length();
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
				bigchar++;
			// System.out.println(bigchar);
			else if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
				smallchar++;
			else if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
				number++;
			else if (str.charAt(i) == 32)
				blank++;
			else
				other++;
		}
		System.out.println("您输入的内容为：");
		System.out.println(str);
		System.out.println("大写字母个数：" + bigchar);
		System.out.println("小写字母个数：" + smallchar);
		System.out.println("数字个数：" + number);
		System.out.println("空格个数：" + blank);
		System.out.println("其他字符个数：" + other);

	}
}
