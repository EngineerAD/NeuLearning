package com.google.Cola;

public class SalariedEmployee extends ColaEmployee {
	/* SalariedEmployee �� ColaEmployee �����࣬�ù̶����ʵ�Ա�������ԣ���н */
	private double money;

	public SalariedEmployee(String name, int months, int birthday, double money) {
		super(name, months, birthday);
		this.money = money;
	}

	public void getSalary() {
		money+=birthGift();
		System.out.println("ColaԱ��" + super.getName() +" "+ super.getMonths() + "�µĹ���Ϊ" + money);
	}
}
