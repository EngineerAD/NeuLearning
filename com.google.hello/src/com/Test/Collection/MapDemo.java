package com.Test.Collection;

import java.util.HashMap;
import java.util.Map;

import com.google.Grades.Student;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student(11, "哈利", '男', 20, 50.0);
		Map m = new HashMap();
		m.put("哈利", st);
		m.put("GG", 11);
		//键值对不许重复，否者后来的键值会把之前的键值覆盖
		m.put("GG", 22);
		System.out.println(m.get("GG").toString());
	}

}
