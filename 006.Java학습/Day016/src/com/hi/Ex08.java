package com.hi;

import java.util.LinkedList;

public class Ex08 {

	public static void main(String[] args) {
		
		/// ť�� �ڷᱸ��
		// java.util  >>  Interface Queue<E>
		// https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
		
		// FIFO (first-in-fist-out)
		java.util.Queue que = new LinkedList();

		que.offer("ù��°");
		que.offer("�ι�°");
		que.offer("����°");
		que.offer("�׹�°");

		/*
		while(true){
			if(que.peek()==null){break;}
			// ���� ù��° ���� ���� .peek
			System.out.println(que.peek());
			// ���� .poll()
			que.poll();
		}
		*/
		while(que.peek()!=null){
			// ���ѹ� ȣ���ϸ� ������ ��
			System.out.println(que.poll());
			// System.out.println(que.poll());
		}
		
	}

}
