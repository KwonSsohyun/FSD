package com.hi;
//�����ڷ� : Day023 �� Ex15
import java.awt.BorderLayout;
import java.awt.Button;
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

public class Ex14 extends Frame implements ActionListener, Runnable{
	
	// �̺�Ʈ �߻��Ǵ°͵� �ʵ忡 ���� (�������� �� �� �ְ�)
	// ���� �δ�����ư 16��
	JButton[] dudu;
	// ���� ����,�ݱ� ��ư
	Button str, end;
	// ���� ī��Ʈ
	Label laTime;
	// ���� mix() 
	//    �� �δ��� �̹��� 1�ʸ��� �����ϰ� �Ϸ��� ���� �޼��廩����
	Panel p2;
	// ���� ����(���ھ�)
	Label score;
	int su = 0;
	
	public Ex14(){
		//*****************************************
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		//*****************************************
		
		
		// �г� ����
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(1,2));
		
		// Panel p2 = new Panel();
		p2 = new Panel();
		p2.setLayout(new GridLayout(4,4));
		
		Panel p3 = new Panel();
		
		// Ÿ��Ʋ
		p1.add(new Label("�δ������� (ver 0.1.0)"));
		laTime = new Label("10��");
		p1.add(laTime);
		
		// ���� �δ�����ư 16��
		// JButton[] dudu = new JButton[16];
		dudu = new JButton[16];
		
		for(int i=0; i<dudu.length; i++){
			dudu[i] = new JButton(""+i);
			p2.add(dudu[i]);
			// �� ��Ȱ��ȭ(false) / Ȱ��ȭ(true) ó��
			dudu[i].setEnabled(false);
			// �� �̺�Ʈ����
			// up, down �̹����� Ŭ���� ���ھ� �����ؾ��ؼ�
			dudu[i].addActionListener(this);
			
			// ���� �̹��� �ֱ�
			ImageIcon img;
			// �� �δ��� UP / DOWN �̹��� �ֱ�
			if(i<4){ // �ε��� �� 0,1,2,3
				img = new ImageIcon("up.png");
				// �̺�Ʈ �޾��ֱ�
				// ����ٰ� �̺�Ʈ �޸�, up�̹��� Ŭ���� �̺�Ʈ��
				// dudu[i].addActionListener(this);
			} else { // �ε��� �� ���� ������ ������
				img = new ImageIcon("down.png");
			}
			// �̹��� ����
			dudu[i].setIcon(img);
		}
		
		// �̰� ȣ���ؼ� ����� �� 1�ʸ��� �����Ǿ��ϴ�
		// 					    �� mix()
		// Random ran = new Random();
		//
		// for(int i=0; i<1000; i++){
		//	JButton temp = dudu[0];
		//	int su = ran.nextInt(16); // 0~15
		//	dudu[0] = dudu[su];       // 0���� ����==15 ����
		//	dudu[su] = temp;
		// }
	
		// for(int i=0; i<dudu.length; i++){
		//	p2.add(dudu[i]);
		// }
		
		
		
		// ���� ����,�ݱ� ��ư
		// Button str = new Button("����");
		str = new Button("����");
		// �� �̺�Ʈ ����
		str.addActionListener(this);
		p3.add(str);
		
		// Button end = new Button("����");
		end = new Button("����");
		// �� �̺�Ʈ ����
		end.addActionListener(this);
		p3.add(end);
		
		// ����(���ھ�)
		score = new Label();
		score.setText("���� : 0");
		
		p.add(p1, BorderLayout.NORTH);
		p.add(p2, BorderLayout.CENTER);
		p.add(p3, BorderLayout.EAST);
		p.add(score, BorderLayout.SOUTH);
		
		
		add(p);
		setBounds(200,200, 500+7, 400+85);
		setVisible(true);
		
		// �δ��� �̹��� ������ ���߷��� ��.
		// System.out.println(p2.getWidth());  // 393 + "7"  = 400
		// System.out.println(p2.getHeight()); // 315 + "85" = 400
		
	}
	
	// �δ��� �̹��� ����! ���������������������������������������������
	// �Ʒ� �����忡�� 1�ʸ��� �̹��� ���� ��Ű�� ���� �����������������
	// �ش� �޼��� ȣ���Ѵ�! �� mix()
	public void mix(){
		Random ran = new Random();
		
		for(int i=0; i<1000; i++){
			JButton temp = dudu[0];
			int su = ran.nextInt(16); // 0~15
			dudu[0] = dudu[su];       // 0���� ����==15 ����
			dudu[su] = temp;
		}
	
		for(int i=0; i<dudu.length; i++){
			p2.add(dudu[i]);
		}
		
		// revalidate (�����ϴ�)
		this.revalidate();
	}

	public static void main(String[] args) {
		// �δ�������
		new Ex14();
        
	}
	
    // implements ActionListener ����������������������������������������
	// Ŭ���̺�Ʈ �߻� ��������������������������������������������������
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj==end){ // "����" ��ư �������� ---------------------------
			dispose();
			
		} else if(obj==str){ // "����" ��ư �������� --------------------
			
			// �� �δ��� ��ư 
			for(int i=0; i<dudu.length; i++){
				// �δ�����ư(16��) Ȱ��ȭ
				dudu[i].setEnabled(true);
			}
			
			// �� ������ ����
			Thread thr = new Thread(this);
			thr.start();
			
			// �� 60�� �� ������ �������� >> ���۹�ư ��Ȱ��ȭ
			str.setEnabled(false);
			
			// �� ���� �ʱ�ȭ
			su = 0;
			score.setText("���� : 0");
			
			
		} else { // "�δ�����ư(16��)" ��ư �������� ---------------------
			
			// �� ����(���ھ�) �ű��
			JButton btn = ((JButton)obj);
			
			// getLabel() �� String Ÿ�Ը��� : Button ������Ʈ�� ǥ�õ� ���ڿ� ���ϱ�
			if(Integer.parseInt(btn.getLabel())<4){
				// ������ 0~3�� �ε����� �δ����ϱ�
				// �ش� �δ��� �°� ������ ���ھ� 1�� �߰�
				su++;
			}else{
				// �δ��� �߸������� -2�� ����
				su -= 2;
			}
			score.setText("���� : " + su);
		
		}
		
	}

	// implements Runnable �������������������������������������������������
	// ������ �߻� ���������������������������������������������������������
	@Override
	public void run() {
		
		for(int i=10; i>=0; i--){
			laTime.setText(i+"��");
			
			try {
				// �δ����̹��� �������� 1�ʸ��� ���̰� �ϱ�
				mix();
				
				// 1�� (for�� ���ϱ�, 1�ʸ��ٰ� ��) 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 60�� �ٳ����� �� ���۹�ư Ȱ��ȭ 
		str.setEnabled(true);
		
		// 60�� �ٳ����� �� �δ�����ư ��Ȱ��ȭ
		for(int i=0; i<dudu.length; i++){
			// �δ�����ư(16��) ��Ȱ��ȭ
			dudu[i].setEnabled(false);
		}
		
	}

}
