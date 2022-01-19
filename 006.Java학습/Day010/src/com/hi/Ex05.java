package com.hi;

public class Ex05 {
	
	// 중복된 생성자를 쓸 경우 사용 ->> this();
	// 오직, 생성자에서만 사용 가능
	// 없는게 최소 하나는 있어야 사용한다. / 서로가 서로를 호출할 경우도 피할것.
	// 생성자의 최상단에 배치해야한다.

	public String msg;
	
	public Ex05(){ // 최초호출될때만 객체가 생성된다.
		this("hello"); // 1) 인자를 받는 this (생성자에서만 쓰이고, 다른 생성자를 호출해내기를 위해서) 
		return; // 7) 종료
	}
	
	
	public Ex05(String msg){ // 2) 인자받은거 생성되고,
		/*
		this.msg = msg;
		for(int i=0; i<3; i++){
			System.out.println(msg);
		}
		*/
		this(msg,1); // 3) 2번의 값을 다시 3번인 Ex05(스트링, 인트) 값 전달
		return; // 6) 호출받은데 다시 돌아감.
	}
	
	
	public Ex05(String msg, int cnt){ // 4) 인자 전달 받음 - 여기서는 맨 마지막인 여기서 객체생성
		this.msg = msg;
		for(int i=0; i<cnt; i++){
			System.out.println(msg);
		}
		return; // 5) 호출받은데 다시 돌아감.
	}
	
	public static void main(String[] args) {
		Ex05 me = new Ex05();
//		Ex05 me = new Ex05("java");
//		Ex05 me = new Ex05("easy", 5);
	}

}
