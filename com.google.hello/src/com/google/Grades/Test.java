package com.google.Grades;

import java.util.Random;

/**
 * @author ��N
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 ��ӭ��������bug
 * @function ��ʾ��̬
 * @bug ��
 */
public class Test {
	public static void main(String[] args) {
		Student[] stu = { new EnglishStudent(100, "�׾�", '��', 48, 80, 90, 81),
				new ComputerStudent(101, "����", '��', 45, 20, 20, 20, 20),
				new ChineseStudent(102, "����", '��', 50, 80, 100, 95, 95) };
		Student[] stu1 = new Student[stu.length];
		// ���������
		Random r = new Random();
		for (int i = 0; i < stu1.length; i++) {
			int num = r.nextInt(stu1.length);
			while (stu1[num] != null) {
				num = r.nextInt(stu1.length);
			}
			stu1[num] = stu[i];
			stu[i] = null;

		}
		// ������ʾ
		for (int i = 0; i < stu1.length; i++) {
			stu1[i].Show();
		}
	}

}
