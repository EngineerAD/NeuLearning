package com.google.chapter04;

public class MainPoint {
	/**
	 * @author 吴昇 Encoding:GBK
	 * @version 1.0
	 * @since 1.8
	 * 
	 */
	static MainPoint mp = new MainPoint();

	public static void main(String[] args) {
		/*
		 * 1、编写一个简单程序，要求数组长度为5，分别赋值10，20，30，40，50，在控制台输出该数组的值。
		 * （知识点：数组定义和创建、一维数组初始化）[必做题]
		 * 
		 * 2、将一个字符数组的值（neusofteducation）拷贝到另一个字符数组中。（知识点：数组复制） [必做题]
		 * 
		 * 3、给定一个有9个整数（1,6,2,3,9,4,5,7,8）的数组，先排序，然后输出排序后的数组的值。
		 * （知识点：Arrays.sort排序 、冒泡排序） [必做题]
		 */
		// 题1
		int arr1[] = { 10, 20, 30, 40, 50 };
		mp.outArrary(arr1);
		// 题2
		char arr2[] = { 'a', 'b' }, arr2Change[];
		arr2Change = arr2;
		mp.outArrary(arr2Change);
		// 题3
		int arr3[] = { 1, 6, 2, 3, 9, 4, 5, 7, 8 };
		mp.outArrary(mp.bobSort(arr3));

		/*
		 * 4、 输出一个double型二维数组（长度分别为5、4，值自己设定）的值。 （知识点：数组定义和创建、多维数组初始化、数组遍历）
		 * [必做题]
		 * 
		 * 5、 在一个有8个整数（18，25，7，36，13，2，89，63）的数组中找出其中最大的数及其下标。
		 * （知识点：数组遍历、数组元素访问）[必做题]
		 */
		// 题4
		double dou[][] = new double[5][4];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				dou[i][j] = i * 4 + 1 + j;
			}
		}
		mp.outArrary(dou);
		// 题5
		int findMax[] = { 18, 25, 7, 36, 13, 2, 89, 63 };
		int max[] = mp.max(findMax);
		System.out.println("最大值：" + max[0] + " 下标" + max[1]);

		/*
		 * 1、有2个多维数组分别是 2 3 4 和 1 5 2 8 4 6 8 5 9 10 -3 2 7 -5 -18
		 * 按照如下方式进行运算。生成一个2行4列的数组。此数组的第1行1列是2*1+3*5+4*2第1行2列是2*5+3*9+4*7
		 * 第2行1列是4*1+6*5+8*2 依次类推。（知识点：多维数组定义和创建、数组遍历、数组元素访问） [选作题]
		 * 
		 * 2、将一个数组中的元素逆序存放（知识点：数组遍历、数组元素访问） [选作题]
		 * 
		 * 3. 将一个数组中的重复元素保留一个其他的清零。（知识点：数组遍历、数组元素访问） [选作题]
		 */
		// 选做题1
		// 本题建议从线性代数中矩阵运算相关知识点找解决方法，以下采用暴力破解法完成
		int multiArrary1[][] = { { 2, 3, 4 }, { 4, 6, 8 } },
				multiArrary2[][] = { { 1, 5, 2, 8 }, { 5, 9, 10, -3 }, { 2, 7, -5, -18 } },
				endArrary[][] = new int[2][4];
		int sum = 0;
		// trip意为计算次数，用于控制数组1的行和结果数组的行，也就是计算周期。
		for (int trip = 0; trip < endArrary.length; trip++) {
			// i用于控制数组2的列Index，j用于同时控制数组1的列和数组2的行，当这两个循环走完时
			// 结果数组的一行才算完，即完成一个计算周期
			for (int i = 0; i <endArrary[trip].length; i++) {
				for (int j = 0; j < 3; j++) {
					// 取消下列三行输出注释并运行程序可以看到具体计算过程
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
		// 选做题2
		int f[] = { 18, 25, 7, 13, 2, 89, 63 };
		int temp;
		for (int i = 0; i <= f.length - i - 1; i++) {
			temp = f[i];
			f[i] = f[f.length - 1 - i];
			f[f.length - 1 - i] = temp;
		}
		mp.outArrary(f);
		// 选做题3
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
