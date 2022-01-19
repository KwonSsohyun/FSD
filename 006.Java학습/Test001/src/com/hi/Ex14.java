package com.hi;
//참고자료 : Day023 ▶ Ex15
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex14 extends Frame implements ActionListener, Runnable{
	
	// 이벤트 발생되는것들 필드에 선언 (공통으로 쓸 수 있게)
	// ▶▶ 두더지버튼 16개
	JButton[] dudu;
	// ▶▶ 시작,닫기 버튼
	Button str, end;
	// ▶▶ 카운트
	Label laTime;
	// ▶▶ mix() 
	//    → 두더지 이미지 1초마다 랜덤하게 하려고 따로 메서드빼서임
	Panel p2;
	// ▶▶ 점수(스코어)
	Label score;
	int su = 0;
	
	public Ex14(){
		//*****************************************
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		//*****************************************
		
		
		// 패널 설정
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(1,2));
		
		// Panel p2 = new Panel();
		p2 = new Panel();
		p2.setLayout(new GridLayout(4,4));
		
		Panel p3 = new Panel();
		
		// 타이틀
		p1.add(new Label("두더지게임 (ver 0.1.0)"));
		laTime = new Label("10초");
		p1.add(laTime);
		
		// ▶▶ 두더지버튼 16개
		// JButton[] dudu = new JButton[16];
		dudu = new JButton[16];
		
		for(int i=0; i<dudu.length; i++){
			dudu[i] = new JButton(""+i);
			p2.add(dudu[i]);
			// ▶ 비활성화(false) / 활성화(true) 처리
			dudu[i].setEnabled(false);
			// ▶ 이벤트붙힘
			// up, down 이미지시 클릭시 스코어 집계해야해서
			dudu[i].addActionListener(this);
			
			// ▶▶ 이미지 넣기
			ImageIcon img;
			// ▶ 두더지 UP / DOWN 이미지 넣기
			if(i<4){ // 인덱스 → 0,1,2,3
				img = new ImageIcon("up.png");
				// 이벤트 달아주기
				// 여기다가 이벤트 달면, up이미지 클릭시 이벤트됨
				// dudu[i].addActionListener(this);
			} else { // 인덱스 → 위를 제외한 나머지
				img = new ImageIcon("down.png");
			}
			// 이미지 삽입
			dudu[i].setIcon(img);
		}
		
		// 이거 호출해서 써야함 ▶ 1초마다 랜덤되야하니
		// 					    ▶ mix()
		// Random ran = new Random();
		//
		// for(int i=0; i<1000; i++){
		//	JButton temp = dudu[0];
		//	int su = ran.nextInt(16); // 0~15
		//	dudu[0] = dudu[su];       // 0번은 없음==15 없음
		//	dudu[su] = temp;
		// }
	
		// for(int i=0; i<dudu.length; i++){
		//	p2.add(dudu[i]);
		// }
		
		
		
		// ▶▶ 시작,닫기 버튼
		// Button str = new Button("시작");
		str = new Button("시작");
		// ▶ 이벤트 붙힘
		str.addActionListener(this);
		p3.add(str);
		
		// Button end = new Button("종료");
		end = new Button("종료");
		// ▶ 이벤트 붙힘
		end.addActionListener(this);
		p3.add(end);
		
		// 점수(스코어)
		score = new Label();
		score.setText("점수 : 0");
		
		p.add(p1, BorderLayout.NORTH);
		p.add(p2, BorderLayout.CENTER);
		p.add(p3, BorderLayout.EAST);
		p.add(score, BorderLayout.SOUTH);
		
		
		add(p);
		setBounds(200,200, 500+7, 400+85);
		setVisible(true);
		
		// 두더지 이미지 사이즈 맞추려고 함.
		// System.out.println(p2.getWidth());  // 393 + "7"  = 400
		// System.out.println(p2.getHeight()); // 315 + "85" = 400
		
	}
	
	// 두더지 이미지 랜덤! ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	// 아래 쓰레드에서 1초마다 이미지 랜덤 시키기 위해 ■■■■■■■■■■■■■■■■
	// 해당 메서드 호출한다! ▶ mix()
	public void mix(){
		Random ran = new Random();
		
		for(int i=0; i<1000; i++){
			JButton temp = dudu[0];
			int su = ran.nextInt(16); // 0~15
			dudu[0] = dudu[su];       // 0번은 없음==15 없음
			dudu[su] = temp;
		}
	
		for(int i=0; i<dudu.length; i++){
			p2.add(dudu[i]);
		}
		
		// revalidate (갱신하다)
		this.revalidate();
	}

	public static void main(String[] args) {
		// 두더지게임
		new Ex14();
        
	}
	
    // implements ActionListener ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	// 클릭이벤트 발생 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj==end){ // "종료" 버튼 눌렀을때 ---------------------------
			dispose();
			
		} else if(obj==str){ // "시작" 버튼 눌렀을때 --------------------
			
			// ▶ 두더지 버튼 
			for(int i=0; i<dudu.length; i++){
				// 두더지버튼(16개) 활성화
				dudu[i].setEnabled(true);
			}
			
			// ▶ 쓰레드 실행
			Thread thr = new Thread(this);
			thr.start();
			
			// ▶ 60초 다 끝나기 전까지는 >> 시작버튼 비활성화
			str.setEnabled(false);
			
			// ▶ 점수 초기화
			su = 0;
			score.setText("점수 : 0");
			
			
		} else { // "두더지버튼(16개)" 버튼 눌렀을때 ---------------------
			
			// ▶ 점수(스코어) 매기기
			JButton btn = ((JButton)obj);
			
			// getLabel() ▶ String 타입리턴 : Button 컴포넌트에 표시된 문자열 구하기
			if(Integer.parseInt(btn.getLabel())<4){
				// 위에서 0~3번 인덱스가 두더지니까
				// 해당 두더지 맞게 누르면 스코어 1점 추가
				su++;
			}else{
				// 두더지 잘못누르면 -2점 차감
				su -= 2;
			}
			score.setText("점수 : " + su);
		
		}
		
	}

	// implements Runnable ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	// 쓰레드 발생 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	@Override
	public void run() {
		
		for(int i=10; i>=0; i--){
			laTime.setText(i+"초");
			
			try {
				// 두더지이미지 랜덤으로 1초마다 보이게 하기
				mix();
				
				// 1초 (for문 도니까, 1초마다가 됨) 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 60초 다끝나면 ▶ 시작버튼 활성화 
		str.setEnabled(true);
		
		// 60초 다끝나면 ▶ 두더지버튼 비활성화
		for(int i=0; i<dudu.length; i++){
			// 두더지버튼(16개) 비활성화
			dudu[i].setEnabled(false);
		}
		
	}

}
