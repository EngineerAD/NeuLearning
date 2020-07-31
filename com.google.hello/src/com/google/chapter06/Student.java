package com.google.chapter06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
	/**
	 * @author 吴昇 Encode=GBK
	 * @version 1.0
	 * @since 1.8 欢迎反馈更多bug function:实现集合排序与集合元素添加，最终让学生成绩倒序输出
	 */
	List<Student> sl = new ArrayList<>();
	private String name;
	private String sno;
	private double academicRecord;

	public Student() {
	}

	// 存入本地数值
	public Student(String name, String sno, double academicRecord) {
		this.name = name;
		this.sno = sno;
		this.academicRecord = academicRecord;
	}

	/*
	 * public void calculate() { this.avg = (this.java + this.mysql +
	 * this.web)/3; }
	 */
	// 通过add()方法为数组列表添加学生元素
	public void add(String name, String Sno, double academicRecord) {
		sl.add(new Student(name, Sno, academicRecord));
	}

	// 用于封装本地变量，增加安全性
	public double getRecord() {
		return academicRecord;
	}

	// 对list利用比较器进行比较
	public void sort() {
		// reversed()方法为倒序方法去除则默认使用正序排序
		sl.sort(Comparator.comparingDouble(Student::getRecord).reversed());
		print(sl);
	}
	// 参考来源：
	// java中list的sort()功能如何使用？ - love______feng - 博客园
	// https://www.cnblogs.com/love-feng/p/11324937.html

	// 超级for循环输出list
	private static void print(List<Student> list) {
		for (Student s : list) {
			System.out.println(s.name + "," + s.sno + "," + s.academicRecord + ";");
		}
	}
	// 参考来源：
	// 遍历List集合的三种方法 - Java初级码农 - 博客园
	// https://www.cnblogs.com/lzq198754/p/5774593.html

}
