package com.itheima.myset;

import java.util.HashSet;
import java.util.Set;

public class A01_SetDemo1{
	public static void main(String[] args){
		Set<String> s = new HashSet<>();
		//2.添加元素
		//如果当前元素是第一次添加, 那么可以添加成功, 返回true
		//如果当前元素是第二次添加, 那么添加失败, 返回false
		s.add("张三");
		s.add("李四");
		s.add("王五");

		//3.打印集合
		//无序
		//System.out.println(s);

		//迭代器
		/*Iterator<String> it = s.iterator();
		while(it.hasNext()){
			String next = it.next();
			System.out.println(next);
		}*/

		//增强for
		/*for (String s1 : s) {
			System.out.println(s1);
		}*/

		//Lambda表达式
		s.forEach (str -> System.out.println(s));
	}
}