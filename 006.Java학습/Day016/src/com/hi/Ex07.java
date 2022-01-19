package com.hi;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex07 {

	public static void main(String[] args) {
		// 배열
		ArrayList list1 = new ArrayList();
		// 주소값 연결된 LinkedList
		LinkedList list2 = new LinkedList();
		
		int cnt = 100000;
		long a,b,c;
		// 속도 측정해보기
		a= System.currentTimeMillis();
		
		for(int i=0; i<cnt; i++){
			list1.add(i);
		}
		b= System.currentTimeMillis();
		for(int i=0; i<cnt; i++){
			list2.add(i);
		}
		c= System.currentTimeMillis();
		System.out.println("ArrayList time : " + (b-a));
		System.out.println("LinkedList time : " + (c-b));
		// LinkedList가 더 빠르다.
	}

}
