package com.hi;

public class Ex03 {

	public static void main(String[] args) {
		// 다중배열 (배열안에 배열)
		
		String[][] data = new String[4][];
		String[] stu = new String[5];
		data[0] = stu;
		
		stu[0] = "0";
		stu[1] = "1";
		stu[2] = "2";
		stu[3] = "3";
		stu[4] = "4";
		
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		System.out.println(data[0][2]);
		System.out.println(data[0][3]);
		System.out.println(data[0][4]);
		
		System.out.println("----------------------------------");
		
		data[1] = stu;
		stu[0] = "00";
		stu[1] = "11";
		stu[2] = "22";
		stu[3] = "33";
		stu[4] = "44";
		System.out.println(data[1][0]);
		System.out.println(data[1][1]);
		System.out.println(data[1][2]);
		System.out.println(data[1][3]);
		System.out.println(data[1][4]);

		

		

	}

}
