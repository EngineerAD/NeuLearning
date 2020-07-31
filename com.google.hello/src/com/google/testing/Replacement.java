package com.google.testing;
/**
 * @author 吴昇
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 欢迎反馈更多bug
 * @function 实现字符串转置替换功能
 */
public class Replacement {

	public static void main(String[] args) {
		String mainString = "abcd1234";
		String sub = "bcd";
		System.out.println("原字符串："+mainString+"\t查找子字符串："+sub);
		if (mainString.contains(sub)) {
			mainString=mainString.replace(sub, new StringBuilder(sub).reverse().toString());
		} else
			System.out.println("未找到相关子字符串");
		System.out.println("替换结果："+mainString);
	}
}