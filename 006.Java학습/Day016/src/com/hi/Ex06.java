package com.hi;

import java.util.LinkedList;

public class Ex06 {

	public static void main(String[] args) {
		
		// java.util >> Class LinkedList<E>
//		java.util.LinkedList list = new LinkedList();
		
		// �������̽�
		java.util.List list = new LinkedList();
		// java.util >> Interface List<E>
		// https://docs.oracle.com/javase/8/docs/api/java/util/List.html
		// List ��ӹ޴� �͵�
		// AbstractList, AbstractSequentialList, ArrayList, AttributeList, CopyOnWriteArrayList, 
		// LinkedList, RoleList, RoleUnresolvedList, Stack, Vector
      
		
		list.add("ù��°");
		list.add("�ι�°");
		list.add("����°");
		list.add("�׹�°");
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
	}

}
