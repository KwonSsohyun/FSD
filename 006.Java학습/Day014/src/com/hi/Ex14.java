package com.hi;
// 키워드 클래스
public class Ex14 {

	int su = 1234;
	
	public static void main(String[] args) {
		
		Ex14 me = new Ex14();
		System.out.println(me.su);
		
		// 자바 리플렉션
		// 클래스 정보필요
		String info = "com.hi.Ex14";
		// 이 문자열을 이용해서
		
		// 클래스의 정보를 가지고 있는 클래스
//		Class cls = Class.forName(info);
		
		try {
			// .forName() >> class 라는 class를 만든다.
			// 객체를 생성한다.
			// Ex14의 정보를 가지고 있다. (필드, 메서드)
			Class cls = Class.forName(info);
			
			
			// 새로운 인스턴스(객체)를 만들어준다.
//			System.out.println(cls.newInstance());
			
			
			// 새로운 인스턴스(객체)를 만들어준다.
			// 객체는 같은데, 타입이 다르다. (같은걸 가르키고 있다.)
			// 다만 객체를 타입이 Object 다.
			Object obj = cls.newInstance();
			// 근데 Object를 캐스팅 할 수 있다.
			Ex14 me2 = (Ex14)obj;
			
			
			// .getDeclaredFields -> s를 뒤에 붙히면 여러개 나온다.
			System.out.println(cls.getDeclaredField("su").getName());

		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
