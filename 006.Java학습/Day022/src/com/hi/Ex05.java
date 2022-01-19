package com.hi;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//**********************************************************************************************************
// [ Ŭ���� ����(WindowListener ���)�ؼ� �� Ŭ���� �����ؼ� ��ӹ޾Ƽ� 
//                                        �� ���θ޼��忡�� �������̵��� ��ü�����ؼ� ���������� ���� ]
//**********************************************************************************************************
// 1. Ŭ���� �����ؼ� �������̽� WindowListener ��ӹ޴´�.
//    class Lec05 implements WindowListener {
//
//			@Override
//			public void windowOpened(WindowEvent e) {
//		
//			}
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//		
//			}
//
//			@Override
//			public void windowClosed(WindowEvent e) {
//		
//			}
//
//			@Override
//			public void windowIconified(WindowEvent e) {
//		
//			}
//
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//		
//			}
//
//			@Override
//			public void windowActivated(WindowEvent e) {
//
//			}
//
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//		
//			}
//    }
//
//
// 2. ���� Ŭ���� ����ϸ�, �θ��� �޼��� ����� �� �� �ִ�. �� �� �� "windowClosing(Ŭ��¡)" �޼��常 ���Ŵ�.
//     
//    class Lec55 extends Lec05 { 
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println("�����ư ������ �����");
// 				dispose();
//			}
//    }
//
//**********************************************************************************************************





//**********************************************************************************************************
// [ �����Ŭ����(WindowAdapter) ��� �޾Ƽ�, ���� �� �޼��常 ����.(�������̵�) 
//                               �� ���θ޼��忡�� ��ü�����ؼ� ���������� ���� ]
//**********************************************************************************************************
//    class Lec55 extends WindowAdapter { // ����ϸ� ���� ����� �� �� �ִ�. �� �� �� "windowClosing(Ŭ��¡)" �޼��常 ���Ŵ�.
//										  // �ʿ��Ѱ͸� �������̵��ؼ� ������!
//	                                      // 7���ϱ� �����ϴϱ�! (���� �޼��� �ϳ��� ���Ŷ�)
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println("�����ư ������ �����");
//				dispose();
//			}
//    }
// 
//**********************************************************************************************************

public class Ex05 extends Frame{
	//**********************************************************************************************************
	// [ ���δ�� �ִ� Ŭ������ ���� Ŭ���� ���� �� �����Ŭ����(WindowAdapter) ��� �޾Ƽ�, ���� �� �޼��常 ����.(�������̵�) 
    //	                                         �� ���θ޼��忡�� ��ü�����ؼ� ���������� ���� ]
	//**********************************************************************************************************
	// 
    //	class Lec55 extends WindowAdapter { // ����ϸ� ���� ����� �� �� �ִ�. �� �� Ŭ��¡�� ���Ŵ�.
    //		@Override
    //		public void windowClosing(WindowEvent e) {
	//          System.out.println("�����ư ������ �����");
    //			dispose();
    //		}
    //	}

	public Ex05(){
		// ��ü�����ϰ� ���������� ������ �� �Ȱ���.
		WindowAdapter adapter = new WindowAdapter(){ // ��ü ������ (��� �͸�Ŭ����)
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			public void windowClosed(WindowEvent e) {
				System.out.println("�����ϰڽ��ϴ�.");
			}
		};
		
		addWindowListener(adapter); // ���������� ����
		// addWindowListener(new Lec55());
		setBounds(200,200,400,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex05();
		
	}

}
