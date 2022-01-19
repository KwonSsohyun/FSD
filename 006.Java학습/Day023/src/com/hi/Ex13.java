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
		
		btn1 = new Button("����");
		btn1.addActionListener(this);
		
		btn2 = new Button("����");
		btn2.addActionListener(this);
		
		p.add(btn1);
		p.add(btn2);
		
		// �� .setEnabled()
		// ����� �� ���� �ϰ�, �����ϰ� (�������)
		btn1.setEnabled(true);
		btn2.setEnabled(false);
		
		// �� .setVisible()
		// �ƿ� ����� (���� �Ⱥ���)
		// btn1.setVisible(true);
		
		
		add(p);
		setBounds(200,200,300,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// ������ ����
		new Ex13();
	}


	// �̺�Ʈ
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		
		if(btn==btn1){ // btn.getLabel().equals("����")
			// Ȱ��ȭ (true - ����ϰ� �ϰ�, false - ���ϰ� �ϰ�)
			btn1.setEnabled(false);
			try {
				// 3�ʰ� �� �ֱ�
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			btn2.setEnabled(true);
		} else if(btn==btn2){
			btn2.setEnabled(false);
			try {
				// 3�ʰ� �� �ֱ�
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			btn1.setEnabled(true);
		}
		
	}

}
