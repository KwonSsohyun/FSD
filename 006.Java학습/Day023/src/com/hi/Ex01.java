package com.hi;

public class Ex01 extends Thread{

	public static void main(String[] args) {
		
		// 메인도 하나의 쓰레드니까 이름을 받아보자
		Thread thr = Thread.currentThread();
		String name = thr.getName();
		// 메인 쓰레드 이름은 "main"
		System.out.println(name + " 메인 쓰레드 시작");
		
		
		// 쓰래드
		// 만들때마다 이름이 달라진는걸 알 수 있다.
		// 0 -> 1 이렇게 순차적으로 진행된다는 보장은 없다.
		Ex01 me = new Ex01();
		me.start();
		Ex01 you = new Ex01();
		you.start();
		
		System.out.println(name + " 메인 쓰레드 종료");
	}
	
	// 메인이외에 쓰레드 부분 (별도)
	// 병렬적으로 처리
	// ▶ run 치고 스페이스바
	@Override
	public void run() {
		
		
		// Thread[Thread-0,5,main]
		// Thread[Thread-1,5,main]
		// 최근의 쓰레드 (나) -> getName() -> 내 이름 쓰래드 받아볼 수 있다.
		Thread thr = Thread.currentThread();
		// true
		// Ex01객체 인 그놈 > this
		System.out.println(thr.hashCode() == this.hashCode());
		
		// 쓰래드 클래스를 상속받았기에 됨
		// 쓰래드의 이름 받아올 수 있다. ▶ getName()
		String name = getName();
		// String name = this.getName();
		// this. 내가 쓰레드니까 > 이름 가져오는것 가능
		
		System.out.println(name + " 새로운 쓰레드로 하고자하는 일");
	}
}
