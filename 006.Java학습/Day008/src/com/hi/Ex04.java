package com.hi;


class Ex33{
	// 필드
	int a = 1111;
	
	// 디폴드 생성자 (자동으로 만들어짐 >> 인자가 없을때)
	public Ex33(){    }
}

class Ex333{
	int b = 2222;
	
	// 생성자
	public Ex333(){
		System.out.println("생성자 호출");
	}
}

class Ex3333{
	int c = 3333;
	
	// 생성자
	public Ex3333(int su){ // 인자를 가진 생성자
		c = su;
		System.out.println(c + "r값을 매개변수로 받는 생성자");
	}
}



public class Ex04 {

	public static void main(String[] args) {
		
		java.io.InputStream is = System.in;
		
		java.util.Scanner sc;
		sc = new java.util.Scanner(is);
	 // sc = new java.util.Scanner(System.in);

		// 클래스의 구성요소
		// 1. 메서드
		// 2. 전역변수
		// 3. 생성자
		
		// < 생성자의 특징 >
		//   없으면 default 생성자를 자동으로 만듬 (인자가 없을때/매개변수가 없을때)
		//   public 클래스명([매개변수]){수행할 코드;}
	    //   리턴밸류가 없다. void 이런게 없음  (리턴의 값) ex) return a; -> 이런게 없다. return은 있음(자동으로 있음)
		//   객체 생성시점에 호출이 된다. 단 한번만 일어남.
		// 객체를 생성하는게 생성자를 호출하는 것이다.
		// 맴버필드 초기화 
		 
		Ex33 ex33; // 변수의 선언
		ex33 = null; // 초기화
		ex33 = new Ex33(); // 생성자의 호출
				
		Ex333 ex333 = new Ex333();
	 // Ex3333 ex3333 = new Ex3333();
		Ex3333 ex3333 = new Ex3333(1234);
	}

}
