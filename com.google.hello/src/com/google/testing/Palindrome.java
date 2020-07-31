package com.google.testing;

import java.util.Scanner;

/**
 * @author ��N
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 ��ӭ��������bug
 * @function ����ջʵ�������Ż����жϻ�����
 */
public class Palindrome {

	public static void main(String[] args) {
		System.out.println("������һ�����֣������֪��������Ƿ�Ϊ��������");

		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		sc.close();

		char[] oragin = number.toCharArray();// ��ȡԭʼ����
		boolean flag = true;// ��ʶ�Ƿ�Ϊ������
		char[] stack = new char[number.length() / 2];// ����ԭʼ���鳤���趨ջ���
		
		long startTime = System.nanoTime(); // ��ȡ��ʼʱ��

		// ��ջ
		for (int i = 0; i < number.length() / 2; i++) {
			stack[i] = oragin[i];
		}

		// ��ջ���ȶ�
		int index = number.length() / 2;
		if (number.length() % 2 != 0)
			index = 1 + number.length() / 2;
		for (; index < oragin.length; index++) {
			if (oragin[index] != stack[oragin.length - 1 - index]) {
				flag = false;
				break;
			}
		}
		long endTime = System.nanoTime(); // ��ȡ����ʱ��

		// ������
		if (flag)
			System.out.println(number + "�ǻ�����");
		else
			System.out.println(number + "���ǻ�����");
		// ��ӡ����ָ��
		System.out.println();
		System.out.println("��������ʱ�䣺 " + (endTime - startTime) + "ns");
	}

}
