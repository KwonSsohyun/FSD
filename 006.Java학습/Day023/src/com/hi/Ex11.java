package com.hi;

import java.awt.Frame;
import java.awt.Label;

public class Ex11 extends Frame{
	
	static Label la;
	

	public Ex11(){
		la = new Label();
		la.setAlignment(Label.CENTER);
		add(la);
		setBounds(200,200,200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// 카운트다운 (두더지게임)
		Ex11 me = new Ex11();
		
		// 카운트다운
		for(int i=10; i>=0; i--){
			// 숫자(모든지 다)를 문자열하고 조합하면 문자열됨.
			// 문자열과 연산하면 문자열됨
			la.setText(""+i);
			try {
				// 1초마다 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
