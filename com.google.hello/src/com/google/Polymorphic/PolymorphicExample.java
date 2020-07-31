package com.google.Polymorphic;

/**
 * @author 吴昇
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 欢迎反馈更多bug
 * @function 演示多态
 * @bug 无
 */
public class PolymorphicExample {
	public static void main(String[] args) {
		CarType c = new Bus();
		c.parking();
		c = new Van();
		c.parking();
		c = new Car();
		c.parking();
		c = null;
	}

}
