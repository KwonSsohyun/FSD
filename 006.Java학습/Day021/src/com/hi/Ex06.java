package com.hi;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;

public class Ex06 extends Frame{

	public Ex06(){
		// java.awt >> Class MenuItem
		// https://docs.oracle.com/javase/8/docs/api/java/awt/MenuItem.html
		
		// java.awt >> Class PopupMenu
		
		// 창 타이틀
		setTitle("메모장");
		
		PopupMenu pop = new PopupMenu("POP");
		
		// 각 세부 메뉴버튼
		Menu mn1 = new Menu();
		// 하위 메뉴들
		MenuItem mi1 = new MenuItem("item1");
		mn1.add(mi1);
		MenuItem mi2 = new MenuItem("item2");
		mn1.add(mi2);
		
		// 구분선 주기 ▶ .addSeparator()
		mn1.addSeparator();
		
		// 추가 세부 메뉴 만들기
		Menu mn3 = new Menu("하위메뉴");
		mn1.add(mn3);
		// 하위 메뉴들
		MenuItem mi4 = new MenuItem("하위item1");
		mn3.add(mi4);
		MenuItem mi5 = new MenuItem("하위item2");
		mn3.add(mi5);
		
		// 체크됨 , true주면 처음부터 체크되어있음
		// 상속관계니까 다형성 활용
		// MenuItem > 부모 | CheckboxMenuItem > 자식
		MenuItem mi3 = new CheckboxMenuItem("item3", true);
		// MenuItem mi3 = new MenuItem("item3");
		mn1.add(mi3);
		
		Menu mn2 = new Menu("Help"); // 생성자를 통해서 기입 가능
		mn1.setLabel("File");
		
		
		// 메뉴바
		MenuBar mb = new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		mb.add(pop);
		setMenuBar(mb);
		
		
		// 기본설정
		setBounds(200, 200, 600, 500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex06();

	}

}
