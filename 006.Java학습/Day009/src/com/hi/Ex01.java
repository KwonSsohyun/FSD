package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.4.1)
		// �ѿ� : 3
		// 1.�Է�  2.����  0.����  > 
		
		// 1.�Է�  2.����  0.����  >  a
		// �޴��� ���ð� �ٽ� �������ּ���. 
		// �� (���ڿ��� �Է������� �����ϱ�)
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String sc = scan.nextLine();
		
		char tmp;
		boolean boo = true;
		
		for(int i=0; i<sc.length(); i++){
			tmp = sc.charAt(i);
			
			if(tmp >= '0' && tmp <= '2'){
				boo = false;
			}
		}
		System.out.println();
		
		

	}

}
