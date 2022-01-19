package com.hi;

import java.util.Stack;

public class Ex09 {

	public static void main(String[] args) {
		
		/// 스택의 자료구조
		// java.util  >>  Class Stack<E>
		// https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
		
		// LIFO (last-in-first-out)
		java.util.Stack stack = new Stack();
		
		stack.push("첫번째");
		stack.push("두번째");
		stack.push("세번째");
		stack.push("네번째");
		
		
		while(!stack.empty()){
			System.out.println(stack.pop());
		}
	
		
		// 덱큐의 자료구조
		// java.util  >>  Interface Deque<E>
		// https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html
		
		
	}

}
