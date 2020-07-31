package com.google.chapter02;

/**
 * 
 * @author 大贤者
 *
 */
public class Variables_and_operators {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 100是常量，a是变量
		// int代表整数
		int a = 100;
		// "Arc"是常量，b是变量
		// String代表字符串
		String b = "abc";

		// jdk7.0新特性，支持_
		int c = 1_200_340_000;

		// double代表小数
		double d = 3.14_15926;

		// 整形常量，默认是int类型

		// 此处有默认的类型转换，int -> byte
		byte a1 = 127;
		// 此处有默认的类型转换，int -> short
		short b1 = 32767;

		int c1 = 10000000;

		// 此处有默认的类型转化， int -> long
		long d4 = 1234567;

		// 如果数据超过了int的范围，常量后面必须加L
		long e = 123456789999L;
		//16进制
				//0-9, A(10),B(11),C(12),D(13),E(14),F(15), 10(16), 11(17)..... 1F, 20..2F, 30
				int a2 = 10;
				int b2 = 0X10;
				
				//八进制
				//0-7,10(8),11(9),12(10)
				int c2 = 010;
				
				//二进制
				//0,1,10,11,100,101,110,111,1000,1001,1010,1011,1100,1101,1110,1111
				int d2 = 0B1100;
						
				//打印都是10进制输出
				System.out.println(b2);
				System.out.println(c2);
				System.out.println(d2);
				
				//小数常量默认为double类型
				double a3 = 3.14;
				
				float b3 = 3.14f;
				
				//表示有十进制和科学计数法两种形式
				double c3 = 3.14e2;//314
				double d3 = 3.14e-1;//0.314
				
				//打印小数的时候，有可能是十进制，也可能是科学计数法，两种形式都可能。
				System.out.println(c3);
				System.out.println(d3);
	}
}
