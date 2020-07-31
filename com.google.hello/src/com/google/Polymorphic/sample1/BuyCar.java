package com.google.Polymorphic.sample1;

public class BuyCar {

	public static Car1 buyCar1(int money) {
		if (money > 300000) {
			return new Benz(); // 向上转型
		} else if (money > 100000) {
			return new dazhong();
		} else {
			return new qq();
		}
	}

	public static void main(String[] args) {

		// 父类引用指向子类对象 ===向上转型
		Car1 c = buyCar1(1); // 向上转型
//判断c这个对象是否属于qq类
		if (c instanceof qq) {
			qq q = (qq) c;

			q.xiuche();
		}

		c.run();// 运行时，调用具体子类的方法，这种现象就是多态

	}

}

class Benz extends Car1 {

	@Override
	public void run() {

		System.out.println("beaz run, lafeng");

	}

}

class dazhong extends Car1 {

	@Override
	public void run() {

		System.out.println("dazhong run, keyi");

	}

}

class qq extends Car1 {

	@Override
	public void run() {

		System.out.println("qq run, zhuyianquan");

	}

	public void xiuche() {
		System.out.println("修车");
	}
}

abstract class Car1 {

	public abstract void run();

}
