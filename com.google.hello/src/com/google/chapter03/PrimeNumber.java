package com.google.chapter03;

/*
 * �ӿ���̨���ս���һ����1-200֮�䣬�ж��ǲ���������������������1�ͱ������ܱ�������������13,17,19
 * 
 * n: n%2.....n%n-1
 * */
public class PrimeNumber {
	public static boolean main(int oNum) {
		// Scanner input = new Scanner(System.in);
		// System.out.println("������1-200(��)��һ����");
		// int oNum = input.nextInt();
		boolean flag = isPrime(oNum);
		// ���
		if (flag) {
			//System.out.println(oNum + "������");
			return true;
		} else {
			//System.out.println(oNum + "��������");
			return false;
		}
	}

	public static boolean isPrime(int oNum) {
		for (int i = 2; i < Math.sqrt(oNum); i++) {
			if (oNum % i == 0) {
				return false;
			}
		}
		return true;
	}
}
