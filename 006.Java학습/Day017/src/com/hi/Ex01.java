package com.hi;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// List(����), Set(����), Map(����)
		
		// ���� �ڷᱸ��   |  �� List (ArrayList)
		// ���� �ڷᱸ��   |  �� Set  (HashSet)
		// ���� �ڷᱸ�� |  �� Map  (HashMap)
		
		
		/// ���׸� (1.5���� ����)
		//  �� �ڷ����� �����ϴ� ��
		//    <String> �����⶧���� -> String�� ���� �� �ִ�.
		ArrayList<Object> list = new ArrayList<Object>();
///		ArrayList<Object> list = new ArrayList<>(); -> ���� ����. 1.7���� ��� (�߷�Ÿ��)
		list.add("ù��°");
		list.add("�ι�°");
		// list.add(1111);
		// list.add(new Ex01());
		// list.add(true);
		
		for(int i=0; i<list.size(); i++){
			// ĳ���� ���̵� �ٷ� String Ÿ�� ���´�.
			Object msg = list.get(i);
			System.out.println(list);
		}
		

	}

}
