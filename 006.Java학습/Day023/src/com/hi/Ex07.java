package com.hi;

import java.awt.Frame;
import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07 extends Frame{

	Label la;
	
	public Ex07(){ // UI쪽 하나의 쓰레드
		la = new Label();
		add(la);
		
		setBounds(200,200,200,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// 메인쪽 하나의 쓰레드
		// 시계
		Ex07 thr = new Ex07();
		
		// 반복문 하면서 계속 진행
		while(true){
			Date date = new Date();
			// 시분초 셋팅
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			String msg = sdf.format(date);
			// 참조변수(thr)를 통해서 접근
			thr.la.setText("");
			thr.la.setText(msg);
			try {
				// UI병목현상 일어나니
				// 1초가 됫을땐 시간이 바꼈을 테니까
				// 초 단위니까 1초씩 쉬게 한다.
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
