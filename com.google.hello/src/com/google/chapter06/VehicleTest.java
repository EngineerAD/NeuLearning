package com.google.chapter06;

public class VehicleTest {
	/**
	 * @author 吴昇 Encode=GBK
	 * @version 1.0
	 * @since 1.8 欢迎反馈更多bug function:完成课后习题
	 */
	public static void main(String[] args) {
		// 2、定义一个汽车类Vehicle，要求如下：[选做题]
		// 2.1属性包括：汽车品牌brand（String类型）、颜色color（String类型）和速度speed（double类型），并且所有属性为私有。
		// 2.2至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始值必须为0）。
		// 2.3为私有属性提供访问器方法。注意：汽车品牌一旦初始化之后不能修改。
		// 2.4定义一个一般方法run()，用打印语句描述汽车奔跑的功能
		// 2.5定义测试类VehicleTest，在其main方法中创建一个品牌为“benz”、颜色为“black”的汽车。
		Vehicle v = new Vehicle("benz", "black");
		v.setSpeed(100);
		v.run();
		v.setSpeed(400);
		v.setSpeed(-100);
		v.run();
	}

}
