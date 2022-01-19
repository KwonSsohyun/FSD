package com.hi;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// List(선형), Set(선형), Map(비선형)
		
		// 선형 자료구조   |  ▶ List (ArrayList)
		// 선형 자료구조   |  ▶ Set  (HashSet)
		// 비선형 자료구조 |  ▶ Map  (HashMap)
		
		
		/// 제네릭 (1.5에서 등장)
		//  ▶ 자료형을 제약하는 것
		//    <String> 붙혔기때문에 -> String만 들어올 수 있다.
		ArrayList<Object> list = new ArrayList<Object>();
///		ArrayList<Object> list = new ArrayList<>(); -> 위랑 같다. 1.7부터 허용 (추론타입)
		list.add("첫번째");
		list.add("두번째");
		// list.add(1111);
		// list.add(new Ex01());
		// list.add(true);
		
		for(int i=0; i<list.size(); i++){
			// 캐스팅 없이도 바로 String 타입 나온다.
			Object msg = list.get(i);
			System.out.println(list);
		}
		

	}

}
