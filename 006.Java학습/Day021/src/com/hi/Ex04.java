package com.hi;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

public class Ex04 extends Frame{

	public Ex04(){
		// 운영체제 소통하는 것. (요청)
		Toolkit tool = Toolkit.getDefaultToolkit();
		Image img = tool.createImage("img01.jpg");
		
		
		// java.awt  >>  Class Canvas
		// https://docs.oracle.com/javase/8/docs/api/java/awt/Canvas.html
		// 메서드 구현
		// void	 ▶  paint(Graphics g)
		// 매개변수에 써있는  Graphics 클릭해보면
		// 생성자를 보면 protected 라는 것을 볼 수 있다.
		// 이미 우린 public class Ex04 "extends Frame" 을 상속받고 있기때문에
		// 익명 클래스를 쓰고, 상속을 받는다.
		java.awt.Canvas can = new Canvas(){ // 1) 익명클래스를 쓰고,

			// 클래스 오탈자 체크해줌! >> @Override
			@Override
			
			// 2) 상속받는다.
			public void paint(Graphics g){
				String msg = "java awt";
				// 이미지 사이즈를 조정해준다.
				g.drawImage(img, 50, 50, 300, 300, this);
				// 글시는 글씨인데 이미지로.
				g.drawChars(msg.toCharArray(), 0, msg.length(), 100, 100);
				g.setColor(Color.RED);
				
				// ▶ 이거가지고 그림 그린다.
				// ▶ 백터방식이라서 -> 안깨짐
				g.drawLine(100, 100, 200, 200);     	  // ▶ 직선
				g.drawRect(200, 200, 50, 50); 		 	  // ▶ 사각형
				g.setColor(Color.BLUE);
				g.drawOval(300, 100, 200, 200); 	 	  // ▶ 원
				// g.drawArc(300, 100, 200, 200, 0, 180); // ▶ 호
				g.fillRect(100, 100, 200, 200); 		  // ▶ 사각형 색 채우기
				g.setColor(Color.RED);
				g.fillOval(300, 100, 200, 200); 		  // ▶ 원 색 채우기
				g.draw3DRect(100, 100, 200, 200, true);   // ▶ 3D 사각형
			}
		};
		add(can);
		
	
		setSize(600,500);
		setLocation(200,200);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new Ex04();

	}

}
