package com.room802;

public class Ex02 {

	public static void main(String[] args) {
		
		// �� ���� �̱�
		// 123
		// 456
		// 789	
		
		for(int i=1; i<10; i++){ 
			System.out.print(i);
			if(i%3==0){ // 3�� ����϶� ����
				System.out.println();
			}
		}
		
		System.out.println("-----------------------------------------");
		
		// 1 2 3 �� 4 5 6 �� 7 8 9
		// 1 2 3 �� 2 3 4 �� 3 4 5
		
		int su=1; // ���ڸ� ������� ����
		for(int i=1; i<12; i++){ // ����� ����
			if(i%4==0){ // 4�� ��� ����
				System.out.println();
				su-=2;
			}
			else{ // ���� ���
				System.out.print(su++); // su�� ����
			}
		}

	}

}
