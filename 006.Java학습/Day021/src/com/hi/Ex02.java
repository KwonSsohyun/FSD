package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Ex02 extends Frame{

	public Ex02(){
		// 패널은 작업영역인 배젤,위에 다 빼줌.
		// ★★★ 그래서, 패널을 쓰고 작업하는 것이 효율!
		
		Panel p = new Panel();
		// 배치관리자 안주면, 절대적으로 그 위치에 있다.(절대배치)
		// 창 사이즈가 고정일때 적용하는 것이 효율적
		// 사이즈를 결정하고, 위치도 내가 결정할 수 있으니 편하긴 함
		// 배치관리자를 안쓰겠다.(절대배치를 하겠다.) ▶ .setLayout(null);
		p.setLayout(null);
		// setLayout(null); → 패널안주면, 배젤까지 다 잡아먹는것을 알수있다.
		
		
		
		// JButton 으로 바꾸면 이미지 넣을 수 있다.
		// https://docs.oracle.com/javase/8/docs/api/javax/swing/JButton.html
		// javax.swing >> Class JButton
		// javax.swing >> Class AbstractButton -> 부모에서 찾음
		JLabel btn = new JLabel("라벨"); // 버튼이 아니라 라벨에 이미지 들어간것을 볼 수 있다.
//		JButton btn = new JButton("버튼");
		Toolkit tool = Toolkit.getDefaultToolkit();
		java.awt.Image image = tool.createImage("img01.jpg");
		// java.awt.Image image = null;
		javax.swing.Icon icon = new javax.swing.ImageIcon(image);
		// 이미지넣으려면 ▶ .setIcon()
		btn.setIcon(icon);
		
		// 배치관리자를 안쓰고, 내가 지정하겠다.
		// ▶ .setLocation() | .setSize()
		btn.setLocation(100,100);  // 버튼 위치
		btn.setSize(200, 200); // 버튼 사이즈
		p.add(btn);
		// add(btn); → 패널안주면, 배젤까지 다 잡아먹는것을 알수있다.
		
		add(p);
		setSize(500,400);
		setLocation(100, 100);
		setVisible(true);
		// 창 사이즈 사용자가 조정 못하게 하기(고정) ▶ setResizable(false)
		setResizable(false);
	}
	
	
	public static void main(String[] args) {
		new Ex02();

	}

}
