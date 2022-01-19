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
			// 내 클래스 타입으로 캐스팅함
			// 이제 중복처리함
			
			// return 1;
			// 0 이면  >>  중복으로 간주해서 하나만 나옴
			// -1 이면 >>  순서 거꾸로 나옴
		}
	}
	
	public static void main(String[] args) {
		Ele ele1 = new Ele(1111);
		Ele ele2 = new Ele(1111);
//		System.out.println(ele1);
		Set set = new TreeSet();
		set.add(ele1);
		set.add(ele2);
		set.add(new Ele(1122)); // 위처럼 새로운 객체를 만듬
		
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}

	}

}
