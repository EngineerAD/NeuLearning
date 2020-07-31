package com.google.chapter03;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author 吴昇 Encoding:GBK
 * @version 1.2
 * @since 1.8
 * Debug 1.修复了必做题第9题在处理5位数时，第四位数字不正确的问题
 * 2.修复了选做题第2题计算结果过大的问题
 * 3.修复了选做题第3题在数字临界时出现计算错误的问题
 * 
 */
public class Fim03 {
	/**
	 * @return No return value.
	 * @param args
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// [必做题]
		// 1、企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；
		// 利润高于10万元，低于或等于20万元时，高于10万元的部分，可提成7.5%；
		// 高于20万，低于或等于40万时，高于20万元的部分，可提成5%；
		// 高于40万，低于或等于60万时，高于40万元的部分，可提成3%；
		// 高于60万，低于或等于100万时，高于60万元的部分，可提成1.5%，
		// 高于100万元时，超过100万元的部分按1%提成，
		// 输入一个整数变量为当月利润，求应发放奖金总数？（知识点：条件语句）
		Scanner input = new Scanner(System.in);
		System.out.println("请输入总利润");
		int profit = input.nextInt();
		System.out.println("1.总利润为:" + profit + " 奖金为：" + getBonus(profit));

		// 2、输入一个成绩a，使用switch结构求出a的等级。
		// A：90-100，B：80-89，C：70-79，D：60-69，E：0~59（知识点：条件语句switch）
		System.out.println("2.请输入成绩");
		int a = input.nextInt();
		System.out.println("成绩为:" + a + " 等级为：" + getGrades(a));

		// 3、输入一个数字，判断是一个奇数还是偶数（知识点：条件语句）
		System.out.println("3.请输入一个整数");
		int numNo3 = input.nextInt();
		System.out.println(numNo3 + "是");
		if (isOddEven(numNo3)) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}

		// 4、编写程序， 判断一个随机变量x的值，如果是1，输出x=1，如果是5，输出x=5，如果是10，
		// 输出x=10，除了以上几个值，都输出x=none。（知识点：条件语句）
		isOrder();

		// 5、判断一个随机整数是否能被5和6同时整除（打印能被5和6整除），或只能被5整除（打印能被5整除），
		// 或只能被6整除，（打印能被6整除），不能被5或6整除，（打印不能被5或6整除）（知识点：条件语句）
		isComDivisorFor5And6();

		// 6、输入一个年份，判断这个年份是否是闰年（知识点：条件、循环语句）
		System.out.println("6.请输入年份");
		int year = input.nextInt();

		isLeepYear(year);

		// 7、输入一个0～100的分数，如果不是0～100之间，打印分数无效，
		// 根据分数等级打印A,B,C,D,E（知识点：条件语句if elseif）
		System.out.println("7.请输入百分制分数");
		int fraction = input.nextInt();
		System.out.println("分数为:" + fraction + " 等级为：" + getGrades(fraction));

		// 8、输入三个整数x,y,z，请把这三个数由小到大输出（知识点：条件语句）
		System.out.println("8.请输入3个整数进行排序，一个数字一Enter");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		sortThree(x, y, z);

		// 9、有一个不多于5位的正整数，求它是几位数，分别打印出每一位数字。（知识点：条件语句）
		System.out.println("9.请输入一个不多于5位的正整数");
		int numNo9 = input.nextInt();
		int division[] = numAnalysis(numNo9);
		System.out.println("正整数为:" + numNo9 + "，为" + division[0] + "位数" + "，分别是：");
		for (int i = 1; i < division.length; i++) {
			System.out.print(division[i] + " ");
		}
		System.out.println();
		// [选做题]
		// 1、假设某员工今年的年薪是30000元，年薪的年增长率6%。
		// 编写一个Java应用程序计算该员工10年后的年薪，并统计未来10年（从今年算起）总收入。
		// （知识点：循环语句for）
		int yearlySalary = 30000;
		double other[] = futureRevenueYear10(yearlySalary);
		System.out.println("10年后年薪为:" + other[0] + "元，总收入为" + other[1] + "元");

		// 2、猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个，
		// 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
		// 以后每天早上都吃了前一天剩下的一半零一个。
		// 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。（知识点：循环语句while）
		notFeedMonkeys();

		// 3、编写一个程序，计算邮局汇款的汇费。
		// 如果汇款金额小于100元，汇费为一元，
		// 如果金额在100元与5000元之间，按1%收取汇费，如果金额大于5000元，汇费为50元。
		// 汇款金额由命令行输入。（知识点：条件语句）
		System.out.println("*3.请输入邮局汇款");
		int feeNum = input.nextInt();

		System.out.println("汇款金额为:" + feeNum + "元，手续费为" + fee(feeNum) + "元");
		// 4、分别使用for循环，while循环，do循环求1到100之间所有能被3整除的整数的和。（知识点：循环语句）
		sumComDivisorFor3();

		// 5、输出0-9之间的数，但是不包括5。
		not5Random();

		// 6、编写一个程序，求整数n的阶乘，例如5的阶乘是1*2*3*4*5
		System.out.println("*6.输入一个整数，求整数n的阶乘");
		int n = input.nextInt();
		System.out.println(n + "的阶乘为:" + factorial(n));

		// 7、编写一个程序，找出大于200的最小的质数

		minPrimeBiggerThan200();

		// 8、由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321
		System.out.println("*8输入一个4位整数，求将该数反转以后的数");
		int num4 = input.nextInt();
		System.out.println(num4 + "的反转为:" + numReversal(num4));

		long time = System.currentTimeMillis() - start;
		input.close();
		System.out.println("运行耗时= " + time + " 毫秒");
	}

	// [必做题]
	// 1、企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；
	// 利润高于10万元，低于或等于20万元时，高于10万元的部分，可提成7.5%；
	// 高于20万，低于或等于40万时，高于20万元的部分，可提成5%；
	// 高于40万，低于或等于60万时，高于40万元的部分，可提成3%；
	// 高于60万，低于或等于100万时，高于60万元的部分，可提成1.5%，
	// 高于100万元时，超过100万元的部分按1%提成，
	// 输入一个整数变量为当月利润，求应发放奖金总数？（知识点：条件语句）
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

	// 2、输入一个成绩a，使用switch结构求出a的等级。
	// A：90-100，B：80-89，C：70-79，D：60-69，E：0~59（知识点：条件语句switch）
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
			return "分数无效";
		}
	}

	// 3、输入一个数字，判断是一个奇数还是偶数（知识点：条件语句）
	public static boolean isOddEven(int num) {
		return num % 2 == 0 ? true : false;
	}

	// 4、编写程序， 判断一个随机变量x的值，如果是1，输出x=1，如果是5，输出x=5，如果是10，
	// 输出x=10，除了以上几个值，都输出x=none。（知识点：条件语句）
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

	// 5、判断一个随机整数是否能被5和6同时整除（打印能被5和6整除），或只能被5整除（打印能被5整除），
	// 或只能被6整除，（打印能被6整除），不能被5或6整除，（打印不能被5或6整除）（知识点：条件语句）
	public static void isComDivisorFor5And6() {
		Random r = new Random();
		int num = r.nextInt();
		System.out.println("5.随机数为："+num);
		if (num % 5 == 0 && num % 6 == 0)
			System.out.println("能被5和6整除");
		else if (num % 5 == 0)
			System.out.println("能被5整除");
		else if (num % 6 == 0)
			System.out.println("能被6整除");
		else
			System.out.println("不能被5和6整除");
	}

	// 6、输入一个年份，判断这个年份是否是闰年（知识点：条件、循环语句）
	public static void isLeepYear(int year) {
		LeapYear.main(year);
	}

	// 7、输入一个0～100的分数，如果不是0～100之间，打印分数无效，
	// 根据分数等级打印A,B,C,D,E（知识点：条件语句if elseif）
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
			return "分数无效";
		}
	}

	// 8、输入三个整数x,y,z，请把这三个数由小到大输出（知识点：条件语句）
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
		System.out.println("从小到大排列：" + x + " " + y + " " + z);
	}

	// 9、有一个不多于5位的正整数，求它是几位数，分别打印出每一位数字。（知识点：条件语句）
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

	// [选做题]
	// 1、假设某员工今年的年薪是30000元，年薪的年增长率6%。
	// 编写一个Java应用程序计算该员工10年后的年薪，并统计未来10年（从今年算起）总收入。
	// （知识点：循环语句for）
	public static double[] futureRevenueYear10(int yearlySalary) {
		double sum, rate = 1.06;
		for (int i = 0; i < 9; i++) {
			rate *= 1.06;
		}
		sum = (30000.0 - 30000 * rate * 1.06) / (1 - 1.06);
		double a[] = { 30000 * rate, sum };
		return a;
	}

	// 2、猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个，
	// 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
	// 以后每天早上都吃了前一天剩下的一半零一个。
	// 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。（知识点：循环语句while）
	public static void notFeedMonkeys() {
		// 这题重要的是把整个过程倒置，看成从第一天（题干第十天）开始往前每天先摘一个，
		// 然后变2倍存起来，第十天（题干第一天）一共存了多少？
		int last = 1, day = 1;
		for (; day < 10; day++)
			last = (last + 1) * 2;
		System.out.println("一开始的桃子数：" + last);
	}

	// 3、编写一个程序，计算邮局汇款的汇费。
	// 如果汇款金额小于100元，汇费为一元，
	// 如果金额在100元与5000元之间，按1%收取汇费，如果金额大于5000元，汇费为50元。
	// 汇款金额由命令行输入。（知识点：条件语句）
	public static double fee(int num) {
		if (num < 100) {
			return 1;
		} else if (num >= 100 && num <= 5000)
			return num * 0.01;
		else
			return 50;

	}

	// 4、分别使用for循环，while循环，do循环求1到100之间所有能被3整除的整数的和。（知识点：循环语句）
	public static void sumComDivisorFor3() {
		int sum = 0;
		for (int i = 0; i < 100; i += 3) {
			sum += i;
		}
		System.out.println("for的结果：" + sum);
		sum = 0;
		int i = 0;
		while (i < 100) {
			sum += i;
			i += 3;
		}
		System.out.println("while的结果：" + sum);
		sum = 0;
		i = 0;
		do {
			sum += i;
			i += 3;
		} while (i < 100);
		System.out.println("do-while的结果：" + sum);
		sum = 0;
	}

	// 5、输出0-9之间的数，但是不包括5。
	public static void not5Random() {
		Random r = new Random();
		int a = 5, i = -1;
		for (; a == 5;) {
			a = r.nextInt(10);
			i++;
		}
		System.out.println("随机数为：" + a + "，该随机命中5的次数：" + i);
	}

	// 6、编写一个程序，求整数n的阶乘，例如5的阶乘是1*2*3*4*5
	public static int factorial(int num) {
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		return sum;
	}

	// 7、编写一个程序，找出大于200的最小的质数
	public static void minPrimeBiggerThan200() {
		for (int i = 200; i > 0; i++) {
			if (PrimeNumber.isPrime(i)) {
				System.out.println("大于200的最小质数:" + i);
				break;
			}
		}
	}

	// 8、由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321
	public static int numReversal(int num) {
		int line[] = { num / 1000, num / 100 % 10, num % 100 / 10, num % 10 };
		return line[3] * 1000 + line[2] * 100 + line[1] * 10 + line[0];
	}

}
