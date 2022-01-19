package com.hi;

import java.util.StringTokenizer;
import java.util.Vector;

public class Ex08 {
	// java.util >> Class Vector<E>
	// https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html
	
	public static void main(String[] args) {
//		Vector vec = new Vector();
		// ������ ���͸� ��� �����ϱ�.
		Vector vec = new Vector();
		vec.addElement("ù��°");
		vec.addElement("�ι�°");
		vec.addElement("����°");
		vec.addElement("�׹�°");
		
//		vec.addElement("ù��°");
//		vec.insertElementAt("�ι�°",0);
//		vec.insertElementAt("����°",0);
//		vec.insertElementAt("�׹�°",0);

		
//		// �� �ٲٱ�
//		vec.setElementAt("3��°", 2);
//		// �����ֱ�
//		vec.insertElementAt("�ټ���°", 3);
//		// �� ����� - �ε��� ��ȣ ����
//		vec.removeElementAt(0);
//		// �� ����� - �ε��� �ش系�� ����
//		vec.removeElement("3��°");
//		
//		for(int i=0; i<vec.size(); i++){
//			System.out.println(vec.elementAt(i));
//		}
//		
//		System.out.println("------------------------------");
//		
//		// ù��° ������Ʈ ����
//		System.out.println(vec.firstElement());
//		// ������ ������Ʈ ����
//		System.out.println(vec.lastElement());

		System.out.println("------------------------------");
		
		while(vec.size()!=0){
			System.out.println(vec.firstElement());
			vec.removeElementAt(0);
		}
		
		System.out.println("------------------------------");
		
		// ���͸��� ����
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
