package com.hi;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex02 extends Frame implements TextListener{

	TextField tf;
	
	public Ex02(){
		Panel p = new Panel();
		
		tf = new TextField(15); // 15�ڱ��� ���̰� �ϱ�
		tf.addTextListener(this);
		p.add(tf);
		
		
		add(p);
		setBounds(200,200,400,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex02();

	}


	@Override
	public void textValueChanged(TextEvent e) {
		// �������� �ٲ�� ȣ��ȴ�. (�Է�)
		// �Է��ϴ´�� �ٷιٷ� ���� �ٷ� ��ȯ����
		// ����Ű, ����Ʈ, ���� �� ���� ����
		// Ű�ڵ�� ������. (���������� �����)
		System.out.println(tf.getText());
		
	}

}
