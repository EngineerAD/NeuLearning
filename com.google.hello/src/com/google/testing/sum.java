package com.google.testing;

public class sum {
	/**
	 * 冒泡排序
	 * */
	public static int[] BubbleSort(int[] arr) {

		int temp;// 临时变量
		for (int i = 0; i < arr.length - 1; i++) { // 表示趟数，一共arr.length-1次。
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		return (int[]) arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 2, 7, 11, 15 };
		int target = 9, solution1, solution2, stopDot = nums.length;
		// 先做排序
		nums = sum.BubbleSort(nums);
		// 测出不符合题意的边界
		for (int i = 0; i < stopDot; i++) {
			if (nums[i] >= target) {
				stopDot = i;
			}

			if (nums[i] + nums[i + 1] == 9) {
				solution1 = i;
				solution2 = i + 1;
				System.out.println(solution1+"  "+solution2);
			}
		}
	}

}
