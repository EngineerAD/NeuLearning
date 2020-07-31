package com.google.Cola;
/**
 * @author 吴昇
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 欢迎反馈更多bug
 * @function 演示多态
 * @bug 无
 */
public class TestCompany {
	/*4、 Cola公司的雇员分为以下若干类：(知识点：多态) [必做题]
	4.1  ColaEmployee ：这是所有员工总的父类，属性：员工的姓名,员工的生日月份。方法：getSalary(int month) 根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
	4.2  SalariedEmployee ：	ColaEmployee 的子类，拿固定工资的员工。属性：月薪
	4.3  HourlyEmployee ：ColaEmployee 的子类，按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。属性：每小时的工资、每月工作的小时数
	4.4  SalesEmployee ：ColaEmployee 的子类，销售人员，工资由月销售额和提成率决定。属性：月销售额、提成率
	4.5  定义一个类Company，在该类中写一个方法，调用该方法可以打印出某月某个员工的工资数额，写一个测试类TestCompany,在main方法，把若干各种类型的员工放在一个ColaEmployee 数组里，并单元出数组中每个员工当月的工资。
	*/
	public static void main(String[] args) {
		Company cp=new Company();
		ColaEmployee[] ce={new SalariedEmployee("bob",1,1,200),new HourlyEmployee("Charlie", 2, 1, 170, 60),new SalesEmployee("Archer", 3, 2, 1000, 1.3)}	;
		for(ColaEmployee c :ce)
		cp.tell(c);
	}

}
