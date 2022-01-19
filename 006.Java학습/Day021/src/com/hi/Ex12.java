package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ex12 extends Frame implements KeyListener{

	TextField tf;
	JLabel la;
	
	public Ex12(){
		// Ű���� �̺�Ʈ �߻� ��Ű��!
		
		Panel p = new Panel();
		// ��ġ������ �Ⱦ�
		p.setLayout(null);
		
		// TextField tf = new TextField("", 20);
//		tf = new TextField("", 20);
//		
//		Button btn = new Button("��ư");
		// ������ �������� Label ����, JLabel��
		la = new JLabel("��");
		la.setIcon(new ImageIcon("img02.jpg"));
		// ��ġ ������ �Ⱦ�
		la.setLocation(0,0);
		la.setSize(250,150);
//		// ���� ��Ŀ���� ����. �̺�Ʈ �۵� ��� �� ���ΰ�.
//		la.addKeyListener(this);
		this.addKeyListener(this);
//		
//		// addKeyListener(KeyListener l)
//		tf.addKeyListener(this);
		
		p.add(la);
//		p.add(tf);
//		p.add(btn);
		
		add(p);
		setBounds(200,200,400,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex12();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Shift, ctrl ���� �ȵ�
		// System.out.println("���� ������ �ߵ� (���� �����ϴ� ����)");
//		System.out.println("keyTyped : " + e.getKeyChar());
//		System.out.println("keyTyped : " + e.getKeyCode());
		
		// tf�� �����ϱ�
		// ������ �ۿ� (non-static)
		// ��Ÿ�� �ʴ�.
//		System.out.println("keyTyped : " + tf.getText());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// System.out.println("Ű���� Ű ������ ����");
		
		// ���۰� �����Ҷ��� ���⼭ �ϴ°� �����ϴ�. (Ű���� ����)(ex.����)
		
		// �� �������� �� ������ �� �ִ�.
		// keyCode=65 (Ű���� �� ��������) | keyChar='a' (���� �� ��������)
		// keyCode = Ű���� A�� a�� 97�� �ƴ϶� 65�� A�� ����
//		System.out.println("keyPressed : "  + e.getKeyChar());
//		System.out.println("keyPressed : "  + e.getKeyCode());
		
		// ��Ÿ�� �ʴ�.
//		System.out.println("keyPressed : " + tf.getText());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// System.out.println("Ű���� Ű ���� ����");
//		System.out.println("keyReleased : " + e.getKeyChar());
//		System.out.println("keyReleased : " + e.getKeyCode());
		
		// �Ȱ��� �ٷιٷ� ���� �� �� �ִ�. (������Ʈ����)
//		System.out.println("keyReleased : " + tf.getText());
		
		// �ؽ�Ʈ�ʵ� ��ü�� �����°� �� �� �ִ�.
		// �ϳ��� �̺�Ʈ���� ���� ���ϴ� Ÿ���� ĳ�����ؼ� �� �����´�.
//		Object obj = e.getSource();
		// TextField tf2 = (TextField) obj;
		// System.out.println(tf2.getText());
//		Button tf2 = (Button) obj;
//		System.out.println(tf2.getLabel());
		
		// �̺�Ʈ �ߵ��ϸ� �̵��Ѵ�. (Ű���� �ƹ��ų� ������)
		// la.setLocation(100,100);
		//System.out.println(e.getExtendedKeyCode());
		
		
		// �̷��� �����̴°� ������ ������
		// ��ġ�����ڸ� �ȽἭ �����Ѱ���
		int x = la.getLocation().x ;
		int y = la.getLocation().y ;
		
		if(e.getExtendedKeyCode() == 39){
			// Dimension(����,���� �������°�) 
			la.setLocation(x+ 10,y);
		}else if(e.getExtendedKeyCode() == 37){
			la.setLocation(x-10,y);
		}else if(e.getExtendedKeyCode() == 38){
			la.setLocation(x,y-10);
		}else if(e.getExtendedKeyCode() == 40){
			la.setLocation(x,y+10);
		}
		
		
		
		
	}

}
