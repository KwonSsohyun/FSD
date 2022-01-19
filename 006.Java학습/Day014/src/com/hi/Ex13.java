package com.hi;

public class Ex13 {

	public static void main(String[] args) {
		// crud
		
//		StringBuilder 나 StringBuffer 는 같다.
//		StringBuilder msg = new StringBuilder("abcd");
		StringBuffer msg = new StringBuffer("abcd");
		
		System.out.println(msg.append("efg"));
		
		// 중간에 삽입 ▶▶ .insert(넣을인덱스번호, 넣을내용);
		System.out.println(msg.insert(3, "ABC"));

		// 수정
		// 앞에는 0부터 센다.
		// 뒤에는 1부터 센다.
		System.out.println(msg.replace(3, 6, "123"));
		
		// 지우기
		// 앞에는 0부터 센다.
		// 뒤에는 1부터 센다.
		System.out.println(msg.delete(3, 6));
	}

}
