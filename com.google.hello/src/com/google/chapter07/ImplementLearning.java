package com.google.chapter07;

public class ImplementLearning extends Person implements Customer {
	public static void main(String[] args) {
		ImplementLearning i=new ImplementLearning();
		i.useCredit();
	}

	@Override
	public void useCredit() {
		System.out.print(super.getName());
		System.out.print("消费500");

	}

	public ImplementLearning() {
		super("乐乐");
	}

}

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int age;
	private String sex;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		this.name = name;
	}

	public void getInfo() {
		System.out.println(this.name + "\t" + this.age + "\t" + this.sex);
	}

	public void sayHello() {
		System.out.println("hello");
	}

}

interface Customer {
	public void useCredit();
}