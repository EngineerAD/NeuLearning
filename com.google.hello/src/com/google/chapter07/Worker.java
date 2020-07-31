package com.google.chapter07;

public class Worker extends Employee {

	public void dressAllowance() {
		System.out.println(200);
	}
	public static void main(String[] args) {
		Worker w = new Worker();
		w.birth="1990-8-7";
		w.name="lana";
		w.salary=200;
		Worker w1 = new Worker();
		w1.birth="1990-8-7";
		w1.name="Ash";
		w1.salary=300;
		w.getDetail();
		w1.getDetail();

	}

}