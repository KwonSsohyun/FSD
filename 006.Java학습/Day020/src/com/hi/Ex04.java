package com.hi;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex04 extends Frame{
	
	public Ex04(){ // super()를 이용해서 "창이 생성"된것임 (상속받았으니)
		
		// 버튼 객체 생성
		java.awt.Button btn1 = new Button();
		// 버튼에 글씨 써보기
		btn1.setLabel("처음 버튼");
		// 창에다가 버튼 추가
		// add(btn1);
		
		// 새로운 버튼을 만들어봤는데
		// "처음 버튼"가 아래 깔려있고
		// "새로운 버튼2"이 보이는걸 볼 수 있다. (레이어 겹치는 것 처럼)
		//  ▶▶ 화면을 분할해서 그 작업영역에 넣어야 한다는 것을 알수 있다.
		// + 버튼 사이즈는 내부컨텐츠에 맞게 자동 설정됨.
		Button btn2 = new Button();
		btn2.setLabel("새로운 버튼2");
		// add(btn2);
		
		Button btn3 = new Button();
		btn3.setLabel("새로운 버튼3");
		
		Button btn4 = new Button();
		btn4.setLabel("새로운 버튼4");
		
		Button btn5 = new Button();
		btn5.setLabel("새로운 버튼5");
		
		
		///////////////////////////////////////////////////////////////////////////////
		// 배치관리자 /////////////////////////////////////////////////////////////////
		// 화면을 배치하는 것이다.
		
		// ▶▶ FlowLayout
		// Panel에서는 이걸 안줘도 -> 디폴트로 가지고 있다.
		// FlowLayout layout = new FlowLayout();
		
		// ▶▶ FlowLayout
		// 화면을 격자로 잘라서 그 셀에다가 넣는것이다.
		// 내부에 들어갈 컨포넌트는 그 셀에 꽉차게 들어간다.
		// 여러개를 이용한다면 다중중첩도 가능
		// 만약 add넘어가 버리면, 세로는 지키는데, 가로는 안지킴
		java.awt.GridLayout layout = new GridLayout(2,2); // 세로 2칸, 가로 2칸
		
		///////////////////////////////////////////////////////////////////////////////		
		
		
		// 작업영역
		java.awt.Panel pan1 = new Panel();
		pan1.setLayout(layout);
		// 작업영역 안에 버튼을 넣어준다.
		// 패널을 바꾸는것. (하나의 작업영역이 "패널")
		// └ add했더니 뒤에 숨어버리거나
		// └ 패널을 바꿔치기 하거나
		// 가운데정렬로 화면에 보이는것을 알 수 있다.
		// add의 순서를 한줄한줄 들어간다.
		pan1.add(btn1);
		pan1.add(btn2);
		pan1.add(btn3);
		pan1.add(btn4);
		pan1.add(btn5);
		add(pan1);
		
		// 화면에 보여줄지 결정
		setVisible(true);
		// 창 위치
		setLocation(200, 200);
		// 창 사이즈
		setSize(300,300);
	}

	public static void main(String[] args) {
		// 상속 받아서 하면 extends Frame
		// 참조변수 통해서 접근할 필요도 없이 편리하다.
		new Ex04();

	}

}
