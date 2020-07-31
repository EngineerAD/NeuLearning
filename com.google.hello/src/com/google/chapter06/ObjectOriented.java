package com.google.chapter06;

public class ObjectOriented {
	/**
	 * @author ��N Encode=GBK
	 * @version 1.0
	 * @since 1.8 ��ӭ��������bug function:��ɿκ�ϰ��
	 */
	public static void main(String[] args) {
		// 1������һ������Point������2����Ա����x��y�ֱ��ʾx��y���꣬2�����췽��Point()��Point(int
		// x0,y0),�Լ�һ��movePoint��int dx,int
		// dy������ʵ�ֵ��λ���ƶ�����������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2�����ꡣ[������]
		Point p1 = new Point(0, 0);
		Point p2 = new Point(10, 5);
		p1.movePoint(10, 20);
		p2.movePoint(5, 10);
		// 2������һ��������Rectangle�� [������]
		// 2.1 ��������������getArea()�������getPer()���ܳ���showAll()�ֱ��ڿ���̨���������������ܳ���
		// 2.2 ��2�����ԣ���length����width
		// 2.3 ͨ�����췽��Rectangle(int width, int length)���ֱ���������Ը�ֵ
		// 2.4 ����һ��Rectangle���󣬲���������Ϣ
		Rectangle re = new Rectangle(20, 30);
		re.showAll();
		// 3������һ���ʼǱ��࣬��������ɫ��char����cpu�ͺţ�int���������ԡ� [������]
		// 3.1 �޲κ��вε��������췽�����вι��췽�������ڴ��������ͬʱΪÿ�����Ը�ֵ��
		// 3.2 ����ʼǱ���Ϣ�ķ���
		// 3.3 Ȼ���дһ�������࣬���ԱʼǱ���ĸ���������
		Laptop lap = new Laptop('r', 7500);
		lap.laptopInfo();
		// 4�����������࣬�������£� [������]
		// 4.1����һ������Person��
		// 4.1.1����һ������sayHello()��������Է������ʺ��hello,my name is XXX��
		// 4.1.2���������ԣ����֡���ߡ�����
		// 4.2����һ��PersonCreate�ࣺ
		// 4.2.1�����������󣬷ֱ���zhangsan��33�꣬1.73��lishi��44��1.74
		// 4.2.2�ֱ���ö����sayHello()������
		PersonCreate pc = new PersonCreate();
		pc.lisi.sayHello();
		pc.zhangsan.sayHello();
		// 5�����������࣬�������£� [������]
		// 5.1����һ������Person��
		// 5.1.1����һ������sayHello()��������Է������ʺ��hello,my name is XXX��
		// 5.1.2���������ԣ����֡���ߡ�����
		// 5.1.3ͨ�����췽�����ֱ���������Ը�ֵ
		// 5.2����һ��Constructor�ࣺ
		// 5.2.1�����������󣬷ֱ���zhangsan��33�꣬1.73��lishi��44��1.74
		// 5.2.2�ֱ���ö����sayHello()������
		Constructor pc1 = new Constructor();
		pc1.lisi.sayHello();
		pc1.zhangsan.sayHello();
		// 1�����һ����Student���������������ѧ�źͳɼ������һ�����������ճɼ��Ӹߵ��͵�˳�����������ѧ�źͳɼ���Ϣ��[ѡ����]
		Student s = new Student();
		s.add("����", "44", 10);
		s.add("���·�", "33", 20);
		s.add("��÷��", "22", 30);
		s.add("����", "110", 40);
		s.sort();

		

	}

}
