package com.hi;

import java.awt.Frame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Ex03 extends Frame implements WindowFocusListener, MouseWheelListener, FocusListener, ComponentListener
{ // 인터페이스 다중상속 가능

	public Ex03(){
		
		// 윈도우 상태변화
		addWindowFocusListener(this);
		addMouseWheelListener(this);
		addWindowFocusListener(this);
		addComponentListener(this);
		
		setBounds(200,200,400,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex03();

	}

	//*************************************************************
	@Override
	public void windowGainedFocus(WindowEvent e) {
		System.out.println("windowGainedFocus");
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		System.out.println("windowLostFocus");
		
	}
	//*************************************************************
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("마우스 휠");
		
	}
	//*************************************************************
	@Override
	public void focusGained(FocusEvent e) {
		// 컴포넌트 공통 
		// 포커스를 얻는 (라벨은 불가) (버튼, 텍스트 쓰는것 얻을 수 있는객체만 가능)
		System.out.println("포커스 얻음");
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// 컴포넌트 공통
		System.out.println("포커스 잃음");
	}
	//*************************************************************
	@Override
	public void componentResized(ComponentEvent e) {
		// 컴포넌트 리스너니까 컴포넌트에 다 붙을 수 있다.
		// UI객체는 컴포넌트를 상속 받으니 다 쓸 수 있다.
		// 사이즈 줄어들때마다 가로,세로 사이즈 픽셀값 알려준다.
		System.out.println(this.getSize().width + "," + this.getSize().height);
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
