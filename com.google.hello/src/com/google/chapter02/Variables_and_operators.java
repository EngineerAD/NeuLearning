package com.google.chapter02;

/**
 * 
 * @author ������
 *
 */
public class Variables_and_operators {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 100�ǳ�����a�Ǳ���
		// int��������
		int a = 100;
		// "Arc"�ǳ�����b�Ǳ���
		// String�����ַ���
		String b = "abc";

		// jdk7.0�����ԣ�֧��_
		int c = 1_200_340_000;

		// double����С��
		double d = 3.14_15926;

		// ���γ�����Ĭ����int����

		// �˴���Ĭ�ϵ�����ת����int -> byte
		byte a1 = 127;
		// �˴���Ĭ�ϵ�����ת����int -> short
		short b1 = 32767;

		int c1 = 10000000;

		// �˴���Ĭ�ϵ�����ת���� int -> long
		long d4 = 1234567;

		// ������ݳ�����int�ķ�Χ��������������L
		long e = 123456789999L;
		//16����
				//0-9, A(10),B(11),C(12),D(13),E(14),F(15), 10(16), 11(17)..... 1F, 20..2F, 30
				int a2 = 10;
				int b2 = 0X10;
				
				//�˽���
				//0-7,10(8),11(9),12(10)
				int c2 = 010;
				
				//������
				//0,1,10,11,100,101,110,111,1000,1001,1010,1011,1100,1101,1110,1111
				int d2 = 0B1100;
						
				//��ӡ����10�������
				System.out.println(b2);
				System.out.println(c2);
				System.out.println(d2);
				
				//С������Ĭ��Ϊdouble����
				double a3 = 3.14;
				
				float b3 = 3.14f;
				
				//��ʾ��ʮ���ƺͿ�ѧ������������ʽ
				double c3 = 3.14e2;//314
				double d3 = 3.14e-1;//0.314
				
				//��ӡС����ʱ���п�����ʮ���ƣ�Ҳ�����ǿ�ѧ��������������ʽ�����ܡ�
				System.out.println(c3);
				System.out.println(d3);
	}
}
