package com.hi;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex09 extends Frame{

	public Ex09(){
		Panel p = new Panel();
		// �����ڸ� �̿��ؼ� �÷��� �����.
		// Color c = new Color(128, 128, 255);
		Color c = Color.GREEN;
		// p.setBackground(c);
		
		// ��ü�����ϰ� ��ӹ��� // �͸�Ŭ���� �Ѱ���
		Font f = new Font(Font.SERIF , Font.ITALIC , 22){}; 
		
		// ��Ʈ
		// https://docs.oracle.com/javase/8/docs/api/java/awt/Font.html
		// protected �����ڶ�°� �� �� �ִ�. ��� �׷��� ��ü ����	�Ұ�.
		// Font f = new Font();
		// static �޼��� �߿��� font�� ã���ش�.
		// Font f = Font.getFont(Font.SANS_SERIF);
		// �� Font f = Font.getFont(Font.SANS_SERIF);
		//   Font.getFont()  �� �޼���
		//   Font.SANS_SERIF �� �ʵ�
		
//		// �����ڸ� ���ؼ� ��ư���� ������ �� �� �ִ�.
//		Button btn1 = new Button("abcd");
//		// btn1.setLabel("��ư�ؽ�Ʈ");
//		// ��ü �����ؼ� ��� �Ѵ�.
//		btn1.setFont(f);
//		btn1.setBackground(c);
//		// ��ư �� ���� �ϱ�(Ȱ��ȭ/��Ȱ��ȭ) �� .setEnabled(false)
//		btn1.setEnabled(false);
//		p.add(btn1);

		
		
		
//		// �۾� ���� ������ �� Label
//		// �����ڿ� ��� �ȴ�. �� .setText() �� ������ ���̴�.
//		Label la1 = new Label("�۾�");
//		// la1.setText("�ۼ�");
//		la1.setBackground(c);
//		la1.setFont(f);
//		p.add(la1);

		
		
		
//		// ���� ���� �Է��� �� �ִ� ������ ���� �� TextField
//		TextField tf1 = new TextField("",5);
//		// ������ְ�, â������(5��� ������ 5���ڸ� ���̴� â ������) >> ����� ���� �� �ִ�.
//		// tf1.setText(" ");
//		// ��й�ȣ ������ -> ���� ���µ� �Ⱥ��̰� �ϰ� ������ �� .setEchoChar('@')
//		// >> get���� �� �޾ƺ��� ���������� �޾ƿ���
//		tf1.setEchoChar('@');
//		tf1.setBackground(c);
//		p.add(tf1);

		
		
		
//		// �������� �Է��ϰ� ������
//		// �⺻�ؽ�Ʈ � ���� ������ / 3�� / 10�� / ��ũ�ѿ���
//		TextArea ta1 = new TextArea("����Ʈ �ؽ�Ʈ" , 3, 10, TextArea.SCROLLBARS_BOTH);
//		// CROLLBARS_VERTICAL_ONLY >>  ������ũ�Ѹ� ������, ���γ����� ������ �ڵ������
//		p.add(ta1);

		
		
		
//		// .Checkbox �����ڿ� 3��° ��ü�� �־�߸� >> �� �׷�ó�� ���δ�.
//		// ���� �ߺ�üũ �ϰ� ������, .CheckboxGroup �ϸ� �ȵȴ�.
//		java.awt.CheckboxGroup chg = new CheckboxGroup();
//		// üũ�ڽ�
//		java.awt.Checkbox ckb1 = new Checkbox("�׸�1", false, chg);
//		// üũ�ڽ��� �� > �̰� Ŭ���ص� üũ�ڽ��� üũ�� �Ǵϱ�.
//		// >> ckb1.setLabel("�׸�1");
//		// ó�����ۺ��� üũ�� ��  �� .setState(true)
//		// �� �⺻���� üũ������ false
//		// >> ckb1.setState(true);
//		p.add(ckb1);
//		
//		// �����ڸ� ���ؼ� -> üũ�ڽ�üũ�ȰͰ�, ���� ���� ���� �� �ִ�.
//		java.awt.Checkbox ckb2 = new Checkbox("�׸�2", true, chg);
//		p.add(ckb2);
//		
//		java.awt.Checkbox ckb3 = new Checkbox("�׸�3",false ,chg);
//		p.add(ckb3);

		
		
		
//		// ���� (���̽�)
//		java.awt.Choice cho1 = new Choice();
//		// ����Ʈ�� ù��°�� ���õȴ�.
//		cho1.addItem("item1");
//		cho1.addItem("item2");
//		cho1.addItem("item3");
//		cho1.addItem("item4");
//		p.add(cho1);
//		
//		// ����Ʈ�� ù��°���� 2��° �����ϰ� ������? �� .select()
//		cho1.select(1);
//		cho1.select("item3");
//		// ���õ� �ε�����ȣ ��ȯ �� .getSelectedIndex()
//		System.out.println(cho1.getSelectedIndex());
//		// ���õ� ���ڿ� ��ȯ �� .getSelectedItem()
//		System.out.println(cho1.getSelectedItem());
		
		
		
		
		// ����â ����Ʈ �� �����ϰ� �ϱ� ���� List()
		// �����ڿ� 3�̶�� ������, 3������ ���̰�, ��ũ�� ���� 
		// ����Ʈ�� 4��
		// true ������ ���߼��� ��������
		List list1 = new List(3, true);
		list1.add("item1");
		list1.add("item2");
		list1.add("item3");
		list1.add("item4");
		list1.add("item5");
		p.add(list1);
		// ����Ʈ ���� 3��°�� �ϱ� �� .select(2)
		list1.select(2);
		list1.select(3);
		// ���� ������� ������ ���ڿ� ��ȯ
		System.out.println(list1.getItem(3));
		// ������ �ε��� ��ȣ ��ȯ
		System.out.println(list1.getSelectedIndex());
		System.out.println(list1.getSelectedItem());
		// �迭�� �޾ƺ���. (�ε�����ȣ)
		int[] arr1 = list1.getSelectedIndexes();
		// �迭�� �޾ƺ���. (�ش簪 ���ڿ�)
		String[] arr2 = list1.getSelectedItems();
		
		
		
		
		
		add(p);
		setLocation(200,200);
		setSize(500,500);
		setVisible(true);
		
		// ����ǥ���ٸ�ŭ �۾�������, �����ڸ� �����κ� �߷���
		// �г��� ���� �۾������� �߸��°��� �� �� �ִ�.
		System.out.println(p.getWidth() + "," + p.getHeight());
	}
	
	
	public static void main(String[] args) {
		new Ex09();

	}

}
