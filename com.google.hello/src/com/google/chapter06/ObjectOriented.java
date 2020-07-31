package com.google.chapter06;

public class ObjectOriented {
	/**
	 * @author 吴昇 Encode=GBK
	 * @version 1.0
	 * @since 1.8 欢迎反馈更多bug function:完成课后习题
	 */
	public static void main(String[] args) {
		// 1、定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，2个构造方法Point()和Point(int
		// x0,y0),以及一个movePoint（int dx,int
		// dy）方法实现点的位置移动，创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标。[必做题]
		Point p1 = new Point(0, 0);
		Point p2 = new Point(10, 5);
		p1.movePoint(10, 20);
		p2.movePoint(5, 10);
		// 2、定义一个矩形类Rectangle： [必做题]
		// 2.1 定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。
		// 2.2 有2个属性：长length、宽width
		// 2.3 通过构造方法Rectangle(int width, int length)，分别给两个属性赋值
		// 2.4 创建一个Rectangle对象，并输出相关信息
		Rectangle re = new Rectangle(20, 30);
		re.showAll();
		// 3、定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。 [必做题]
		// 3.1 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值；
		// 3.2 输出笔记本信息的方法
		// 3.3 然后编写一个测试类，测试笔记本类的各个方法。
		Laptop lap = new Laptop('r', 7500);
		lap.laptopInfo();
		// 4、定义两个类，描述如下： [必做题]
		// 4.1定义一个人类Person：
		// 4.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
		// 4.1.2有三个属性：名字、身高、体重
		// 4.2定义一个PersonCreate类：
		// 4.2.1创建两个对象，分别是zhangsan，33岁，1.73；lishi，44，1.74
		// 4.2.2分别调用对象的sayHello()方法。
		PersonCreate pc = new PersonCreate();
		pc.lisi.sayHello();
		pc.zhangsan.sayHello();
		// 5、定义两个类，描述如下： [必做题]
		// 5.1定义一个人类Person：
		// 5.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
		// 5.1.2有三个属性：名字、身高、体重
		// 5.1.3通过构造方法，分别给三个属性赋值
		// 5.2定义一个Constructor类：
		// 5.2.1创建两个对象，分别是zhangsan，33岁，1.73；lishi，44，1.74
		// 5.2.2分别调用对象的sayHello()方法。
		Constructor pc1 = new Constructor();
		pc1.lisi.sayHello();
		pc1.zhangsan.sayHello();
		// 1、设计一个类Student，该类包括姓名、学号和成绩。设计一个方法，按照成绩从高到低的顺序输出姓名、学号和成绩信息。[选做题]
		Student s = new Student();
		s.add("王启", "44", 10);
		s.add("王德发", "33", 20);
		s.add("卡梅伦", "22", 30);
		s.add("迪特", "110", 40);
		s.sort();

		

	}

}
