package com.hi;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex15 extends Frame implements ActionListener, Runnable{
	
	// 필드
	Label laTime, laScore;
	JButton[] btns; // 이미지 넣을거라서
	Button btn1, btn2;
	int score = 0; // 점수합산 (버튼 클릭시 점수집계)
	Panel p2;

	public Ex15(){
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(1,2));
		p2 = new Panel();
		p2.setLayout(new GridLayout(4,4));
		Panel p3 = new Panel();
		
		// 상단
		p1.add(new Label("두더지게임(ver 0.1.0)"));
		laTime = new Label("60초");
		p1.add(laTime);
		
		// 중간 (두더지)
		btns = new JButton[16];
		for(int i=0; i<btns.length; i++){
			btns[i] = new JButton(i+"");
			p2.add(btns[i]);
			// 버튼 사용 못하게 하기
			btns[i].setEnabled(false);
			// 모든 버튼 이벤트 주기
			btns[i].addActionListener(this);
			
			// 버튼 마킹하기 (두더지 이미지 넣기)
			String img;
			// 이렇게 
			if(i<3){ // 0~3번만 UP 이미지 넣기 (1이면 1개 이미지만 나옴)
				img = "up.png";
				// UP이미지한테만 이벤트 처리 했기때문에
				// 스코어 점수 올라간다.
				 btns[i].addActionListener(this);
			} else{ // 4~15번 DOWN 이미지 넣기
				img = "down.png";
			}
			// 이미지 삽입
			btns[i].setIcon(new ImageIcon(img));
			// 이미지 삽입한걸 가지고, 랜덤하게 섞어서 뿌릴거당! ▶ mix() 메서드 확인!
			// 그리고, run() 쓰레드에서 1초마다 이미지가 계속 랜덤하게 돌게 
			// run() 메서드 안에서 ▶ mix() 메서드 호출!
		}
		
		/////////////////////////////////////////////////////////////////////
		// << 이미지 섞어주기 (메서드로 뺄거임) ▶ mix() 메서드 확인! >>
		// btns[0] = btns[15]; 
		// (0~3번까지만 UP이미지 넣었는데, 0번을 15번(DOWN)이미지와 바꿔치기!)
		//  -> 단, 이렇게만 하면, 값 덮어쓰니 임시(temp)선언해서 해줌 
		//     이런식으로 값 바꿔치기 해준다.
		////// JButton temp = btns[0];
		////// btns[0] = btns[15];
		////// btns[15] = temp;
		
		////// for(int i=0; i<btns.length; i++){
		////// 		p2.add(btns[i]);
		////// }
		
//      해당코드 메서드로 따로 빼줄것임 → 쓰레드에서 반복 호출할것이기 때문 
//                                       (계속 1초마다 이미지 바껴야 하기 때문) 
//		Random ran = new Random();
//		
//		for(int i=0; i<100; i++){ // 100번 랜덤하게 섞어준다.
//			JButton temp = btns[0];
//			int su = ran.nextInt(16);
//			btns[0] = btns[su];
//			btns[su] = temp;
//		}
//	
//		for(int i=0; i<btns.length; i++){
//			p2.add(btns[i]);
//		}
		
		
		/////////////////////////////////////////////////////////////////////

		
		btn1 = new Button("시작");
		// 버튼 이벤트 줌
		btn1.addActionListener(this);
		btn2 = new Button("종료");
		// 버튼 이벤트 줌
		btn2.addActionListener(this);
		p3.add(btn1);
		p3.add(btn2);
		
		laScore = new Label("점수 : 0");
		
		// 작업공간 만듬
		p.add(p1,BorderLayout.NORTH);
		p.add(p2,BorderLayout.CENTER);
		p.add(p3,BorderLayout.EAST);
		p.add(laScore, BorderLayout.SOUTH);
		
		add(p);
		setBounds(200,200, 500+7, 400+85);
		setVisible(true);
		
		// 이미지(100x100px) 넣기 위해서 측정해봄
		System.out.println(p2.getWidth());  // 393 // >> 400 ▶ setBounds(400+85);
		System.out.println(p2.getHeight()); // 315 // >> 400 ▶ setBounds(400+85);
	}
	
	
	
	
	public void mix(){ // 이미지를 랜덤으로 바꿔주는 (믹스) -------------------------------
		Random ran = new Random();
		
//		for(int i=0; i<100; i++){ // 100번 랜덤하게 섞어준다.
//			JButton temp = btns[0];
//			int su = ran.nextInt(16);
//			btns[0] = btns[su];
//			btns[su] = temp;
//		}
//	
//		for(int i=0; i<btns.length; i++){
//			p2.add(btns[i]);
//		}
	
		for(int i=0; i<16; i++){
			int su = ran.nextInt(16);
			// 있던놈을 잡아다가 add하니거니까 뒤에다가 집어넣어서 믹스
			p2.add(btns[su]);
		}
		
		// 드로잉 다시 해달라
		this.revalidate();
		
	} // -----------------------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		Ex15 me = new Ex15();

	}


	
	
	
	// 이벤트 줌 ▶▶ ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj==btn1){ // 시작버튼 *********************************************************
			System.out.println("시작");
			
			// 시작을 하면 버튼 활성화
			for(int i=0; i<btns.length; i++){
				btns[i].setEnabled(true);
			}
			Thread thr = new Thread(this);
			thr.start();
			// 시작버튼 계속 못 누르게 하기 (비활성화)
			btn1.setEnabled(false);
			// 스코어 점수 초기화 (버튼클릭시 점수)
			score = 0;
			laScore.setText("점수" + score);
			
		} else if(obj==btn2){ // 종료버튼 ***************************************************
			System.out.println("종료");
			dispose();
			
		}else{ // 버튼 16개 *****************************************************************
			// 버튼클릭하면 점수 올라가게 해주기
			// 맞출때는 점수 + / 아닐때는 점수 -
			JButton btn = (JButton) obj;
		
			if(Integer.parseInt(btn.getLabel())<4){
				score++;
			}else{
				score-=2;
			}
			laScore.setText("점수 : " + score);
			
			
			// score++;
			// laScore.setText("점수" + score);
			
			
			
			
			
		}
	}


	// 쓰레드 ▶▶ Runnable
	@Override
	public void run() {
		// System.out.println("새로운 쓰레드 실행");
		
		
		// 카운트다운하기
		int time = 10;
		for(int i=time; i>=0; i--){
			
			// 믹스 호출 
			mix();
			
			laTime.setText(i+"초");
			try {
				// 0.5초
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// 믹스 호출 (0.5초마다 믹스) (합이 1000 = 1초)
			// 재빠르게 누르지 못하게 하려고
			mix();
			
			try {
				// 0.5초
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 시작버튼 계속 못 누르게 하기 (활성화)
		btn1.setEnabled(true);
		
		// 다 끝나고 나면 못누르게, 
		// 두더지 버튼 비활성화해주기
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(false);
		}
		
		
		
	}

}
