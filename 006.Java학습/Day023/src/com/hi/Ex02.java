package com.hi;

public class Ex02 implements Runnable{ // 인터페이스 Runnable 상속

	public static void main(String[] args) {
		
		Ex02 work = new Ex02();
		// 쓰레드 직접 객체 생성
		// start를 호출해서 생성자에 주입!
		Thread thr = new Thread(work);
		thr.start();

	}
	
	// 하고자하는 일을 오버라이딩해서 덮어써준다.
	@Override
	public void run() {
		// 인터페이스 Runnable 상속 받아서 없다.
		// getName()은 쓰래드클래스가 가지고 있기 때문.
		// String name = getName();
		
		// 이때는 쓰래드 이름 어떻게 받아볼 것이냐
		Thread me = Thread.currentThread();
		String name = me.getName();
		// String name = this.getName();
		// this안됨 > 상속받았기 때문에. > Ex02이기 때문임
		
		System.out.println(name + "쓰레드로 하고자하는 일");
	}

}
