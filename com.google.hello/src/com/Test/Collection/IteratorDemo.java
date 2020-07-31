package com.Test.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//演示迭代器的使用
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("aaa");
        lst.add("bbb");
        lst.add("ccc");
        lst.add("ddd");
        lst.add("eee");
        lst.add("fff");
        Iterator<String> iterator = lst.iterator();
        //iterator.hasNext()如果存在元素的话返回true
        while(iterator.hasNext()) {
            //iterator.next()返回迭代的下一个元素
            System.out.println(iterator.next());
            iterator.remove();
        }
    }

}
