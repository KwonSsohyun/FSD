package com.hi;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

//**********************************************************************************************
// << Frame >>
//    : WindowListener은 Frame(프레임)에 붙히는 이벤트이다.
//      └ 클로징을 이용해서  dispose(); 하려고 하는 것 이다.
//      └ ▶ addWindowListener(this); | WindowListener 해당 클래스에 인터페이스 상속 → 오버라이딩
//      └ ▶ "windowClosing" → public void windowClosing(WindowEvent e) 
//      └    			    → dispose();
//**********************************************************************************************
// << JFrame >> 
//    : WindowListener은 JFrame(제이프레임)에 붙히는 이벤트이다.
//      └ JFrame 은 굳이 이거 안해도 이미 되어있음. (단 콘솔은 돌아감, 눈에만 창 안보임)
//      └ addWindowListener 이미 이게 만들어놨기 때문에 setDefaultCloseOperation(2); 준다.
//      └ ▶ setDefaultCloseOperation(2); == setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//**********************************************************************************************

public class Ex07 extends Frame implements java.awt.event.WindowListener{

	public Ex07(){
		// 이벤트 달기! ▶ addWindowListener(l);
		// 인터페이스니까 인터페이스 상속받고 오버라이딩
		// Ex07에다가 마우스대고 첫번째거 클릭!
		addWindowListener(this);
		
		setBounds(200, 200, 400, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex07();
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// 메소드명 똑같이 찍어보기 (테스트)
		// System.out.println("windowOpened");
		 System.out.println("창 열림");
	}


	@Override
	public void windowClosing(WindowEvent e) {
		 System.out.println("창 닫기버튼 누름");
		 // ▶ 강제종료 → .exit(0)
		 //   : 쓰레드가 돌고 있는데 그냥 꺼버리는것. → 안좋은 코드
		 // System.exit(0);
		 
		 // ▶ 종료 → dispose()
		 //   : X버튼 누룰때만 종료됨.
		 dispose();
		 //     ex) 다일로그박스를 띄우는것. (바로 종료 안할때)
		 //         진짜로 종료할거냐? 하는 경고 팝업메세지
		 //         그럼 그 창에서 OK를 누르면 그때 dispose() 하게함.
	
	}


	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("dispose() 가 호출될 때");
		// 프로그램 마무리 시점은 여기다가 적어야한다.
		// dispose가 호출될때만 이니까.
		// 종료가 되야하는 시점은 여기다가 명세를 해야한다.
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("창 최소화");
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("창 최소화 해제");
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		 System.out.println("창 활성화");
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		 System.out.println("창 비활성화");
		
	}

}
