package com.hi;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

public class Ex01 extends Frame implements ItemListener{

	// non-static���� ������ �����ϴ�
	// �����ڿ� �Ʒ� ItemListener ��ü���� ����ƽ�̶� ���� �����ϰ� �ϱ� ����
	// �ۿ� ������.
	Choice cho;
	// "util" �� �ڷᱸ���� >> import java.awt.List; �̰ɷ� �� �� �����ؾ���!!!
	List list;
	Checkbox cb1, cb2, cb3;
	
	public Ex01(){
		Panel p = new Panel();
		
		// ****************************************************
		// (4, true) >> ����Ʈ 4�������ְ�, ��Ƽ�����ϰڴ�.
		list = new List(4, true);
		list.add("List1");
		list.add("List2");
		list.add("List3");
		list.add("List4");
		list.addItemListener(this);
		// ****************************************************	
		// Choice() �� ������ ������ ���ִ� ���¿��� ����
		// addItem�ε� add�� ��.
		cho = new Choice();
		cho.add("Choice1");
		cho.addItem("Choice2");
		cho.addItem("Choice3");
		cho.addItem("Choice4");
		// ���� ����� �����Ҷ� �����ؾ� �Ҷ� (�̺�Ʈ ������)
		// ItemListener �������̽� ��ӹް� �������̵�
		cho.addItemListener(this);
		// ****************************************************
		// üũ�ڽ� �׷����� ����
		CheckboxGroup cbg = new CheckboxGroup();
		// ������ üũ�ڽ� - 3��
		cb1 = new Checkbox("Checkbox1", false, cbg); // �� ���� | üũ�� ���ϰ� | cbg�� ����
		cb1.addItemListener(this);
		p.add(cb1);
		
		cb2 = new Checkbox("Checkbox2", true, cbg); // üũ�ص� �Ʒ� ���º�ȭ������ ���� �ȵ� (���º�ȭ�� �ƴ϶�)
		cb2.addItemListener(this);
		p.add(cb2);
		
		cb3 = new Checkbox("Checkbox3", false, cbg);
		cb3.addItemListener(this);
		p.add(cb3);
		// ****************************************************
		
		
		p.add(cho);
		p.add(list);
		add(p);
		setBounds(200,200,500,400);
		setVisible(true);
		
		
		// ������ϱ� ������ �� �ִ� �ð��� �ش�.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// ������ �ε��� �� �����´�. (�ε�����ȣ)
		System.out.println(cho.getSelectedIndex());
		// ��� ������ ���� �����´�.(�ؽ�Ʈ)
		System.out.println(cho.getSelectedItem());
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("���ο� ������ ����");
		
		// �� �� �����ߴ��� �˾ƿ���
		// �� ������ �ε��� �� �����´�. (�ε�����ȣ)
//		System.out.println(cho.getSelectedIndex());
//		// �� ��� ������ ���� �����´�.(�ؽ�Ʈ)
//		System.out.println(cho.getSelectedItem());
//		
//		System.out.println(list.getSelectedIndex());
//		System.out.println(list.getSelectedItem());
		
		// �� ��Ƽ����Ʈ �Ҷ��� �̹���� ����!
		// int[] arr1 = list.getSelectedIndexes();
		// String[] arr2 = list.getSelectedItems();
		// System.out.println(Arrays.toString(arr1));
		// System.out.println(Arrays.toString(arr2));
		
		// �� üũ�ڽ� ���ÿ��� -> "���º�ȭ" �� üũ (true/false)
		System.out.println("cb1 : " + cb1.getState() );
		System.out.println("cb2 : " + cb2.getState() );
		System.out.println("cb3 : " + cb3.getState() );
		
	}

}
