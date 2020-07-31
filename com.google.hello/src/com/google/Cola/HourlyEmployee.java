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
	 * HourlyEmployee ��ColaEmployee �����࣬��Сʱ�ù��ʵ�Ա����ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5
	 * �����ʷ��š����ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��
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
		System.out.println("ColaԱ��" + super.getName() + " " + super.getMonths() + "�µĹ���Ϊ" + money);
	}

}
