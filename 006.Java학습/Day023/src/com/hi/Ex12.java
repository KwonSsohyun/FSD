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
		
		// �迭�� ��⿡ ��� ����������.
		Button[] btns = new Button[16];
		
		for(int i=0; i<16; i++){
			// Button btn = new Button(""+i);
			// btn.addActionListener(this);
			// ���ڿ� ���� ���ϸ� ���ڿ��� 
			btns[i] = new Button(""+i);
			btns[i].addActionListener(this);
			p.add(btns[i]);
		}
		
		add(p);
		setBounds(200,200,400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// ��ư 16�� ����
		new Ex12();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ���� ��ư Ȯ���ϱ�
		// ��ư�� ������ �� ������, ������ �� �ִ�.
		// ex) �ζǰ� 45�� ����
		System.out.println(((Button)(e.getSource())).getLabel());
		

		
	}

}
