package com.google.Grades;

public class ComputerStudent extends Student {

	public ComputerStudent(int no, String name, char sex, int age, double operateScore, double writeScore,
			double middleScore, double finalScore) {
		super(no, name, sex, age, (operateScore * 0.4 + writeScore * 0.2 + 0.2 * middleScore + 0.2 * finalScore));
	}
}
