package com.google.Grades;

public class Student {
	int no;
    String name;
    char sex;
    int age;
    double score;
    public Student(int no, String name, char sex, int age, double score) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public void Show(){
        System.out.println("ѧ��:"+this.no+" ����:"+this.name+" �Ա�:"+this.sex+" ����:"+this.age+" �ۺϳɼ�:"+this.score);
    }
}

