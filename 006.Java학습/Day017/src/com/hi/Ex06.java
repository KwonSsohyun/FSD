package com.hi;

import java.util.ArrayList;

public class Ex06 {
	// 와일드니까 결정 안남
	// extends Number  상속 아래로 >> 와일드가 Number을 상속 받는 -> 그러니 숫자만 받을 수 있음(실수, 정수가능)
	// super Number    상속받아서 위로 >> Object 가능
	
	// V - 벨류 | E - 엘리먼트(요소) | K - 키 
	public static <T extends Object> void func(ArrayList<? super Number> a){
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
	}

	public static void main(String[] args) {
		// 넣으면서 타입 결정됨.
		ArrayList<Object> list1 = new ArrayList<>();
		list1.add("aaaa");
		list1.add("bbbb");
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1111);
		list2.add(2222);
		ArrayList<Double> list3 = new ArrayList<>();
		list3.add(1.0);
		list3.add(2.0);
		func(list1);

	}

}
