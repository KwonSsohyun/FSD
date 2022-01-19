package com.hi;

public class Ex05 {

	public static void main(String[] args) {
		// 주민번호 검사기
		// 주민번호를 입력하세요.
		// >>> 020501-4123456
		// 당신은 올해 20세 여성입니다.
		////////////////////////////////
		// 주민번호를 입력하세요.
		// >>> 990501-4123456
		// 당신은 올해 23세 남성입니다.
		////////////////////////////////
		// 주민번호를 입력하세요.
		// >>> 9905011123456
		// 입력을 다시 확인하세요. (000000-0000000)
		////////////////////////////////
		// 주민번호를 입력하세요.
		// >>> 990501-112345
		// 입력이 부족합니다. (000000-0000000)
		////////////////////////////////	
		
		System.out.println("주민번호 검사기");
		System.out.println("주민번호를 입력하세요.");
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String scan = sc.nextLine();
		char[] jumin = scan.toCharArray();
		
		if(jumin[6] == '1'|| jumin[6] == '3'){
			System.out.println("남자입니다.");
		}else if(jumin[6] == '2' || jumin[6] == '4'){
			System.out.println("여자입니다.");
		}
		
//		int su = Integer.parseInt(jumin[0]);
//		int su1 = Integer.parseInt(jumin[1]);
		
		
		
		/*
		 * int[] arr = new int[n.length()];
		 * 
		for(int i=0; i<n.length(); i++){
			arr[i] = n.charAt(i) - '0';
			System.out.println(arr[i]);
		}
		
		if(arr[6] == 1 || arr[6] == 3){
			System.out.println("남자입니다.");
		}else if(arr[6] == 2 || arr[6] == 4){
			System.out.println("여자입니다.");
		}
		
		System.out.println(2021 - a);
		*/
		

 		
 		
 		
		
		
		
		
		
		
	}

}
