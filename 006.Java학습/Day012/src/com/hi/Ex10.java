package com.hi;

// 한문서에서 하나만 public 클래스를 가질 수 있다.

// 접근제한자 
// public > protected >= default > private

class Lec10{ // 클래스는 private 빼고 다됨
	// 필드도 접근제한 가능
	public static int su1 = 1111;    // public 접근자 - 모두 접근 허용
	static int su2 = 2222;		     // default 접근자 - 동일패키지 내부에서만 접근허용
	private static int su3 = 3333;   // private 접근자 - 해당클래스 내부에서만 사용 (여기서는 Lec10안에서)
	protected static int su4 = 4444; // protected 접근자 - default 와 동일 >> 또한 "상속"을 통해서도 접근 허용
	/*
	// ********** 디자인패턴 (싱글톤 패턴) **************************************
	 * 	 객체 무분별하게 찍어내는걸 막아냄 (하나의 객체를 사용)
	// < 코드 리뷰 >
	//   1) private Lec10(){ } 
	        메인메서드에서 new로 선언해서 객체를 생성해야하는데
	        private 이니까 접근이 불가 (해당클래스 안에서만 가능하니까)
	       
	     2) 객체를 그럼 어떻게 찍을 것인가?
	        public static Lec10 newInstance(){ 
	        	Lec10 me = new Lec10();
	         	return me;
	      	}
	      	위 코드처럼 객체를 찍는 메서드를 만든다.
	      	객체를 만드는 코드를 해당 메서드 안에서 생성하고,
	      	return 한다.
	      	return 은 호출한곳으로 간다. 그럼 3번으로 간다.
	      	
	      3) 그럼 호출을 해야겠지?
	         메인메서드에서
	         Lec10 you2;
	    	 you2 = Lec10.newInstance();
	    	 이렇게 호출해준다.
	    	 
	    	 근데 문제는 객체를 찍는건 좋다 이거야
	    	 근데 무분별하게 계속 객체를 여러개 찍으니
	    	 you2 = Lec10.newInstance(); 이걸 여러개 적어도 
	    	 하나의 객체만 사용하고 싶으면 어떻게 할까?
	    	 
	      4) 아까 2번에서 만든 메서드중에서
	         Lec10 me = new Lec10(); 를 위로 따로 빼고
	         그 앞에 private static 을 붙힌다.
	         
	         static은 static 끼리 접근이 가능하니까 같은 static 쓴다.
	         2번메서드에 이제 리턴 me만 있으니
	         이 me는  
	         private static Lec10 me = new Lec10(); -> 주소값 주고 메인메서드로 가서 주소값전달해줌
	         
	         private 은 해당클래스안에서만 쓸수있으니 
	         객체가 여러개 생길일이 없다.
	         끝날때까지 객체가 하나로 계속 돌려 쓴다.
	*/
	private static Lec10 me = new Lec10(); // 객체생성해서 변경시킬 방법이 없다. 
	// 끝날때까지 객체가 하나로 계속 돌려 쓴다. (객체가 무분별하게 생성하는걸 막는다.)
//	private static String msg = "hello";
	
	
	private Lec10(){// 디폴트 생성자 못 만듬 >> 객체 생성이 안됨
		// 참조변수를 만들어낼 필요가 없는 static이다.
	}
	
	public static Lec10 newInstance(){ // 객체 생성해줌
//		Lec10 me = new Lec10(); // 생성자를 만들어줌 
		return me;
	}
	
	
	// 메서드도 가능
	public static void func1(){ // 메서드도 해당이 된다. public 모두 가능
		System.out.println(su3);
	}
	
	static void func02(){ // public - 동일패키지 접근가능 

	}
	
	private static void func03(){ // private - 해당 클래스 내부 접근가능
		
	}
}


public class Ex10 extends com.bit.Ex10{ // main을 가진 메서드에서 public사용 // 상속

	public static void main(String[] args) {
		// 접근제한자
		Ex10 me = new Ex10();
		System.out.println(me.su1);
//		System.out.println(me.su2);
//		System.out.println(me.su3);
		System.out.println(me.su4);
		System.out.println("---------------------------------------------");
		System.out.println(Lec10.su1);
		System.out.println(Lec10.su2);
//		System.out.println(Lec10.su3);
		System.out.println(Lec10.su4);
		System.out.println("---------------------------------------------");
		System.out.println(com.bit.Ex10.su1);
// 		System.out.println(com.bit.Ex10.su2);
//		System.out.println(com.bit.Ex10.su4);
		System.out.println("---------------------------------------------");
		com.bit.Ex10 you = new com.bit.Ex10(); // new com.bit.Ex10(); 생성자 호출
		
		Lec10 you2;
//		you2 = new Lec10();
//		you2 = new Lec10(); // private 동일패키지 내에서만 접근해야하니까 안됨
		// 객체 생성없이 사용하는 클래스들
		you2 = Lec10.newInstance(); // 객체를 여러개찍는걸 막을 수 있다.
		System.out.println(you2); 
//		you2 = new Lec10();
		you2 = Lec10.newInstance(); // .newInstance() 가 위에서 static으로 사용했기 때문에 >> Lec10으로 바로 접근 가능
		System.out.println(you2);
	}

}
