package com.room802;

public class Ex01 {

	public static void main(String[] args) {
		
		// �� �� 3�����
		// �ڡڡ�
		// �ڡڡ�
		// �ڡڡ�
		
		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				System.out.print("��");	
			}
			System.out.println();
		}
		
		
		// �� ���� �̱�
		// 123
		// 456
		// 789		
		for(int i=0; i<3; i++){
			for(int j=1+3*i; j<=3+3*i; j++){
				System.out.print(j);	
			}
			System.out.println();
		}
		
		
		System.out.println("-----------------------------------------");
		
		
		// �� ���� �̱�
		// 123
		// 234
		// 345	
		for(int i=0; i<3; i++){
			for(int j=1; j<=3; j++){
				System.out.print(j+i);	
			}
			System.out.println();
		}
		
		
		System.out.println("-----------------------------------------");
		
		// �� ���� �̱�
		// 123
		// 456
		// 789	
		
		int su =1;
		
		for(int i=0; i<3; i++){
			for(int j=1; j<=3; j++){
				System.out.print(su++);	
			}
			System.out.println();
			// su-=2; // �� �� �ڵ带 ������ 123 / 234 / 345 ����
			// �ڿ� ���� 3�ڿ� 4�� �����µ� �ٽ� 2�� ����ؾ��ϴϱ� -2�� ���ش�.
			// ����ڿ� �ٷ� ���̴�.(������ �ٽ� ���ƿ�����)
		}
	
		
		
	}

}
