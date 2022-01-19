package com.hi;

import java.util.ArrayList;

public class Ex06 {
	// ���ϵ�ϱ� ���� �ȳ�
	// extends Number  ��� �Ʒ��� >> ���ϵ尡 Number�� ��� �޴� -> �׷��� ���ڸ� ���� �� ����(�Ǽ�, ��������)
	// super Number    ��ӹ޾Ƽ� ���� >> Object ����
	
	// V - ���� | E - ������Ʈ(���) | K - Ű 
	public static <T extends Object> void func(ArrayList<? super Number> a){
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
	}

	public static void main(String[] args) {
		// �����鼭 Ÿ�� ������.
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
