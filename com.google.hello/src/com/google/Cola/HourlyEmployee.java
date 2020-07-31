package com.google.Cola;

import java.math.BigDecimal;

public class HourlyEmployee extends ColaEmployee {
	private double hours;
	private int mon;

	public HourlyEmployee(String name, int months, int birthday, double hours, int mon) {
		super(name, months, birthday);
		this.hours = hours;
		this.mon = mon;

	}
	/*
	 * HourlyEmployee ：ColaEmployee 的子类，按小时拿工资的员工，每月工作超出160 小时的部分按照1.5
	 * 倍工资发放。属性：每小时的工资、每月工作的小时数
	 */

	@Override
	void getSalary() {
		double money = 0;
		if (hours >= 160) {
			money = (160 + (hours - 160) * 1.5) * mon;
		} else if (hours < 160) {
			money = (mon * hours);
		}
		money += birthGift();
		System.out.println("Cola员工" + super.getName() + " " + super.getMonths() + "月的工资为" + money);
	}

}
