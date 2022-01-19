package com.hi;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex11 extends Frame implements MouseMotionListener{

	public Ex11(){
		
		// ���콺 ����� ������ �̺�Ʈ �ֱ�
		
		Panel p = new Panel();
		// addMouseMotionListener(MouseMotionListener l)
		// �������̽� ��� �޾Ƽ� ����. �� this ��  Ex11���콺 ù��°Ŭ��
		p.addMouseMotionListener(this);
		
		// ���콺��ǥ ���
		// ���콺�̺�Ʈ ��ü
		
		add(p);
		setBounds(200,200,400,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex11();

	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// System.out.println("�巹��");
		
		// < ��ǥ �˾ƺ��� >
		//   : �Ű����� e�� ���� �̿��ϸ� ��ǥ �˾ƿ� �� �ִ�.
		//   : Ȱ��ȭ�� �Ǿ�������, �̺�Ʈ�� �߻����� �������� ����
		//   : System.out.println(e);
		//   : ������Ʈ����(�гο� ������ �г��� ����) |  ȭ�������� 
		
		System.out.println("������Ʈ ���� : " + e.getX() + "," + e.getY());
		System.out.println("ȭ����� : " + e.getXOnScreen() + "," + e.getYOnScreen());
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("����");
		
	}

}
