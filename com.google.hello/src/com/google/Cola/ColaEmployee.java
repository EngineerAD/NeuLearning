package com.google.Cola;

import java.math.BigDecimal;

public abstract class ColaEmployee {
	/*
	 * 属性：员工的姓名,员工的生日月份。方法：getSalary(int month)
	 * 根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
	 */
	private String name;
	private int months;
	private int birth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public int getBirthday() {
		return birth;
	}

	public void setBirthday(int birth) {
		this.birth = birth;
	}

	public ColaEmployee(String name, int months, int birth) {
		super();
		this.name = name;
		this.months = months;
		this.birth = birth;
	}

	public double birthGift() {
		if (months == birth) {
			return 100;
		}
		return 0;
	}

	abstract void getSalary();
}
