package com.hi;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex09 extends Frame{

	public Ex09(){
		Panel p = new Panel();
		// 생성자를 이용해서 컬러를 만든다.
		// Color c = new Color(128, 128, 255);
		Color c = Color.GREEN;
		// p.setBackground(c);
		
		// 객체생성하고 상속받자 // 익명클래스 한것임
		Font f = new Font(Font.SERIF , Font.ITALIC , 22){}; 
		
		// 폰트
		// https://docs.oracle.com/javase/8/docs/api/java/awt/Font.html
		// protected 생성자라는걸 볼 수 있다. 상속 그래서 객체 생성	불가.
		// Font f = new Font();
		// static 메서드 중에서 font를 찾아준다.
		// Font f = Font.getFont(Font.SANS_SERIF);
		// ▶ Font f = Font.getFont(Font.SANS_SERIF);
		//   Font.getFont()  ▶ 메서드
		//   Font.SANS_SERIF ▶ 필드
		
//		// 생성자를 통해서 버튼명을 지어줄 수 도 있다.
//		Button btn1 = new Button("abcd");
//		// btn1.setLabel("버튼텍스트");
//		// 객체 생성해서 써야 한다.
//		btn1.setFont(f);
//		btn1.setBackground(c);
//		// 버튼 못 쓰게 하기(활성화/비활성화) ▶ .setEnabled(false)
//		btn1.setEnabled(false);
//		p.add(btn1);

		
		
		
//		// 글씨 쓰고 싶으면 ▶ Label
//		// 생성자에 적어도 된다. ▶ .setText() 에 안적고도 말이다.
//		Label la1 = new Label("글씨");
//		// la1.setText("작성");
//		la1.setBackground(c);
//		la1.setFont(f);
//		p.add(la1);

		
		
		
//		// 내가 직접 입력할 수 있는 공간이 나옴 ▶ TextField
//		TextField tf1 = new TextField("",5);
//		// 빈공간주고, 창사이즈(5라고 적으면 5글자만 보이는 창 사이즈) >> 빈공간 나올 수 있다.
//		// tf1.setText(" ");
//		// 비밀번호 적을때 -> 적긴 적는데 안보이게 하고 싶을때 ▶ .setEchoChar('@')
//		// >> get으로 값 받아보면 정상적으로 받아와짐
//		tf1.setEchoChar('@');
//		tf1.setBackground(c);
//		p.add(tf1);

		
		
		
//		// 여러줄을 입력하고 싶을때
//		// 기본텍스트 어떤 내용 들어갈건지 / 3줄 / 10자 / 스크롤여부
//		TextArea ta1 = new TextArea("디폴트 텍스트" , 3, 10, TextArea.SCROLLBARS_BOTH);
//		// CROLLBARS_VERTICAL_ONLY >>  수직스크롤만 있으니, 가로끝으로 못가니 자동개행됨
//		p.add(ta1);

		
		
		
//		// .Checkbox 생성자에 3번째 객체에 넣어야만 >> 한 그룹처럼 묶인다.
//		// ▶▶ 중복체크 하고 싶으면, .CheckboxGroup 하면 안된다.
//		java.awt.CheckboxGroup chg = new CheckboxGroup();
//		// 체크박스
//		java.awt.Checkbox ckb1 = new Checkbox("항목1", false, chg);
//		// 체크박스의 라벨 > 이걸 클릭해도 체크박스에 체크가 되니까.
//		// >> ckb1.setLabel("항목1");
//		// 처음시작부터 체크가 됨  ▶ .setState(true)
//		// ▶ 기본값은 체크해제된 false
//		// >> ckb1.setState(true);
//		p.add(ckb1);
//		
//		// 생성자를 통해서 -> 체크박스체크된것과, 설명 같이 적을 수 있다.
//		java.awt.Checkbox ckb2 = new Checkbox("항목2", true, chg);
//		p.add(ckb2);
//		
//		java.awt.Checkbox ckb3 = new Checkbox("항목3",false ,chg);
//		p.add(ckb3);

		
		
		
//		// 선택 (초이스)
//		java.awt.Choice cho1 = new Choice();
//		// 디폴트는 첫번째가 선택된다.
//		cho1.addItem("item1");
//		cho1.addItem("item2");
//		cho1.addItem("item3");
//		cho1.addItem("item4");
//		p.add(cho1);
//		
//		// 디폴트로 첫번째말고 2번째 선택하고 싶으면? ▶ .select()
//		cho1.select(1);
//		cho1.select("item3");
//		// 선택된 인덱스번호 반환 ▶ .getSelectedIndex()
//		System.out.println(cho1.getSelectedIndex());
//		// 선택된 문자열 반환 ▶ .getSelectedItem()
//		System.out.println(cho1.getSelectedItem());
		
		
		
		
		// 선택창 리스트 다 노출하게 하기 ▶▶ List()
		// 생성자에 3이라고 적으면, 3개까지 보이고, 스크롤 생김 
		// 디폴트는 4개
		// true 적으면 다중선택 가능해짐
		List list1 = new List(3, true);
		list1.add("item1");
		list1.add("item2");
		list1.add("item3");
		list1.add("item4");
		list1.add("item5");
		p.add(list1);
		// 디폴트 선택 3번째거 하기 ▶ .select(2)
		list1.select(2);
		list1.select(3);
		// 숫자 집어넣은 아이템 문자열 반환
		System.out.println(list1.getItem(3));
		// 선택한 인덱스 번호 반환
		System.out.println(list1.getSelectedIndex());
		System.out.println(list1.getSelectedItem());
		// 배열로 받아본다. (인덱스번호)
		int[] arr1 = list1.getSelectedIndexes();
		// 배열로 받아본다. (해당값 문자열)
		String[] arr2 = list1.getSelectedItems();
		
		
		
		
		
		add(p);
		setLocation(200,200);
		setSize(500,500);
		setVisible(true);
		
		// 제목표시줄만큼 작업영역과, 가장자리 베젤부분 잘려서
		// 패널인 실제 작업영역이 잘리는것을 알 수 있다.
		System.out.println(p.getWidth() + "," + p.getHeight());
	}
	
	
	public static void main(String[] args) {
		new Ex09();

	}

}
