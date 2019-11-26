package cn.itcast.demo5;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		function_1();
	}
	
	public static void function_1(){
		BigDecimal b1 = new BigDecimal("1.0301");
		BigDecimal b2 = new BigDecimal("100");
		//计算b1/b2的商,调用方法divied
		BigDecimal bigDiv = b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);//0.01301
		System.out.println(bigDiv);
	}
	
	
	public static void function(){
		BigDecimal b1 =  new BigDecimal("0.09");
		BigDecimal b2 =  new BigDecimal("0.01");
		//计算b1+b2的和,调用方法add
		BigDecimal bigAdd = b1.add(b2);
		System.out.println(bigAdd);
		
		BigDecimal b3 = new BigDecimal("1");
		BigDecimal b4 = new BigDecimal("0.32");
		
		BigDecimal bigSub = b3.subtract(b4);
		System.out.println(bigSub);
		
		BigDecimal b5 = new BigDecimal("1.015");
		BigDecimal b6 = new BigDecimal("100");
		//计算b5*b6的成绩,调用方法 multiply
		BigDecimal bigMul = b5.multiply(b6);
		System.out.println(bigMul);
	}
}


