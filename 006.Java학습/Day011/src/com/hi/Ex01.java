package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		// < Java API (jdk 1.8 api) >
		// java.lang 은 그대로 쓸 수 있다. 
		
		// 문자열 (문자들의 집합)
		String st1 = null; // 객체가 없다. (가르키는게 없다.) ▶ null
//		str1.equals(""); // 객체가 없는데 메서드를 어떻게 호출해 >> 오류
		
		st1 = "java"; // 객체는 있는데 엘리먼트가 없다.
//		st1.equals("");
		st1 = new String("java"); // 객체가 있으니 null은 아님

		String st2 = "java";
		
		// 문자열비교 (벨류값 비교) ▶ equals메서드
		System.out.println(st1.equals(st2));
		// == >> 이건 객체 주소값 비교
		
		
		char[] arr1 = st2.toCharArray(); // 문자열 >> 단일문자로 일일히 분해
		String st3 = new String(arr1); // 조합 !!
		System.out.println(st3);
		
		byte[] arr2 = st2.getBytes();
		String st4 = new String(arr2,1,2); // 1, 2 (인덱스번호, 길이)
		System.out.println(st4);

	}

}
