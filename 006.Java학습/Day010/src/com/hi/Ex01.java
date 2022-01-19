package com.hi;

// this
// 참조변수 자기자신의 열할
// 자기자신을 지칭할 경우 생략가능(컴파일과정에서 자동생성)
// 오직 non-static에서만 사용가능

public class Ex01 {
	
	// 필드
	public static int su1 = 1111; // static 에서는 this사용 불가 >> 47번라인 >> Ex01.su1 접근
	public int su2 = 2222; // non-static 에서는 this 사용 >> 44번라인 >> this.su2 접근
	
	public Ex01(){
		
	}
	
	public static void func01(){ 
		com.hi.Ex01 me = new com.hi.Ex01(); // 객체 생성
		me.func03(); // 참조변수를 통해 접근
		// static에서는 this는 사용 불가
	}
	
	
	public void func02(com.hi.Ex01 me){ // 객체를 찍어내지 않고, 매개변수로 전달 받는다.
		//***************** 동일한 객체에서 수행 ***************** 
//		com.hi.Ex01 me = new com.hi.Ex01();
		me.func03();
		this.func03(); // 같은 non-static끼리는 참조변수없이도 호출 가능 (앞에 this가 생략되어있기 때문)
		// this라는 키워드는 오직 non-static 에서만 사용할 것! (참조변수 역할을 하니까)
		System.out.println(me == this); // true
		
		//***************** 새로운 객체에서 수행 *****************
		Ex01 you = new Ex01();
		you.func03();
	}
	
	
	public void func03(){
		// 지역변수와 전역변수가 동시 존재시(이름이 같을 경우) >> 우선순위 지역!!!
		int su1 = 4444;
		int su2 = 3333;
		System.out.println(su2);     // 3333 (지역변수)
		System.out.println(this.su2); // 2222 (전역변수)

		System.out.println(su1); // 4444 (지역변수)
		System.out.println(Ex01.su1); // 1111 (전역변수)
	}

	public static void main(String[] args) {
		com.hi.Ex01.func01(); // func01(); 만써도 되는데 숨겨진것
		com.hi.Ex01 me = new com.hi.Ex01();
		me.func02(me);
	}

}
