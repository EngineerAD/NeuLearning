package com.google.testing;

public class sum {
	/**
	 * ð������
	 * */
	public static int[] BubbleSort(int[] arr) {

		int temp;// ��ʱ����
		for (int i = 0; i < arr.length - 1; i++) { // ��ʾ������һ��arr.length-1�Ρ�
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
		// ��������
		nums = sum.BubbleSort(nums);
		// �������������ı߽�
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
