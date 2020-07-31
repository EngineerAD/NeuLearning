package com.google.chapter03;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author ��N Encoding:GBK
 * @version 1.2
 * @since 1.8
 * Debug 1.�޸��˱������9���ڴ���5λ��ʱ������λ���ֲ���ȷ������
 * 2.�޸���ѡ�����2����������������
 * 3.�޸���ѡ�����3���������ٽ�ʱ���ּ�����������
 * 
 */
public class Fim03 {
	/**
	 * @return No return value.
	 * @param args
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// [������]
		// 1����ҵ���ŵĽ������������ɡ�������ڻ����10��Ԫʱ���������10%��
		// �������10��Ԫ�����ڻ����20��Ԫʱ������10��Ԫ�Ĳ��֣������7.5%��
		// ����20�򣬵��ڻ����40��ʱ������20��Ԫ�Ĳ��֣������5%��
		// ����40�򣬵��ڻ����60��ʱ������40��Ԫ�Ĳ��֣������3%��
		// ����60�򣬵��ڻ����100��ʱ������60��Ԫ�Ĳ��֣������1.5%��
		// ����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
		// ����һ����������Ϊ����������Ӧ���Ž�����������֪ʶ�㣺������䣩
		Scanner input = new Scanner(System.in);
		System.out.println("������������");
		int profit = input.nextInt();
		System.out.println("1.������Ϊ:" + profit + " ����Ϊ��" + getBonus(profit));

		// 2������һ���ɼ�a��ʹ��switch�ṹ���a�ĵȼ���
		// A��90-100��B��80-89��C��70-79��D��60-69��E��0~59��֪ʶ�㣺�������switch��
		System.out.println("2.������ɼ�");
		int a = input.nextInt();
		System.out.println("�ɼ�Ϊ:" + a + " �ȼ�Ϊ��" + getGrades(a));

		// 3������һ�����֣��ж���һ����������ż����֪ʶ�㣺������䣩
		System.out.println("3.������һ������");
		int numNo3 = input.nextInt();
		System.out.println(numNo3 + "��");
		if (isOddEven(numNo3)) {
			System.out.println("ż��");
		} else {
			System.out.println("����");
		}

		// 4����д���� �ж�һ���������x��ֵ�������1�����x=1�������5�����x=5�������10��
		// ���x=10���������ϼ���ֵ�������x=none����֪ʶ�㣺������䣩
		isOrder();

		// 5���ж�һ����������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6����������ֻ�ܱ�5��������ӡ�ܱ�5��������
		// ��ֻ�ܱ�6����������ӡ�ܱ�6�����������ܱ�5��6����������ӡ���ܱ�5��6��������֪ʶ�㣺������䣩
		isComDivisorFor5And6();

		// 6������һ����ݣ��ж��������Ƿ������֪꣨ʶ�㣺������ѭ����䣩
		System.out.println("6.���������");
		int year = input.nextInt();

		isLeepYear(year);

		// 7������һ��0��100�ķ������������0��100֮�䣬��ӡ������Ч��
		// ���ݷ����ȼ���ӡA,B,C,D,E��֪ʶ�㣺�������if elseif��
		System.out.println("7.������ٷ��Ʒ���");
		int fraction = input.nextInt();
		System.out.println("����Ϊ:" + fraction + " �ȼ�Ϊ��" + getGrades(fraction));

		// 8��������������x,y,z���������������С���������֪ʶ�㣺������䣩
		System.out.println("8.������3��������������һ������һEnter");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		sortThree(x, y, z);

		// 9����һ��������5λ���������������Ǽ�λ�����ֱ��ӡ��ÿһλ���֡���֪ʶ�㣺������䣩
		System.out.println("9.������һ��������5λ��������");
		int numNo9 = input.nextInt();
		int division[] = numAnalysis(numNo9);
		System.out.println("������Ϊ:" + numNo9 + "��Ϊ" + division[0] + "λ��" + "���ֱ��ǣ�");
		for (int i = 1; i < division.length; i++) {
			System.out.print(division[i] + " ");
		}
		System.out.println();
		// [ѡ����]
		// 1������ĳԱ���������н��30000Ԫ����н����������6%��
		// ��дһ��JavaӦ�ó�������Ա��10������н����ͳ��δ��10�꣨�ӽ������������롣
		// ��֪ʶ�㣺ѭ�����for��
		int yearlySalary = 30000;
		double other[] = futureRevenueYear10(yearlySalary);
		System.out.println("10�����нΪ:" + other[0] + "Ԫ��������Ϊ" + other[1] + "Ԫ");

		// 2�����ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ����
		// �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
		// �Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
		// ����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١���֪ʶ�㣺ѭ�����while��
		notFeedMonkeys();

		// 3����дһ�����򣬼����ʾֻ��Ļ�ѡ�
		// ��������С��100Ԫ�����ΪһԪ��
		// ��������100Ԫ��5000Ԫ֮�䣬��1%��ȡ��ѣ����������5000Ԫ�����Ϊ50Ԫ��
		// ����������������롣��֪ʶ�㣺������䣩
		System.out.println("*3.�������ʾֻ��");
		int feeNum = input.nextInt();

		System.out.println("�����Ϊ:" + feeNum + "Ԫ��������Ϊ" + fee(feeNum) + "Ԫ");
		// 4���ֱ�ʹ��forѭ����whileѭ����doѭ����1��100֮�������ܱ�3�����������ĺ͡���֪ʶ�㣺ѭ����䣩
		sumComDivisorFor3();

		// 5�����0-9֮����������ǲ�����5��
		not5Random();

		// 6����дһ������������n�Ľ׳ˣ�����5�Ľ׳���1*2*3*4*5
		System.out.println("*6.����һ��������������n�Ľ׳�");
		int n = input.nextInt();
		System.out.println(n + "�Ľ׳�Ϊ:" + factorial(n));

		// 7����дһ�������ҳ�����200����С������

		minPrimeBiggerThan200();

		// 8��������������һ��4λ�������󽫸�����ת�Ժ��������ԭ��Ϊ1234����ת�����λ4321
		System.out.println("*8����һ��4λ�������󽫸�����ת�Ժ����");
		int num4 = input.nextInt();
		System.out.println(num4 + "�ķ�תΪ:" + numReversal(num4));

		long time = System.currentTimeMillis() - start;
		input.close();
		System.out.println("���к�ʱ= " + time + " ����");
	}

	// [������]
	// 1����ҵ���ŵĽ������������ɡ�������ڻ����10��Ԫʱ���������10%��
	// �������10��Ԫ�����ڻ����20��Ԫʱ������10��Ԫ�Ĳ��֣������7.5%��
	// ����20�򣬵��ڻ����40��ʱ������20��Ԫ�Ĳ��֣������5%��
	// ����40�򣬵��ڻ����60��ʱ������40��Ԫ�Ĳ��֣������3%��
	// ����60�򣬵��ڻ����100��ʱ������60��Ԫ�Ĳ��֣������1.5%��
	// ����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
	// ����һ����������Ϊ����������Ӧ���Ž�����������֪ʶ�㣺������䣩
	public static double getBonus(int profit) {
		int temp = profit / 10000;
		double Bonus = 0;
		switch (temp) {
		case 10:
			Bonus =10000+(profit-100000)*0.075;
			break;
		case 20:
			Bonus =17500+(profit-200000)*0.05;
			break;
		case 40:
			Bonus =27500+(profit-400000)*0.03;
			break;
		case 60:
			Bonus =33500+(profit-600000)*0.015;
			break;
		case 100:
			Bonus =39500+(profit-1000000)*0.01;
			break;
		default:
			Bonus =profit*0.1;
			break;
		}
		return Bonus;
	}

	// 2������һ���ɼ�a��ʹ��switch�ṹ���a�ĵȼ���
	// A��90-100��B��80-89��C��70-79��D��60-69��E��0~59��֪ʶ�㣺�������switch��
	public static String getGrades(int fraction) {
		if (fraction >= 0 && fraction <= 100) {
			switch (fraction / 10) {
			case 10:
			case 9:
				return "A";
			case 8:
				return "B";
			case 7:
				return "C";
			case 6:
				return "D";
			default:
				return "E";
			}
		} else {
			return "������Ч";
		}
	}

	// 3������һ�����֣��ж���һ����������ż����֪ʶ�㣺������䣩
	public static boolean isOddEven(int num) {
		return num % 2 == 0 ? true : false;
	}

	// 4����д���� �ж�һ���������x��ֵ�������1�����x=1�������5�����x=5�������10��
	// ���x=10���������ϼ���ֵ�������x=none����֪ʶ�㣺������䣩
	public static void isOrder() {
		Random r = new Random();
		int x = r.nextInt();
		if (x == 1)
			System.out.println("x=1");
		else if (x == 5)
			System.out.println("x=5");
		else if (x == 5)
			System.out.println("x=10");
		else
			System.out.println("x=none");
	}

	// 5���ж�һ����������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6����������ֻ�ܱ�5��������ӡ�ܱ�5��������
	// ��ֻ�ܱ�6����������ӡ�ܱ�6�����������ܱ�5��6����������ӡ���ܱ�5��6��������֪ʶ�㣺������䣩
	public static void isComDivisorFor5And6() {
		Random r = new Random();
		int num = r.nextInt();
		System.out.println("5.�����Ϊ��"+num);
		if (num % 5 == 0 && num % 6 == 0)
			System.out.println("�ܱ�5��6����");
		else if (num % 5 == 0)
			System.out.println("�ܱ�5����");
		else if (num % 6 == 0)
			System.out.println("�ܱ�6����");
		else
			System.out.println("���ܱ�5��6����");
	}

	// 6������һ����ݣ��ж��������Ƿ������֪꣨ʶ�㣺������ѭ����䣩
	public static void isLeepYear(int year) {
		LeapYear.main(year);
	}

	// 7������һ��0��100�ķ������������0��100֮�䣬��ӡ������Ч��
	// ���ݷ����ȼ���ӡA,B,C,D,E��֪ʶ�㣺�������if elseif��
	public static String getGrades1(int fraction) {
		if (fraction >= 0 && fraction <= 100) {
			switch (fraction / 10) {
			case 10:
			case 9:
				return "A";
			case 8:
				return "B";
			case 7:
				return "C";
			case 6:
				return "D";
			default:
				return "E";
			}
		} else {
			return "������Ч";
		}
	}

	// 8��������������x,y,z���������������С���������֪ʶ�㣺������䣩
	public static void sortThree(int x, int y, int z) {
		int temp;
		if (x > y) {
			temp = x;
			x = y;
			y = temp;
		}
		if (x > z) {
			temp = x;
			x = z;
			z = temp;
		}
		if (y > z) {
			temp = y;
			y = z;
			z = temp;
		}
		System.out.println("��С�������У�" + x + " " + y + " " + z);
	}

	// 9����һ��������5λ���������������Ǽ�λ�����ֱ��ӡ��ÿһλ���֡���֪ʶ�㣺������䣩
	public static int[] numAnalysis(int num) {
		int count = 0;
		for (int i = 1; i < 5; i++) {
			if (num / Math.pow(10, i) < 1) {
				count = i;
				break;
			}
		}
		if (count == 0) {
			count = 5;
			int a[] = new int[count + 1];
			a[0] = count;
			a[1] = num / 10000;
			a[2] = num / 1000 % 10;
			a[3] = num % 1000 / 100;
			a[4] = num % 100 / 10;
			a[5] = num % 10;
			return a;
		} else if (count == 4) {
			int a[] = new int[count + 1];
			a[0] = count;
			a[1] = num / 1000;
			a[2] = num % 1000 / 100;
			a[3] = num % 100 / 10;
			a[4] = num % 100 % 10;
			return a;
		} else if (count == 3) {
			int a[] = new int[count + 1];
			a[0] = count;
			a[1] = num / 100;
			a[2] = num / 10 % 10;
			a[3] = num % 100 % 10;
			return a;
		} else if (count == 2) {
			int a[] = new int[count + 1];
			a[0] = count;
			a[1] = num / 10;
			a[2] = num % 10;
			return a;
		} else if (count == 1) {
			int a[] = new int[count + 1];
			a[0] = count;
			a[1] = num;
			return a;
		}
		int b[] = { 0, 0 };
		return b;
	}

	// [ѡ����]
	// 1������ĳԱ���������н��30000Ԫ����н����������6%��
	// ��дһ��JavaӦ�ó�������Ա��10������н����ͳ��δ��10�꣨�ӽ������������롣
	// ��֪ʶ�㣺ѭ�����for��
	public static double[] futureRevenueYear10(int yearlySalary) {
		double sum, rate = 1.06;
		for (int i = 0; i < 9; i++) {
			rate *= 1.06;
		}
		sum = (30000.0 - 30000 * rate * 1.06) / (1 - 1.06);
		double a[] = { 30000 * rate, sum };
		return a;
	}

	// 2�����ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ����
	// �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
	// �Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
	// ����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١���֪ʶ�㣺ѭ�����while��
	public static void notFeedMonkeys() {
		// ������Ҫ���ǰ��������̵��ã����ɴӵ�һ�죨��ɵ�ʮ�죩��ʼ��ǰÿ����ժһ����
		// Ȼ���2������������ʮ�죨��ɵ�һ�죩һ�����˶��٣�
		int last = 1, day = 1;
		for (; day < 10; day++)
			last = (last + 1) * 2;
		System.out.println("һ��ʼ����������" + last);
	}

	// 3����дһ�����򣬼����ʾֻ��Ļ�ѡ�
	// ��������С��100Ԫ�����ΪһԪ��
	// ��������100Ԫ��5000Ԫ֮�䣬��1%��ȡ��ѣ����������5000Ԫ�����Ϊ50Ԫ��
	// ����������������롣��֪ʶ�㣺������䣩
	public static double fee(int num) {
		if (num < 100) {
			return 1;
		} else if (num >= 100 && num <= 5000)
			return num * 0.01;
		else
			return 50;

	}

	// 4���ֱ�ʹ��forѭ����whileѭ����doѭ����1��100֮�������ܱ�3�����������ĺ͡���֪ʶ�㣺ѭ����䣩
	public static void sumComDivisorFor3() {
		int sum = 0;
		for (int i = 0; i < 100; i += 3) {
			sum += i;
		}
		System.out.println("for�Ľ����" + sum);
		sum = 0;
		int i = 0;
		while (i < 100) {
			sum += i;
			i += 3;
		}
		System.out.println("while�Ľ����" + sum);
		sum = 0;
		i = 0;
		do {
			sum += i;
			i += 3;
		} while (i < 100);
		System.out.println("do-while�Ľ����" + sum);
		sum = 0;
	}

	// 5�����0-9֮����������ǲ�����5��
	public static void not5Random() {
		Random r = new Random();
		int a = 5, i = -1;
		for (; a == 5;) {
			a = r.nextInt(10);
			i++;
		}
		System.out.println("�����Ϊ��" + a + "�����������5�Ĵ�����" + i);
	}

	// 6����дһ������������n�Ľ׳ˣ�����5�Ľ׳���1*2*3*4*5
	public static int factorial(int num) {
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		return sum;
	}

	// 7����дһ�������ҳ�����200����С������
	public static void minPrimeBiggerThan200() {
		for (int i = 200; i > 0; i++) {
			if (PrimeNumber.isPrime(i)) {
				System.out.println("����200����С����:" + i);
				break;
			}
		}
	}

	// 8��������������һ��4λ�������󽫸�����ת�Ժ��������ԭ��Ϊ1234����ת�����λ4321
	public static int numReversal(int num) {
		int line[] = { num / 1000, num / 100 % 10, num % 100 / 10, num % 10 };
		return line[3] * 1000 + line[2] * 100 + line[1] * 10 + line[0];
	}

}
