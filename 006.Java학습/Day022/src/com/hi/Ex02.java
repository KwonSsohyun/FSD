package com.hi;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex02 extends Frame implements TextListener{

	TextField tf;
	
	public Ex02(){
		Panel p = new Panel();
		
		tf = new TextField(15); // 15자까지 보이게 하기
		tf.addTextListener(this);
		p.add(tf);
		
		
		add(p);
		setBounds(200,200,400,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex02();

	}


	@Override
	public void textValueChanged(TextEvent e) {
		// 벨류값이 바뀌면 호출된다. (입력)
		// 입력하는대로 바로바로 내용 바로 반환해줌
		// 방향키, 쉬프트, 엔터 는 반응 안함
		// 키코드는 반응함. (선택적으로 써야함)
		System.out.println(tf.getText());
		
	}

}
