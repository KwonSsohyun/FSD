package com.hi;

public class Ex13 {

	public static void main(String[] args) {
		// 주민번호 확인(ver 0.2.0)
		// 남자, 여자 / 몇살
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
//		int sc = Integer.parseInt(scan.nextLine());
		String sc = scan.nextLine();
		
		// 950116 - 2 0 3 1  8  1  6
		// 012345 6 7 8 9 10 11 12 13
//		System.out.println(sc.substring(7,8));
		
		try{
			// 남자, 여자 구분
			if(sc.substring(7,8).equals("2") || sc.substring(7,8).equals("4")){
				System.out.println("여자입니다.");
			}else if(sc.substring(7,8).equals("1") || sc.substring(7,8).equals("3")){
				System.out.println("남자입니다.");
			}
			
			// 나이 계산
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
