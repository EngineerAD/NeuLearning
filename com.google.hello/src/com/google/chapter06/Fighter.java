package com.google.chapter06;

import java.util.Random;

public class Fighter {

	String name;
	int blood = 100;

	public void takeDamage(int damage) {
		this.blood -= damage;
	}

	public static void main(String[] args) {

		// 创建2个人
		Fighter f1 = new Fighter();
		f1.name = "毛毛"; // 强

		Fighter f2 = new Fighter();
		f2.name = "乐乐"; // 弱

		Random r = new Random();
		while (true) {
			int d = r.nextInt(20);
			f1.takeDamage(d);
			System.out.println(f1.name + "剩余血量:" + f1.blood);
			if (f1.blood <= 0) {
				System.out.println("游戏结束," + f1.name + "dead");
				break;
			}

			int d2 = r.nextInt(40);
			f2.takeDamage(d2);
			System.out.println(f2.name + "剩余血量:" + f2.blood);
			if (f2.blood <= 0) {
				System.out.println("游戏结束," + f2.name + "dead");
				break;
			}

		}

	}

}
