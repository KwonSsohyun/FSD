package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.6.0)
		// 1 user1 1 2 3\n
		// 2 user2 44 55 66
		// 3 user3 77 88 99
		
		// 1 user1 1 2 3\n2 user2 44 55 66\n3 user3 77 88 99
		
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
				System.out.print("------------------------------------------"); // /n (개행) 맨첫번째학생
				System.out.println(data);
				System.out.println("------------------------------------------");
				
			}else if(input.equals("2")){
				// 입력
				System.out.println("학번 > ");
				data+="\n" + sc.nextLine() + "\t│"; // 누적
				System.out.println("이름 > ");
				data+=sc.nextLine()+"\t│";
				System.out.println("국어 > ");
				data+=sc.nextLine()+"\t│";
				System.out.println("영어 > ");
				data+=sc.nextLine()+"\t│";
				System.out.println("수학 > ");
				data+=sc.nextLine(); // 개행
				
			}else if(input.equals("3")){
				// 삭제
				System.out.println("삭제할 학번을 입력해주세요."); 
				
				input = sc.nextLine(); // 삭제할 학번 입력함. (문자열 입력받음)
				int startIdx = data.indexOf("\n" + input + "\t"); // 시작위치 인덱스 얻음 (맨앞에 \n의 시작인덱스 찾아줌)
				// data+="\n"+ sc.nextLine()+"\t"; 
				int endIdx = data.indexOf("\n", startIdx+1); // +1을해서 다음인덱스 찾음 // 없으면 -1
				// startIdx+1 을 하니까 
				// 예를 들면 startIdx가 0번 인덱스인데 +1을했으니 다음인덱스인 1번 인덱스부터 \n개행을 찾겠다.
				// 하니까 다음 startIndx 인 \n의 인덱스를 찾아준다. (다음학번입력하는 \n의 인덱스를 찾아준다!)
				
				String target; 
				
				if(endIdx==-1){ // 값이 없냐? (-1은 그런거 없다는것) // 근데 왜 -1하냐? 맨 마지막 학생의 뒤에는 \n이 없으니 그것을 제하기 위함
					target = data.substring(startIdx); // 맨 마지막 학생은 뒷 학생이 아무것도 없으니 시작점부터~끝까지 값읽어줘~
				}else{
					target = data.substring(startIdx,endIdx); 
					// startIdx시작 인덱스부터 ~ endIdx까지 이다.
					// 여기서 .substring()의 뒤에 인자는 인덱스 카운팅 시작을 0으로 읽지않고 1으로 읽으니
					// 오히려 잘됬다. 
					// endIdx는 \n 인덱스를 가르키고 있으니 진짜 값인 딱 앞의 인덱스를 읽어주니
					// ─────────────────────────────────────────────────────────
					//  \n 학번 \t                 \n 학번 \t           
					//   ↑                          ↑                               
					// startIdx                   endIdx
					// ─────────────────────────────────────────────────────────
					//  \n 학번 \t                 \n 학번 \t           
					//   ↑                        ↑                     << .substring(startIdx,endIdx) 써서 이와같이 찍어주는 범위가 바꿔짐
					// startIdx                endIdx
					//  이와같이 \n 딱 앞인 데이터 까지 읽어준다.
				}
				
				data = data.replace(target, "");
				// 값을 빈칸으로 바꿔치기하니 삭제와 같은 효과
				
			}else if(input.equals("4")){
				// 수정
				System.out.println("수정할 학번을 입력해주세요."); 
				input = sc.nextLine(); // 수정할 학번 입력함. (문자열 입력받음)
				int startIdx = data.indexOf("\n" + input + "\t"); // 시작위치 인덱스 얻음
				// data+="\n"+ sc.nextLine()+"\t"; 
				int endIdx = data.indexOf("\n", startIdx+1); // +1을해서 다음인덱스 찾음 // 없으면 -1
				
				String target; 
				if(endIdx==-1){
					target = data.substring(startIdx); // 맨 마지막 학생 수정시에는 구분할 다음 학생이 없고, 학번 앞에 \n이 없으니까
				}else{
					target = data.substring(startIdx,endIdx);
				}
				
				input = "\n" + input + "\t│";
				System.out.println("이름 > ");
				input+=sc.nextLine()+"\t│";
				System.out.println("국어 > ");
				input+=sc.nextLine()+"\t│";
				System.out.println("영어 > ");
				input+=sc.nextLine()+"\t│";
				System.out.println("수학 > ");
				input+=sc.nextLine();
				
				data = data.replace(target, input);
				// 값을 해당입력값으로 다시 리플레이스 하니 준다.
			}
			
		}

	}

}
