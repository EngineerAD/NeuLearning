package com.google.chapter02;

/**
 * 
 * @author 大贤者
 *Encoding:GBK
 */
public class Variables_and_operators_Encoding {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {		
		//字符编码方式
		//ascii 128字符 1个字节
		//latin iso-8859-1 255字符 1个字节
		//gbk, gb2312, 中国，2个字节存储
		//unicode编码  2个字节， 65535，
		
		char a = 'a';
		char b = '1';
		char c = '中';
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
