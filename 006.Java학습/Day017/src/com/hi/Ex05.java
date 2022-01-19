package com.hi;

import java.util.ArrayList;

public class Ex05 {
	
	// 와일드카드 언제 쓰냐?
	// 아직 타입이 결정나지 않아서, 결정을 미루는 것 (그래서 쓸때는 캐스팅을 요구함)
	public static ArrayList<?> func(int a, int b){
		if(a%b == 0){
			ArrayList<Integer> list = new ArrayList<>();
			list.add(a/b);
			return list;
		}else{
			ArrayList<Double> list = new ArrayList<>();
			list.add(a*100/b/100.0);
			return list;
		}
		
	}

	public static void main(String[] args) {
		// <?> : 와일드카드
		//       아직 결정하지 않겠다.
		//       객체는 찍었으나, 타입은 안 정해짐
		//       사용하기 전에는 타입을 정해줘야함.
		//       그래서 아래코드에서 캐스팅을 허용해줌.
//		ArrayList<?> list = new ArrayList<>();
//		// ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<String> list2 = (ArrayList<String>) list;
//		
//		list.add(1111);
//		list.add("java");
		
		// 위에서 결정이 안나서 쓸때는 캐스팅을 요구함 ▶ (ArrayList<Integer>)
		ArrayList<Integer> list = (ArrayList<Integer>)func(6,2);
		ArrayList<Double> list2 = (ArrayList<Double>)func(5,2);
		
		System.out.println(list);
		System.out.println(list2);

	}

}
