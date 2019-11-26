package cn.itcast.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollectionsDemo {
	public static void main(String[] args) {
		function_2();
	}
	
	public static void function_2(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(11);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);	
		System.out.println(list);
		
		
		Collections.shuffle(list);
		System.out.println(list);
	}
	
	
	public static void function_1(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);
		//调用工具类静态方法binarySearch
		int index = Collections.binarySearch(list, 16);
		System.out.println(index);
	}
	
	
	public static void function(){
		//创建List集合
		List<String> list = new ArrayList<String>();
		list.add("ewrew");
		list.add("qwesd");
		list.add("Qwesd");
		list.add("bv");
		list.add("wer");
		System.out.println(list);
		//调用集合工具类的方法sort
		Collections.sort(list);
		System.out.println(list);
	}
}
