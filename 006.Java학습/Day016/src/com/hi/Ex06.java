package com.hi;

import java.util.LinkedList;

public class Ex06 {

	public static void main(String[] args) {
		
		// java.util >> Class LinkedList<E>
//		java.util.LinkedList list = new LinkedList();
		
		// 인터페이스
		java.util.List list = new LinkedList();
		// java.util >> Interface List<E>
		// https://docs.oracle.com/javase/8/docs/api/java/util/List.html
		// List 상속받는 것들
		// AbstractList, AbstractSequentialList, ArrayList, AttributeList, CopyOnWriteArrayList, 
		// LinkedList, RoleList, RoleUnresolvedList, Stack, Vector
      
		
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add("네번째");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
	}

}
