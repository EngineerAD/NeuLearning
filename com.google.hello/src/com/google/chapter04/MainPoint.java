package com.google.chapter04;

public class MainPoint {
	/**
	 * @author ��N Encoding:GBK
	 * @version 1.0
	 * @since 1.8
	 * 
	 */
	static MainPoint mp = new MainPoint();

	public static void main(String[] args) {
		/*
		 * 1����дһ���򵥳���Ҫ�����鳤��Ϊ5���ֱ�ֵ10��20��30��40��50���ڿ���̨����������ֵ��
		 * ��֪ʶ�㣺���鶨��ʹ�����һά�����ʼ����[������]
		 * 
		 * 2����һ���ַ������ֵ��neusofteducation����������һ���ַ������С���֪ʶ�㣺���鸴�ƣ� [������]
		 * 
		 * 3������һ����9��������1,6,2,3,9,4,5,7,8�������飬������Ȼ����������������ֵ��
		 * ��֪ʶ�㣺Arrays.sort���� ��ð������ [������]
		 */
		// ��1
		int arr1[] = { 10, 20, 30, 40, 50 };
		mp.outArrary(arr1);
		// ��2
		char arr2[] = { 'a', 'b' }, arr2Change[];
		arr2Change = arr2;
		mp.outArrary(arr2Change);
		// ��3
		int arr3[] = { 1, 6, 2, 3, 9, 4, 5, 7, 8 };
		mp.outArrary(mp.bobSort(arr3));

		/*
		 * 4�� ���һ��double�Ͷ�ά���飨���ȷֱ�Ϊ5��4��ֵ�Լ��趨����ֵ�� ��֪ʶ�㣺���鶨��ʹ�������ά�����ʼ�������������
		 * [������]
		 * 
		 * 5�� ��һ����8��������18��25��7��36��13��2��89��63�����������ҳ����������������±ꡣ
		 * ��֪ʶ�㣺�������������Ԫ�ط��ʣ�[������]
		 */
		// ��4
		double dou[][] = new double[5][4];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				dou[i][j] = i * 4 + 1 + j;
			}
		}
		mp.outArrary(dou);
		// ��5
		int findMax[] = { 18, 25, 7, 36, 13, 2, 89, 63 };
		int max[] = mp.max(findMax);
		System.out.println("���ֵ��" + max[0] + " �±�" + max[1]);

		/*
		 * 1����2����ά����ֱ��� 2 3 4 �� 1 5 2 8 4 6 8 5 9 10 -3 2 7 -5 -18
		 * �������·�ʽ�������㡣����һ��2��4�е����顣������ĵ�1��1����2*1+3*5+4*2��1��2����2*5+3*9+4*7
		 * ��2��1����4*1+6*5+8*2 �������ơ���֪ʶ�㣺��ά���鶨��ʹ������������������Ԫ�ط��ʣ� [ѡ����]
		 * 
		 * 2����һ�������е�Ԫ�������ţ�֪ʶ�㣺�������������Ԫ�ط��ʣ� [ѡ����]
		 * 
		 * 3. ��һ�������е��ظ�Ԫ�ر���һ�����������㡣��֪ʶ�㣺�������������Ԫ�ط��ʣ� [ѡ����]
		 */
		// ѡ����1
		// ���⽨������Դ����о����������֪ʶ���ҽ�����������²��ñ����ƽⷨ���
		int multiArrary1[][] = { { 2, 3, 4 }, { 4, 6, 8 } },
				multiArrary2[][] = { { 1, 5, 2, 8 }, { 5, 9, 10, -3 }, { 2, 7, -5, -18 } },
				endArrary[][] = new int[2][4];
		int sum = 0;
		// trip��Ϊ������������ڿ�������1���кͽ��������У�Ҳ���Ǽ������ڡ�
		for (int trip = 0; trip < endArrary.length; trip++) {
			// i���ڿ�������2����Index��j����ͬʱ��������1���к�����2���У���������ѭ������ʱ
			// ��������һ�в����꣬�����һ����������
			for (int i = 0; i <endArrary[trip].length; i++) {
				for (int j = 0; j < 3; j++) {
					// ȡ�������������ע�Ͳ����г�����Կ�������������
					// System.out.print(multiArrary1[trip][j] + "*" +
					// multiArrary2[j][i] + "+");
					sum += multiArrary1[trip][j] * multiArrary2[j][i];
					//System.out.print(endArrary[trip].length);
				}
				// System.out.print("\t");
				endArrary[trip][i] = sum;
				sum = 0;
			}
			// System.out.print("\n");
		}
		mp.outArrary(endArrary);
		// ѡ����2
		int f[] = { 18, 25, 7, 13, 2, 89, 63 };
		int temp;
		for (int i = 0; i <= f.length - i - 1; i++) {
			temp = f[i];
			f[i] = f[f.length - 1 - i];
			f[f.length - 1 - i] = temp;
		}
		mp.outArrary(f);
		// ѡ����3
		int fin[] = { 1, 1, 2, 3, 4, 4, 5, 4, 6, 7, 6, 8, 9 }, same = fin[0];
		boolean flag = false;
		for (int a : fin) {
			if (a == same)
				flag = true;
			same = a;
		}
		if (flag) {
			for (int i = 0; i < fin.length; i++)
				for (int j = i + 1; j < fin.length; j++)
					if (fin[i] == fin[j] && fin[i] != 0)
						fin[j] = 0;
		}
		mp.outArrary(fin);
	}

	public int[] max(int arr[]) {
		int maxArr[] = new int[2];
		int i = 0;
		for (int x : arr) {
			if (maxArr[0] < x) {
				maxArr[0] = x;
				maxArr[1] = i;
			}
			i++;
		}
		return maxArr;
	}

	public void outArrary(int arr[]) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.print("\n");
	}

	public void outArrary(char arr[]) {
		for (char i : arr) {
			System.out.print(i + "\t");
		}
		System.out.print("\n");
	}

	public int[] bobSort(int a[]) {
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
		return a;
	}

	public void outArrary(double a[][]) {
		for (double[] arr : a) {
			for (double i : arr) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}

	public void outArrary(int a[][]) {
		for (int[] arr : a) {
			for (int i : arr) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}
}
