package com.hi;
// 참고자료 : Day022 ▶ Ex08

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 창만드는 Frame 클래스 상속 | 액션이 일어났을때 이벤트 줄 수 있는, 인터페이스 ActionListener 상속받음 ▶ Ex13에 마우스 대면 1번째 클릭
public class Ex13 extends Frame implements ActionListener{ 
	
	@Override // 액션이 일어났을 때 이벤트 설정하는 "ActionListener" 
	public void actionPerformed(ActionEvent e) {

		Object menu = e.getSource();

		if(menu == mi4){ // 종료 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
			dispose();
			
		} else if(menu == mi5){ // 정보(팝업창) ■■■■■■■■■■■■■■■■■■■■■■■■■
			// this로 Ex13을 true 종속을 받아서 
			// 팝업창을 안끄면 뒤에 부모창은 못 건들게 하려고.
			// Dialog 씀
			Dialog pop = new Dialog(this, "정보창", true);
			
			// 정보창만 창 닫기
			WindowAdapter alisten = new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					pop.dispose();
				}
			};
			pop.addWindowListener(alisten);
			
			// 레이아웃
			BorderLayout bl = new BorderLayout();
			Panel p = new Panel();
			p.setLayout(bl);
			
			GridLayout gtop = new GridLayout(2,1);
			GridLayout gdown = new GridLayout(1,1);
			Panel ptop = new Panel();
			Panel pdown = new Panel();
			
			// 텍스트
			Label text1 = new Label("내가 수업을 위해 만들었습니다.");
			text1.setAlignment(Label.CENTER);
			ptop.add(text1);
			Label text2 = new Label("2022.01.01");
			text2.setAlignment(Label.CENTER);
			ptop.add(text2);
			
