package com.google.chapter02;

/**
 * 
 * @author ������
 *Encoding:GBK
 */
public class Variables_and_operators_Encoding {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {		
		//�ַ����뷽ʽ
		//ascii 128�ַ� 1���ֽ�
		//latin iso-8859-1 255�ַ� 1���ֽ�
		//gbk, gb2312, �й���2���ֽڴ洢
		//unicode����  2���ֽڣ� 65535��
		
		char a = 'a';
		char b = '1';
		char c = '��';
		char d = '.';
		
		
		char e = '\u4e2d';
		char f = '\u4e00';
		char g = '\u9FA5';
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

	}
}
