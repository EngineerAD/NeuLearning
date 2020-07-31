package com.google.chapter06;

/**
 * @author 吴昇 Encoding:GBK
 * @version 1.0
 * @since 1.8
 * function:生成一个点
 */
public class Point {
	private int x, y;

	public Point() {

	}

	public Point(int x0, int y0) {
		x = x0;
		y = y0;
		System.out.println("当前坐标："+x + "," + y);
	}

	public void movePoint(int dx, int dy) {
		x = dx;
		y = dy;
		System.out.println("坐标移动后："+x + "," + y);
	}
}
