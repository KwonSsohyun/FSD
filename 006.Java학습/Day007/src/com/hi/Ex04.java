package com.hi;

public class Ex04 {
	
	// Ŭ������ �������
	// 1. �޼���
	// 2. ����
	public static int b=2222;
	public int c=3333;
	
	public void func01(){
		//System.out.println(a);
		System.out.println(b); // Ex04.b �տ����� (���� Ŭ������)
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		/*
		int a = 1111;
		System.out.println(a);
		System.out.println(b);
		*/
		
		Ex04 me;
		me=new Ex04();
		System.out.println(me.c);
		me.func01();
	

	}

}
