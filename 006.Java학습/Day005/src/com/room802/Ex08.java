package com.room802;

public class Ex08 {

	public static void main(String[] args) {
		
		// 	   ��
		// 	 �� ��
		// �� �� ��
		// (��ĭ���)
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(j<2-i){ // ���� �ٲ𶧸��ٴϱ� i // j�� ��� ���������� ���� ���ϴϱ� i�� ���� �Ⱥ��ϴϱ�
					System.out.print(' ');
				}
				else{System.out.print('��');}
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------------");
		
		
		//   3
		//  23
		// 123
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(j<2-i){ // ���� �ٲ𶧸��ٴϱ� i // j�� ��� ���������� ���� ���ϴϱ� i�� ���� �Ⱥ��ϴϱ�
					System.out.print(' ');
				}
				else{System.out.print(j+1);}
			}
			System.out.println();
		}

	}

}
