package com.hi;
// �����ڷ� : Day022 �� Ex08

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// â����� Frame Ŭ���� ��� | �׼��� �Ͼ���� �̺�Ʈ �� �� �ִ�, �������̽� ActionListener ��ӹ��� �� Ex13�� ���콺 ��� 1��° Ŭ��
public class Ex13 extends Frame implements ActionListener{ 
	
	@Override // �׼��� �Ͼ�� �� �̺�Ʈ �����ϴ� "ActionListener" 
	public void actionPerformed(ActionEvent e) {

		Object menu = e.getSource();

		if(menu == mi4){ // ���� �����������������������������������������
			dispose();
			
		} else if(menu == mi5){ // ����(�˾�â) ��������������������������
			// this�� Ex13�� true ������ �޾Ƽ� 
			// �˾�â�� �Ȳ��� �ڿ� �θ�â�� �� �ǵ�� �Ϸ���.
			// Dialog ��
			Dialog pop = new Dialog(this, "����â", true);
			
			// ����â�� â �ݱ�
			WindowAdapter alisten = new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					pop.dispose();
				}
			};
			pop.addWindowListener(alisten);
			
			// ���̾ƿ�
			BorderLayout bl = new BorderLayout();
			Panel p = new Panel();
			p.setLayout(bl);
			
			GridLayout gtop = new GridLayout(2,1);
			GridLayout gdown = new GridLayout(1,1);
			Panel ptop = new Panel();
			Panel pdown = new Panel();
			
			// �ؽ�Ʈ
			Label text1 = new Label("���� ������ ���� ��������ϴ�.");
			text1.setAlignment(Label.CENTER);
			ptop.add(text1);
			Label text2 = new Label("2022.01.01");
			text2.setAlignment(Label.CENTER);
			ptop.add(text2);
			
