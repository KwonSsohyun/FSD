package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.util.Scanner;

public class Ex05 extends Frame {

	Scanner sc = new Scanner(System.in);
	
	
	public Ex05(){
		Panel p = new Panel();
		
		add(p);
		// ��ġ, ������ �� setBounds(��ġx, ��ġy, ������x, ������y);
		//                : setSize(600,500); setLocation(200,200); ��ģ��
		setBounds(200, 200, 600, 500);
		setVisible(true);
		
		sc.nextLine();
		// �����µ� �Ⱥ��δ�. -> â �ø��� ���δ�.
		// ȭ�� ����!!!! �� ����Ʈ�ؼ� ȭ���� �ٽ� �׸��� �Ѵ�.
		Button btn = new Button("���߿� �߰�");
		p.add(btn);
		
		
		// [ ȭ���� ���Ž�Ű�� ��ɾ� �� 3����! ]
		//   : �����찡 �ٽ� ����ִ°Ŵϱ�.
		// 	   1) repaint();     �� ȭ���� �ٽ� �׷���.
		//     2) validate();    �� ȭ���� üũ
		//     3) revalidate();  �� �ٽ� üũ
		
		
		// ȭ���� �ٽ� �׷���. �� "������Ʈ!"
		repaint();
		// ȭ���� üũ         �� "��������Ʈ!"
		validate();
		// �ٽ� üũ           �� "����������Ʈ!"
		revalidate();
	}
	
	public static void main(String[] args) {
		new Ex05();

	}

}
