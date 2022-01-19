package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex13 extends Frame implements ActionListener{
	
	Button btn1, btn2;

	public Ex13(){
		Panel p = new Panel();
		p.setLayout(new GridLayout(1,2));
		
		btn1 = new Button("시작");
		btn1.addActionListener(this);
		
		btn2 = new Button("종료");
		btn2.addActionListener(this);
		
		p.add(btn1);
		p.add(btn2);
		
		// ▶ .setEnabled()
		// 사용할 수 없게 하고, 없게하고 (존재는함)
		btn1.setEnabled(true);
		btn2.setEnabled(false);
		
		// ▶ .setVisible()
		// 아예 사라짐 (눈에 안보임)
		// btn1.setVisible(true);
		
		
		add(p);
		setBounds(200,200,300,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// 쓰레드 제어
		new Ex13();
	}


	// 이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		
		if(btn==btn1){ // btn.getLabel().equals("시작")
			// 활성화 (true - 사용하게 하고, false - 못하게 하게)
			btn1.setEnabled(false);
			try {
				// 3초간 텀 주기
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			btn2.setEnabled(true);
		} else if(btn==btn2){
			btn2.setEnabled(false);
			try {
				// 3초간 텀 주기
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			btn1.setEnabled(true);
		}
		
	}

}
