package cn.itcast.demo3;

public class VarArgumentsDemo {
	public static void main(String[] args) {
		 getSum(5,34,3,56,7,8,0);
		System.out.println(sum);
		
		function(1,2,3);
	}
	
	 public static void function(Object...o){
		 
	 }
	
	
	public static int getSum(int...a){
		int sum = 0 ;
		for(int i : a){
			sum = sum + i;
		}
		return sum;
	}
	

	
}
