package com.google.testing;

import java.util.Scanner;

public class MailTest {
	/**
	 * @author 吴昇
	 * @Encode UTF-8
	 * @version 1.0
	 * @since 1.8 欢迎反馈更多bug
	 * @function 验证邮箱格式
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入你的邮箱地址:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		MailTest mt = new MailTest();
		if (mt.testMail(s))
			System.out.println("邮箱合法");

	}

	public boolean testMail(String mailAddress) {
		// 邮箱地址中不包含@或.
		if (mailAddress.indexOf("@") == -1 || mailAddress.indexOf(".") == -1) {
			System.out.println("输入的邮箱不合法没有包含@和.");
			return false;
		}
		// 邮箱地址中含有多了@或.
		if (mailAddress.indexOf("@") != mailAddress.lastIndexOf("@")
				|| mailAddress.indexOf(".") != mailAddress.lastIndexOf(".")) {
			System.out.println("输入的邮箱中包含了多个的@和.");
			return false;
		}
		// 邮箱地址中.出现在@的前面
		if (mailAddress.lastIndexOf("@") > mailAddress.lastIndexOf(".")) {
			System.out.println("输入的邮箱地址中.出现在了@前面");
			return false;
		}
		// 用户名里有其他字符
		for (int i = 0; i < mailAddress.indexOf("@"); i++) {
			if (mailAddress.charAt(i) >= 'a' && mailAddress.charAt(i) <= 'z'
					|| mailAddress.charAt(i) >= 'A' && mailAddress.charAt(i) <= 'Z'
					|| mailAddress.charAt(i) >= '0' && mailAddress.charAt(i) <= '9') {
				return true;
			} else {
				System.out.println("邮箱中包含了其他字符");
				return false;
			}
		}

		return false;
	}
}
