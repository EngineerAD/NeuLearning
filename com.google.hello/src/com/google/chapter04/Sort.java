package com.google.chapter04;

public class Sort {

	public static void main(String[] args) {

		Sort sort = new Sort();
		sort.bobSort();
	}

	public void quickSort() {
		int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int temp = 0;
		for (int low = 0; low < a.length; low++) {
			temp=a[low];
			for (int high = a.length - 1; high > low; high--) {

			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

	public void bobSort() {
		int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
