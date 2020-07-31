package com.google.Cola;

import java.math.BigDecimal;

public class SalesEmployee extends ColaEmployee {
	private double monthlySales;
	private double commissionRate;

	public SalesEmployee(String name, int months, int birthday, double monthlySales, double commissionRate) {
		super(name, months, birthday);
		this.monthlySales = monthlySales;
		this.commissionRate = commissionRate;
	}

	@Override
	void getSalary() {
		// TODO Auto-generated method stub
		double money = monthlySales*commissionRate;
		money += birthGift();
		System.out.println("ColaԱ��" + super.getName() + " " + super.getMonths() + "�µĹ���Ϊ" + money);
	}

}
