package com.hi;

import java.awt.Frame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Ex03 extends Frame implements WindowFocusListener, MouseWheelListener, FocusListener, ComponentListener
{ // �������̽� ���߻�� ����

	public Ex03(){
		
		// ������ ���º�ȭ
		addWindowFocusListener(this);
		addMouseWheelListener(this);
		addWindowFocusListener(this);
		addComponentListener(this);
		
		setBounds(200,200,400,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex03();

	}

	//*************************************************************
	@Override
	public void windowGainedFocus(WindowEvent e) {
		System.out.println("windowGainedFocus");
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		System.out.println("windowLostFocus");
		
	}
	//*************************************************************
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("���콺 ��");
		
	}
	//*************************************************************
	@Override
	public void focusGained(FocusEvent e) {
		// ������Ʈ ���� 
		// ��Ŀ���� ��� (���� �Ұ�) (��ư, �ؽ�Ʈ ���°� ���� �� �ִ°�ü�� ����)
		System.out.println("��Ŀ�� ����");
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// ������Ʈ ����
		System.out.println("��Ŀ�� ����");
	}
	//*************************************************************
	@Override
	public void componentResized(ComponentEvent e) {
		// ������Ʈ �����ʴϱ� ������Ʈ�� �� ���� �� �ִ�.
		// UI��ü�� ������Ʈ�� ��� ������ �� �� �� �ִ�.
		// ������ �پ�鶧���� ����,���� ������ �ȼ��� �˷��ش�.
		System.out.println(this.getSize().width + "," + this.getSize().height);
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
