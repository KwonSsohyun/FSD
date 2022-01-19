package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Ex02 extends Frame{

	public Ex02(){
		// �г��� �۾������� ����,���� �� ����.
		// �ڡڡ� �׷���, �г��� ���� �۾��ϴ� ���� ȿ��!
		
		Panel p = new Panel();
		// ��ġ������ ���ָ�, ���������� �� ��ġ�� �ִ�.(�����ġ)
		// â ����� �����϶� �����ϴ� ���� ȿ����
		// ����� �����ϰ�, ��ġ�� ���� ������ �� ������ ���ϱ� ��
		// ��ġ�����ڸ� �Ⱦ��ڴ�.(�����ġ�� �ϰڴ�.) �� .setLayout(null);
		p.setLayout(null);
		// setLayout(null); �� �гξ��ָ�, �������� �� ��ƸԴ°��� �˼��ִ�.
		
		
		
		// JButton ���� �ٲٸ� �̹��� ���� �� �ִ�.
		// https://docs.oracle.com/javase/8/docs/api/javax/swing/JButton.html
		// javax.swing >> Class JButton
		// javax.swing >> Class AbstractButton -> �θ𿡼� ã��
		JLabel btn = new JLabel("��"); // ��ư�� �ƴ϶� �󺧿� �̹��� ������ �� �� �ִ�.
//		JButton btn = new JButton("��ư");
		Toolkit tool = Toolkit.getDefaultToolkit();
		java.awt.Image image = tool.createImage("img01.jpg");
		// java.awt.Image image = null;
		javax.swing.Icon icon = new javax.swing.ImageIcon(image);
		// �̹����������� �� .setIcon()
		btn.setIcon(icon);
		
		// ��ġ�����ڸ� �Ⱦ���, ���� �����ϰڴ�.
		// �� .setLocation() | .setSize()
		btn.setLocation(100,100);  // ��ư ��ġ
		btn.setSize(200, 200); // ��ư ������
		p.add(btn);
		// add(btn); �� �гξ��ָ�, �������� �� ��ƸԴ°��� �˼��ִ�.
		
		add(p);
		setSize(500,400);
		setLocation(100, 100);
		setVisible(true);
		// â ������ ����ڰ� ���� ���ϰ� �ϱ�(����) �� setResizable(false)
		setResizable(false);
	}
	
	
	public static void main(String[] args) {
		new Ex02();

	}

}
