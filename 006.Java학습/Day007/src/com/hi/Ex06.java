package com.hi;

public class Ex06 {
	
	public static int c;
	public static int d;
	
	public static void func01(int a, int b){
		System.out.println(a+b);
	}
	
	
	public static void func02(){ // void -> int[]
		int a = 10;
		int b =5;
		
		c = a;
		d = b;
		// int[] arr = new int[]{a,b};
		// return arr;
		// System.out.println(c+d);
	}
	
	
	public static void main(String[] args) {
		
		int a,b;
		a = 2;
		b = 3;
		func01(a,b);
		// c = a;
		// d = b;
		
		// int[] arr = func02();
		// System.out.println(arr[0]);
		//System.out.println(arr[1]);
		
		func02();
		System.out.println(c);
		System.out.println(d);
	}
}
