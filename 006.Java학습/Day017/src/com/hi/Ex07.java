package com.hi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex07 {
	// Collection 상속 받아서
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		HashSet<Integer> sett = new HashSet<>();
		ArrayList<Integer> listt = new ArrayList<>(sett);
		
		list.add(1111);
		list.add(3333);
		list.add(1111);
		list.add(2222);

		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------------");
		
		HashSet<Integer> set = new HashSet<>(list);
		set.addAll(list);
		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext()){
			int temp = ite.next();
			System.out.println(temp);
		}
	}

}
