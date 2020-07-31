package com.google.Grades;

import java.util.Random;

/**
 * @author 吴昇
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 欢迎反馈更多bug
 * @function 演示多态
 * @bug 无
 */
public class Test {
	public static void main(String[] args) {
		Student[] stu = { new EnglishStudent(100, "雷军", '男', 48, 80, 90, 81),
				new ComputerStudent(101, "马化腾", '男', 45, 20, 20, 20, 20),
				new ChineseStudent(102, "马云", '男', 50, 80, 100, 95, 95) };
		Student[] stu1 = new Student[stu.length];
		// 产生随机数
		Random r = new Random();
		for (int i = 0; i < stu1.length; i++) {
			int num = r.nextInt(stu1.length);
			while (stu1[num] != null) {
				num = r.nextInt(stu1.length);
			}
			stu1[num] = stu[i];
			stu[i] = null;

		}
		// 遍历显示
		for (int i = 0; i < stu1.length; i++) {
			stu1[i].Show();
		}
	}

}
