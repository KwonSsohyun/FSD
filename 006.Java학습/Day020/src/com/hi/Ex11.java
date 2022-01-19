package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex11 extends Frame{

	public Ex11(){
		// <BorderLayout> �� �гο� add�Ҷ� �����ġ�� ��ġ���� ���� �����ؾ���. 
		BorderLayout layout = new BorderLayout();
		// �۾�����(�г�)
		Panel p = new Panel();
		// �۾������� <BorderLayout> ���̾ƿ��� ���ڴ�.
		p.setLayout(layout);
		
		// <GridLayout> �� �����ڿ� ���� 2�� ����� (����, ����)
		GridLayout ltop = new GridLayout(1,1); // (y, x)
		GridLayout lcen = new GridLayout(4,3);
		Panel ptop = new Panel();
		Panel pcen = new Panel();
		// �۾������� <GridLayout> ���̾ƿ��� ��.
		ptop.setLayout(ltop);
		pcen.setLayout(lcen);
		
		
		Font f = new Font(Font.SANS_SERIF, Font.BOLD, 50){};
		TextField tf = new TextField();
		tf.setFont(f);
		ptop.add(tf);
		
		String[] msg = {"7","8","9","4","5","6","1","2","3","*","0","#"};
		Button[] arr = new Button[12];
		for(int i=0; i<arr.length; i++){
			arr[i] = new Button(msg[i]);
			pcen.add(arr[i]);
		}
		
		
		// <BorderLayout> �� �����̳�, ���ͳ� (�гο� add�Ҷ� �����ġ�� ��ġ���� ���� ����)
		p.add(ptop, BorderLayout.NORTH); // "���� ����"���� ���Ű�
		p.add(pcen,BorderLayout.CENTER); // "����"�ϱ� ������
		
		// â�� �۾����� �г�����!
		add(p);
		// �⺻����
		setLocation(200,200);
		setSize(300,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11();

	}

}
