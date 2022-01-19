package com.hi;

// Exception 클래스
class MyException extends Exception{ // Exception 클래스 상속받음
	public MyException(){
		// 부모 생성자 호출
		super("1로 나눌 수 없음."); // 32번 메시지 전달
	}
}

public class Ex08 {

	static void func(int a, int b) throws MyException{ // 던지고
		
		// 에러던짐
		if(b==1){
			MyException ex = new MyException();
			throw ex;
		}
		int c= a/b;
		System.out.println(a+"/"+b+"="+c);
	}
	
	public static void main(String[] args) {
		// 1로 나누면 에러인 시나리오
		// 에러객체 만들어서 던진다.
		
		try {
			func(6,1);
		}catch(MyException e){ // 받고
			e.printStackTrace();
			System.out.println(e.getMessage()); // 메세지를 준적없으니 null
		}
		
	}

}
