package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("�ֹι�ȣ �˻��");
		System.out.print(">>> ");
		
		char sung = '��';
		int age;
		int age1;
		
		String sc = scan.nextLine();
		char[] jumin = sc.toCharArray();
		/*
		for(int i=0; i< jumin.length; i++){
			System.out.println(jumin[i]);
		}
		*/
		
		if(jumin[7] == '2' || jumin[7] == '4'){
			sung = '��';
		}
		
		age = 2000 + (jumin[0] - '0')*10 + (jumin[1] - '0'); // 2095
		if(jumin[7]=='1' || jumin[7]=='2'){
			age = age - 100; 
		}
		
		age1 = (2021-age)+1;
		
		
		System.out.println("����� " + age1 + "�� " + sung+"�� �Դϴ�.");
		
		

	}

}
