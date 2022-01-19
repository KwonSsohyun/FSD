package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex10 extends Frame implements MouseListener{

	public Ex10(){
		
		// ���콺 �̺�Ʈ �ޱ�
		// "Component(���۳�Ʈ)"�� ��ӹ޴� � ��ü�� .addMouseListener ����
		
		Panel p = new Panel();
		
		Button btn1 = new Button("�̺�Ʈ��� ��ư");
		// .addMouseListener ���콺�뺸�� 
		//  (MouseListener l) ��ӹ޾Ƽ� �������̵��ؼ� ����.
		// ���� ��ӹ޾����� this
		// Ex10 -> ù��° Ŭ��
		// btn1.addMouseListener(this);
		p.addMouseListener(this);
		// �гη� �ָ�, ��ư�� ���� (���̾������ ���� �г��� �Ʒ� �ֱ� ����)
		// �г� ���������� ������ ���콺 �������� ������.
		p.add(btn1);
		
		
		add(p);
		setBounds(200,200,400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex10();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Ŭ���� (�̺�Ʈ ��󿡼� ������ ���� �ؿ������� ������!��)");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("���콺 ��������");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("���콺 �������� ����");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("�̺�Ʈ ������� ���콺�� �ö��� ��");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("�̺�Ʈ ������� ���콺�� ������ ��");
		
	}

}
