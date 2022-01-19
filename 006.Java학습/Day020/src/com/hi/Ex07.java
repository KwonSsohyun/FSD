package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex07 extends Frame {
	
	public Ex07(){
		// GridBagLayout
		GridBagLayout layout = new GridBagLayout();
		Panel p = new Panel();
		p.setLayout(layout);
		
		
		// GridBagConstraints
		// 얘가 속성을 다 가지고 있음 (컴퍼런트에 대한 속성만)
		GridBagConstraints gbc = new GridBagConstraints();
		// 화면에 꽉차게 설정
		gbc.fill = GridBagConstraints.BOTH; 
		// BOTH       >> 상하좌우 모두 꽉채움
		// VERTICAL   >> 세로만 꽉차되 가로는 컨텐츠
		// HORIZONTAL >> 가로는 꽉차되 세로는 안참
		// 이것을 위해서는 가중치를 부여해야 한다. ▶ .weightx | .weighty
		
		// 가로좌표
		gbc.gridx = 0;
		// 세로좌표
		gbc.gridy = 0;
		// 가로세로 크기지정
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		///////////////////////////////////////////////////////////////////////////////////////
		// 가중치로 조절하려면 너무 머리가 아프다.
		// 가중치를 .weightx ▶ 1.0 | .weighty ▶ 1.0 으로 주고
		// 아래서 버튼 값들 조절을 .gridwidth ▶ 가로 | .gridheight ▶ 세로 로 조절한다.
		// 다만, 이렇게 하려면 첫줄 가로, 세로는 셀을 병합하면 안된다. 
		// └ 첫줄 가로,세로를 제외한 다음줄부터는 병합해도 상관없음
		//   근데 꼭 첫줄 가로,세로를 병합하고 싶다면, 빈 엘리먼트를 넣어서 하는 꼼수도 있다.
		
		// 가중치 = 비중 
		// 현재 창 사이즈의 100% 비중만큼 나온다.
		// 가중치를 줘야 화면 꽉차게 나온다. ▶ .fill
		// 0.25로 쓰면 계산해야되서 너무 머리 아프니 ▶ 1.0!!!
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		///////////////////////////////////////////////////////////////////////////////////////
		
		
		// 버튼 좌표로 그리드 만들기 (배치중)
		// 1번째 칸
		Button btn1 = new Button();
		// 가중치를 주면 한쪽이 늘어나는만큼 남한테도 영향을 준다.
		gbc.weightx = 2.0;
		p.add(btn1, gbc);
		Button btn2 = new Button();
		gbc.weightx = 1.0;
		// 격자무늬로 했을때 몇 셀
		// x는 가로 | y는 세로
		gbc.gridx = 1;
		p.add(btn2, gbc);
		Button btn3 = new Button();
		gbc.gridx = 2;
		p.add(btn3, gbc);
		Button btn4 = new Button();
		gbc.gridx = 3;
		p.add(btn4, gbc);
		
		// 2번째 칸
		Button btn5 = new Button();
		gbc.gridx = 0;
		gbc.gridy = 1;
		p.add(btn5, gbc);
		Button btn6 = new Button();
		gbc.gridx = 1;
		gbc.gridheight = 2;
		p.add(btn6, gbc);
		Button btn7 = new Button();
		gbc.gridx = 2;
		// x축으로 가로로 밀어야 하니까. 
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		p.add(btn7, gbc);
		
		// 3번째 칸
		Button btn8 = new Button();
		gbc.gridx = 0;
		gbc.gridy = 2;
		// 이건 늘리면서 영향받지 말라고 초기화해줌
		gbc.gridwidth = 1;
		p.add(btn8, gbc);
		Button btn9 = new Button();
		gbc.gridx = 2;
		gbc.gridy = 2;
		p.add(btn9, gbc);
		Button btn10 = new Button();
		gbc.gridx = 3;
		gbc.gridy = 2;
		p.add(btn10, gbc);
		
		
		
		add(p);
		setLocation(200,200);
		setSize(400,300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Ex07();

	}

}
