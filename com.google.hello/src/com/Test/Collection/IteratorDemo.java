package com.Test.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//��ʾ��������ʹ��
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
        //iterator.hasNext()�������Ԫ�صĻ�����true
        while(iterator.hasNext()) {
            //iterator.next()���ص�������һ��Ԫ��
            System.out.println(iterator.next());
            iterator.remove();
        }
    }

}
