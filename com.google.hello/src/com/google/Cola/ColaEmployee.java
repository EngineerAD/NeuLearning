package com.google.Cola;

import java.math.BigDecimal;

public abstract class ColaEmployee {
	/*
	 * ���ԣ�Ա��������,Ա���������·ݡ�������getSalary(int month)
	 * ���ݲ����·���ȷ�����ʣ��������Ա�������գ���˾����⽱��100 Ԫ��
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
