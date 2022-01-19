package com.hi;

import javax.swing.JFrame;

public class Ex03 extends JFrame{
	
	
	// 생성자에 스윙!
	public Ex03(){
		// 창이 보일지말지 정해줘야한다. (제어한다.)
		// 스윙에서는 ▶▶ setVisible(true);!!!
		// 디폴트로 붙혀놓은 기능이 -> X버튼 눌렀을때 화면에서 안보이게 해준다.
		// 단 콘솔창은 계속 돌아가는것을 볼수 있다. (왜냐? 종료가 아니라 안보이게 하는거니까)
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		// 상속 받아서 하면 extends JFrame
		// 참조변수 통해서 접근할 필요도 없이 편리하다.
		// 객체 생성하면서 생성자 호출
		new Ex03();

	}

}
