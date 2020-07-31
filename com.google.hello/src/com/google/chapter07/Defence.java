package com.google.chapter07;

interface Alarm {
	// 成员只有常量和抽象方法
	// 类只能单继承，接口可以多继承
	int a = 100;// 修饰符不许有private

	public abstract void sound();
}
interface Door {
	int a = 100;

	public abstract void open();
}
public interface Defence extends Alarm, Door {
	int a = 200;

	@Override
	 default void open() {
		System.out.println("防盗门被打开了");
		if (a != 100) {
			System.out.println("当前开门密钥为：" + a);
			sound();
		}
	}

	@Override
	default void sound() {
		// TODO Auto-generated method stub
		System.out.println("哔哔哔");
	}
}
