package com.hi;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex04 extends Frame{
	
	public Ex04(){ // super()�� �̿��ؼ� "â�� ����"�Ȱ��� (��ӹ޾�����)
		
		// ��ư ��ü ����
		java.awt.Button btn1 = new Button();
		// ��ư�� �۾� �Ẹ��
		btn1.setLabel("ó�� ��ư");
		// â���ٰ� ��ư �߰�
		// add(btn1);
		
		// ���ο� ��ư�� �����ôµ�
		// "ó�� ��ư"�� �Ʒ� ����ְ�
		// "���ο� ��ư2"�� ���̴°� �� �� �ִ�. (���̾� ��ġ�� �� ó��)
		//  ���� ȭ���� �����ؼ� �� �۾������� �־�� �Ѵٴ� ���� �˼� �ִ�.
		// + ��ư ������� ������������ �°� �ڵ� ������.
		Button btn2 = new Button();
		btn2.setLabel("���ο� ��ư2");
		// add(btn2);
		
		Button btn3 = new Button();
		btn3.setLabel("���ο� ��ư3");
		
		Button btn4 = new Button();
		btn4.setLabel("���ο� ��ư4");
		
		Button btn5 = new Button();
		btn5.setLabel("���ο� ��ư5");
		
		
		///////////////////////////////////////////////////////////////////////////////
		// ��ġ������ /////////////////////////////////////////////////////////////////
		// ȭ���� ��ġ�ϴ� ���̴�.
		
		// ���� FlowLayout
		// Panel������ �̰� ���൵ -> ����Ʈ�� ������ �ִ�.
		// FlowLayout layout = new FlowLayout();
		
		// ���� FlowLayout
		// ȭ���� ���ڷ� �߶� �� �����ٰ� �ִ°��̴�.
		// ���ο� �� ������Ʈ�� �� ���� ������ ����.
		// �������� �̿��Ѵٸ� ������ø�� ����
		// ���� add�Ѿ ������, ���δ� ��Ű�µ�, ���δ� ����Ŵ
		java.awt.GridLayout layout = new GridLayout(2,2); // ���� 2ĭ, ���� 2ĭ
		
		///////////////////////////////////////////////////////////////////////////////		
		
		
		// �۾�����
		java.awt.Panel pan1 = new Panel();
		pan1.setLayout(layout);
		// �۾����� �ȿ� ��ư�� �־��ش�.
		// �г��� �ٲٴ°�. (�ϳ��� �۾������� "�г�")
		// �� add�ߴ��� �ڿ� ��������ų�
		// �� �г��� �ٲ�ġ�� �ϰų�
		// ������ķ� ȭ�鿡 ���̴°��� �� �� �ִ�.
		// add�� ������ �������� ����.
		pan1.add(btn1);
		pan1.add(btn2);
		pan1.add(btn3);
		pan1.add(btn4);
		pan1.add(btn5);
		add(pan1);
		
		// ȭ�鿡 �������� ����
		setVisible(true);
		// â ��ġ
		setLocation(200, 200);
		// â ������
		setSize(300,300);
	}

	public static void main(String[] args) {
		// ��� �޾Ƽ� �ϸ� extends Frame
		// �������� ���ؼ� ������ �ʿ䵵 ���� ���ϴ�.
		new Ex04();

	}

}
