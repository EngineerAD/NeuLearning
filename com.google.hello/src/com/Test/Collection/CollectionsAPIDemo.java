package com.Test.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAPIDemo {

	public static void main(String[] args) {
		int array[] = { 112, 111, 23, 456, 231 };
		List<Integer> list = new ArrayList();
		List<Integer> li = new ArrayList();
		//List li = new ArrayList();也能够运行，但不推荐使用，因为在系统自动匹配包装类提供的类型时会有性能损失
		
		// copy(List A,List B)将B中的元素复制到A
		for (int i = 1; i < 5; i++) {
			list.add(new Integer(i * 10));
			li.add(new Integer(i * 100));
		}
		Collections.copy(list, li);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list[" + i + "]=" + list.get(i));
		}
		
		// sort()集合排序
		//初始化赋值
		for (int i = 0; i < array.length - 1; i++) {
			list.add(new Integer(array[i]));
		}
		Collections.sort(list);
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println(list.get(i));
		}

	}

}
