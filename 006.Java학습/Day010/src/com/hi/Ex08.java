package com.hi;

public class Ex08 {

	public static void main(String[] args) {

		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input = null;
		System.out.println("주민번호 > ");
		input = "구구일이삼일-일일이삼사오육"; //"951231-1123456"; // sc.nextLine();
		
		char[] arr = input.toCharArray(); // 스트링 입력한것들 다 단일타입으로 분해
		
//		for(문자배열의 길이만큼 반복){
//			if(문자하나가 '일')'1'
//			else if(문자하나가 '이')'2'
//			~~~
//			else if(문자하나가 '일')'0'
//		}
		// 주민번호 확인 (배열로 분해)
		char[] temp1 = {'영','일','이', '삼','사', '오', '육', '칠', '팔', '구'};
		char[] temp2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		
		for(int i=0; i<arr.length; i++){
//			char ch = arr[i];
			for(int j=0; j<temp1.length; j++){ // 비교
				if(arr[i]==temp1[j]){ // 찾는코드
					arr[i] = temp2[j]; // 바꿔치기
				}
			}
		}
		
//		input = "19"+input;
//		char[] arr = input.toCharArray();   // String -> char[]		{'9''5''1''2''3''1'.....
		
		boolean check1 = true;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == '-'){ // - 있으면 거짓이어서 나오고, 20번라인도 거짓이니까 안나옴 그리고 계속 실행
					check1 = false; // - 없으면 참이 되면서 (길이 갯수만큼)도니까, 나오고, 20번라인 true니까 -입력하세요, 메세지 나옴 
			}
		}
		if(check1){
			System.out.println("-를 반드시 입력하세요.");
		}
		if(arr[6] != '-'){
			System.out.println("입력오류");
			return; // 메인메서드 종료
		}
		
		char[] arr2 = new char[4];			//						{(char)0 , (char)0 , (char)0 , (char)0}
		if(arr[7] <= (int)'2'){
			arr2[0] = '1';
			arr2[1] = '9';
		}else{
			arr2[0] = '2';
			arr2[1] = '0';
		}
		System.arraycopy(arr, 0, arr2, 2, 2);  //                    {(char)0 , (char)0 , 9 , 5}
		String year = new String(arr2);     // char[] -> String
		int su = Integer.parseInt(year);   
		
		System.out.print("당신은 ");
		System.out.print(2021 - su + 1);
		System.out.print("세 ");
		
		if(arr[7]%2==0){
			System.out.print("여");
		}else{
			System.out.print("남");
		} 
		//System.out.println((int)'1'); // 문자열 1이 49니까 똑같이 짝수 활용 남자 -> 1,3

		System.out.println("성입니다.");
		
		
	}

}
