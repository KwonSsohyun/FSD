package com.hi;

public class Ex04 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.5.0)
		// 다중배열 >>  [tot]총원  |  [0]학번 [1]이름 [2]국어 [3]영어 [4]수학
		System.out.println("학생성적관리프로그램(ver 0.5.0)");
		System.out.print("총원 > ");
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String sc = scan.nextLine(); // 문자열 입력 받기
		int su = Integer.parseInt(sc);// 총원 >> 문자열 -> 숫자형으로 변경
		
		String[][] data = new String[su][];
		int count = 0;
		String empty = null; // String디폴트값 null (값 안들어갔을때)
		
		while(true){
			System.out.println("1.입력  2.보기  0.종료 > ");
			sc = scan.nextLine();

			if(sc.equals("1") && su!=count){ // 문자열로 비교
				// 입력
				String[] stu = new String[5]; // 1차원배열 5개길이의 배열 stu변수 넣어줌 ▶ data 2차원배열의 [] 뒷괄호에 해당하는 값들을 쓰려고
				System.out.println("학번 > ");
				sc = scan.nextLine(); 
				stu[0] = sc; // stu 5개의 길이의 배열에 각각 값을 입력함 ▶ [0]
				System.out.println("이름 > ");
				sc = scan.nextLine();
				stu[1] = sc; // stu 5개의 길이의 배열에 각각 값을 입력함 ▶ [1]
				System.out.println("국어 > ");
				sc = scan.nextLine();
				stu[2] = sc; // stu 5개의 길이의 배열에 각각 값을 입력함 ▶ [2]
				System.out.println("영어 > ");
				sc = scan.nextLine();
				stu[3] = sc; // stu 5개의 길이의 배열에 각각 값을 입력함 ▶ [3]
				System.out.println("수학 > ");
				sc = scan.nextLine();
				stu[4] = sc; // stu 5개의 길이의 배열에 각각 값을 입력함 ▶ [4]
				
				data[count++] = stu; // count++ ▶ 다음번부터 숫자올라감  
				// stu ▶ 24번 ~ 36번까지 값 입력한것을 data[0][//] ▶▶ 슬래쉬친 부분에 해당값들이 들어감 
				continue;
			}else if(sc.equals("2")){
				System.out.println("-------------------------------------------");
				System.out.println("학번\t| 이름\t| 국어\t| 영어\t| 수학 ");
				System.out.println("-------------------------------------------");
				for(int i=0; i<data.length; i++){
					String[] stu = data[i]; // 얕은복사
					if(stu!=null){
						System.out.println(stu[0] +"\t"+ stu[1] +"\t"+ stu[2] +"\t"+ stu[3] +"\t"+ stu[4]);
					}
				}
				System.out.println("-------------------------------------------");
			}else if(sc.equals("0")){
				System.out.println("프로그램을 종료합니다.");
				return; // main메소드 나감 (프로그램 종료)
			}else if(su==count){
				System.out.println("입력횟수를 초과했습니다.");
			}
			
			
			
		}
		

	}

}
