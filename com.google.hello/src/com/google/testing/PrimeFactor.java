package com.google.testing;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactor {
	/**
	 * @author ��N
	 * @Encode GBK
	 * @version 1.0
	 * @since 1.8 ��ӭ��������bug
	 * @function ��ɿκ�ϰ��
	 * @bug Ŀǰ���㵽6λ��ʱ��ʮ�����Ե�����ȱ��
	 */
	public static void main(String[] args) {
		// ���ڷֽ�������
		int x, ox, ux;
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		x = sc.nextInt();
		// x = 12;
		ox = x;
		ux = x;
		Doit: while (true) {
			search: for (int i = x; i > 0; i--) {
				for (int j = i; j > 0; j--)
					// ������
					if (i % j == 0 && j != 1 && j != i)
						continue search;
				// �жϸ������Ƿ�Ϊ����
				if (x % i == 0) {
					answer.add(i);
					// ��¼���μ���ĳ�ʼֵ����ֹ��ѭ��
					ux = x;
					// ��¼���γ�������������
					x /= i;
					break;
				} else
					continue;
			}
			// ��������ѭ��ʱ�˳�ѭ��
			if (ux == x)
				break Doit;
		}
		System.out.print(ox + "=1");
		for (int i : answer) {
			if (i != 1)
				System.out.print("*" + i);
		}
		System.out.println();
		sc.close();
	}
}
