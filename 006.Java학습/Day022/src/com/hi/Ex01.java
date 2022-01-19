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

	// non-static끼리 접근은 가능하니
	// 생성자와 아래 ItemListener 객체끼리 논스테틱이라 접근 가능하게 하기 위해
	// 밖에 선언함.
	Choice cho;
	// "util" 은 자료구조라서 >> import java.awt.List; 이걸로 꼭 잘 선택해야함!!!
	List list;
	Checkbox cb1, cb2, cb3;
	
	public Ex01(){
		Panel p = new Panel();
		
		// ****************************************************
		// (4, true) >> 리스트 4개보여주고, 멀티선택하겠다.
		list = new List(4, true);
		list.add("List1");
		list.add("List2");
		list.add("List3");
		list.add("List4");
		list.addItemListener(this);
		// ****************************************************	
		// Choice() ▶ 무조건 선택이 되있는 상태에서 시작
		// addItem인데 add도 됨.
		cho = new Choice();
		cho.add("Choice1");
		cho.addItem("Choice2");
		cho.addItem("Choice3");
		cho.addItem("Choice4");
		// 내가 어떤것을 선택할때 반응해야 할때 (이벤트 붙히기)
		// ItemListener 인터페이스 상속받고 오버라이딩
		cho.addItemListener(this);
		// ****************************************************
		// 체크박스 그룹으로 묶기
		CheckboxGroup cbg = new CheckboxGroup();
		// 각각의 체크박스 - 3개
		cb1 = new Checkbox("Checkbox1", false, cbg); // 들어갈 내용 | 체크는 안하고 | cbg로 묶임
		cb1.addItemListener(this);
		p.add(cb1);
		
		cb2 = new Checkbox("Checkbox2", true, cbg); // 체크해도 아래 상태변화에서는 집계 안됨 (상태변화가 아니라서)
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
		
		
		// 쓰레드니까 선택할 수 있는 시간을 준다.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 선택한 인덱스 값 가져온다. (인덱스번호)
		System.out.println(cho.getSelectedIndex());
		// 어떤거 선택한 건지 가져온다.(텍스트)
		System.out.println(cho.getSelectedItem());
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("새로운 아이템 선택");
		
		// ▶ 뭘 선택했는지 알아오기
		// ▶ 선택한 인덱스 값 가져온다. (인덱스번호)
//		System.out.println(cho.getSelectedIndex());
//		// ▶ 어떤거 선택한 건지 가져온다.(텍스트)
//		System.out.println(cho.getSelectedItem());
//		
//		System.out.println(list.getSelectedIndex());
//		System.out.println(list.getSelectedItem());
		
		// ▶ 멀티셀렉트 할때는 이방법을 쓴다!
		// int[] arr1 = list.getSelectedIndexes();
		// String[] arr2 = list.getSelectedItems();
		// System.out.println(Arrays.toString(arr1));
		// System.out.println(Arrays.toString(arr2));
		
		// ▶ 체크박스 선택여부 -> "상태변화" 값 체크 (true/false)
		System.out.println("cb1 : " + cb1.getState() );
		System.out.println("cb2 : " + cb2.getState() );
		System.out.println("cb3 : " + cb3.getState() );
		
	}

}
