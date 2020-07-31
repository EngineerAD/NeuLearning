package com.google.Grades;

public class EnglishStudent extends Student{

    public EnglishStudent(int no, String name, char sex, int age, double speechScore,double middleScore,double finalScore){
    super(no,name,sex,age,(0.5*speechScore+0.25*middleScore+0.25*finalScore));

}
}
