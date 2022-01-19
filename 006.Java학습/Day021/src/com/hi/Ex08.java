package com.hi;

import java.awt.Frame;

import javax.swing.JFrame;

// WindowListener은 JFrame(제이프레임)에 붙히는 이벤트이다. 
// └ JFrame 은 굳이 이거 안해도 이미 되어있음.

// 다만, 콘솔은 돌아는 가지만, X버튼 먹긴 먹음 (눈에만 창이 안보이는 것)
// 선언만 하면 될 수 있게 해줌. ▶ setDefaultCloseOperation(2);

public class Ex08 extends JFrame{

	public Ex08(){
		// << 상수는 JFrame에 선언해놓음 >>
        //    1 ▶ HIDE_ON_CLOSE: 디폴트값(안주면 이거임)  setVisible(false);(그래서 화면에서만 안보인것임)  

        //    2 ▶ DISPOSE_ON_CLOSE: dispose(); → on하는 것 (★ 이걸로 하자!!!)

        //    3 ▶ EXIT_ON_CLOSE: System.exit(0); → 시스템 종료 (쓰래드 강제종료라 비추)
		
		//    0 ▶ DO_NOTHING_ON_CLOSE: 아무것도 안함 (눌러도 아무반응이 없음) 
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// setDefaultCloseOperation(2);
		
		setBounds(200, 200, 400, 400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex08();

	}

}
