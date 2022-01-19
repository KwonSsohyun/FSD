package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 extends Frame implements ActionListener{

	MenuItem mi1, mi2, mi3, mi4, mi5 ;
	TextArea ta;
	String title = "제목없음";
	
	public Ex08(){
		
		// 닫기버튼
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		
		setTitle(title);
		MenuBar bar = new MenuBar();
		Menu mn1 = new Menu("파일");
		Menu mn2 = new Menu("도움말");
		
		mi1 = new MenuItem("새파일");
		mi1.addActionListener(this);
		
		mi2 = new MenuItem("열기");
		mi2.addActionListener(this);
		
		mi3 = new MenuItem("저장");
		mi3.addActionListener(this);
		
		mi4 = new MenuItem("종료");
		mi4.addActionListener(this);
		
		mi5 = new MenuItem("정보");
		mi5.addActionListener(this);
		
		mn1.add(mi1);
		mn1.add(mi2);
		mn1.addSeparator();
		mn1.add(mi3);
		mn1.addSeparator();
		mn1.add(mi4);
		mn2.add(mi5);
		
		
		bar.add(mn1);
		bar.add(mn2);
		
		ta = new TextArea();
		
		
		setMenuBar(bar);
		add(ta);
		setBounds(200,200,500,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex08();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if(obj == mi5){ // "정보" 일때만 가동되게!
			Dialog dia = new Dialog(this, "정보", true); // true 뒷창은 못만지게 함 (종속)
			Panel p = new Panel();
			Panel p2 = new Panel();
			p2.setLayout(new GridLayout(2,1));
			// p2.add(new Label("내가 수업을 위해 만들었습니다."), BorderLayout.CENTER);
			p2.add(new Label("내가 수업을 위해 만들었습니다."));
			Label la2 = new Label("2021.12.31");
			la2.setAlignment(Label.CENTER);
			
			p2.add(la2);
			p.setLayout(new BorderLayout());
			p.add(p2, BorderLayout.CENTER);
			Button btn = new Button("확인");
			
			
			btn.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					dia.dispose();
					
				}
			});
			
			p.add(btn, BorderLayout.SOUTH);
			
			dia.add(p);
			dia.setBounds(200,200,300,200);
			dia.setVisible(true);
			
		}else if(obj == mi1){
			// 새파일
			this.setTitle(title);
			ta.setText(" ");ta.setText(""); // 공백생기니 또 넣어준다.

			
		}else if(obj == mi4){
			dispose();
		}else if(obj == mi3){
			// 파일저장창
			FileDialog dia = new FileDialog(this,"저장",FileDialog.SAVE);
			dia.setVisible(true);
			// 디렉토리, 파일명 경로를 가져온다. → 이를 이용해서 파일을 만든다.
			// System.out.println(dia.getDirectory() + dia.getFile());
			
			File file = new File(dia.getDirectory() + dia.getFile());
			try {
				// 파일 없으면 ▶ 만들기
				if(!file.exists()){
					file.createNewFile();
				} 
				
				// 빨대 꽂고, 통로 연결
				FileOutputStream fos = new FileOutputStream(file);
				
				// 파일을 쓰겠다. (사용자가 적은 글자를 → 바이트 단위로 쓰겠다.)
				fos.write(ta.getText().getBytes());
				
				// 통로 끊는다.
				fos.close();
				
				// 파일의 이름을 얻어와서, 
				title = (file.getName());
				// 창의 제목 바꿔준다.
				setTitle(title);
				
			}catch (IOException e1) {
					e1.printStackTrace();
			}
			
			
		}else if(obj == mi2){
			// 파일 열기 읽기
			// 파일읽기
			FileDialog dia = new FileDialog(this,"열기",FileDialog.LOAD);
			dia.setVisible(true);
			File file = new File(dia.getDirectory() + dia.getFile());
			
			// return 을 만나면 
			// public void actionPerformed(ActionEvent e) { //// } -> 90번라인 해당하는 전체메서드를 빠져나가고
			// 호출한곳으로 가는데
			// 쓰레드이기 때문에 원래 메인창만 뜨게 된다.
			if(!file.exists()){return;} // 파일이 없으면 아무것도 안하게 하기. (리턴해서 무시)
			
			// 그만큼 배열의 길이를 만들어냄
			// 13바이트 -> [13]
			byte[] buf = new byte[(int)file.length()];
			
			try {
				// 빨대 꽂고, 통로 연결
				FileInputStream fis = new FileInputStream(file);
				
				// 파일의 사이즈만큼 버퍼 만들기
				// 한번에 읽어들일라고 버퍼 만든다.
				// 파일의 길이만큼 한번에 읽어버린다.
				fis.read(buf);
				// 기존에 파일 써진게 있을수도 있으니, "텍스트 초기화 시킨다."
				ta.setText("초기화");
				ta.setText("");
				// 객체 새로 생성해서 해당 파일 읽어가지고 온다.
				// 문자열로 만들고 객체로 만들었다.
				ta.setText(new String(buf)); // 생성자에다가 바이트배열을 
				// 통로 끊는다.
				fis.close();
				
				// 파일의 이름을 얻어와서, 
				title = (file.getName());
				// 창의 제목 바꿔준다.
				setTitle(title);
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
			
		
	}

}
