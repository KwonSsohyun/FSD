package com.hi;

public class Ex04 extends Thread{
	
	// 생성자를 만들고 부모에 전달
	public Ex04(String name){	
		super(name); // 쓰래드를 이야기함
		// Thread 클래스의 생성자를 호출함
	}

	public static void main(String[] args) {
		// 상속을 했을때
		// 생성자 통해서 하기
		Ex04 thr1 = new Ex04("첫번째");
		// thr1.setName("첫번째");
		thr1.start();
	}

	@Override
	public void run() {
		System.out.println(getName() + "run...");
	}
}
