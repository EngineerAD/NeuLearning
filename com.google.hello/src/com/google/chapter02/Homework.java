package com.google.chapter02;

import java.util.Random;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First question
		int a = 1, b = 2, c;
		c = a;
		a = b;
		b = c;
		System.out.println("a:" + a + " b:" + b);

		// Second questions
		System.out.println("");
		float fahrenheit, centigrade;
		int choose;
		Scanner sc = new Scanner(System.in);
		System.out.println("选择你输入的温度单位：");
		System.out.println("1.摄氏度  2.华氏度");
		choose = sc.nextInt();
		System.out.println("请输入温度：");
		if (choose == 1) {
			centigrade = sc.nextFloat();
			sc.close();
			fahrenheit = centigrade * 9 / 5 + 32;
			System.out.println("华氏度为：" + fahrenheit + "℉");
			System.out.println("转换结束，程序停止");
		} else {
			fahrenheit = sc.nextFloat();
			sc.close();
			centigrade = (fahrenheit - 32) * 5 / 9;
			System.out.println("摄氏度为：" + centigrade + "℃");
			System.out.println("转换结束，程序停止");
		}
		Random r = new Random();
		int month = r.nextInt(12) + 1;
		int date = r.nextInt(30) + 1;
		if(month==2&&date==30)
			for(;date==30;)
			{
			date = r.nextInt(30) + 1;}
		int count31 = 0, count30 = 0;
		int day=date;
		//int test=0,num;
		//for (month = 12; month >= 1; month--) {
			//day = 1;
			switch (month) {
			case 12:
				count31 = 6;
				count30 = 4;
				day += 28;
				break;
			case 11:
				count31 = 6;
				count30 = 3;
				day += 28;
				break;
			case 10:
				count31 = 5;
				count30 = 3;
				day += 28;
				break;
			case 9:
				count31 = 5;
				count30 = 2;
				day += 28;
				break;
			case 8:
				count31 = 4;
				count30 = 2;
				day += 28;
				break;
			case 7:
				count31 = 3;
				count30 = 2;
				day += 28;
				break;
			case 6:
				count31 = 3;
				count30 = 1;
				day += 28;
				break;
			case 5:
				count31 = 2;
				count30 = 1;
				day += 28;
				break;
			case 4:
				count31 = 2;
				count30 = 0;
				day += 28;
				break;
			case 3:
				count31 = 1;
				count30 = 0;
				day += 28;
				break;
			case 2:
				count31 = 1;
				count30 = 0;
				break;
			case 1:
				count31 = 0;
				count30 = 0;
				break;
			}
			System.out.println("month:" + month+" date:"+date);
			//System.out.println("31 " + count31 + " 30 " + count30);
			day += count31 * 31 + count30 * 30;
			//num=day-test;
			//test=day;
			//System.out.println("与上个月差" +num);
			System.out.println("该日期在一年中为：" + day);
		//}

	}

}
