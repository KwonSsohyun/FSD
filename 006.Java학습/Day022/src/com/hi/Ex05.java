package com.hi;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//**********************************************************************************************************
// [ 클래스 생성(WindowListener 상속)해서 → 클래스 생성해서 상속받아서 
//                                        → 메인메서드에서 오버라이딩한 객체생성해서 참조변수로 접근 ]
//**********************************************************************************************************
// 1. 클래스 생성해서 인터페이스 WindowListener 상속받는다.
//    class Lec05 implements WindowListener {
//
//			@Override
//			public void windowOpened(WindowEvent e) {
//		
//			}
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//		
//			}
//
//			@Override
//			public void windowClosed(WindowEvent e) {
//		
//			}
//
//			@Override
//			public void windowIconified(WindowEvent e) {
//		
//			}
//
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//		
//			}
//
//			@Override
//			public void windowActivated(WindowEvent e) {
//
//			}
//
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//		
//			}
//    }
//
//
// 2. 위에 클래스 상속하면, 부모의 메서드 기능을 쓸 수 있다. → 그 중 "windowClosing(클로징)" 메서드만 쓸거다.
//     
//    class Lec55 extends Lec05 { 
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println("종료버튼 누르면 종료됨");
// 				dispose();
//			}
//    }
//
//**********************************************************************************************************





//**********************************************************************************************************
// [ 어댑터클래스(WindowAdapter) 상속 받아서, 내가 쓸 메서드만 쓴다.(오버라이딩) 
//                               → 메인메서드에서 객체생성해서 참조변수로 접근 ]
//**********************************************************************************************************
//    class Lec55 extends WindowAdapter { // 상속하면 위에 기능을 쓸 수 있다. → 그 중 "windowClosing(클로징)" 메서드만 쓸거다.
//										  // 필요한것만 오버라이딩해서 쓰려고!
//	                                      // 7개니까 불편하니까! (그중 메서드 하나만 쓸거라서)
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println("종료버튼 누르면 종료됨");
//				dispose();
//			}
//    }
// 
//**********************************************************************************************************

public class Ex05 extends Frame{
	//**********************************************************************************************************
	// [ 메인담고 있는 클래스안 내부 클래스 생성 → 어댑터클래스(WindowAdapter) 상속 받아서, 내가 쓸 메서드만 쓴다.(오버라이딩) 
    //	                                         → 메인메서드에서 객체생성해서 참조변수로 접근 ]
	//**********************************************************************************************************
	// 
    //	class Lec55 extends WindowAdapter { // 상속하면 위에 기능을 쓸 수 있다. 그 중 클로징만 쓸거다.
    //		@Override
    //		public void windowClosing(WindowEvent e) {
	//          System.out.println("종료버튼 누르면 종료됨");
    //			dispose();
    //		}
    //	}

	public Ex05(){
		// 객체생성하고 참조변수로 접근은 다 똑같다.
		WindowAdapter adapter = new WindowAdapter(){ // 객체 생성함 (대신 익명클래스)
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			public void windowClosed(WindowEvent e) {
				System.out.println("종료하겠습니다.");
			}
		};
		
		addWindowListener(adapter); // 참조변수로 접근
		// addWindowListener(new Lec55());
		setBounds(200,200,400,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex05();
		
	}

}
