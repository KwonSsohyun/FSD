package com.hi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ex12 extends Frame implements KeyListener{

	TextField tf;
	JLabel la;
	
	public Ex12(){
		// 키보드 이벤트 발생 시키기!
		
		Panel p = new Panel();
		// 배치관리자 안씀
		p.setLayout(null);
		
		// TextField tf = new TextField("", 20);
//		tf = new TextField("", 20);
//		
//		Button btn = new Button("버튼");
		// 사진을 넣을꺼라서 Label 말고, JLabel씀
		la = new JLabel("라벨");
		la.setIcon(new ImageIcon("img02.jpg"));
		// 배치 관리자 안씀
		la.setLocation(0,0);
		la.setSize(250,150);
//		// 라벨은 포커스가 없다. 이벤트 작동 어떻게 할 것인가.
//		la.addKeyListener(this);
		this.addKeyListener(this);
//		
//		// addKeyListener(KeyListener l)
//		tf.addKeyListener(this);
		
		p.add(la);
//		p.add(tf);
//		p.add(btn);
		
		add(p);
		setBounds(200,200,400,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex12();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Shift, ctrl 등은 안됨
		// System.out.println("값이 있을때 발동 (값을 전달하는 시점)");
//		System.out.println("keyTyped : " + e.getKeyChar());
//		System.out.println("keyTyped : " + e.getKeyCode());
		
		// tf에 접근하기
		// 선언을 밖에 (non-static)
		// 한타임 늦다.
//		System.out.println("keyTyped : " + tf.getText());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// System.out.println("키보드 키 누르는 순간");
		
		// 동작값 측정할때는 여기서 하는게 유리하다. (키보드 기준)(ex.게임)
		
		// 뭐 눌렀는지 값 가져올 수 있다.
		// keyCode=65 (키보드 뭐 눌렀는지) | keyChar='a' (실제 뭐 눌렀는지)
		// keyCode = 키보드 A는 a는 97이 아니라 65로 A로 나옴
//		System.out.println("keyPressed : "  + e.getKeyChar());
//		System.out.println("keyPressed : "  + e.getKeyCode());
		
		// 한타임 늦다.
//		System.out.println("keyPressed : " + tf.getText());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// System.out.println("키보드 키 때는 순간");
//		System.out.println("keyReleased : " + e.getKeyChar());
//		System.out.println("keyReleased : " + e.getKeyCode());
		
		// 똑같은 바로바로 값을 볼 수 있다. (엘리먼트기준)
//		System.out.println("keyReleased : " + tf.getText());
		
		// 텍스트필드 객체가 나오는걸 볼 수 있다.
		// 하나의 이벤트에서 내가 원하는 타입을 캐스팅해서 값 가져온다.
//		Object obj = e.getSource();
		// TextField tf2 = (TextField) obj;
		// System.out.println(tf2.getText());
//		Button tf2 = (Button) obj;
//		System.out.println(tf2.getLabel());
		
		// 이벤트 발동하면 이동한다. (키보드 아무거나 눌러라)
		// la.setLocation(100,100);
		//System.out.println(e.getExtendedKeyCode());
		
		
		// 이렇게 움직이는게 가능한 이유는
		// 배치관리자를 안써서 가능한것임
		int x = la.getLocation().x ;
		int y = la.getLocation().y ;
		
		if(e.getExtendedKeyCode() == 39){
			// Dimension(가로,세로 가져오는것) 
			la.setLocation(x+ 10,y);
		}else if(e.getExtendedKeyCode() == 37){
			la.setLocation(x-10,y);
		}else if(e.getExtendedKeyCode() == 38){
			la.setLocation(x,y-10);
		}else if(e.getExtendedKeyCode() == 40){
			la.setLocation(x,y+10);
		}
		
		
		
		
	}

}
