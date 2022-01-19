package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 extends Frame implements ActionListener{

	MenuItem mi1, mi2, mi3, mi4, mi5 ;
	TextArea ta;
	String title = "�������";
	
	public Ex08(){
		
		// �ݱ��ư
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		
		setTitle(title);
		MenuBar bar = new MenuBar();
		Menu mn1 = new Menu("����");
		Menu mn2 = new Menu("����");
		
		mi1 = new MenuItem("������");
		mi1.addActionListener(this);
		
		mi2 = new MenuItem("����");
		mi2.addActionListener(this);
		
		mi3 = new MenuItem("����");
		mi3.addActionListener(this);
		
		mi4 = new MenuItem("����");
		mi4.addActionListener(this);
		
		mi5 = new MenuItem("����");
		mi5.addActionListener(this);
		
		mn1.add(mi1);
		mn1.add(mi2);
		mn1.addSeparator();
		mn1.add(mi3);
		mn1.addSeparator();
		mn1.add(mi4);
		mn2.add(mi5);
		
		
		bar.add(mn1);
		bar.add(mn2);
		
		ta = new TextArea();
		
		
		setMenuBar(bar);
		add(ta);
		setBounds(200,200,500,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex08();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if(obj == mi5){ // "����" �϶��� �����ǰ�!
			Dialog dia = new Dialog(this, "����", true); // true ��â�� �������� �� (����)
			Panel p = new Panel();
			Panel p2 = new Panel();
			p2.setLayout(new GridLayout(2,1));
			// p2.add(new Label("���� ������ ���� ��������ϴ�."), BorderLayout.CENTER);
			p2.add(new Label("���� ������ ���� ��������ϴ�."));
			Label la2 = new Label("2021.12.31");
			la2.setAlignment(Label.CENTER);
			
			p2.add(la2);
			p.setLayout(new BorderLayout());
			p.add(p2, BorderLayout.CENTER);
			Button btn = new Button("Ȯ��");
			
			
			btn.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					dia.dispose();
					
				}
			});
			
			p.add(btn, BorderLayout.SOUTH);
			
			dia.add(p);
			dia.setBounds(200,200,300,200);
			dia.setVisible(true);
			
		}else if(obj == mi1){
			// ������
			this.setTitle(title);
			ta.setText(" ");ta.setText(""); // �������� �� �־��ش�.

			
		}else if(obj == mi4){
			dispose();
		}else if(obj == mi3){
			// ��������â
			FileDialog dia = new FileDialog(this,"����",FileDialog.SAVE);
			dia.setVisible(true);
			// ���丮, ���ϸ� ��θ� �����´�. �� �̸� �̿��ؼ� ������ �����.
			// System.out.println(dia.getDirectory() + dia.getFile());
			
			File file = new File(dia.getDirectory() + dia.getFile());
			try {
				// ���� ������ �� �����
				if(!file.exists()){
					file.createNewFile();
				} 
				
				// ���� �Ȱ�, ��� ����
				FileOutputStream fos = new FileOutputStream(file);
				
				// ������ ���ڴ�. (����ڰ� ���� ���ڸ� �� ����Ʈ ������ ���ڴ�.)
				fos.write(ta.getText().getBytes());
				
				// ��� ���´�.
				fos.close();
				
				// ������ �̸��� ���ͼ�, 
				title = (file.getName());
				// â�� ���� �ٲ��ش�.
				setTitle(title);
				
			}catch (IOException e1) {
					e1.printStackTrace();
			}
			
			
		}else if(obj == mi2){
			// ���� ���� �б�
			// �����б�
			FileDialog dia = new FileDialog(this,"����",FileDialog.LOAD);
			dia.setVisible(true);
			File file = new File(dia.getDirectory() + dia.getFile());
			
			// return �� ������ 
			// public void actionPerformed(ActionEvent e) { //// } -> 90������ �ش��ϴ� ��ü�޼��带 ����������
			// ȣ���Ѱ����� ���µ�
			// �������̱� ������ ���� ����â�� �߰� �ȴ�.
			if(!file.exists()){return;} // ������ ������ �ƹ��͵� ���ϰ� �ϱ�. (�����ؼ� ����)
			
			// �׸�ŭ �迭�� ���̸� ����
			// 13����Ʈ -> [13]
			byte[] buf = new byte[(int)file.length()];
			
			try {
				// ���� �Ȱ�, ��� ����
				FileInputStream fis = new FileInputStream(file);
				
				// ������ �����ŭ ���� �����
				// �ѹ��� �о���϶�� ���� �����.
				// ������ ���̸�ŭ �ѹ��� �о������.
				fis.read(buf);
				// ������ ���� ������ �������� ������, "�ؽ�Ʈ �ʱ�ȭ ��Ų��."
				ta.setText("�ʱ�ȭ");
				ta.setText("");
				// ��ü ���� �����ؼ� �ش� ���� �о���� �´�.
				// ���ڿ��� ����� ��ü�� �������.
				ta.setText(new String(buf)); // �����ڿ��ٰ� ����Ʈ�迭�� 
				// ��� ���´�.
				fis.close();
				
				// ������ �̸��� ���ͼ�, 
				title = (file.getName());
				// â�� ���� �ٲ��ش�.
				setTitle(title);
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
			
		
	}

}
