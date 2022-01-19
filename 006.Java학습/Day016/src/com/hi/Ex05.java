package com.hi;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
		// java.util >> Class ArrayList<E>
		
		// << Constructor Summary >> 
		// 	  �⺻�� 10���� >> add�ϸ� ��� �ڵ� �����Ҵ��
		// 	  �� ArrayList()
		//      �� ����Ʈ ����.
		
		
		// 	 �������� �ƽɸ��� �����Ѵ�. 
		// 	 �ȿ� ���ΰ� ��� ���� �𸣴� �� �� 100���� �ҰŸ�
		//   100 ���� (�׽�Ʈ�ϸ鼭 �ؾ��Ѵ�.)
		//   �� ArrayList(int initialCapacity)
		
		
		// <�ڷᱸ��>
		// �������� �迭 �����.
		java.util.ArrayList list = new ArrayList();
		list.add("ù��°");
//		list.add(1234); // Object Ÿ���̴ϱ� �ڷ�Ÿ�� �������. // �ٵ� �ǵ��� ���� Ÿ���� ����.
//		list.add(new Ex05());
		list.add("�׹�°");
		// �����ְ�
		list.add(0,"���߿�"); // 0��° �ε��� -> "���߿�" �ؽ�Ʈ ���鼭 // ������ �� ���� �и�
		
		// ���� �� ������� 
//		list.clear();
		
		// ����
		// ArrayLinst�� ĳ����
		Object obj = list.clone();
		
		// �ݺ��� �Ἥ ��������Ѵٸ�, �Ѱ��� Ÿ������ �����ϴ°� ����.
		// �ֳĸ� �� �޸� ����ó���ϰ�, �´� ĳ������ �ؾ��ϴϱ�.
		
		
		// �迭 ����غ���.
		// �迭 ���� Ȯ��
		System.out.println(list.size());
		
//		for(int i=0; i<list.size(); i++){
//			// Object �� ��ȯ�ȴ�. (string X)
//			// Object msg = list.get(i);
//			
//			// String Ÿ�����θ� ������ StringŸ������ ĳ�����Ѵ�.
//			String msg = (String)list.get(i);
//			System.out.println(msg);
//			// System.out.println(list.get(i));
//		}
		// ���ڸ� ������ �ε����� �����ְ�
		list.remove(1);
		// list.add(1); -> �����ӰԵ� 1�̶�� �����̶�� ġ��
		// ������ �ƴ϶� �ε����� 1���� ������.
		// �켱������ ��Ʈ��� ��ü Ÿ�� 1
		// ������ ������ �ڽ��� ���ؼ� ã��
		
		// ���� ������ �� �ش� �ε����� ã�Ƽ� ������
		list.remove("ù��°");
		// �ٲ���
		list.set(0, "3��°");
		
		// �ش� �� �ִ��� Ȯ�� (�ȿ� ���� �ִ��� ������)
		System.out.println(list.contains("�׹�°"));
		
		// �ش� ���� ���� �ִ��������� + �ε��� ��ȣ ��ȯ����
		// �ε�����ȣ���� �ִ� �����̵� �����ڵ��� �� ���� ��
		// ������ -1
		System.out.println(list.indexOf("ù��°"));
		
		// ������� �Ⱥ������
		// ������� -> true // ä���������� -> false
		System.out.println(list.isEmpty());		
		System.out.println(list.size()==0); // ������ �������� (size�� ������ 0)
		
		Object[] objs = list.toArray(); // ������Ʈ �迭
		System.out.println(Arrays.toString(objs));
		// ���� �ϳ��� ĳ���� �ؾ��� (�ε��� �ϳ��� ������� �ؾ���)
//		Object[] objs = (String[])list.toArray();
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(2));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
	}

}
