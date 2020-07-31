package com.google.testing;

/**
 * @author 吴昇
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8
 * @function 求100m高的地方丢个弹球，不考虑系统外因素，每次落地动能衰减一半，求第十次球落地的轨迹总长
 */
public class BallDistance {

	public static void main(String[] args) {
		double height = 100;
		double distance = 0;
		for (int i = 0; i < 10; i++) {
			distance += height;
			height /= 2;
			distance += height;
			// System.out.println(height);
		}
		distance -= height;
		System.out.println(distance + "m");
	}
}
