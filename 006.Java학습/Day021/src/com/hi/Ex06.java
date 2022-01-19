package com.hi;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;

public class Ex06 extends Frame{

	public Ex06(){
		// java.awt >> Class MenuItem
		// https://docs.oracle.com/javase/8/docs/api/java/awt/MenuItem.html
		
		// java.awt >> Class PopupMenu
		
		// â Ÿ��Ʋ
		setTitle("�޸���");
		
		PopupMenu pop = new PopupMenu("POP");
		
		// �� ���� �޴���ư
		Menu mn1 = new Menu();
		// ���� �޴���
		MenuItem mi1 = new MenuItem("item1");
		mn1.add(mi1);
		MenuItem mi2 = new MenuItem("item2");
		mn1.add(mi2);
		
		// ���м� �ֱ� �� .addSeparator()
		mn1.addSeparator();
		
		// �߰� ���� �޴� �����
		Menu mn3 = new Menu("�����޴�");
		mn1.add(mn3);
		// ���� �޴���
		MenuItem mi4 = new MenuItem("����item1");
		mn3.add(mi4);
		MenuItem mi5 = new MenuItem("����item2");
		mn3.add(mi5);
		
		// üũ�� , true�ָ� ó������ üũ�Ǿ�����
		// ��Ӱ���ϱ� ������ Ȱ��
		// MenuItem > �θ� | CheckboxMenuItem > �ڽ�
		MenuItem mi3 = new CheckboxMenuItem("item3", true);
		// MenuItem mi3 = new MenuItem("item3");
		mn1.add(mi3);
		
		Menu mn2 = new Menu("Help"); // �����ڸ� ���ؼ� ���� ����
		mn1.setLabel("File");
		
		
		// �޴���
		MenuBar mb = new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		mb.add(pop);
		setMenuBar(mb);
		
		
		// �⺻����
		setBounds(200, 200, 600, 500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex06();

	}

}
