package com.hi;

import java.util.StringTokenizer;
import java.util.Vector;

public class Ex08 {
	// java.util >> Class Vector<E>
	// https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html
	
	public static void main(String[] args) {
//		Vector vec = new Vector();
		// 스택이 백터를 상속 받으니까.
		Vector vec = new Vector();
		vec.addElement("첫번째");
		vec.addElement("두번째");
		vec.addElement("세번째");
		vec.addElement("네번째");
		
//		vec.addElement("첫번째");
//		vec.insertElementAt("두번째",0);
//		vec.insertElementAt("세번째",0);
//		vec.insertElementAt("네번째",0);

		
//		// 값 바꾸기
//		vec.setElementAt("3번째", 2);
//		// 끼워넣기
//		vec.insertElementAt("다섯번째", 3);
//		// 값 지우기 - 인덱스 번호 적기
//		vec.removeElementAt(0);
//		// 값 지우기 - 인덱스 해당내용 적기
//		vec.removeElement("3번째");
//		
//		for(int i=0; i<vec.size(); i++){
//			System.out.println(vec.elementAt(i));
//		}
//		
//		System.out.println("------------------------------");
//		
//		// 첫번째 엘리먼트 나옴
//		System.out.println(vec.firstElement());
//		// 마지막 엘리먼트 나옴
//		System.out.println(vec.lastElement());

		System.out.println("------------------------------");
		
		while(vec.size()!=0){
			System.out.println(vec.firstElement());
			vec.removeElementAt(0);
		}
		
		System.out.println("------------------------------");
		
		// 백터만을 위한
		java.util.Enumeration enu = vec.elements();
		
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
		
//		vec.iterator();
		
		java.util.StringTokenizer token = new StringTokenizer("java web framwork");
		while(token.hasMoreElements()){
			System.out.println(token.nextElement());
		}

	}

}
