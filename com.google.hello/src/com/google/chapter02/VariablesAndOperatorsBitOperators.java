package com.google.chapter02;

/**
 * @author 大贤者
 */
public class VariablesAndOperatorsBitOperators {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 101 & 111 -> 101
		// 101 | 111 -> 111
		// 101 ^ 111 -> 010
		// 1000 << 1 -> 10000
		// 1000 << 2 - 100000

		// 01111111 <1 -> 00000011111110
		// 011111111 <1 -> 0111111110

		// 1000 >> 1 -> 100
		short a = 255;
		System.out.println(5 & 7);// 5
		System.out.println(5 | 7); // 7
		System.out.println(5 ^ 7);// 2
		System.out.println(8 << 1);// 16
		System.out.println(8 << 2);// 32
		System.out.println(a << 1);// 254

		System.out.println(8 >> 1);// 4
		System.out.println(8 >> 2);// 2
		System.out.println(8 >> 3);// 1
		System.out.println(8 >> 4);// 0

		// 任意一个int类型的整数，右移31位 ， 都等于0
		// 任意一个int类型的负数，右移31位 ， 都等于-1
		System.out.println(12345679 >> 31);// 0
		System.out.println(-12345679 >> 31);// -1

		System.out.println(-12345679 >>> 31);// 1

		// 10000001
		// 11111111
		// 11111110

		// 以最高效的方式求2的3次方 2<<2

	}

}
