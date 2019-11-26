package cn.itcast.demo
public class IntegerDemo2 {
	public static void main(String[] args) {
		function_2();
	}
	
	public static void function_2(){
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i==j);
		System.out.println(i.equals(j));
		
		System.out.println("===================");
		
		Integer a = 500;
		Integer b = 500;
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
		System.out.println("===================");
		
		
		
		Integer aa = 127; )
		Integer bb = 127; // Integer bb = aa;
		System.out.println(aa==bb); //true
		System.out.println(aa.equals(bb));//true
	}
	
	
	
	public static void function_1(){
	    Integer in =null;	
	    
	    in = in + 1;
	    System.out.println(in);
	}
	
	
	public static void function(){
		
		
		Integer in = 1; // Integer in = new Integer(1)
		
		in = in + 1;
		
		System.out.println(in);
		
	}
}

