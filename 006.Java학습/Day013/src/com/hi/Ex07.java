package com.hi;

public class Ex07 {
	
	// 명시적으로 try, catch를 호출한 쪽에 명시하라고 강제적으로 하는것.
	// throws Exception
	// (에러객체 생성) Exception ex = new Exception();
	
	// 콤마를 통해서 여러개 던질 수 있음.
	// throws ArrayIndexOutOfBoundsException, NumberFormatException
	
	public static void func01(int a) throws InterruptedException, ClassNotFoundException { // 던질 수 도 있다는것 // (28번라인) 호출한측에 강제적으로 트라이캣치 하도록 함
		String[] arr = {"a", "ab", "abc", "abcd"};
		
		// 에러객체 생성
		Exception ex = new Exception();

		
		// 직접 해당하는 코드를 예외처리 할 수 도 있음.
//		try{
//		 if(a>-1){throw ex;} // throw하면 catch로 감 // 직접 던지는것
			System.out.println(arr[a]);
//		}catch(Exception e){
//			System.out.println("에러 회피저스트 in");
//		}
			
		 
	}

	public static void main(String[] args) {
		System.out.println("main start");
		
		// func01(3); // 이것만 적으면 오류난다. throws 던지는것이 잇어서.
		// 아래처럼 예외처리 해야한다. 필수 강제적
		
		// 나를 호출한 쪽에서 예외처리를 해도 해결이 되더라.
//		try{
			try {
				func01(3);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
//		}catch(Exception e){
//			System.out.println("에러 회피저스트 out");
//		}
		
		System.out.println("main end");

	}

}
