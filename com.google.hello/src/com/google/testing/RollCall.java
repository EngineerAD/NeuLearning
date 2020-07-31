package com.google.testing;

/**
 * @author 吴昇
 * @Encode GBK
 * @version 1.0
 * @since 1.8 欢迎反馈更多bug
 * @function 实现点兵点将
 */
public class RollCall {

	public static void main(String[] args) {
		int[] line = { 1, 2, 3, 4, 5, 6, 7 };
		int[] shadow = new int[line.length];
		int maxLength = line.length;// 测算每次子集长度
		int interval = 2;// 间隔
		int times = 0;// 遍历次数，用于控制第一个数字是否进入替换序列，默认为1开启，0为关闭
		while (maxLength != 1) {
			// 对数组做划去操作
			for (int i = 0; i < maxLength; i += interval) {
				if (times == 1) {
					times++;
					continue;
				}
				line[i] = 0;
			}
			// 复刻子集数组便于整理后实现数组二次遍历
			int i = 0;
			maxLength = 0;
			for (int j = 0; j < shadow.length;) {
				if (i == 7)
					break;
				if (line[i] != 0) {
					shadow[j] = line[i];
					maxLength++;
					j++;
				}
				i++;
			}
			// 将整理完的数组返回给原数组
			for (i = 0; i < shadow.length; i++) {
				line[i] = shadow[i];
			}
			// 以下所有注释的代码用于调试
			// 取消这个多行注释能够输出每次遍历的集合
			/*
			 * for (i = 0; i < shadow.length; i++) { System.out.print(shadow[i]
			 * + " "); shadow[i] = 0; }
			 */
			// System.out.println();
		}
		System.out.println("最终得数是" + line[0]);
		// System.out.println(maxLength);
	}

}
