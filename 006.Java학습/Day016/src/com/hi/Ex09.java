package com.hi;

import java.util.Stack;

public class Ex09 {

	public static void main(String[] args) {
		
		/// ������ �ڷᱸ��
		// java.util  >>  Class Stack<E>
		// https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
		
		// LIFO (last-in-first-out)
		java.util.Stack stack = new Stack();
		
		stack.push("ù��°");
		stack.push("�ι�°");
		stack.push("����°");
		stack.push("�׹�°");
		
		
		while(!stack.empty()){
			System.out.println(stack.pop());
		}
	
		
		// ��ť�� �ڷᱸ��
		// java.util  >>  Interface Deque<E>
		// https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html
		
		
	}

}
