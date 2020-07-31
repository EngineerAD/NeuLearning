package com.google.testing;

/**
 * @author 吴昇
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 欢迎反馈更多bug
 * @function 3块一瓶饮料，2个空瓶能换一瓶新的，一共有20元，问一共能喝几瓶
 */
public class HW1 {

	public static void main(String[] args) {
		int emptyBottle = 0;
		int fullBottle = 0;
		int bottles = 0;
		int changeNum = 2;
		int money = 20;
		int price = 3;
		// 计算初始购买的酒瓶数
		bottles = money / price;
		emptyBottle = bottles;
		//开始喝换循环
		while (changeBottles(emptyBottle, changeNum) > 0) {
			fullBottle = changeBottles(emptyBottle, changeNum);
			bottles += fullBottle;
			//喝完变空瓶
			emptyBottle = fullBottle;
		}
		System.out.println("一共喝了:" + bottles + "瓶");
	}

	protected static int changeBottles(int emptyBottle, int changeNum) {
		return emptyBottle / changeNum;
	}

	
}
