package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		// 주민번호 체크기 (ver 0.3.0)
		// 9 5 0 1 1 6 - 2 0 3   1  8   1   6
		// 0 1 2 3 4 5 6 7 8 9  10  11  12  13
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String sc;
		char[] arr;
		

		while(true){
			System.out.println("주민번호 입력해주세요.");
			sc = scan.nextLine();
			arr = sc.toCharArray(); 
		
			for(int i=0; i<arr.length; i++){
				if(!(Character.isDigit(arr[i]))){ // 숫자가 아니면
					if(arr[6] == '-'){
						continue;
					}
					System.out.println("숫자를 넣어서 재입력 부탁드립니다.");
					break;
				}
				if(!(arr[6] == '-')){
					System.out.println("하이픈을 넣어서 재입력 부탁드립니다.");
					break;
				}
			}
			

			
			
			
			
			
		}
		
	
		


	}

}
