package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.6.0)

		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("학생성적관리프로그램(ver 0.6.0)");
		
		String input; // 입력 받은 데이터 넣을거임
		String data = ""; // 성적 쌓을 데이터
		
		
		while(true){
			
			System.out.println("1.보기  2.입력  3.삭제  4.수정  0.종료 > ");
			input = sc.nextLine();
			
			if(input.equals("1")){
				System.out.println("------------------------------------------");
				System.out.println("학번\t │이름\t │국어\t │영어\t │수학\t ");
				System.out.print("------------------------------------------");
				System.out.println(data);
				System.out.println("------------------------------------------");
			}else if(input.equals("2")){
				System.out.println("학번 > ");
				data += "\n" + sc.nextLine() + "\t";
				System.out.println("이름 > ");
				data += " │"+ sc.nextLine() + "\t";
				System.out.println("국어 > ");
				data += " │"+ sc.nextLine() + "\t";
				System.out.println("영어 > ");
				data += " │"+ sc.nextLine() + "\t";
				System.out.println("수학 > ");
				data += " │"+ sc.nextLine();
			}else if(input.equals("3")){
				System.out.println("삭제할 학번을 입력해주세요. > ");
				input = sc.nextLine();
				
				int start = data.indexOf("\n"+input+"\t"); // \n의 인덱스번호 반환
				int end = data.indexOf("\n",start+1); // \n를 찾을건데, start 다음부터 찾아야하니까, start 다음 인덱스부터 "\n" 찾아서 인덱스 번호 알려줘라 
				
				String del;
				
//				if(data.contains("\n"+input+"\t")){
				if(end==-1){
					del = data.substring(start);
				}else{
					del = data.substring(start, end);
				}
				
				data = data.replace(del,"");
			}
				
			
//			}
			
	
			
			
			
			
			
			
			
		}
		
		
		
		
	}

}
