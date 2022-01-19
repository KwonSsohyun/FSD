package com.hi;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.io.InputStream;
import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		CardLayout layout = new CardLayout();
		// 메인패널
		Panel p1 = new Panel();
		p1.setLayout(layout);
		
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		
		// 각 버튼을 p2,3,4에 넣는다. -> 각 패널을 구분하기 위함
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		
		btn2.setLabel("첫번째");
		btn3.setLabel("두번째");
		btn4.setLabel("세번째");
		
		p2.add(btn2);
		p3.add(btn3);
		p4.add(btn4);
		
		// p1에다가 p2,3,4 집어넣음
		p1.add(p2);
		p1.add(p3);
		p1.add(p4);
		
		f.add(p1);
		f.setLocation(200,200);
		f.setSize(300,400);
		f.setVisible(true);
		
		
		Scanner sc = new Scanner(System.in);
		while(true){
			// 콘솔창에 아무거나 입력할때마다 다음장 넘어감.
			 sc.nextLine();
			 layout.next(p1);
		}
		
		
		// layout을 가지고 있는 부모를 쓰는 것임
		// 그러니 p1
		// layout.next(p1); // 두번째
		// layout.next(p1); // 세번째
		// layout.next(p1); // 첫번째
		

	}


}