			// ��ư
			Button btn = new Button("Ȯ��");
			btn.setPreferredSize(new Dimension(45, 28));
			pdown.add(btn);
			// ��ư ������ â ������
			ActionListener action = new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					pop.dispose();
				}
			};
			btn.addActionListener(action);

			
			ptop.setLayout(gtop);
			pdown.setLayout(gdown);
						
			p.add(ptop, BorderLayout.NORTH);
			p.add(pdown, BorderLayout.CENTER);
			
			pop.add(p);
			// â �⺻ ����
			pop.setBounds(300,300,400,300);
			pop.setVisible(true);
			
		} else if(menu == mi3){ // ���� �����������������������������������������
			// ���� ����â
			FileDialog dia = new FileDialog(this, "����", FileDialog.SAVE);
			dia.setVisible(true);
			
			// ���� ��� �� ex) F:\JavaWork\Test001\
			System.out.println(dia.getDirectory());
			// ���ϸ� �� ex) text01
			System.out.println(dia.getFile());
			
			// ���� �� ��ο� �ش� ���ϸ����� �����ؾ��ϴϱ�
			File file = new File( dia.getDirectory() + dia.getFile() );
			
			// ���� �� FileOutputStream
	        try {
	        	// ���� ������ �� �����
				if(!file.exists()){ 
					file.createNewFile();
				}
				// ����(FileOutputStream) �� ���� �Ȱ�, ��� ����
				FileOutputStream save = new FileOutputStream(file);
				// ����ڰ� ���� ���ڸ� �� ����Ʈ������ ������ ���ڴ�.
				save.write(text.getText().getBytes());
				// ��� ���´�.
				save.close();
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		} else if(menu == mi2){ // ���� �����������������������������������������
			
			FileDialog die = new FileDialog(this, "����", FileDialog.LOAD);
			die.setVisible(true);
			
			File file = new File(die.getDirectory() + die.getFile());
			
			// ���� �� FileInputStream
			try {
				// ������ ������ �� ���� (�ƹ��͵� ���ϰ� �ϱ�)
				if(!file.exists()){
					return;
				}
				
				// ����ũ��(����Ʈ�� �˾ƿ��� �޼��� ���) �� .length()
				// longŸ�� �� .length() 
				// int (ĳ����) ����ȯ
				int buff = (int)file.length();
				// (������ �뷮ũ��)��ŭ ����Ʈ �迭���� ����
				byte[] buffb = new byte[buff];
				
				
				// ���� �Ȱ�, ��� ����
				FileInputStream open = new FileInputStream(file);
				// ������ ���̸�ŭ �ѹ��� �о������.
				open.read(buffb);
				
				// �޸��忡 �ش����� ���� ����
				// setText�� ��Ʈ���� ������
				// �� ��ü �����ؼ� buffb �޴´�.
				text.setText(new String(buffb));
				
				// ��� ���´�.
				open.close();
				
				// â ���� ���ϸ�� �Ȱ��� �ϱ�
				// �Ʒ� setTitle������ �󳻿�(����)���� �����.
				title = file.getName();
				setTitle(title);

				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if(menu == mi1){ // ������ ����������������������������������������
			// â ����
			setTitle(title);
			
			// �ȿ� ���� ����� 
			text.setText(" "); 
			// �տ� �ڵ忡�� ��ĭ ����� ������
			// Ŀ�� �ٽ� ������ ��ĭ ������� ��ĭ �ȶ��ɷ� �ش�.
			text.setText("");

		}
		
	}
	
	// **** �ʵ� (�����) *********************************************
	// �޴� ��ư ////////////////////////////////////////
	MenuItem mi1, mi2, mi3, mi4, mi5; 
	// mi1 - "������"
	// mi2 - "����" - 
	// mi3 - "����" - o
	// mi4 - "����" - o
	// mi5 - "����" - o
	
	// �޸��� �ؽ�Ʈ �Է¹޴� �� ////////////////////////
	TextArea text;
	
	// â ���� 
	String title;
	// 
	Panel pdown;
	// ************************************************************
	
	public Ex13(){ // ������ **************************************
		// â �ݱ� ��ư ///////////////////////////////////////////
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		
		// ���̾ƿ� ///////////////////////////////////////////////
		Panel p = new Panel();
		
		BorderLayout bblayout = new BorderLayout();
		p.setLayout(bblayout);
		
		GridLayout top = new GridLayout(1,1);
		GridLayout down = new GridLayout(1,1);
		
		Panel ptop = new Panel();
		pdown = new Panel();
		// Panel pdown = new Panel();
		
		ptop.setLayout(top);
		pdown.setLayout(down);
		
		p.add(ptop, BorderLayout.NORTH);
		p.add(pdown, BorderLayout.CENTER);
		
		 
		// �޴� ///////////////////////////////////////////////////
		MenuBar mb = new MenuBar();
		Menu mu1 = new Menu("����");
		Menu mu2 = new Menu("����");
		mb.add(mu1);
		mb.add(mu2);
		
		// �� ��ư�� �̺�Ʈ �ֱ�
		mi1 = new MenuItem("������");
		mi1.addActionListener(this);
		
		mi2 = new MenuItem("����");
		mi2.addActionListener(this);
		
		mi3 = new MenuItem("����");
		mi3.addActionListener(this);
		
		mi4 = new MenuItem("����");
		mi4.addActionListener(this);
		
		mu1.add(mi1);
		mu1.add(mi2);
		mu1.addSeparator();
		mu1.add(mi3);
		mu1.addSeparator();
		mu1.add(mi4);
		mi5 = new MenuItem("����");
		mi5.addActionListener(this);
		
		mu2.add(mi5);
		
		setMenuBar(mb);
		
		
		// �޸��� �ؽ�Ʈ �Է¹޴� �� ////////////////////////
		// TextArea tx = new TextArea();
		text = new TextArea();
		// text.setText("");
		// pdown.add(text);
		
		
		// �⺻���� ///////////////////////////////////////////
		add(text);
		title = "�������";
		setTitle(title);
		setBounds(200,200,700,500);
		setVisible(true);
	}

	public static void main(String[] args) { // ���θ޼��� ************
		// ���� �޸��� �����
		new Ex13();
		// ������ ȣ���ϰ� ��ü ����

	}



}
