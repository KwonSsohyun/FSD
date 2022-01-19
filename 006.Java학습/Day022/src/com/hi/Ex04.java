package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex04 extends Frame implements ActionListener {

	public Ex04(){
		Panel p = new Panel();
		// p.setLayout(null);
		MenuBar bar = new MenuBar();
		Menu mn = new Menu("menu");
		MenuItem mi = new MenuItem("item");
		mn.add(mi);
		bar.add(mn);
		
		mi.addActionListener(this);
		
		PopupMenu popup = new PopupMenu();
		popup.add(new MenuItem("popup1"));
		popup.add(new MenuItem("popup2"));

		
		// 액션을 가지고 있는 컴포넌트에 사용할 수 있다.
		// 버튼 눌렀을때 반응 ▶ addActionListener()
		Button btn = new Button("버튼");
		btn.addActionListener(this);
		p.add(btn);
		
		// 텍스트는 입력하고 엔터를 쳤을때 반응 ▶ addActionListener()
		TextField tf = new TextField(10);
		tf.addActionListener(this);
		p.add(tf);
		
		// 리스트는 더블클릭하거나, 선택 후 엔터쳤을때 반응 ▶ addActionListener()
		List list = new List();
		list.addActionListener(this);
		list.add("list1");
		list.add("list2");
		p.add(list);
		
		
		p.add(popup);
		add(p);
		setMenuBar(bar);
		setBounds(200,200,500,400);
		setVisible(true);
		
		// 위에 화면 사이즈가 결정되야 정해지니까.
		// 팝업을 누구에게 붙힐것이냐. (부모)
		// 쇼는 나중에
		popup.show(p, 200, 200);
	}
	
	public static void main(String[] args) {
		new Ex04();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 액션이 가능한 컴포넌트 전체 가능
		System.out.println("메뉴동작");
		
	}

}
