package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		// �ζ�
		// 1. ���� (1~45)
		// 2. 6�� - �ߺ����� -> ���� ������������� �ߺ��˻� 
		// 3. �������� ����
		
//		int su = (int)(Math.random()*45)+1; // 0~44 ->> 1~45
		
		// 6�� �ߺ��� �˻� - ����� ���� ����
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++){ // i�� 6���� ��°Ű�
			int su = (int)(Math.random()*45)+1; 
			lotto[i] = su;
			for(int j=0; j<i; j++){ // j�� i 6���� ���� �� 
				if(lotto[i] == lotto[j]){
					i--; // �ٽ� ����
				}
			}
		}
		
		
		System.out.println("-------------------------------------------------------------");
		
		// �������� ���� - ����� ���� ����
//		int[] lotto = {6,1,3,4,2,5};
		// �� �ٲ�ġ���� �� ����Ұ� �ʿ���
		int temp = 0;
		
		for(int i=0; i<lotto.length; i++){
			for(int j = i+1; j<lotto.length; j++){
				if(lotto[i]>lotto[j]){
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++){
			System.out.println(lotto[i]);
		}
		
	}

}
