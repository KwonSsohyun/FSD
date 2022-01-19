package com.room802;

public class Stu01 {

	public static void main(String[] args) {
		
		int temp = 1;
		
		for(int i=0; i<=2; i++){
			temp += i; // temp+=i;
			
			for(int j=temp; j<=temp+i; j++){
				System.out.print(j);
			}
			System.out.println();
			
			
			
		}

	}

}
