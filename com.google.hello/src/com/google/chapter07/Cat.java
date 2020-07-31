package com.google.chapter07;

public class Cat extends Animal {

	String breed;

	void miao() {

		System.out.println("miao");

	}

	public static void main(String[] args) {

		/*
		 * Cat c = new Cat(); //向上转型 // a 实际上是 cat, 但是通过a, 无法调用cat的属性和方法 Animal
		 * a = c;
		 */

		Cat c = new Cat();

		Animal a = c;

		// 向下转型
		// 向下转型需要强制类型转换
		// 向下转型有前提，a必须是通过向上转型得来的。

		if (a instanceof Cat) {
			Cat c2 = (Cat) a;

			c2.miao();
		} else {
			Dog d2 = (Dog) a;
			d2.bark();
		}

	}

}

class Dog extends Animal {

	void bark() {
		System.out.println("bark");
	}

}

class Animal {
	int size;

	void eat() {

	}
}
