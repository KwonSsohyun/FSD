package com.hi;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex06 extends Frame implements ActionListener{
	
	// �̹��� �����ſ��� JButton
	JButton btn1, btn2, btn3;
	// �����Ҽ� �ְ� �ʵ忡 ����
	Label result;

	public Ex06(){
		// *******************************************************************
		// �����ư - �͸��Լ� Ȱ�� (WindowAdapter �� ����� Ŭ���� Ȱ��)
		WindowAdapter win = new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		};
		// �����ư
		addWindowListener(win);
		// *******************************************************************
		
		
		Panel p1 = new Panel();
		p1.setLayout(new BorderLayout());
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		
		p4.setLayout(new GridLayout(1,3));
		
		p2.add(new Label("����, ����, �� ���� (ver 0.2.0"));
		result = new Label("��� : ");
		p3.add(result);
		
		btn1 = new JButton("����");
		btn2 = new JButton("����");
		btn3 = new JButton("��");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		btn1.setIcon(new ImageIcon("thumb_1.png"));
		btn2.setIcon(new ImageIcon("thumb_2.png"));
		btn3.setIcon(new ImageIcon("thumb_3.png"));
		
		p4.add(btn1);
		p4.add(btn2);
		p4.add(btn3);
		
		p1.add(p2, BorderLayout.NORTH);
		p1.add(p3, BorderLayout.SOUTH);
		p1.add(p4, BorderLayout.CENTER);
		add(p1);
		setBounds(200,200,600,300);
		setVisible(true);
		
		// �ش����� �°� �̹��� �ڸ����� üũ�� �� 194px Ȯ��
		// System.out.println(btn1.getSize().width);
	}
	
	
	public static void main(String[] args) {
		new Ex06();
	}


	// ��ư�� �̺�Ʈ �ޱ�
	@Override
	public void actionPerformed(ActionEvent e) {
		// ��ư Ŭ���Ҷ����� �� ���.
		// System.out.println("����");
		
		// e.getSource() �� �̺�Ʈ�� �Ͼ ��ü
		Object obj = e.getSource();
		// System.out.println(((JButton)obj).getText()); �� ���� ��ư�� �ؽ�Ʈ �� ������
		
		// ��ǻ�� ����
		Random ran = new Random();
		// ����0 , ����1, ��2
		int com = ran.nextInt(3);
		
		// ����ڰ� ���� ��ü�� / bt1(����)�� ����? �� ���۷��� �� (true/false��ȯ)
		if(obj == btn1){
			// System.out.println("������ �̺�Ʈ");
			if(com==0){
				// ���
				result.setText("��� : ���");
			}else if(com==1){
				// ����
				result.setText("��� : ����");
			}else if(com==2){
				// �̱�
				result.setText("��� : �̱�");
			}
			
		}else if(obj == btn2){
			// System.out.println("������ �̺�Ʈ");
			if(com==0){
				// �̱�
				result.setText("��� : �̱�");
			}else if(com==1){
				// ���
				result.setText("��� : ���");
			}else if(com==2){
				// ����
				result.setText("��� : ����");
			}
			
		}else if(obj == btn3){
			// System.out.println("���� �̺�Ʈ");
			if(com==0){
				// ����
				result.setText("��� : ����");
			}else if(com==1){
				// �̱�
				result.setText("��� : �̱�");
			}else if(com==2){
				// ���
				result.setText("��� : ���");
			}
		}
		
		
		// ȭ�� ������ ���� ���Ѽ� ���� �� ���̰� ���ֱ�
		this.revalidate();
		
	
	}

}
