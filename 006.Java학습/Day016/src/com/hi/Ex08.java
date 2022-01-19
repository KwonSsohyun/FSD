package com.hi;

import java.util.LinkedList;

public class Ex08 {

	public static void main(String[] args) {
		
		/// 큐의 자료구조
		// java.util  >>  Interface Queue<E>
		// https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
		
		// FIFO (first-in-fist-out)
		java.util.Queue que = new LinkedList();

		que.offer("첫번째");
		que.offer("두번째");
		que.offer("세번째");
		que.offer("네번째");

		/*
		while(true){
			if(que.peek()==null){break;}
			// 시점 첫번째 보는 관점 .peek
			System.out.println(que.peek());
			// 빼냄 .poll()
			que.poll();
		}
		*/
		while(que.peek()!=null){
			// 또한번 호출하면 다음걸 뺌
			System.out.println(que.poll());
			// System.out.println(que.poll());
		}
		
	}

}
