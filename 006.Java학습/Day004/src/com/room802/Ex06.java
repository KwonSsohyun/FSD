package com.room802;

public class Ex06 {

	public static void main(String[] args) {
		
		// Q3. 1,3,5,7,9 �� ����Ͻÿ�.
		for(int su = 2; su <= 10; su+=2){
			if(su!=2){ // �ʱⰪ(���۰�)�� �ƴϸ� (ó���� ���ö� �ĸ� �������� �Ϸ���)
				System.out.println(",");
			}
			System.out.print(su-1);
		}
		System.out.println("\n---------------------------------------------");
		
		for(int su=1; su*2<=10; su++){
			if(su!=1){System.out.println(",");}
			System.out.print(su*2-1);
		}
		
		System.out.println("\n---------------------------------------------");
		
		boolean boo = false; // �ʱⰪ ���ۺ��� �ĸ� �������� �ϰ� ������, false�� �����ؼ� ó������ �ĸ������
		for(int i =1; i<=10; i++){
			if(i%2!=0){
				if(boo){System.out.println(",");}
				System.out.print(i);
				boo = true; // ���� �������� true �ٲ㼭, �ĸ� ������ ���ش�.
			}
		}		

	}

}
