package com.hi;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;

public class Ex01 extends Frame{

	
	public Ex01(){
		// 창을 제어
		// 기기가 다른데 어떻게 가운데 뜨냐?
		// 사용자 컴퓨터 환경 인식하고, 동적으로 지정해야함.

		
		// 위치
		// https://docs.oracle.com/javase/8/docs/api/java/awt/Point.html
		// Point p = new Point(100,100);
		// setLocation(p);
		setLocation(200, 200);
		// 1) 모니터 해상도 확인
		//    https://docs.oracle.com/javase/8/docs/api/java/awt/Toolkit.html
		//    public abstract class Toolkit -> 추상클래스임 -> 메서드를 봐라 (static) 찾아라
		//    static Toolkit ->	getDefaultToolkit()
		//    추상클래스 쓸 수 있게 툴킷 가져온것임.
		java.awt.Toolkit tool = Toolkit.getDefaultToolkit();
		//    ▶ abstract Dimension -> getScreenSize()
		//      사용자의 환경 모니터 해상도 가로세로 가져올수있다.
		//      아래 가로,세로값을 지닌, "Dimension" 타입쓴다.
		Dimension dim = tool.getScreenSize();

		// 2) 사용자 해상도에 맞게 가운데 배치하기
		setLocation(dim.width/2-(500/2), dim.height/2-(400/2));
		// System.out.println(dim.width + ":" + dim.height);

		// +) 운영체제한테 요청함 -> 창 열때 소리내라고 ▶ .beep()
		tool.beep();
		
		
		// 사이즈 지정이 가능
		// Dimension di;
		// setSize(di);
		// 가로, 세로의 값을 가짐. (생성자를 통해서)
		// https://docs.oracle.com/javase/8/docs/api/java/awt/Dimension.html
		// 반대로 세로와 가로 얻어낼 수 있다. 단, 더블타입으로 반환
		// 여러개있을때 용이
		// Dimension dim = new Dimension(500, 400);
		System.out.println(dim.width);
		System.out.println(dim.getHeight());
		// 전체창으로 보임
		// setSize(dim);
		setSize(500, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex01();
		
	}

}
