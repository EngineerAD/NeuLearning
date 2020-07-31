package com.google.chapter06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
	/**
	 * @author ��N Encode=GBK
	 * @version 1.0
	 * @since 1.8 ��ӭ��������bug function:ʵ�ּ��������뼯��Ԫ����ӣ�������ѧ���ɼ��������
	 */
	List<Student> sl = new ArrayList<>();
	private String name;
	private String sno;
	private double academicRecord;

	public Student() {
	}

	// ���뱾����ֵ
	public Student(String name, String sno, double academicRecord) {
		this.name = name;
		this.sno = sno;
		this.academicRecord = academicRecord;
	}

	/*
	 * public void calculate() { this.avg = (this.java + this.mysql +
	 * this.web)/3; }
	 */
	// ͨ��add()����Ϊ�����б����ѧ��Ԫ��
	public void add(String name, String Sno, double academicRecord) {
		sl.add(new Student(name, Sno, academicRecord));
	}

	// ���ڷ�װ���ر��������Ӱ�ȫ��
	public double getRecord() {
		return academicRecord;
	}

	// ��list���ñȽ������бȽ�
	public void sort() {
		// reversed()����Ϊ���򷽷�ȥ����Ĭ��ʹ����������
		sl.sort(Comparator.comparingDouble(Student::getRecord).reversed());
		print(sl);
	}
	// �ο���Դ��
	// java��list��sort()�������ʹ�ã� - love______feng - ����԰
	// https://www.cnblogs.com/love-feng/p/11324937.html

	// ����forѭ�����list
	private static void print(List<Student> list) {
		for (Student s : list) {
			System.out.println(s.name + "," + s.sno + "," + s.academicRecord + ";");
		}
	}
	// �ο���Դ��
	// ����List���ϵ����ַ��� - Java������ũ - ����԰
	// https://www.cnblogs.com/lzq198754/p/5774593.html

}
