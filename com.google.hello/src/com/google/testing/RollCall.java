package com.google.testing;

/**
 * @author ��N
 * @Encode GBK
 * @version 1.0
 * @since 1.8 ��ӭ��������bug
 * @function ʵ�ֵ���㽫
 */
public class RollCall {

	public static void main(String[] args) {
		int[] line = { 1, 2, 3, 4, 5, 6, 7 };
		int[] shadow = new int[line.length];
		int maxLength = line.length;// ����ÿ���Ӽ�����
		int interval = 2;// ���
		int times = 0;// �������������ڿ��Ƶ�һ�������Ƿ�����滻���У�Ĭ��Ϊ1������0Ϊ�ر�
		while (maxLength != 1) {
			// ����������ȥ����
			for (int i = 0; i < maxLength; i += interval) {
				if (times == 1) {
					times++;
					continue;
				}
				line[i] = 0;
			}
			// �����Ӽ�������������ʵ��������α���
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
			// ������������鷵�ظ�ԭ����
			for (i = 0; i < shadow.length; i++) {
				line[i] = shadow[i];
			}
			// ��������ע�͵Ĵ������ڵ���
			// ȡ���������ע���ܹ����ÿ�α����ļ���
			/*
			 * for (i = 0; i < shadow.length; i++) { System.out.print(shadow[i]
			 * + " "); shadow[i] = 0; }
			 */
			// System.out.println();
		}
		System.out.println("���յ�����" + line[0]);
		// System.out.println(maxLength);
	}

}
