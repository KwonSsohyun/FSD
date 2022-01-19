package com.hi;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex09 extends Frame implements ActionListener{

	public Ex09(){
		
		MenuBar mb = new MenuBar();
		Menu mn = new Menu("메뉴");
		// 하위메뉴 만들기
		MenuItem mi = new MenuItem("실행");
		mn.add(mi);
		
		// 하위메뉴에 이벤트 달기
		// → 인터페이스 ActionListener 상속 받기
		// → Ex09 마우스 대고 첫번째 클릭!
		mi.addActionListener(this);
		// 여기서 this는 밑에 만약 Ex09 me = new Ex09();라고
		// 메인 메서드에 적었다면, 
		// me를 뜻함.
		// Ex09객체를 뜻한다.
		// ▶ .addActionListener(ActionListener l) 마우스를 저기에 대보면
		//    이렇게 나오는데 → (ActionListener l) 타입을 쓸 수 있다.
		//    그래서 Ex09에 ActionListener 인터페이스 상속받아서 해당을 쓸수 있게 해서 사용하게 한다.
		//    그러니 ActionListener 상속 받았으니 Ex09객체인 "this" 써서 
		//    이벤트를 사용할 수 있게 한다.
		
		mb.add(mn);
		
		setMenuBar(mb);
		
		setBounds(200,200,400,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex09();
		// Ex09 me = new Ex09();
		// me는 객체인데 필드랑 메서드를 뜻하는데
		// 위에는 필드랑 메서드는 없다.
		// me 는 Ex09객체를 뜻한다.

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("이벤트 발생");
		// 이벤트 발생했을때 시스템 종료하고 싶으면
		dispose();
		
	}

}
