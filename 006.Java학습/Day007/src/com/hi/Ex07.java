package com.hi;

public class Ex07 {

	// 전역변수
	// 전역은 값이 주어지지 않는 경우 디폴트 값을 갖는다. (지역은 꼭 초기화를 해줘야 한다.)
	public static int a=2222; // 선언과 초기화를 같이 주던가 해야한다. (값을 넣고 싶다면)
	public static int b; // 선언만 해버리면 값을 줄 수 없기 때문에 디폴트값이 자동됨
	// 하고자하는 것은 메소드 안에서 값 넣어준다.  (있는 값 -> 디폴트 값)
	public static String msg = null; // null 문자열이 아니라 null은 키워드 (가르킬 객체의 주소가 없다는것)
	// null과 빈문자열은 다른거임 
	
	
	public static void main(String[] args) {
		// 지역 > 전역에 비해 우선순위 높다.
		int a = 1111; // 초기화 안하면 에러난다.
		System.out.println(a); // 지역변수 나옴
		System.out.println(Ex07.a); // 클래스 이름 앞에 붙히면, 전역변수 나옴
		// 변수명 없으면, 지역에서 찾다가 앞에 동일 클래스 이름 자동적으로 붙혀서 전역변수에서 찾는다.
		
		System.out.println(b); // static 이든 non-static이든 초기값 노출

	}

}
