package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex13 extends JFrame implements MouseListener {

	TextField tf;
	
	public Ex13(){
		setTitle("�������������� (ver 0.2.0)");
		
		BorderLayout layout = new BorderLayout();
		Panel p = new Panel();
		p.setLayout(layout);
		
		GridLayout gup = new GridLayout(1,3);
		GridLayout gdown = new GridLayout(1,1);
		
		Panel pup = new Panel();
		Panel pdown = new Panel();

		
		
		ImageIcon scissors = new ImageIcon("scissors.png");
		
		JButton btn1 = new JButton(scissors);
		pup.add(btn1);
		btn1.addMouseListener(this);

		ImageIcon rock = new ImageIcon("rock.png");
		JButton btn2 = new JButton(rock);
		pup.add(btn2);
		btn2.addMouseListener(this);

		ImageIcon paper = new ImageIcon("paper.png");
		JButton btn3 = new JButton(paper);
		pup.add(btn3);
		btn3.addMouseListener(this);
		
	
		// ��ǻ��
		int ran = (int)(Math.random()*3)+1;
		Font font = new Font("�ü�ü", 1, 80);

		tf = new TextField("��� : ", 20);
		tf.setFont(font);
		pdown.add(tf);
		
		pup.setLayout(gup);
		pdown.setLayout(gdown);
		
		p.add(pup, BorderLayout.NORTH);
		p.add(pdown, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		add(p);
		setBounds(200,200, 900, 500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// ��������������(ver 0.2.0)
		new Ex13();
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// �����
		Object obj = e.getSource();
		JButton me = (JButton) obj;
		int su = 1;
		if(me.getLabel().equals("����")){
			su = 1;
		}else if(me.getLabel().equals("����")){
			su = 2;
		}else if(me.getLabel().equals("��")){
			su = 3;
		}

		int ran = (int)(Math.random()*3)+1;
		
		if(su == ran){
			tf.setText("��� : " + "���º� �Դϴ�.");
		}else if( su - ran == -2 || su - ran == 1 ){
			tf.setText("��� : " + "�̰� ���ϴ�.");
		}else if( su - ran == -1 || su - ran == 2 ){
			tf.setText("��� : " + "�����ϴ�.");
		}
		System.out.println(su);
		System.out.println(ran);
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