			// 버튼
			Button btn = new Button("확인");
			btn.setPreferredSize(new Dimension(45, 28));
			pdown.add(btn);
			// 버튼 누르면 창 꺼지기
			ActionListener action = new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					pop.dispose();
				}
			};
			btn.addActionListener(action);

			
			ptop.setLayout(gtop);
			pdown.setLayout(gdown);
						
			p.add(ptop, BorderLayout.NORTH);
			p.add(pdown, BorderLayout.CENTER);
			
			pop.add(p);
			// 창 기본 설정
			pop.setBounds(300,300,400,300);
			pop.setVisible(true);
			
		} else if(menu == mi3){ // 저장 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
			// 파일 저장창
			FileDialog dia = new FileDialog(this, "저장", FileDialog.SAVE);
			dia.setVisible(true);
			
			// 폴더 경로 ▶ ex) F:\JavaWork\Test001\
			System.out.println(dia.getDirectory());
			// 파일명 ▶ ex) text01
			System.out.println(dia.getFile());
			
			// 실제 이 경로에 해당 파일명으로 저장해야하니까
			File file = new File( dia.getDirectory() + dia.getFile() );
			
			// 저장 ▶ FileOutputStream
	        try {
	        	// 파일 없으면 ▶ 만들기
				if(!file.exists()){ 
					file.createNewFile();
				}
				// 저장(FileOutputStream) ▶ 빨대 꽂고, 통로 연결
				FileOutputStream save = new FileOutputStream(file);
				// 사용자가 적은 글자를 → 바이트단위로 파일을 쓰겠다.
				save.write(text.getText().getBytes());
				// 통로 끊는다.
				save.close();
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		} else if(menu == mi2){ // 열기 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
			
			FileDialog die = new FileDialog(this, "열기", FileDialog.LOAD);
			die.setVisible(true);
			
			File file = new File(die.getDirectory() + die.getFile());
			
			// 열기 ▶ FileInputStream
			try {
				// 파일이 없으면 ▶ 리턴 (아무것도 안하게 하기)
				if(!file.exists()){
					return;
				}
				
				// 파일크기(바이트값 알아오는 메서드 사용) ▶ .length()
				// long타입 ▶ .length() 
				// int (캐스팅) 형변환
				int buff = (int)file.length();
				// (파일의 용량크기)만큼 바이트 배열갯수 만듬
				byte[] buffb = new byte[buff];
				
				
				// 빨대 꽂고, 통로 연결
				FileInputStream open = new FileInputStream(file);
				// 파일의 길이만큼 한번에 읽어버린다.
				open.read(buffb);
				
				// 메모장에 해당파일 내용 띄우기
				// setText는 스트링을 받으니
				// 새 객체 생성해서 buffb 받는다.
				text.setText(new String(buffb));
				
				// 통로 끊는다.
				open.close();
				
				// 창 제목 파일명과 똑같이 하기
				// 아래 setTitle에서는 빈내용(변수)으로 줘야함.
				title = file.getName();
				setTitle(title);

				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if(menu == mi1){ // 새파일 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
			// 창 제목
			setTitle(title);
			
			// 안에 내용 지우기 
			text.setText(" "); 
			// 앞에 코드에서 한칸 띄었기 때문에
			// 커서 다시 찍으면 한칸 띄어져서 한칸 안띄운걸로 준다.
			text.setText("");

		}
		
	}
	
	// **** 필드 (선언부) *********************************************
	// 메뉴 버튼 ////////////////////////////////////////
	MenuItem mi1, mi2, mi3, mi4, mi5; 
	// mi1 - "새파일"
	// mi2 - "열기" - 
	// mi3 - "저장" - o
	// mi4 - "종료" - o
	// mi5 - "정보" - o
	
	// 메모장 텍스트 입력받는 곳 ////////////////////////
	TextArea text;
	
	// 창 제목 
	String title;
	// 
	Panel pdown;
	// ************************************************************
	
	public Ex13(){ // 생성자 **************************************
		// 창 닫기 버튼 ///////////////////////////////////////////
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		
		// 레이아웃 ///////////////////////////////////////////////
		Panel p = new Panel();
		
		BorderLayout bblayout = new BorderLayout();
		p.setLayout(bblayout);
		
		GridLayout top = new GridLayout(1,1);
		GridLayout down = new GridLayout(1,1);
		
		Panel ptop = new Panel();
		pdown = new Panel();
		// Panel pdown = new Panel();
		
		ptop.setLayout(top);
		pdown.setLayout(down);
		
		p.add(ptop, BorderLayout.NORTH);
		p.add(pdown, BorderLayout.CENTER);
		
		 
		// 메뉴 ///////////////////////////////////////////////////
		MenuBar mb = new MenuBar();
		Menu mu1 = new Menu("파일");
		Menu mu2 = new Menu("도움말");
		mb.add(mu1);
		mb.add(mu2);
		
		// 각 버튼에 이벤트 주기
		mi1 = new MenuItem("새파일");
		mi1.addActionListener(this);
		
		mi2 = new MenuItem("열기");
		mi2.addActionListener(this);
		
		mi3 = new MenuItem("저장");
		mi3.addActionListener(this);
		
		mi4 = new MenuItem("종료");
		mi4.addActionListener(this);
		
		mu1.add(mi1);
		mu1.add(mi2);
		mu1.addSeparator();
		mu1.add(mi3);
		mu1.addSeparator();
		mu1.add(mi4);
		mi5 = new MenuItem("정보");
		mi5.addActionListener(this);
		
		mu2.add(mi5);
		
		setMenuBar(mb);
		
		
		// 메모장 텍스트 입력받는 곳 ////////////////////////
		// TextArea tx = new TextArea();
		text = new TextArea();
		// text.setText("");
		// pdown.add(text);
		
		
		// 기본설정 ///////////////////////////////////////////
		add(text);
		title = "제목없음";
		setTitle(title);
		setBounds(200,200,700,500);
		setVisible(true);
	}

	public static void main(String[] args) { // 메인메서드 ************
		// ▶▶ 메모장 만들기
		new Ex13();
		// 생성자 호출하고 객체 생성

	}



}
