package com.google.Cola;

public class SalariedEmployee extends ColaEmployee {
	/* SalariedEmployee ： ColaEmployee 的子类，拿固定工资的员工。属性：月薪 */
	private double money;

	public SalariedEmployee(String name, int months, int birthday, double money) {
		super(name, months, birthday);
		this.money = money;
	}

	public void getSalary() {
		money+=birthGift();
		System.out.println("Cola员工" + super.getName() +" "+ super.getMonths() + "月的工资为" + money);
	}
}
