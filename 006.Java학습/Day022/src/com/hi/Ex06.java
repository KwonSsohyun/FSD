package com.hi;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex06 extends Frame implements ActionListener{
	
	// 이미지 넣을거여서 JButton
	JButton btn1, btn2, btn3;
	// 접근할수 있게 필드에 선언
	Label result;

	public Ex06(){
		// *******************************************************************
		// 종료버튼 - 익명함수 활용 (WindowAdapter ▶ 어댑터 클래스 활용)
		WindowAdapter win = new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		};
		// 종료버튼
		addWindowListener(win);
		// *******************************************************************
		
		
		Panel p1 = new Panel();
		p1.setLayout(new BorderLayout());
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		
		p4.setLayout(new GridLayout(1,3));
		
		p2.add(new Label("가위, 바위, 보 게임 (ver 0.2.0"));
		result = new Label("결과 : ");
		p3.add(result);
		
		btn1 = new JButton("가위");
		btn2 = new JButton("바위");
		btn3 = new JButton("보");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		btn1.setIcon(new ImageIcon("thumb_1.png"));
		btn2.setIcon(new ImageIcon("thumb_2.png"));
		btn3.setIcon(new ImageIcon("thumb_3.png"));
		
		p4.add(btn1);
		p4.add(btn2);
		p4.add(btn3);
		
		p1.add(p2, BorderLayout.NORTH);
		p1.add(p3, BorderLayout.SOUTH);
		p1.add(p4, BorderLayout.CENTER);
		add(p1);
		setBounds(200,200,600,300);
		setVisible(true);
		
		// 해당사이즈에 맞게 이미지 자르려고 체크함 → 194px 확인
		// System.out.println(btn1.getSize().width);
	}
	
	
	public static void main(String[] args) {
		new Ex06();
	}


	// 버튼에 이벤트 달기
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 클릭할때마다 잘 뜬다.
		// System.out.println("동작");
		
		// e.getSource() ▶ 이벤트가 일어난 객체
		Object obj = e.getSource();
		// System.out.println(((JButton)obj).getText()); → 실제 버튼의 텍스트 값 가져옴
		
		// 컴퓨터 계정
		Random ran = new Random();
		// 가위0 , 바위1, 보2
		int com = ran.nextInt(3);
		
		// 사용자가 누른 객체랑 / bt1(가위)랑 같냐? → 레퍼런스 비교 (true/false반환)
		if(obj == btn1){
			// System.out.println("가위의 이벤트");
			if(com==0){
				// 비김
				result.setText("결과 : 비김");
			}else if(com==1){
				// 졌음
				result.setText("결과 : 졌음");
			}else if(com==2){
				// 이김
				result.setText("결과 : 이김");
			}
			
		}else if(obj == btn2){
			// System.out.println("바위의 이벤트");
			if(com==0){
				// 이김
				result.setText("결과 : 이김");
			}else if(com==1){
				// 비김
				result.setText("결과 : 비김");
			}else if(com==2){
				// 졌음
				result.setText("결과 : 졌음");
			}
			
		}else if(obj == btn3){
			// System.out.println("보의 이벤트");
			if(com==0){
				// 졌음
				result.setText("결과 : 졌음");
			}else if(com==1){
				// 이김
				result.setText("결과 : 이김");
			}else if(com==2){
				// 비김
				result.setText("결과 : 비김");
			}
		}
		
		
		// 화면 사이즈 갱신 시켜서 글자 다 보이게 해주기
		this.revalidate();
		
	
	}

}
