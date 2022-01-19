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
		// 위치, 사이즈 ▶ setBounds(위치x, 위치y, 사이즈x, 사이즈y);
		//                : setSize(600,500); setLocation(200,200); 합친것
		setBounds(200, 200, 600, 500);
		setVisible(true);
		
		sc.nextLine();
		// 적었는데 안보인다. -> 창 늘리면 보인다.
		// 화면 갱신!!!! ▶ 페인트해서 화면을 다시 그리게 한다.
		Button btn = new Button("나중에 추가");
		p.add(btn);
		
		
		// [ 화면을 갱신시키는 명령어 → 3가지! ]
		//   : 윈도우가 다시 띄어주는거니까.
		// 	   1) repaint();     ▶ 화면을 다시 그려라.
		//     2) validate();    ▶ 화면을 체크
		//     3) revalidate();  ▶ 다시 체크
		
		
		// 화면을 다시 그려라. → "리페인트!"
		repaint();
		// 화면을 체크         → "벨리데이트!"
		validate();
		// 다시 체크           → "리벨리데이트!"
		revalidate();
	}
	
	public static void main(String[] args) {
		new Ex05();

	}

}
