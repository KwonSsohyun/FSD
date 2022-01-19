package com.hi;
//▶ Day011 > Ex07
public class Ex06 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.6.0)
		// 1 user1 1 2 3\n
		// 2 user2 44 55 66
		// 3 user3 77 88 99
		
		// 1 user1 1 2 3\n	2 user2 44 55 66\n	3 user3 77 88 99 >> \n 잘라낸다.
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 0.6.0)");
		
		// 여기다가 선언하면 값을 누적해서 쓸 수 있다.
		// 제어문 안에서 쓰면 초기화 되니까.
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
				input = sc.nextLine(); // 삭제할 학번 입력함
				
				String[] st = data.split("\n"); // \n기준으로 배열로 자름 // 입력한 정보는 여기 담겨있음.
				
				data = "";
				for(int i=0; i<st.length; i++){
					if(!st[i].startsWith(input+"\t")){
						data = data + st[i] + "\n";
//						data+=st[i] + "\n";
					}
				}
				
				
			}else if(input.equals("4")){
				// 수정
				System.out.println("수정할 학번을 입력해주세요.");
				input = sc.nextLine(); // 수정할 학번 입력함
				
				String[] st = data.split("\n"); // \n기준으로 배열로 자름 // 입력한 정보는 여기 담겨있음.
				
				data=""; // 기존의 데이터는 지우겠다.
				for(int i=0; i<st.length; i++){
					if(!st[i].startsWith(input+"\t")){
						data = data + st[i] + "\n";
					}else{
						data = data + input +"\t│";
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