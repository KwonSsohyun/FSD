package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in); // 프린트 스캐너 쓸거야 변수로 담아서
		
		boolean boo = true;
		String temp;
		int input = 1;
		int cnt = 0;
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		
		
		while(boo){
			System.out.println("1.입력  2.출력  0.종료  >");
			temp = sc.nextLine(); // 입력받는 코드(입력받는 문장을 문자열로 받겠다.) .~에 // 스트링에 담으려고 (숫자로 변환하려고)
			input = Integer.parseInt(temp); // 문자열변수 temp를 숫자형으로 바꾼다. int타입의 input변수에 담는다.
			
			// 입력
			if(input==1){
				cnt++; // 1 , 2 , 3
				if(cnt<4){
					System.out.println("국어 > ");
					temp = sc.nextLine(); // 입력을 받고
					kor[cnt-1] = Integer.parseInt(temp); // 숫자형으로 바꾼다.
					System.out.println("영어 > ");
					temp = sc.nextLine(); // 입력을 받고
					eng[cnt-1] = Integer.parseInt(temp); // 숫자형으로 바꾼다.
					System.out.println("수학 > "); 
					temp = sc.nextLine(); // 입력을 받고
					math[cnt-1] = Integer.parseInt(temp); // 숫자형으로 바꾼다.
				}
				else{
					System.out.println("입력이 끝났습니다.");
					break;
				}
			}
			// 출력
			else if(input==2){
				System.out.println("-----------------------------------------");
				System.out.println("국어   | 영어    | 수학   ");
				System.out.println("-----------------------------------------");
				for(int i=0; i<3; i++){
					System.out.println(kor[i] + "   |" + eng[i] + "   |" + math[i]);
				}
				System.out.println("-----------------------------------------");
			}
			// 종료
			else if(input==0){
				boo = false;
			}
		}

	}

}
