package com.hi;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Ex07 extends Frame implements ActionListener{

	public Ex07(){
		// �ݱ��ư (�����Ŭ���� ���) ****************
		WindowAdapter apter = new WindowAdapter(){
			 public void windowClosing(WindowEvent e){
				 System.out.println("�����ϰڽ��ϴ�.");
				 dispose();
			 }
		};
		addWindowListener(apter);
		//***********************************************
		
		// ���̾ƿ� �й�
		BorderLayout blay = new BorderLayout();
		Panel p = new Panel();

		Panel pup = new Panel();
		pup.setLayout(new GridLayout(1,1));
		Panel pdown = new Panel();
		pdown.setLayout(new GridLayout(1,1));
	
		
		// ���� �޴�
		Menu mn1 = new Menu("����");
		Menu mn2 = new Menu("����");
		// ���� �޴�
		// ---- 1
		MenuItem mi1 = new MenuItem("������ ����");
		mn1.add(mi1);
		// ���м� - 1
		mn1.addSeparator();
		MenuItem mi2 = new MenuItem("����");
		mn1.add(mi2);
		// ���м� - 2
		mn1.addSeparator();
		MenuItem mi3 = new MenuItem("����");
		mn1.add(mi3);
		mi3.addActionListener(this);
		
		// ---- 2
		MenuItem mi4 = new MenuItem("����");
		mn2.add(mi4);

		
		mi4.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  JOptionPane.showConfirmDialog(null, "���� ������ ���� ��������ϴ�.", "Message", JOptionPane.ERROR_MESSAGE);
              }
          });
		
		
		// �޴���
		MenuBar mb = new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		setMenuBar(mb);
		
		
		p.add(pup, BorderLayout.NORTH);
		p.add(pdown, BorderLayout.CENTER);
		
		
		// �⺻ ����
		add(p);
		setTitle("�������");
		setBounds(200,200,1000,700);
		setVisible(true);
		
		revalidate();
	}

	public static void main(String[] args) {
		new Ex07();

	}

	// �޴� ������ Ŭ���� ����
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�����ϰڽ��ϴ�.");
		dispose();
		
	}

}
