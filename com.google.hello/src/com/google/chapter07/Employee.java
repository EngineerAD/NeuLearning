package com.google.chapter07;

public class Employee{
	String name;
	String birth;
	double salary;
	
	public void getDetail()
	{
		System.out.println(name+"\t" + birth +"\t" + salary);
	}
	
	public void getSalary()
	{
		System.out.println(salary);
	}
}
