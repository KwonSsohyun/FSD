package com.room802;

public class Ex11 {

	public static void main(String[] args) {
		// ��� - �ݺ��� - 2. while��
		/*
			while(����-booleanŸ��){
				���๮;
			}
		*/
		// ��� - �ݺ��� - 3. do~while��
		//                      : �ϴ� �ѹ� �����ϰ� ������ �����ϸ� �ݺ� - �ѹ��� ������ ����
		/*
		 	do{
		 		���๮;
		 	}
		 	while(����-boolean);
		*/

		
		int su=1;
		while(su<5){
			System.out.println("�ݺ�"+su);
			su++;
		}
		
		do{
			System.out.println("�ο���"+su);
			su++;
		}while(su<5);

	}

}
