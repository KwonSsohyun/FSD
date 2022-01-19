package com.hi;

public class Ex11 {

	public static void main(String[] args) {
		// 문자열 String 
		// 주소의 사이즈는 다르기 때문에 참조변수
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String msg1;
		
		msg1 = "java"; // 문자열 바꾸면 새로운 객체를 만들어서 뱉는다.
		//System.out.println(msg1);
		
		msg1 = "문자열";
		//System.out.println(msg1);
		
		
		msg1 = new String("java"); // java 라는 글자를 객체를 생성해서 msg1에 담는다.
		System.out.println(msg1);
		String msg2 = new String("java");
		System.out.println(msg2);
		System.out.println(msg1==msg2); // false (19라인, 22라인 > new 선언했기에 서로 다른 객체 -> 서로 같은 문자열을 써도 말이다.)
        // 다른 객체이기 때문에, 다른 객체니까
		
		
		String msg3 = "java";
		String msg4 = "java";
		System.out.println(msg3 == msg4); // true (같은 문자열이니까 똑같은 주소값을 가르킨다)
		
		
		//String msg5 = sc.nextLine(); >> 뭘 입력할지 모르니 새로운 객체 생성 (뭘 지정할 수 없기에) (상수에 다 올리고 시작하니말이다)
		//System.out.println(msg3 == msg5); // false
		
		int a =1;
		
		System.out.println("java1" == "java" + a); // 연산을 취햇기때문에 변화를 요청하면, 새로운 객체를 생성해냄 그래서 false // 변수 연산이기 때문에
		System.out.println("java" == "ja" + "va"); // 미리 상수영역에 연산하고 올림 그래서 java >> true // ex) 비유 > int a = 3+5; >> 8이 상수로 올라감
		System.out.println(msg1);

	}

}
