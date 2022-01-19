package com.hi;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

//**********************************************************************************************
// << Frame >>
//    : WindowListener�� Frame(������)�� ������ �̺�Ʈ�̴�.
//      �� Ŭ��¡�� �̿��ؼ�  dispose(); �Ϸ��� �ϴ� �� �̴�.
//      �� �� addWindowListener(this); | WindowListener �ش� Ŭ������ �������̽� ��� �� �������̵�
//      �� �� "windowClosing" �� public void windowClosing(WindowEvent e) 
//      ��    			    �� dispose();
//**********************************************************************************************
// << JFrame >> 
//    : WindowListener�� JFrame(����������)�� ������ �̺�Ʈ�̴�.
//      �� JFrame �� ���� �̰� ���ص� �̹� �Ǿ�����. (�� �ܼ��� ���ư�, ������ â �Ⱥ���)
//      �� addWindowListener �̹� �̰� �������� ������ setDefaultCloseOperation(2); �ش�.
//      �� �� setDefaultCloseOperation(2); == setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//**********************************************************************************************

public class Ex07 extends Frame implements java.awt.event.WindowListener{

	public Ex07(){
		// �̺�Ʈ �ޱ�! �� addWindowListener(l);
		// �������̽��ϱ� �������̽� ��ӹް� �������̵�
		// Ex07���ٰ� ���콺��� ù��°�� Ŭ��!
		addWindowListener(this);
		
		setBounds(200, 200, 400, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex07();
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// �޼ҵ�� �Ȱ��� ���� (�׽�Ʈ)
		// System.out.println("windowOpened");
		 System.out.println("â ����");
	}


	@Override
	public void windowClosing(WindowEvent e) {
		 System.out.println("â �ݱ��ư ����");
		 // �� �������� �� .exit(0)
		 //   : �����尡 ���� �ִµ� �׳� �������°�. �� ������ �ڵ�
		 // System.exit(0);
		 
		 // �� ���� �� dispose()
		 //   : X��ư ���궧�� �����.
		 dispose();
		 //     ex) ���Ϸα׹ڽ��� ���°�. (�ٷ� ���� ���Ҷ�)
		 //         ��¥�� �����Ұų�? �ϴ� ��� �˾��޼���
		 //         �׷� �� â���� OK�� ������ �׶� dispose() �ϰ���.
	
	}


	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("dispose() �� ȣ��� ��");
		// ���α׷� ������ ������ ����ٰ� ������Ѵ�.
		// dispose�� ȣ��ɶ��� �̴ϱ�.
		// ���ᰡ �Ǿ��ϴ� ������ ����ٰ� ���� �ؾ��Ѵ�.
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("â �ּ�ȭ");
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("â �ּ�ȭ ����");
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		 System.out.println("â Ȱ��ȭ");
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		 System.out.println("â ��Ȱ��ȭ");
		
	}

}
