package com.Test.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAPIDemo {

	public static void main(String[] args) {
		int array[] = { 112, 111, 23, 456, 231 };
		List<Integer> list = new ArrayList();
		List<Integer> li = new ArrayList();
		//List li = new ArrayList();Ҳ�ܹ����У������Ƽ�ʹ�ã���Ϊ��ϵͳ�Զ�ƥ���װ���ṩ������ʱ����������ʧ
		
		// copy(List A,List B)��B�е�Ԫ�ظ��Ƶ�A
		for (int i = 1; i < 5; i++) {
			list.add(new Integer(i * 10));
			li.add(new Integer(i * 100));
		}
		Collections.copy(list, li);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list[" + i + "]=" + list.get(i));
		}
		
		// sort()��������
		//��ʼ����ֵ
		for (int i = 0; i < array.length - 1; i++) {
			list.add(new Integer(array[i]));
		}
		Collections.sort(list);
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println(list.get(i));
		}

	}

}
