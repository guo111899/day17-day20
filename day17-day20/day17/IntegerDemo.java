package cn.itcast.demo1;

public class IntegerDemo {
	public static void main(String[] args) {
		function_3();
	}
	
	public static void function_3(){
		Integer in = new Integer("100");
		int i = in.intValue();
		System.out.println(--i);
	}
	
	
	public static void function_2(){
		int i = 3;
		String s = i+"";
		System.out.println(s+1);
		
		String s1 = Integer.toString(5,2);
		System.out.println(s1);
	}
	
	
	
	public static void function_1(){
		int i = Integer.parseInt("110", 2);
		System.out.println(i);
	}
	
	
	public static void function(){
		int i = Integer.parseInt("12");
		System.out.println(i/2);
	}
}
