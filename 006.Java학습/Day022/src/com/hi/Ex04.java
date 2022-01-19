package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex04 extends Frame implements ActionListener {

	public Ex04(){
		Panel p = new Panel();
		// p.setLayout(null);
		MenuBar bar = new MenuBar();
		Menu mn = new Menu("menu");
		MenuItem mi = new MenuItem("item");
		mn.add(mi);
		bar.add(mn);
		
		mi.addActionListener(this);
		
		PopupMenu popup = new PopupMenu();
		popup.add(new MenuItem("popup1"));
		popup.add(new MenuItem("popup2"));

		
		// �׼��� ������ �ִ� ������Ʈ�� ����� �� �ִ�.
		// ��ư �������� ���� �� addActionListener()
		Button btn = new Button("��ư");
		btn.addActionListener(this);
		p.add(btn);
		
		// �ؽ�Ʈ�� �Է��ϰ� ���͸� ������ ���� �� addActionListener()
		TextField tf = new TextField(10);
		tf.addActionListener(this);
		p.add(tf);
		
		// ����Ʈ�� ����Ŭ���ϰų�, ���� �� ���������� ���� �� addActionListener()
		List list = new List();
		list.addActionListener(this);
		list.add("list1");
		list.add("list2");
		p.add(list);
		
		
		p.add(popup);
		add(p);
		setMenuBar(bar);
		setBounds(200,200,500,400);
		setVisible(true);
		
		// ���� ȭ�� ����� �����Ǿ� �������ϱ�.
		// �˾��� �������� �������̳�. (�θ�)
		// ��� ���߿�
		popup.show(p, 200, 200);
	}
	
	public static void main(String[] args) {
		new Ex04();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// �׼��� ������ ������Ʈ ��ü ����
		System.out.println("�޴�����");
		
	}

}
