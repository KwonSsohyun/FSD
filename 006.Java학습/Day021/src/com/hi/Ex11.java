package com.hi;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex11 extends Frame implements MouseMotionListener{

	public Ex11(){
		
		// 마우스 모션이 있을때 이벤트 주기
		
		Panel p = new Panel();
		// addMouseMotionListener(MouseMotionListener l)
		// 인터페이스 상속 받아서 쓴다. → this →  Ex11마우스 첫번째클릭
		p.addMouseMotionListener(this);
		
		// 마우스좌표 찍기
		// 마우스이벤트 객체
		
		add(p);
		setBounds(200,200,400,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex11();

	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// System.out.println("드레그");
		
		// < 좌표 알아보기 >
		//   : 매개변수 e로 변수 이용하면 좌표 알아올 수 있다.
		//   : 활성화는 되어있지만, 이벤트의 발생시점 기준으로 측정
		//   : System.out.println(e);
		//   : 컴포넌트기준(패널에 줬으니 패널의 기준) |  화면을기준 
		
		System.out.println("컴포넌트 기준 : " + e.getX() + "," + e.getY());
		System.out.println("화면기준 : " + e.getXOnScreen() + "," + e.getYOnScreen());
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("무브");
		
	}

}
