package com.google.testing;

import java.util.LinkedList;

/**
 * @author 吴昇
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8
 * @function 实现LinkedList模拟栈
 */
public class SimulationStack {

	public static void main(String[] args) {
		Stack s = new Stack();
		Object o;
		System.out.println("Empty stack  is " + s.isEmpty());
		for (int i = 0; i < 5; i++) {
			o = new OBJTest("测试" + (i + 1));
			System.out.println("入栈顺序为：" + o.toString());
			s.push(o);
		}
		System.out.println("Empty stack  is " + s.isEmpty());
		for (int i = 0; i < 5; i++) {
			o = s.get();
			System.out.println("出栈顺序为：" + o.toString());
		}
		System.out.println("Empty stack  is " + s.isEmpty());
	}

}

class Stack {
	LinkedList<Object> list = new LinkedList<>();

	public void push(Object o) {
		list.addLast(o);
	}

	public Object get() {
		return list.removeLast();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
}

// 测试数据类
class OBJTest {
	private String name;

	public OBJTest(String name) {
		this.name = name;
	}

	public OBJTest() {
	}

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}
}