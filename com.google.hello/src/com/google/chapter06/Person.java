package com.google.chapter06;

public class Person {
	private String name;
	private double height, age;

	public Person() {

	}

	public Person(String name, double d, float age) {
		this.name = name;
		this.height = d;
		this.age = age;
	}

	public void sayHello() {
		System.out.println("hello,my name is " + name);

	}
}
