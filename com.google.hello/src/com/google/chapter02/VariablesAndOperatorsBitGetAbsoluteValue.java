package com.google.chapter02;

public class VariablesAndOperatorsBitGetAbsoluteValue {
	public static void main(String[] args) {
		VariablesAndOperatorsBitGetAbsoluteValue BGAV = new VariablesAndOperatorsBitGetAbsoluteValue();
		System.out.println(BGAV.toAbsoluteValue(-500));
		
		
		int a = -6;
		int b = a >> 31;
		a = (a ^ b) - b;

		System.out.println(a);
		
	}

	public int toAbsoluteValue(int num) {
		long start=System.currentTimeMillis();
		int signBit = num >> 31;
		int absoluteValue;
		if (signBit == 0) {
			System.out.println(Integer.toBinaryString(num));
			return num;
		}
		absoluteValue = num ^ (-1);
		System.out.println(Integer.toBinaryString(~(num - 1)));
		System.out.println(Integer.toBinaryString(absoluteValue + 1));
		long time = System.currentTimeMillis() - start;
		System.out.println("‘À––∫ƒ ±= "+time+" ∫¡√Î");
		return absoluteValue + 1;
		
	}
}
