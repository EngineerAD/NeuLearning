package com.google.testing;

import java.util.Scanner;
/**
 * @author ��N
 * @Encode GBK
 * @version 1.0
 * @since 1.8 ��ӭ��������bug
 * @function ��ɼ��㲢���쳲�������������
 * @bug Ŀǰ���㵽��45����ʱ��ʮ�����Ե�����ȱ��
 */
public class RabbitQuestionFibonacci {
	public static void main(String[] args) {
		System.out.println("����������֪�������һ�����·ݣ�����������");
		Scanner sc = new Scanner(System.in);
		int maxLength = sc.nextInt();
		if (maxLength > 0) {
			System.out.println("�ǵݹ�������У�");
			long startTime = System.nanoTime(); // ��ȡ��ʼʱ��
			// ���ڲ���ʹ��0����������±��1��ʼ
			for (int i = 1; i < maxLength + 1; i++) {
				long num = fibonacci2(i);
				System.out.print(num + " ");
			}
			long endTime = System.nanoTime(); // ��ȡ����ʱ��
			System.out.println();
			System.out.println("��������ʱ�䣺 " + (endTime - startTime) + "ns");
		} else
			System.out.println("�������ֲ���ȷ");
		sc.close();
	}

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
}
