package com.google.Grades;

public class ChineseStudent extends Student {

	public ChineseStudent(int no, String name, char sex, int age, double speechScore, double articleScore,
			double middleScore, double finalScore) {
		super(no, name, sex, age, (0.35 * speechScore + 0.35 * articleScore + 0.15 * middleScore + 0.15 * finalScore));
	}
}
