package com.google.chapter06;

/**
 * @author ��N Encoding:GBK
 * @version 1.0
 * @since 1.8
 * function:����һ����
 */
public class Point {
	private int x, y;

	public Point() {

	}

	public Point(int x0, int y0) {
		x = x0;
		y = y0;
		System.out.println("��ǰ���꣺"+x + "," + y);
	}

	public void movePoint(int dx, int dy) {
		x = dx;
		y = dy;
		System.out.println("�����ƶ���"+x + "," + y);
	}
}
