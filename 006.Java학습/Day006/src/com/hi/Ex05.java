package com.hi;

public class Ex05 {
	
	// 모든 메서드 리턴 가지고 잇음
	// 메인메서드가 아닌경우에 return 종류에 따라서 void 자리는 return 종류 타입이 들어간다.
	
	public static int func01(){
		System.out.println("func01()");
		func02();
		System.out.println("func01 end");
		return 0;
	}

	public static void main(String[] args) {
		
		// Ex04.func01(); // 외부에서 불러서 쓸 수 있다. (메소드)
		
		/// < 반복문과 메소드의 차이 >
		///   반복문은 종속이고.
		///   메소드는 외부에서도 호출해서 쓸 수 있다. (자바 코어한 부분)
		
		System.out.println("main start");
		// System.exit(0); // 상태코드를 던짐 , 좋지 않은 방식 (JVM을 막 닫아버리니까) 후행 작업 안하고 종료 (정상적이지 않은 종료방식)
		func01();
		
		if(1+2>0){
			return; // 여기서 프로그램 종료 ★★★(메인리턴)이 가장 좋은 종료 방식
		}
		
		System.out.println("main end"); // 죽은 코드
		return; // void 이면 자동으로 리턴됨 (컴파일과정에서 자동으로 리턴으로 명시하고 컴파일한다.)
		// 컴파일 자동 - 주석제외시키고 컴파일 진행 
		// return; (메인 return -> 프로그램 종료)

	}
	
	public static void func02(){
		System.out.println("func02()");
		return;
	}

}
