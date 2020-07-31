package com.google.testing;

import java.util.Scanner;

public class FibonacciSequence {
	/**
	 * @author ��N
	 * @Encode GBK
	 * @version 1.0
	 * @since 1.8 ��ӭ��������bug
	 * @function ��ɼ��㲢���쳲�������������
	 * @bug Ŀǰ���㵽��45����ʱ��ʮ�����Ե�����ȱ��
	 */
	// 쳲������������е���ѧ��ʽ��F(n)=F(n-1)+F(n-2)  n>2��F(1)=F(2)=1��nΪ�������
	// �ݹ�ʵ��
	public static long fibonacci(int n) {
		if (n == 0 || n == 1)
			return 1;
		else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	// �ǵݹ�ʵ��
	public static long fibonacci2(int n) {
		long arr[] = new long[n + 1];
		arr[0] = 0;
		if (n != 0) {
			arr[1] = 1; // n����Ϊ0����ΪnΪ0ʱ��arr��СΪ1��arr[1]Խ�硣
			for (int i = 2; i <= n; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}
		return arr[n];
	}

	public static void main(String[] args) {
		System.out.println("����������ȡ�����г��ȣ�����������");
		Scanner sc = new Scanner(System.in);
		int maxLength = sc.nextInt();
		if (maxLength > 0) {
			System.out.println("�ݹ�������У�");
			// long startTime = System.currentTimeMillis();// ��ȡ��ʼʱ��
			long startTime = System.nanoTime(); // ��ȡ��ʼʱ��
			for (int i = 0; i < maxLength; i++) {
				long num = fibonacci(i);
				System.out.print(num + " ");
			}
			long endTime = System.nanoTime(); // ��ȡ����ʱ��
			System.out.println();
			// long endTime = System.currentTimeMillis(); // ��ȡ����ʱ��
			// System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");
			// //�����������ʱ��
			System.out.println("��������ʱ�䣺 " + (endTime - startTime) + "ns");
			System.out.println();
			System.out.println("�ǵݹ�������У�");
			startTime = System.nanoTime(); // ��ȡ��ʼʱ��
			// ���ڲ���ʹ��0����������±��1��ʼ
			for (int i = 1; i < maxLength + 1; i++) {
				long num = fibonacci2(i);
				System.out.print(num + " ");
			}
			endTime = System.nanoTime(); // ��ȡ����ʱ��
			System.out.println();
			System.out.println("��������ʱ�䣺 " + (endTime - startTime) + "ns");
		}
		else
			System.out.println("�������ֲ���ȷ");
		sc.close();
	}
}
