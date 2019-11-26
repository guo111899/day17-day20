package cn.itcast.demo1;

public class IntegerDemo1 {
	public static void main(String[] args) {
		function_1();
	}
	
	public static void function_1(){
		System.out.println(Integer.toBinaryString(99));
		System.out.println(Integer.toOctalString(99));
		System.out.println(Integer.toHexString(999));
	}
	
	
	public static void function(){
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
