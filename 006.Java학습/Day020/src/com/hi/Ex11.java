package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex11 extends Frame{

	public Ex11(){
		// <BorderLayout> → 패널에 add할때 어느위치에 배치할지 같이 지정해야함. 
		BorderLayout layout = new BorderLayout();
		// 작업영역(패널)
		Panel p = new Panel();
		// 작업영역에 <BorderLayout> 레이아웃을 쓰겠다.
		p.setLayout(layout);
		
		// <GridLayout> → 생성자에 숫자 2개 줘야함 (세로, 가로)
		GridLayout ltop = new GridLayout(1,1); // (y, x)
		GridLayout lcen = new GridLayout(4,3);
		Panel ptop = new Panel();
		Panel pcen = new Panel();
		// 작업영역에 <GridLayout> 레이아웃을 씀.
		ptop.setLayout(ltop);
		pcen.setLayout(lcen);
		
		
		Font f = new Font(Font.SANS_SERIF, Font.BOLD, 50){};
		TextField tf = new TextField();
		tf.setFont(f);
		ptop.add(tf);
		
		String[] msg = {"7","8","9","4","5","6","1","2","3","*","0","#"};
		Button[] arr = new Button[12];
		for(int i=0; i<arr.length; i++){
			arr[i] = new Button(msg[i]);
			pcen.add(arr[i]);
		}
		
		
		// <BorderLayout> → 북쪽이냐, 센터냐 (패널에 add할때 어느위치에 배치할지 같이 지정)
		p.add(ptop, BorderLayout.NORTH); // "북쪽 방향"으로 쓸거고
		p.add(pcen,BorderLayout.CENTER); // "센터"니까 나머지
		
		// 창에 작업영역 패널적용!
		add(p);
		// 기본설정
		setLocation(200,200);
		setSize(300,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11();

	}

}
