package com.hi;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Ex07 extends Frame implements ActionListener{

	public Ex07(){
		// 닫기버튼 (어댑터클래스 사용) ****************
		WindowAdapter apter = new WindowAdapter(){
			 public void windowClosing(WindowEvent e){
				 System.out.println("종료하겠습니다.");
				 dispose();
			 }
		};
		addWindowListener(apter);
		//***********************************************
		
		// 레이아웃 분배
		BorderLayout blay = new BorderLayout();
		Panel p = new Panel();

		Panel pup = new Panel();
		pup.setLayout(new GridLayout(1,1));
		Panel pdown = new Panel();
		pdown.setLayout(new GridLayout(1,1));
	
		
		// 상위 메뉴
		Menu mn1 = new Menu("파일");
		Menu mn2 = new Menu("도움말");
		// 하위 메뉴
		// ---- 1
		MenuItem mi1 = new MenuItem("새파일 열기");
		mn1.add(mi1);
		// 구분선 - 1
		mn1.addSeparator();
		MenuItem mi2 = new MenuItem("저장");
		mn1.add(mi2);
		// 구분선 - 2
		mn1.addSeparator();
		MenuItem mi3 = new MenuItem("종료");
		mn1.add(mi3);
		mi3.addActionListener(this);
		
		// ---- 2
		MenuItem mi4 = new MenuItem("정보");
		mn2.add(mi4);

		
		mi4.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  JOptionPane.showConfirmDialog(null, "내가 수업을 위해 만들었습니다.", "Message", JOptionPane.ERROR_MESSAGE);
              }
          });
		
		
		// 메뉴바
		MenuBar mb = new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		setMenuBar(mb);
		
		
		p.add(pup, BorderLayout.NORTH);
		p.add(pdown, BorderLayout.CENTER);
		
		
		// 기본 설정
		add(p);
		setTitle("제목없음");
		setBounds(200,200,1000,700);
		setVisible(true);
		
		revalidate();
	}

	public static void main(String[] args) {
		new Ex07();

	}

	// 메뉴 아이템 클릭시 종료
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("종료하겠습니다.");
		dispose();
		
	}

}
