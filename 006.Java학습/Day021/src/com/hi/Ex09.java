package com.hi;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex09 extends Frame implements ActionListener{

	public Ex09(){
		
		MenuBar mb = new MenuBar();
		Menu mn = new Menu("�޴�");
		// �����޴� �����
		MenuItem mi = new MenuItem("����");
		mn.add(mi);
		
		// �����޴��� �̺�Ʈ �ޱ�
		// �� �������̽� ActionListener ��� �ޱ�
		// �� Ex09 ���콺 ��� ù��° Ŭ��!
		mi.addActionListener(this);
		// ���⼭ this�� �ؿ� ���� Ex09 me = new Ex09();���
		// ���� �޼��忡 �����ٸ�, 
		// me�� ����.
		// Ex09��ü�� ���Ѵ�.
		// �� .addActionListener(ActionListener l) ���콺�� ���⿡ �뺸��
		//    �̷��� �����µ� �� (ActionListener l) Ÿ���� �� �� �ִ�.
		//    �׷��� Ex09�� ActionListener �������̽� ��ӹ޾Ƽ� �ش��� ���� �ְ� �ؼ� ����ϰ� �Ѵ�.
		//    �׷��� ActionListener ��� �޾����� Ex09��ü�� "this" �Ἥ 
		//    �̺�Ʈ�� ����� �� �ְ� �Ѵ�.
		
		mb.add(mn);
		
		setMenuBar(mb);
		
		setBounds(200,200,400,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex09();
		// Ex09 me = new Ex09();
		// me�� ��ü�ε� �ʵ�� �޼��带 ���ϴµ�
		// ������ �ʵ�� �޼���� ����.
		// me �� Ex09��ü�� ���Ѵ�.

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�̺�Ʈ �߻�");
		// �̺�Ʈ �߻������� �ý��� �����ϰ� ������
		dispose();
		
	}

}
