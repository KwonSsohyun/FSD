package com.hi;

public class Ex02 {
	
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("학생성적관리프로그램 (ver 0.3.0)");
		
		System.out.println("총원 > ");
		String input = sc.nextLine(); // 총원 입력 받음 (문자열이라 비교가 안됨)
		int tot = changeSu(input); // 내가 원하는 만큼 만들겠다. (사용자 결정) // input(사용자가 입력한 값 전달) >> 아래 메서드로
		// 이건 여기서 쓰고 안쓰이니 놀고 있으니 이 공간을 아래서 재 사용함. (다시 재선언안하고 말이다.) >> 이 값을 다시 안쓸거기때문
		// 리턴 su는 여기에 담기게 됨. ▶ changeSu(input) >> 이 자리에 담겨서 tot변수에 담김
		
		// 배열의 특징 >> 동일한 자료형, 정적할당(변동이 없다.) -> 동적할당이 등장 (컬렉션 프레임워크) > 챕터 15장
		// 과목별로 선택할 수 있게 채택 
		// -> 학생수에 따라서 막 늘리기 위해서(학생은 동적) / 움직이지 않는 고정적인 과목으로 지정함.(과목은 정적)
		int[] kor = new int[tot]; // tot 변수를 배열[갯수] 에 담는다.
		int[] eng = new int[tot];
		int[] math = new int[tot];
		
		boolean boo = true;
		int cnt = 0; // 입력횟수
		
		while(boo){ // 무한루프 (횟수가 정해지면 for / 모르면 while) 반복문 안에서는 선언하지 말아라 >> 돌때마다 새롭게 공간 할당.
			System.out.println("1.입력  2.보기  0.종료  >"); // 메뉴출력
			input = sc.nextLine(); // 문자열 입력받고 // 공간 재사용 String input = sc.nextLine(); ->> 위에서 선언한 이거 씀
			int su = changeSu(input); // 문자열 > 숫자형으로 변환 // 아래 메서드 호출해서 씀
			
			if(su==0){
				System.out.println("프로그램이 종료됩니다.");
				boo = false; // 반복문 탈출
			}else if(su==1 && cnt!=tot){ // 같기 전까지만 입력할 수 있게 함. (cnt==tot이 같으면 else문으로 빠짐)
				// 입력
				kor[cnt] = inputSu("국어 > "); // 배열에 담긴다. su가 리턴된게 >> "inputSu("국어 > ")" 이자리에 담겨서, 각 과목에 인덱스 값에 담긴다.
				eng[cnt] = inputSu("영어 > ");
				math[cnt] = inputSu("수학 > ");
				cnt++;
				// System.out.print("수학 > ");
				// input = sc.nextLine();
				// math[cnt++] = changeSu(input); // cnt++ 다음번 시점부터 > cnt++된 카운팅이 됨 > 1로 숫자 증가 (계속 증가)
				// cnt++;
			}else if(su==1){ // (su==1 && cnt==tot) // &&은 모두 다 만족해야하니까 35번라인에서 모두만족하지 않으면 다음 else if인 45번으로 옴 
				// >> 순서중요!!! 만약 45번라인이 35번과 바뀌면 절대 안되겠죠? 순서대로 내려오니까 
				// 혹은 이코드가 else if가 아닌 if였다면 35번과 45번이 동시에 출력되겠죠? if로 선언되면 새로운거니까 하위가 아니니까
				System.out.println("더 이상 입력하실 학생이 없습니다.");
			}else if(su==2){
				// 출력
				System.out.println("--------------------------------------------");
				System.out.println("국어\t영어\t수학");
				System.out.println("--------------------------------------------");
				for(int i=0; i<tot; i++){
					System.out.println(kor[i] + "\t|" + eng[i] + "\t|" + math[i]);
				}
				System.out.println("--------------------------------------------");
			}else{
				System.out.println("입력이 잘못되었습니다.");
			}
		}

	}
	
	
	// ********  모듈화 (기능) >> 코드재사용 >> 메소드화 >> 외부에서 가져다 쓴다. (포문 이런건 나만 쓸수있으니까)
	// 목적에 맞춰서 써라 (기능부여)
	// 1. 코드재사용
	// 2. 수정 -> 공통적으로 한번에 적용됨.
	
	// 학점을 입력받고 숫자 전달해주는 기능 >> 메서드
	public static int inputSu(String title){ // (String title) 출력메시지를 타이틀로 주고 인자로 전달
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println(title); // 각각의 과목이름 출력해줌 
		String msg = sc.nextLine(); // 입력 받음
		int su = changeSu(msg); // 문자열을 숫자로 바꿔주는 메서드 사용 (아래 있음)
		boolean boo = true;
		// 점수의 범위는 0~100 사이의 값만 가능
		while(boo){ // 무한루프
			if(su<0 || su>100){
				System.out.print("점수는 0~100 사이의 값만 가능\n 재입력 > ");
				msg = sc.nextLine(); // 다시 입력받게 함.
				su = changeSu(msg); // 문자열 > 숫자변환 (만약 100이상 적으면 계속 와일문 무한루프 타는것임) // 적고 다시 77라인 가는것임
			}
			if(su>=0 && su<=100){
				boo = false;
			}
		}
		return su;
	}
	
	// 문자열을 숫자로 바꿔주는 기능 >> 메서드
	public static int changeSu(String msg){ // static 이니까 위에서 같은 static이라서 바로 호출 가능 // 위에서 전달하니까 문자열이라서 (String msg) 매개변수
		int su = Integer.parseInt(msg); // 문자열은 참조변수라서 객체에 대한 주소라서 >> 숫자로 바꿈 (숫자형)
		return su; // 해당 숫자 리턴
	}

}
