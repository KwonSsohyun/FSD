package com.hi;

public class Ex01 { // awt 프레임 상속 ▶ extends java.awt.Frame

	public static void main(String[] args) {
		
		// 상속받아서 쓰는 방법도 있음
		// Ex01 me = new Ex01();
		
		System.out.println("main start");
		
		// 객체 생성해서 쓰는 방법도 있음
		// 상속 안받아서 쓰면, 여기다가 다 같이 쓴다.
		java.awt.Frame me = new java.awt.Frame();
		
		// 창이 보일지말지 정해줘야한다. (제어한다.)
		me.setVisible(true);
		
		// 창에 대한 사이즈 결정
		// 단위는 픽셀!
		me.setSize(500, 300);
		
		// 창 끄기 (기능 닫기 설정)
		// 창 최소화 (멀티기능)은 운영체제에서 해준다. 그래서 동작함
		// └ 나머지는 동작 안함
		// 카톡은 대화창 끄는게 아니라 안보이게 하는것 (뒤에서는 돌아가야 하니까)
		// 어떤걸 수행할지 코딩을 해야함.
		// 기능을 넣는것 = 이벤트 붙히는 것.
		
		// 메인하나 / UI 하나 ▶ 2개의 쓰래드 
		// 새로운 UI 쓰래드를 만들어서 작동하게 됨.
		System.out.println("main end");

	}

}
