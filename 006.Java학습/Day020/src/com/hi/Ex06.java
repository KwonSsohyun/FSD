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
		// �����г�
		Panel p1 = new Panel();
		p1.setLayout(layout);
		
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		
		// �� ��ư�� p2,3,4�� �ִ´�. -> �� �г��� �����ϱ� ����
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		
		btn2.setLabel("ù��°");
		btn3.setLabel("�ι�°");
		btn4.setLabel("����°");
		
		p2.add(btn2);
		p3.add(btn3);
		p4.add(btn4);
		
		// p1���ٰ� p2,3,4 �������
		p1.add(p2);
		p1.add(p3);
		p1.add(p4);
		
		f.add(p1);
		f.setLocation(200,200);
		f.setSize(300,400);
		f.setVisible(true);
		
		
		Scanner sc = new Scanner(System.in);
		while(true){
			// �ܼ�â�� �ƹ��ų� �Է��Ҷ����� ������ �Ѿ.
			 sc.nextLine();
			 layout.next(p1);
		}
		
		
		// layout�� ������ �ִ� �θ� ���� ����
		// �׷��� p1
		// layout.next(p1); // �ι�°
		// layout.next(p1); // ����°
		// layout.next(p1); // ù��°
		

	}


}
