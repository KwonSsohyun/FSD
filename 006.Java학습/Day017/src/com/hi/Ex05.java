package com.hi;

import java.util.ArrayList;

public class Ex05 {
	
	// ���ϵ�ī�� ���� ����?
	// ���� Ÿ���� �������� �ʾƼ�, ������ �̷�� �� (�׷��� ������ ĳ������ �䱸��)
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
		// <?> : ���ϵ�ī��
		//       ���� �������� �ʰڴ�.
		//       ��ü�� �������, Ÿ���� �� ������
		//       ����ϱ� ������ Ÿ���� ���������.
		//       �׷��� �Ʒ��ڵ忡�� ĳ������ �������.
//		ArrayList<?> list = new ArrayList<>();
//		// ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<String> list2 = (ArrayList<String>) list;
//		
//		list.add(1111);
//		list.add("java");
		
		// ������ ������ �ȳ��� ������ ĳ������ �䱸�� �� (ArrayList<Integer>)
		ArrayList<Integer> list = (ArrayList<Integer>)func(6,2);
		ArrayList<Double> list2 = (ArrayList<Double>)func(5,2);
		
		System.out.println(list);
		System.out.println(list2);

	}

}
