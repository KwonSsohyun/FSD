package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex10 extends Frame implements MouseListener{

	public Ex10(){
		
		// 마우스 이벤트 달기
		// "Component(컴퍼넌트)"를 상속받는 어떤 객체든 .addMouseListener 가능
		
		Panel p = new Panel();
		
		Button btn1 = new Button("이벤트대상 버튼");
		// .addMouseListener 마우스대보니 
		//  (MouseListener l) 상속받아서 오버라이딩해서 쓴다.
		// 내가 상속받았으니 this
		// Ex10 -> 첫번째 클릭
		// btn1.addMouseListener(this);
		p.addMouseListener(this);
		// 패널로 주면, 버튼은 제외 (레이어상으로 보면 패널은 아래 있기 때문)
		// 패널 영역에서의 에서의 마우스 조작으로 먹힌다.
		p.add(btn1);
		
		
		add(p);
		setBounds(200,200,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex10();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("클릭됨 (이벤트 대상에서 누르고 땔때 ※움직임이 없을때!※)");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스 눌렀을때");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 누른것을 땔때");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("이벤트 대상위로 마우스가 올라갔을 때");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("이벤트 대상위로 마우스가 빠졌을 때");
		
	}

}
