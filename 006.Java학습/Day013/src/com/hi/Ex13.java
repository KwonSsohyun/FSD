package com.hi;

public class Ex13 {

	public static void main(String[] args) {
		// �ֹι�ȣ Ȯ��(ver 0.2.0)
		// ����, ���� / ���
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
//		int sc = Integer.parseInt(scan.nextLine());
		String sc = scan.nextLine();
		
		// 950116 - 2 0 3 1  8  1  6
		// 012345 6 7 8 9 10 11 12 13
//		System.out.println(sc.substring(7,8));
		
		try{
			// ����, ���� ����
			if(sc.substring(7,8).equals("2") || sc.substring(7,8).equals("4")){
				System.out.println("�����Դϴ�.");
			}else if(sc.substring(7,8).equals("1") || sc.substring(7,8).equals("3")){
				System.out.println("�����Դϴ�.");
			}
			
			// ���� ���
			String suu = sc.substring(0,2);
			int su = Integer.parseInt(suu);
			if(sc.substring(7,8).equals("2") || sc.substring(7,8).equals("1")){
				int nai = 2021 - (su + 1900) + 1; 
				System.out.println(nai);
			}else{
				int nai = 2021 - (su + 2000) + 1;
				System.out.println(nai);
			}
		}catch(Exception e){
			
		}
		
//		95 + 1900 = 1995
//		2021 - 1995 + 1
		
//		02 + 2000 = 2002
//		2021 - 2002 + 1 

		
		
		
		

	}

}
