package com.hi;

import java.awt.Frame;
import java.awt.Label;

public class Ex11 extends Frame{
	
	static Label la;
	

	public Ex11(){
		la = new Label();
		la.setAlignment(Label.CENTER);
		add(la);
		setBounds(200,200,200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// ī��Ʈ�ٿ� (�δ�������)
		Ex11 me = new Ex11();
		
		// ī��Ʈ�ٿ�
		for(int i=10; i>=0; i--){
			// ����(����� ��)�� ���ڿ��ϰ� �����ϸ� ���ڿ���.
			// ���ڿ��� �����ϸ� ���ڿ���
			la.setText(""+i);
			try {
				// 1�ʸ��� 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
