package com.google.chapter06;

public class VehicleTest {
	/**
	 * @author ��N Encode=GBK
	 * @version 1.0
	 * @since 1.8 ��ӭ��������bug function:��ɿκ�ϰ��
	 */
	public static void main(String[] args) {
		// 2������һ��������Vehicle��Ҫ�����£�[ѡ����]
		// 2.1���԰���������Ʒ��brand��String���ͣ�����ɫcolor��String���ͣ����ٶ�speed��double���ͣ���������������Ϊ˽�С�
		// 2.2�����ṩһ���вεĹ��췽����Ҫ��Ʒ�ƺ���ɫ���Գ�ʼ��Ϊ����ֵ�����ٶȵĳ�ʼֵ����Ϊ0����
		// 2.3Ϊ˽�������ṩ������������ע�⣺����Ʒ��һ����ʼ��֮�����޸ġ�
		// 2.4����һ��һ�㷽��run()���ô�ӡ��������������ܵĹ���
		// 2.5���������VehicleTest������main�����д���һ��Ʒ��Ϊ��benz������ɫΪ��black����������
		Vehicle v = new Vehicle("benz", "black");
		v.setSpeed(100);
		v.run();
		v.setSpeed(400);
		v.setSpeed(-100);
		v.run();
	}

}
