package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex12 extends Frame implements ActionListener{

	public Ex12(){
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,4));
		
		// 배열을 썼기에 제어가 가능해졌다.
		Button[] btns = new Button[16];
		
		for(int i=0; i<16; i++){
			// Button btn = new Button(""+i);
			// btn.addActionListener(this);
			// 문자열 연산 취하면 문자열됨 
			btns[i] = new Button(""+i);
			btns[i].addActionListener(this);
			p.add(btns[i]);
		}
		
		add(p);
		setBounds(200,200,400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// 버튼 16개 섞기
		new Ex12();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 누른 버튼 확인하기
		// 버튼을 지시할 수 있으면, 제어할 수 있다.
		// ex) 로또공 45개 제어
		System.out.println(((Button)(e.getSource())).getLabel());
		

		
	}

}
