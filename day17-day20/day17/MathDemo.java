package cn.itcast.demo3;

public class MathDemo {
	public static void main(String[] args) {
		function_6();
	}

	public static void function_6(){
		double d = Math.round(5.4195);
		System.out.println(d);
	}
	

	public static void function_5(){
		for(int i = 0 ; i < 10 ;i++){
			double d = Math.random();
			System.out.println(d);
		}
	}
	

	public static void function_4(){
		double d = Math.sqrt(-2);
		System.out.println(d);
	}
	
	 
	public static void function_3(){
		double d = Math.pow(2, 3);
		System.out.println(d);
	}
	

	public static void function_2(){
		double d = Math.floor(1.5);
		System.out.println(d);
	}
	

	public static void function_1(){
		double d = Math.ceil(5.1);
		System.out.println(d);
	}
	
	
	 public static void function(){
		int i = Math.abs(0);
		System.out.println(i);
	 }
	 
}
