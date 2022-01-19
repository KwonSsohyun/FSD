package com.hi;

// 추상메서드만 가지고 있는게 인터페이스
// interface Inter01 >> 명시를 안하면 default >> 해당 com.hi 안에서만 쓸 수 있음

// 인터페이스 
// 변수   ▶▶ public final static (해당 키워드는 생략 가능 - 이들만 올 수 있어서)
// 메서드 ▶▶ public abstract     (해당 키워드는 생략 가능 - 이들만 올 수 있어서)

interface Inter01{ // >> 인터페이스 인터페이스명(첫글자대문자) 
	
	int su1 = 1111;
	// ▶▶ public final static  이 생략된것임 (값을 못 바꿈)
	static int su2 = 2222;
	// 이건 필드가 아님, static에 올라가있는 것임
	public static int su3 = 3333;
	public final static int su4 = 4444;
	
	
	// 객체가 없으니 필드도 없고, 생성자도 없다.
	// public Inter01(){}
	
	// 오버라이딩해서 쓴다는 의의가 있다.
	public abstract void func01(); // 구현이 없으니 없는거니
	public void func02(); // abstract 추상키워드 생략 가능 
	// 오직 추상메서드만 가지므로 생략 가능
	// 다만, 추상클래스에서는 추상메서드만 가지는 것이 아닌 일반메서드도 가질 수 있기에 abstract 추상키워드 생략이 불가능

	void func03(); // 디폴트가 public 접근제한자도 생략 가능 (어차피 public이기 때문에)
	// ▶ public abstract 생략된것임
}

public class Ex04 {

	
	
	public static void main(String[] args) {
		System.out.println(Inter01.su4);
//		System.out.println(Inter01.su4++); 

	}

}
