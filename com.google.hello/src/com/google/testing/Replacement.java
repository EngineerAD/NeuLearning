package com.google.testing;
/**
 * @author ��N
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 ��ӭ��������bug
 * @function ʵ���ַ���ת���滻����
 */
public class Replacement {

	public static void main(String[] args) {
		String mainString = "abcd1234";
		String sub = "bcd";
		System.out.println("ԭ�ַ�����"+mainString+"\t�������ַ�����"+sub);
		if (mainString.contains(sub)) {
			mainString=mainString.replace(sub, new StringBuilder(sub).reverse().toString());
		} else
			System.out.println("δ�ҵ�������ַ���");
		System.out.println("�滻�����"+mainString);
	}
}