package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex10 extends Frame{
	
	public Ex10(){
		GridBagLayout layout = new GridBagLayout();
		Panel p = new Panel();
		p.setLayout(layout);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		
		Button btn1 = new Button();
		gbc.gridwidth = 3;
		btn1.setLabel("패드");
		p.add(btn1, gbc);
		
		Button btn2 = new Button();
		gbc.gridwidth = 1;
		gbc.gridy = 1;
		btn2.setLabel("1");
		p.add(btn2, gbc);
		
		Button btn3 = new Button();
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		btn3.setLabel("2");
		p.add(btn3, gbc);
		
		Button btn4 = new Button();
		gbc.gridx = 2;
		gbc.gridy = 1;
		btn4.setLabel("3");
		p.add(btn4, gbc);
		
		Button btn5 = new Button();
		gbc.gridy = 2;
		gbc.gridx = 0;
		btn5.setLabel("4");
		p.add(btn5, gbc);
		
		Button btn6 = new Button();
		gbc.gridx = 1;
		gbc.gridy = 2;
		btn6.setLabel("5");
		p.add(btn6, gbc);
		
		Button btn7 = new Button();
		gbc.gridx = 2;
		gbc.gridy = 2;
		btn7.setLabel("6");
		p.add(btn7, gbc);
		
		Button btn8 = new Button();
		gbc.gridy = 3;
		gbc.gridx = 0;
		btn8.setLabel("7");
		p.add(btn8, gbc);
		
		Button btn9 = new Button();
		gbc.gridx = 1;
		gbc.gridy = 3;
		btn9.setLabel("8");
		p.add(btn9, gbc);
		
		Button btn10 = new Button();
		gbc.gridx = 2;
		gbc.gridy = 3;
		btn10.setLabel("9");
		p.add(btn10, gbc);
		
		Button btn11 = new Button();
		gbc.gridy = 4;
		gbc.gridx = 0;
		btn11.setLabel("*");
		p.add(btn11, gbc);
		
		Button btn12 = new Button();
		gbc.gridx = 1;
		gbc.gridy = 4;
		btn12.setLabel("0");
		p.add(btn12, gbc);
		
		Button btn13 = new Button();
		gbc.gridx = 2;
		gbc.gridy = 4;
		btn13.setLabel("#");
		p.add(btn13, gbc);
		
		
		// 기본설정
		add(p);
		setLocation(200, 200);
		setSize(500, 800);
		setVisible(true);
	}
		
	
	

	public static void main(String[] args) {
		new Ex10();

	}

}
