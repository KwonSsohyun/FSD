package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex16 extends Frame implements ActionListener, Runnable{
	
	// �ʵ�
	Label laTime, laScore;
	JButton[] btns; // �̹��� �����Ŷ�
	Button btn1, btn2;
	int score = 0; // �����ջ� (��ư Ŭ���� ��������)
	Panel p2;
	Image img;
	int su;

	public Ex16(){
		
//		// �Ʒ����� ���ٰ����ϰ� �����ڿ� �ְ� -> �ʵ�� ��
//		Toolkit tool = Toolkit.getDefaultToolkit();
//		img = tool.createImage("up.png");
		
		
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(1,2));
		p2 = new Panel();
		p2.setLayout(new GridLayout(4,4));
		Panel p3 = new Panel();
		
		// ���
		p1.add(new Label("�δ�������(ver 0.1.0)"));
		laTime = new Label("60��");
		p1.add(laTime);
		
		// �߰� (�δ���)
		btns = new JButton[16];
		for(int i=0; i<btns.length; i++){
			btns[i] = new JButton(i+"");
			p2.add(btns[i]);
			// ��ư ��� ���ϰ� �ϱ�
			btns[i].setEnabled(false);
			// ��� ��ư �̺�Ʈ �ֱ�
			btns[i].addActionListener(this);
			
			// ��ư ��ŷ�ϱ� (�δ��� �̹��� �ֱ�)
			String img;
			// �̷��� 
			if(i<3){ // 0~3���� UP �̹��� �ֱ� (1�̸� 1�� �̹����� ����)
				img = "up.png";
				// UP�̹������׸� �̺�Ʈ ó�� �߱⶧����
				// ���ھ� ���� �ö󰣴�.
				// btns[i].addActionListener(this);
			} else{ // 4~15�� DOWN �̹��� �ֱ�
				img = "down.png";
			}
			// �̹��� ����
			btns[i].setIcon(new ImageIcon(img));
			// �̹��� �����Ѱ� ������, �����ϰ� ��� �Ѹ��Ŵ�! �� mix() �޼��� Ȯ��!
			// �׸���, run() �����忡�� 1�ʸ��� �̹����� ��� �����ϰ� ���� 
			// run() �޼��� �ȿ��� �� mix() �޼��� ȣ��!
		}
		
	

		
		btn1 = new Button("����");
		// ��ư �̺�Ʈ ��
		btn1.addActionListener(this);
		btn2 = new Button("����");
		// ��ư �̺�Ʈ ��
		btn2.addActionListener(this);
		p3.add(btn1);
		p3.add(btn2);
		
		laScore = new Label("���� : 0");
		
		// �۾����� ����
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.CENTER);
		p.add(p3,BorderLayout.EAST);
		p.add(laScore, BorderLayout.SOUTH);
		
		add(p);
		setBounds(200,200, 500+7, 400+85);
		setVisible(true);
		
		// �̹���(100x100px) �ֱ� ���ؼ� �����غ�
		System.out.println(p2.getWidth());  // 393 // >> 400 �� setBounds(400+85);
		System.out.println(p2.getHeight()); // 315 // >> 400 �� setBounds(400+85);
	}
	
	
	
	
	public void mix(){ // �̹����� �������� �ٲ��ִ� (�ͽ�) -------------------------------
		Random ran = new Random();
		
		for(int i=0; i<btns.length; i++){
			btns[i].setIcon(new ImageIcon("down.png"));
		}
		
//		// 1���� �δ��� ����
//		int su = ran.nextInt(16);
//		// �̹����� ���� �ִ´�.
//		// OS���� �����;ߵǼ� ��Ŷ��
//		// �Ʒ����� ���ٰ����ϰ� �����ڿ� �ְ� -> �ʵ�� ��
//		///  Toolkit tool = Toolkit.getDefaultToolkit();
//		///  Image img = tool.createImage("up.png");
//		btns[su].setIcon(new ImageIcon(img));
		
		su = ran.nextInt(16);
		btns[su].setIcon(new ImageIcon("up.png"));
		
		
		// ����� �ٽ� �ش޶�
		this.revalidate();
		
	} // -----------------------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		Ex16 me = new Ex16();

	}


	
	
	
	// �̺�Ʈ �� ���� ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj==btn1){ // ���۹�ư *********************************************************
			System.out.println("����");
			
			// ������ �ϸ� ��ư Ȱ��ȭ
			for(int i=0; i<btns.length; i++){
				btns[i].setEnabled(true);
			}
			Thread thr = new Thread(this);
			thr.start();
			// ���۹�ư ��� �� ������ �ϱ� (��Ȱ��ȭ)
			btn1.setEnabled(false);
			// ���ھ� ���� �ʱ�ȭ (��ưŬ���� ����)
			score = 0;
			laScore.setText("����" + score);
			
		} else if(obj==btn2){ // �����ư ***************************************************
			System.out.println("����");
			dispose();
			
		}else{ // ��ư 16�� *****************************************************************
			// ��ưŬ���ϸ� ���� �ö󰡰� ���ֱ�
			// ���⶧�� ���� + / �ƴҶ��� ���� -
			JButton btn = (JButton) obj;
			
			int select = Integer.parseInt(btn.getLabel());
			if(select == su){
				score++;
			} else {
				score -= 2;
			}
			laScore.setText("���� : " + score);
			
			
			
			// �̹��� ��ü�� ������ (ĳ����)
//			Image img = ((ImageIcon)(btn.getIcon())).getImage();
//		
//			if(img == this.img){
//				score++;
//			}else{
//				score-=2;
//			}
//			laScore.setText("���� : " + score);
			
			
			// score++;
			// laScore.setText("����" + score);
			
			
			
			
			
		}
	}


	// ������ ���� Runnable
	@Override
	public void run() {
		// System.out.println("���ο� ������ ����");
		
		
		// ī��Ʈ�ٿ��ϱ�
		int time = 10;
		for(int i=time; i>=0; i--){
			
			// �ͽ� ȣ�� 
			mix();
			
			laTime.setText(i+"��");
			try {
				// 0.5��
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// �ͽ� ȣ�� (0.5�ʸ��� �ͽ�) (���� 1000 = 1��)
			// ������� ������ ���ϰ� �Ϸ���
			mix();
			
			try {
				// 0.5��
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// ���۹�ư ��� �� ������ �ϱ� (Ȱ��ȭ)
		btn1.setEnabled(true);
		
		// �� ������ ���� ��������, 
		// �δ��� ��ư ��Ȱ��ȭ���ֱ�
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(false);
		}
		
		
		
	}

}
