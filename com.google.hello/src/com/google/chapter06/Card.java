package com.google.chapter06;

import java.util.Random;

public class Card {
	/**
	 * @author 吴昇 Encode=GBK
	 * @version 1.0
	 * @since 1.8 欢迎反馈更多bug function:实现数组存放扑克牌，并洗牌抽取最前面的四张，判断是否为同花顺
	 */
	String value;
	String face;

	public static void main(String[] args) {

		// 创建数组
		Card[] array = new Card[52];

		String[] values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] faces = { "红桃", "黑桃", "方片", "草花" };

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
				// 放数组里
				array[4 * i + j] = c;
			}
		}

		// 52张牌放好了
		// for (Card v : array) {
		// System.out.println(v.face + v.value);
		// }
		c = new Card();
		Random r = new Random();
		int indexO, indexN;// 定义两个索引变量，用于标识换顺序的两个数组成员下标
		// 洗牌（数组乱序）
		int maxWashCount = 3;
		for (int i = 1; i <= 52 * maxWashCount; i++) {
			indexO = r.nextInt(52);
			indexN = r.nextInt(52);
			if (indexO == indexN)
				continue;
			// 调试时用于输出索引下标
			// System.out.println(indexO + " " + indexN);
			c = array[indexO];
			array[indexO] = array[indexN];
			array[indexN] = c;
		}
		// for (Card v : array) {
		// System.out.print(v.face + v.value + " ");
		// }
		// 取出前4张牌，判断是不是同花顺
		Card[] draw = new Card[4];
		int[] shadow = new int[4];// 用于顺子判断的备份数组
		Boolean flag = false;// 用于判断是否为同花顺
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
		// 获取样本花色
		String sampleFace = draw[0].face;
		for (Card v : draw)
			if (v.face != sampleFace)
				flag = false;
			else
				flag = true;
		//输出原抽取的四张牌
		for (Card v : draw) {
			System.out.print(v.face + v.value + " ");
		}
		// 若花色相同则执行下列顺子判断
		if (flag) {
			// 将备份数组进行排序
			shadow = bobSort(shadow);
			for (int i = 1; i < shadow.length; i++)
				// 顺子判断
				if (shadow[i] - shadow[i - 1] == 1)
					flag = true;
				else
					flag = false;
			if (flag) {
				System.out.print("\n是同花顺");
			} else {
				System.out.print("\n不是同花顺");
			}
		} else {
			System.out.print("\n不是同花顺");
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
