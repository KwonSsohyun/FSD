package com.hi;

import java.awt.Frame;

import javax.swing.JFrame;

// WindowListener�� JFrame(����������)�� ������ �̺�Ʈ�̴�. 
// �� JFrame �� ���� �̰� ���ص� �̹� �Ǿ�����.

// �ٸ�, �ܼ��� ���ƴ� ������, X��ư �Ա� ���� (������ â�� �Ⱥ��̴� ��)
// ���� �ϸ� �� �� �ְ� ����. �� setDefaultCloseOperation(2);

public class Ex08 extends JFrame{

	public Ex08(){
		// << ����� JFrame�� �����س��� >>
        //    1 �� HIDE_ON_CLOSE: ����Ʈ��(���ָ� �̰���)  setVisible(false);(�׷��� ȭ�鿡���� �Ⱥ��ΰ���)  

        //    2 �� DISPOSE_ON_CLOSE: dispose(); �� on�ϴ� �� (�� �̰ɷ� ����!!!)

        //    3 �� EXIT_ON_CLOSE: System.exit(0); �� �ý��� ���� (������ ��������� ����)
		
		//    0 �� DO_NOTHING_ON_CLOSE: �ƹ��͵� ���� (������ �ƹ������� ����) 
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// setDefaultCloseOperation(2);
		
		setBounds(200, 200, 400, 400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex08();

	}

}
