package com.hi;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex11 {
	
	static class Ele implements Comparable{
		int val;
		public Ele(int val){
			this.val = val;
		}
		public String toString(){
			return "" + val;
		}
		public int compareTo(Object obj){
			return val-((Ele)obj).val;
			// �� Ŭ���� Ÿ������ ĳ������
			// ���� �ߺ�ó����
			
			// return 1;
			// 0 �̸�  >>  �ߺ����� �����ؼ� �ϳ��� ����
			// -1 �̸� >>  ���� �Ųٷ� ����
		}
	}
	
	public static void main(String[] args) {
		Ele ele1 = new Ele(1111);
		Ele ele2 = new Ele(1111);
//		System.out.println(ele1);
		Set set = new TreeSet();
		set.add(ele1);
		set.add(ele2);
		set.add(new Ele(1122)); // ��ó�� ���ο� ��ü�� ����
		
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}

	}

}
