package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.6.0)
		// 1 user1 1 2 3\n
		// 2 user2 44 55 66
		// 3 user3 77 88 99
		
		// 1 user1 1 2 3\n	2 user2 44 55 66\n	3 user3 77 88 99 >> \n 잘라낸다.
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 0.6.0)");
		
		String data = "";
		String input = null;
		
	
		while(true){
			System.out.println("1.보기  2.입력  3.삭제  4.수정  0.종료 > ");
			
			input = sc.nextLine();
			
			if(input.equals("0")){
				// 종료
				return;
			}
			if(input.equals("1")){
				System.out.println("------------------------------------------");
				System.out.println("학번\t│이름\t│국어\t│영어\t│수학");
				System.out.println("------------------------------------------");
				System.out.println(data);
				System.out.println("------------------------------------------");
				
			}else if(input.equals("2")){
				// 입력
				System.out.println("학번 > ");
				data+=sc.nextLine() + "\t│"; // 누적
				System.out.println("이름 > ");
				data+=sc.nextLine()+"\t│";
				System.out.println("국어 > ");
				data+=sc.nextLine()+"\t│";
				System.out.println("영어 > ");
				data+=sc.nextLine()+"\t│";
				System.out.println("수학 > ");
				data+=sc.nextLine()+"\n"; // 개행
				
			}else if(input.equals("3")){
				// 삭제
				System.out.println("삭제할 학번을 입력해주세요.");
				input = sc.nextLine(); // 삭제할 학번 입력함. (문자열 입력받음)
				
				String[] arr = data.split("\n"); // 개행기준으로 잘라내서 문자열 배열로 만듬
				// split 자체가 배열로 잘라서 담음
				// \n 개행을 기준으로 자르니 
				// 학번 ~ 수학까지 arr1 담기고
				// 다음학생도 학번 ~ 수학까지 arr2에 담기는 식이다.
				
				data = ""; // 빈문자열
				for(int i=0; i<arr.length; i++){ // 조건 학번을 찾아내고 // 해당 탭으로 시작하냐 // 맨 마지막에는 빈문자열이 있으니까. \n
					if(!arr[i].startsWith(input+"\t")){ // false 실행(startsWith - true/false 판별) // 입력받은학번\t ▶ 해당문자로 시작을 하는지 확인
						data += arr[i]+"\n"; // 재조합 // 개행이 사라져버리니 개행 누적해줌  // 제외하면 삭제
					}
				} // 학번 적은해당 학생이 포함되면 자연스럽게 빈문자로 찍히니 값이 삭제된것처럼 안보이는것
				
			}else if(input.equals("4")){
				// 수정
				System.out.println("수정할 학번을 입력해주세요.");
				input = sc.nextLine(); // 수정할 학번 입력함. (문자열 입력받음)
				
				String[] arr = data.split("\n"); // 배열로 만듬
				
				data = "";
				for(int i=0; i<arr.length; i++){ // 맨 마지막에는 빈문자열이 있으니까. \n
					if(!arr[i].startsWith(input+"\t")){
						data += arr[i]+"\n"; // 개행이 사라져버리니 개행 누적해줌
					}else{
						data+=input+"\t│"; // 새롭게 입력 받음 // 수정
						System.out.println("이름 > ");
						data+=sc.nextLine()+"\t│";
						System.out.println("국어 > ");
						data+=sc.nextLine()+"\t│";
						System.out.println("영어 > ");
						data+=sc.nextLine()+"\t│";
						System.out.println("수학 > ");
						data+=sc.nextLine()+"\n"; // 개행
					}
				}
				
			}
			
		}

	}

}