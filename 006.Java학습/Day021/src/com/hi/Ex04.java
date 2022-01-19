package com.hi;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

public class Ex04 extends Frame{

	public Ex04(){
		// �ü�� �����ϴ� ��. (��û)
		Toolkit tool = Toolkit.getDefaultToolkit();
		Image img = tool.createImage("img01.jpg");
		
		
		// java.awt  >>  Class Canvas
		// https://docs.oracle.com/javase/8/docs/api/java/awt/Canvas.html
		// �޼��� ����
		// void	 ��  paint(Graphics g)
		// �Ű������� ���ִ�  Graphics Ŭ���غ���
		// �����ڸ� ���� protected ��� ���� �� �� �ִ�.
		// �̹� �츰 public class Ex04 "extends Frame" �� ��ӹް� �ֱ⶧����
		// �͸� Ŭ������ ����, ����� �޴´�.
		java.awt.Canvas can = new Canvas(){ // 1) �͸�Ŭ������ ����,

			// Ŭ���� ��Ż�� üũ����! >> @Override
			@Override
			
			// 2) ��ӹ޴´�.
			public void paint(Graphics g){
				String msg = "java awt";
				// �̹��� ����� �������ش�.
				g.drawImage(img, 50, 50, 300, 300, this);
				// �۽ô� �۾��ε� �̹�����.
				g.drawChars(msg.toCharArray(), 0, msg.length(), 100, 100);
				g.setColor(Color.RED);
				
				// �� �̰Ű����� �׸� �׸���.
				// �� ���͹���̶� -> �ȱ���
				g.drawLine(100, 100, 200, 200);     	  // �� ����
				g.drawRect(200, 200, 50, 50); 		 	  // �� �簢��
				g.setColor(Color.BLUE);
				g.drawOval(300, 100, 200, 200); 	 	  // �� ��
				// g.drawArc(300, 100, 200, 200, 0, 180); // �� ȣ
				g.fillRect(100, 100, 200, 200); 		  // �� �簢�� �� ä���
				g.setColor(Color.RED);
				g.fillOval(300, 100, 200, 200); 		  // �� �� �� ä���
				g.draw3DRect(100, 100, 200, 200, true);   // �� 3D �簢��
			}
		};
		add(can);
		
	
		setSize(600,500);
		setLocation(200,200);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new Ex04();

	}

}
