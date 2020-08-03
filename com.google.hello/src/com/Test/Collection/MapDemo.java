package com.Test.Collection;

import java.util.HashMap;
import java.util.Map;

import com.google.Grades.Student;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student(11, "刘德华", '男', 20, 50.0);
		Map m = new HashMap();
		m.put("刘德华", st);
		m.put("GG", 11);
		//��ֵ�Բ����ظ������ߺ����ļ�ֵ���֮ǰ�ļ�ֵ����
		m.put("GG", 22);
		System.out.println(m.get("GG").toString());
	}

}
