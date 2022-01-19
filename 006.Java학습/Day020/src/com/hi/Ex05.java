package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex05 extends Frame{

	
	public Ex05(){
		// 배치관리자 : 화면을 배치
		// ▶▶ BorderLayout 
		//    이게 가장 많이 쓰임
		java.awt.BorderLayout layout = new BorderLayout();
		Panel p = new Panel();
		p.setLayout(layout);
		
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		Button btn5 = new Button();
		
		btn4.setLabel("메뉴");
		
		// ▶▶ BorderLayout 
		//    패널에 레이아웃 정함
		//    어느 위치에 할지 같이 add 시켜줘야 한다.
		//     p.add(btn1, "North"); // "North" ▶ 필드에 있는 "상수형 변수" 로 저장해놓음 (아래도 마찬가지)
		p.add(btn1, BorderLayout.NORTH);
		p.add(btn2, "South");
		p.add(btn3, "East");
		p.add(btn4, "West");
		p.add(btn5, "Center");
		
		add(p);
		setLocation(200, 200);
		setSize(500, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex05();

	}

}
