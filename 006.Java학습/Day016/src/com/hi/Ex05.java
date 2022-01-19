package com.hi;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
		// java.util >> Class ArrayList<E>
		
		// << Constructor Summary >> 
		// 	  기본이 10개임 >> add하면 계속 자동 동적할당됨
		// 	  ▶ ArrayList()
		//      걍 디폴트 쓰자.
		
		
		// 	 증가량의 맥심멈을 설정한다. 
		// 	 안에 내부가 어떻게 될지 모르니 난 딱 100개만 할거면
		//   100 설정 (테스트하면서 해야한다.)
		//   ▶ ArrayList(int initialCapacity)
		
		
		// <자료구조>
		// 유동적인 배열 만들기.
		java.util.ArrayList list = new ArrayList();
		list.add("첫번째");
//		list.add(1234); // Object 타입이니까 자료타입 상관없다. // 근데 되도록 같은 타입이 좋다.
//		list.add(new Ex05());
		list.add("네번째");
		// 끼워넣고
		list.add(0,"나중에"); // 0번째 인덱스 -> "나중에" 텍스트 들어가면서 // 나머지 다 순서 밀림
		
		// 값을 다 비워버림 
//		list.clear();
		
		// 복사
		// ArrayLinst로 캐스팅
		Object obj = list.clone();
		
		// 반복문 써서 끄집어내야한다면, 한가지 타입으로 통일하는게 좋다.
		// 왜냐면 다 달리 조건처리하고, 맞는 캐스팅을 해야하니까.
		
		
		// 배열 출력해보기.
		// 배열 길이 확인
		System.out.println(list.size());
		
//		for(int i=0; i<list.size(); i++){
//			// Object 로 반환된다. (string X)
//			// Object msg = list.get(i);
//			
//			// String 타입으로만 했으니 String타입으로 캐스팅한다.
//			String msg = (String)list.get(i);
//			System.out.println(msg);
//			// System.out.println(list.get(i));
//		}
		// 숫자를 적으면 인덱스를 지워주고
		list.remove(1);
		// list.add(1); -> 공교롭게도 1이라고 내용이라고 치면
		// 내용이 아니라 인덱스가 1번이 삭제됨.
		// 우선순위가 인트라는 객체 타입 1
		// 내용을 적으면 박싱을 통해서 찾음
		
		// 값을 적으면 그 해당 인덱스를 찾아서 지워줌
		list.remove("첫번째");
		// 바꿔줌
		list.set(0, "3번째");
		
		// 해당 값 있는지 확인 (안에 내용 있는지 없는지)
		System.out.println(list.contains("네번째"));
		
		// 해당 내용 값에 있는지없는지 + 인덱스 번호 반환해줌
		// 인덱스번호까지 주니 개꿀이득 개발자들은 더 많이 씀
		// 없으면 -1
		System.out.println(list.indexOf("첫번째"));
		
		// 비었는지 안비었는지
		// 비었으면 -> true // 채워져있으면 -> false
		System.out.println(list.isEmpty());		
		System.out.println(list.size()==0); // 위에랑 같은거임 (size가 없으면 0)
		
		Object[] objs = list.toArray(); // 오브젝트 배열
		System.out.println(Arrays.toString(objs));
		// 값을 하나씩 캐스팅 해야함 (인덱스 하나씩 끄집어내서 해야함)
//		Object[] objs = (String[])list.toArray();
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(2));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
	}

}
