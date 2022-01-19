package com.hi;

import java.awt.Frame;

public class Ex02 extends Frame{ // 상속받음
	
	
	// 생성자 내부에서 처리 (UI대로 처리)
	// 2개의 쓰래드로 관리
	// 분리해서 쓰겠다. (관리 용이)
	public Ex02(){
		// 창이 보일지말지 정해줘야한다. (제어한다.)
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		
		Ex02 me = new Ex02();
		// ~~~~
		System.out.println("main thread...");

	}

}
