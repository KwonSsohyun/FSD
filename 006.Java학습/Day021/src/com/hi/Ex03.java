package com.hi;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex03 extends Frame{

	public Ex03(){
		
		setBackground(Color.RED);
		
		// 창 여러개 띄우기 (다중창)
		// 조건에 따라 창 띄우기 가능
		// 창을 띄운다 -> 독립적으로 쓰래드 발생
		// 쓰래드안에서 쓰래드 발생
		// 창 닫으면 창도 같이 닫기
		// https://docs.oracle.com/javase/8/docs/api/java/awt/Dialog.html
		// java.awt >> Class Dialog
		
		
		// 프로그램에 종속적이라, 주인을 전달해줘야함.
		// 먼저창이 창 닫으면 "다이얼로그" 하면 종속되서 같이 닫힘
		// 주 쓰래드가 마무리되면, 같이 죽는다. (종속)
		// FileDialog는 Dialog 상속받음
//		java.awt.Dialog dl = new FileDialog(this);
//		dl.setLocation(200,200);
//		dl.setSize(300,200);
//		dl.setVisible(true);
		
		
		// 창이 뜨고나면 뒤에 못 만지게 (비활성화하게 하는 옵션) ▶ ,"제목없음", true)
//		java.awt.Dialog dl = new Dialog(this,"제목없음", true);
//		dl.setLocation(200,200);
//		dl.setSize(300,200);
//		dl.setVisible(true);
		
		
//		Frame f = new Frame();
//		f.setBackground(Color.BLUE);
//		f.setSize(200,200);
//		f.setLocation(200,200);
//		f.setVisible(true);
		
		setSize(600,500);
		setLocation(200,200);
		setVisible(true);
		
//		java.awt.Dialog dl = new Dialog(this,"제목없음", true); //
		java.awt.FileDialog dl = new FileDialog(this,"" ,FileDialog.LOAD); // 열기
//		java.awt.FileDialog dl = new FileDialog(this,"" ,FileDialog.SAVE); // 저장
		dl.setLocation(200,200);
		dl.setSize(300,200);
		dl.setVisible(true); //  얘가 false되기 전까지는 아래에 깔린 빨간색 진행 안함
		// *************** dl.setVisible(false); 되야 아래코드 실행 *********************
		// 이벤트 처리로 setVisible(false); 시켜줘야함.
		// 그래야 뒤에 코드도 진행됨.
		// 파일경로 가져올 수도 있다. (패스경로 -> 파일객체 만들면 -> 저장/열기 다 가능) 
		System.out.println(dl.getDirectory() + "," + dl.getFile());
	}
	
	
	public static void main(String[] args) {
		new Ex03();

	}

}
