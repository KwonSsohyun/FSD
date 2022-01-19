package com.hi;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex03 extends Frame{

	public Ex03(){
		
		setBackground(Color.RED);
		
		// â ������ ���� (����â)
		// ���ǿ� ���� â ���� ����
		// â�� ���� -> ���������� ������ �߻�
		// ������ȿ��� ������ �߻�
		// â ������ â�� ���� �ݱ�
		// https://docs.oracle.com/javase/8/docs/api/java/awt/Dialog.html
		// java.awt >> Class Dialog
		
		
		// ���α׷��� �������̶�, ������ �����������.
		// ����â�� â ������ "���̾�α�" �ϸ� ���ӵǼ� ���� ����
		// �� �����尡 �������Ǹ�, ���� �״´�. (����)
		// FileDialog�� Dialog ��ӹ���
//		java.awt.Dialog dl = new FileDialog(this);
//		dl.setLocation(200,200);
//		dl.setSize(300,200);
//		dl.setVisible(true);
		
		
		// â�� �߰��� �ڿ� �� ������ (��Ȱ��ȭ�ϰ� �ϴ� �ɼ�) �� ,"�������", true)
//		java.awt.Dialog dl = new Dialog(this,"�������", true);
//		dl.setLocation(200,200);
//		dl.setSize(300,200);
//		dl.setVisible(true);
		
		
//		Frame f = new Frame();
//		f.setBackground(Color.BLUE);
//		f.setSize(200,200);
//		f.setLocation(200,200);
//		f.setVisible(true);
		
		setSize(600,500);
		setLocation(200,200);
		setVisible(true);
		
//		java.awt.Dialog dl = new Dialog(this,"�������", true); //
		java.awt.FileDialog dl = new FileDialog(this,"" ,FileDialog.LOAD); // ����
//		java.awt.FileDialog dl = new FileDialog(this,"" ,FileDialog.SAVE); // ����
		dl.setLocation(200,200);
		dl.setSize(300,200);
		dl.setVisible(true); //  �갡 false�Ǳ� �������� �Ʒ��� �� ������ ���� ����
		// *************** dl.setVisible(false); �Ǿ� �Ʒ��ڵ� ���� *********************
		// �̺�Ʈ ó���� setVisible(false); ���������.
		// �׷��� �ڿ� �ڵ嵵 �����.
		// ���ϰ�� ������ ���� �ִ�. (�н���� -> ���ϰ�ü ����� -> ����/���� �� ����) 
		System.out.println(dl.getDirectory() + "," + dl.getFile());
	}
	
	
	public static void main(String[] args) {
		new Ex03();

	}

}
