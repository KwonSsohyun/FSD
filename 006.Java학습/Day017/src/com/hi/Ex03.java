package com.hi;

class Lec03{
	// 안주면 추론 타입
	public static <T> T func(T obj){ // 객체생성을 매개변수로 전달받을것임
		
		// Object obj = new Object();
		// System.out.println(obj.toString());
		System.out.println(obj.getClass()); // 클래스 정보보기
		return obj;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// 객체생성이 아닐때 제네릭 써보기!

		// 위에가 Object 타입이니까 모든 타입 다 들어감
		// int obj = 123;
		
		// 근데 막으려면 제네릭 쓴다.
		String obj = "java"; // -> 락됨  <Integer>로 제한했기 때문.
		//int obj = 123;
		//Lec03.<Integer>func(obj);
		String msg = Lec03.func(obj);
		// 명세안해주면, 아래서 추론해서 타입이 결정된다. ▶ Lec03. "<Integer>" func(obj);
		// 그래서 확인해보면 오브젝트가 아니라 ▶ class java.lang.String
		// String 타입이 나오는걸 볼 수 있다.
	}

}
