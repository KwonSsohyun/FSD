package com.hi;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex07 {

	public static void main(String[] args) {
		// �迭
		ArrayList list1 = new ArrayList();
		// �ּҰ� ����� LinkedList
		LinkedList list2 = new LinkedList();
		
		int cnt = 100000;
		long a,b,c;
		// �ӵ� �����غ���
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
		// LinkedList�� �� ������.
	}

}
