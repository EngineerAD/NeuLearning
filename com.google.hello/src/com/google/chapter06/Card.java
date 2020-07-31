package com.google.chapter06;

import java.util.Random;

public class Card {
	/**
	 * @author ��N Encode=GBK
	 * @version 1.0
	 * @since 1.8 ��ӭ��������bug function:ʵ���������˿��ƣ���ϴ�Ƴ�ȡ��ǰ������ţ��ж��Ƿ�Ϊͬ��˳
	 */
	String value;
	String face;

	public static void main(String[] args) {

		// ��������
		Card[] array = new Card[52];

		String[] values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] faces = { "����", "����", "��Ƭ", "�ݻ�" };

		/*
		 * i=0; i=1; i=2 j=0; j=1; j=2; j=3 j=0 j=1 j=2 j=3
		 * 
		 * k=0; k=1; k=2; k=3 k=4 k=5 k=6 k=7
		 * 
		 * k = i*4+j
		 */
		Card c;
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < faces.length; j++) {
				c = new Card();
				c.value = values[i];
				c.face = faces[j];
				// ��������
				array[4 * i + j] = c;
			}
		}

		// 52���Ʒź���
		// for (Card v : array) {
		// System.out.println(v.face + v.value);
		// }
		c = new Card();
		Random r = new Random();
		int indexO, indexN;// ���������������������ڱ�ʶ��˳������������Ա�±�
		// ϴ�ƣ���������
		int maxWashCount = 3;
		for (int i = 1; i <= 52 * maxWashCount; i++) {
			indexO = r.nextInt(52);
			indexN = r.nextInt(52);
			if (indexO == indexN)
				continue;
			// ����ʱ������������±�
			// System.out.println(indexO + " " + indexN);
			c = array[indexO];
			array[indexO] = array[indexN];
			array[indexN] = c;
		}
		// for (Card v : array) {
		// System.out.print(v.face + v.value + " ");
		// }
		// ȡ��ǰ4���ƣ��ж��ǲ���ͬ��˳
		Card[] draw = new Card[4];
		int[] shadow = new int[4];// ����˳���жϵı�������
		Boolean flag = false;// �����ж��Ƿ�Ϊͬ��˳
		for (int i = 0; i < 4; i++) {
			draw[i] = array[i];
			if (array[i].value.equals("J"))
				shadow[i] = 11;
			else if (array[i].value.equals("Q"))
				shadow[i] = 12;
			else if (array[i].value.equals("K"))
				shadow[i] = 13;
			else if (array[i].value.equals("A"))
				shadow[i] = 1;
			else
				shadow[i] = Integer.parseInt(array[i].value);
		}
		// ��ȡ������ɫ
		String sampleFace = draw[0].face;
		for (Card v : draw)
			if (v.face != sampleFace)
				flag = false;
			else
				flag = true;
		//���ԭ��ȡ��������
		for (Card v : draw) {
			System.out.print(v.face + v.value + " ");
		}
		// ����ɫ��ͬ��ִ������˳���ж�
		if (flag) {
			// �����������������
			shadow = bobSort(shadow);
			for (int i = 1; i < shadow.length; i++)
				// ˳���ж�
				if (shadow[i] - shadow[i - 1] == 1)
					flag = true;
				else
					flag = false;
			if (flag) {
				System.out.print("\n��ͬ��˳");
			} else {
				System.out.print("\n����ͬ��˳");
			}
		} else {
			System.out.print("\n����ͬ��˳");
		}

	}

	public static int[] bobSort(int a[]) {
		// int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

}
