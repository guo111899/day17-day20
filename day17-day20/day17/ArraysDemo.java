package cn.itcast.demo4;

import java.util.Arrays;


public class ArraysDemo {
	public static void main(String[] args) {
		function_2();
		int[] arr = {56,65,11,98,57,43,16,18,100,200};
		int[] newArray = test(arr);
		System.out.println(Arrays.toString(newArray));
	}
	
	public static int[] test(int[] arr){
		
		Arrays.sort(arr);
		
		int[] result = new int[3];
		
		for(int i = 0 ;  i < 3 ;i++){
			result[i] = arr[i];
		}
		return result;
	}
	
	
	public static void function_2(){
		int[] arr = {5,1,4,6,8,9,0};
		String s = Arrays.toString(arr);
		System.out.println(s);
	}
	
	
	public static void function_1(){
		int[] arr = {1,4,7,9,11,15,18};
	    int index =  Arrays.binarySearch(arr, 10);
	    System.out.println(index);
	}
	
	
	public static void function(){
		int[] arr = {5,1,4,6,8,9,0};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
