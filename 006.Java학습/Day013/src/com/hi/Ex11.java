package com.hi;

public class Ex11 {

	public static void main(String[] args) {
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++){
			lotto[i] = i+1;
		}
		
		// ġȯ �ٲٴ°�.
		int temp = 0;
		for(int i=0; i<100; i++){ // < 100 ���ڰ� �������� ���� ����
			int ran = (int)(Math.random()*45);
//			int ran2 = 0;
			int ran2 = (int)(Math.random()*45);
			temp = lotto[ran2];
			lotto[ran2] = lotto[ran];
			lotto[ran] = temp;
		}
		
		// ���̱�
		for(int i=0; i<6; i++){
			System.out.println(lotto[i]);
		}

	}

}
