package com.google.testing;

/**
 * @author ��N
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 ��ӭ��������bug
 * @function 3��һƿ���ϣ�2����ƿ�ܻ�һƿ�µģ�һ����20Ԫ����һ���ܺȼ�ƿ
 */
public class HW1 {

	public static void main(String[] args) {
		int emptyBottle = 0;
		int fullBottle = 0;
		int bottles = 0;
		int changeNum = 2;
		int money = 20;
		int price = 3;
		// �����ʼ����ľ�ƿ��
		bottles = money / price;
		emptyBottle = bottles;
		//��ʼ�Ȼ�ѭ��
		while (changeBottles(emptyBottle, changeNum) > 0) {
			fullBottle = changeBottles(emptyBottle, changeNum);
			bottles += fullBottle;
			//������ƿ
			emptyBottle = fullBottle;
		}
		System.out.println("һ������:" + bottles + "ƿ");
	}

	protected static int changeBottles(int emptyBottle, int changeNum) {
		return emptyBottle / changeNum;
	}

	
}
