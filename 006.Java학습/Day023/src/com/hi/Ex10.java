package com.hi;

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
import javax.swing.JFrame;
// 연결 ▶ Ex14

public class Ex10 extends JFrame implements Runnable, ActionListener{
	
	// 필드 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
	// -> 두더지
	JButton[] dudu;
	// -> 두더지 패널
	Panel pdudu;
	//JButton dudu1,dudu2,dudu3,dudu4,dudu5,dudu6,dudu7,dudu8,dudu9,
	//       dudu10,dudu11,dudu12,dudu13,dudu14,dudu15,dudu16;
	
	// -> 실행버튼
	Button str, end;
	
	// -> 시간 재는 것
	Label la2;
	String time;
	
	// 쓰래드
	// Thread th;
	// ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

	public Ex10(){
		
		// 창닫기 ********************************************
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		}); //************************************************
		
		// <BorderLayout>
		BorderLayout bl = new BorderLayout();
		Panel p = new Panel();
		p.setLayout(bl);

		// -----------------------------------------------------
		// <<상단부>>
		// <GridLayout>
		GridLayout title = new GridLayout(1,2);
		Panel ptitle = new Panel();
		ptitle.setLayout(title);
		
		Label la = new Label();
		la.setText("두더지게임(ver 0.1.0)");
		la.setAlignment(la.CENTER);
		ptitle.add(la);
		
		la2 = new Label(time);
		la2.setAlignment(la2.RIGHT);
		ptitle.add(la2);
		// -----------------------------------------------------
		// <<중간부>>
		// 실행 버튼
		GridLayout button = new GridLayout(2,1);
		Panel pbutton = new Panel();
		pbutton.setLayout(button);
		
		str = new Button();
		str.setLabel("시작");
		str.addActionListener(this);
		end = new Button();
		end.setLabel("종료");
		end.addActionListener(this);
		pbutton.add(str);
		pbutton.add(end);
		// ---------------------
		// 두더지 
		pdudu = new Panel();
		// Panel pdudu = new Panel();
		pdudu.setLayout(new GridLayout(4,4));
		
		dudu = new JButton[16];
		// JButton[] dudu = new JButton[16];
		
		for(int i=0; i<16; i++){
			dudu[i] = new JButton("두더지 "+i);
			dudu[i].addActionListener(this);
			pdudu.add(dudu[i]);
		}
		
		
		// GridLayout gdudu = new GridLayout(4,4);
		// Panel pdudu = new Panel();
		// pdudu.setLayout(gdudu);
		// ImageIcon img = new ImageIcon("F:\\JavaWork\\Day023\\dudu.png");
		
		// dudu1 = new JButton("두더지 1",img);
		// dudu1.setLabel("두더지 1");
		// pdudu.add(dudu1);
		
		// dudu2 = new JButton("두더지 2",img);
		// dudu2.setLabel("두더지 2");
		// pdudu.add(dudu2);
		
		// dudu3 = new JButton("두더지 3",img);
		// dudu3.setLabel("두더지 3");
		// pdudu.add(dudu3);
		
		// dudu4 = new JButton("두더지 4",img);
		// dudu4.setLabel("두더지 4");
		// pdudu.add(dudu4);
		
		// dudu5 = new JButton("두더지 5",img);
		// dudu5.setLabel("두더지 5");
		// pdudu.add(dudu5);
		
		// dudu6 = new JButton("두더지 6",img);
		// dudu6.setLabel("두더지 6");
		// pdudu.add(dudu6);
		
		// dudu7 = new JButton("두더지 7",img);
		// dudu7.setLabel("두더지 7");
		// pdudu.add(dudu7);
			
		// dudu8 = new JButton("두더지 8",img);
		// dudu8.setLabel("두더지 8");
		// pdudu.add(dudu8);
			
		// dudu9 = new JButton("두더지 9",img);
		// dudu9.setLabel("두더지 9");
		// pdudu.add(dudu9);
		
		// dudu10 = new JButton("두더지 10",img);
		// dudu10.setLabel("두더지 10");
		// pdudu.add(dudu10);
		
		// dudu11 = new JButton("두더지 11",img);
		// dudu11.setLabel("두더지 11");
		// pdudu.add(dudu11);
		
		// dudu12 = new JButton("두더지 12",img);
		// dudu12.setLabel("두더지 12");
		// pdudu.add(dudu12);
		
		// dudu13 = new JButton("두더지 13",img);
		// dudu13.setLabel("두더지 13");
		// pdudu.add(dudu13);
		
		// dudu14 = new JButton("두더지 14",img);
		// dudu14.setLabel("두더지 14");
		// pdudu.add(dudu14);
		
		// dudu15 = new JButton("두더지 15",img);
		// dudu15.setLabel("두더지 15");
		// pdudu.add(dudu15);
		
		// dudu16 = new JButton("두더지 16",img);
		// dudu16.setLabel("두더지 16");
		// pdudu.add(dudu16);
		
		

		// -----------------------------------------------------
		// <<하단부>>
		GridLayout footer = new GridLayout(1,1);
		Panel pfooter = new Panel();
		pfooter.setLayout(footer);
		
		Label la3 = new Label();
		la3.setText("점수 (맞추면 1점, 틀리면 -2점)");
		la3.setAlignment(la3.CENTER);
		pfooter.add(la3);
		// ------------------------------------------------------
		
		p.add(pdudu, BorderLayout.CENTER);
		p.add(pfooter, BorderLayout.SOUTH);
		p.add(ptitle, BorderLayout.NORTH);
		p.add(pbutton, BorderLayout.EAST);
		
		add(p);
		setBounds(200, 200, 800, 700);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) { // 메인쓰레드 ********************
		// 두더지 게임
		Ex10 me = new Ex10();
		// Thread th = new Thread(me);
		
		
	}



	// 쓰래드 *****************************************************************
	@Override
	public void run() {
		String su;
		for(int i=60; i>=0; i--){
			su = Integer.toString(i);
			la2.setText(su + "초");
			try {
				Random random = new Random();
				int ran = random.nextInt(16)+1;
				dudu[ran].setText("★두더지잡아랏★");

				for(int j=0; j<16; j++){
					if(dudu[j].getText().equals("★두더지잡아랏★")){
						Thread.sleep(3000);
						dudu[j].setText("두더지 "+j);
						break;
					} else{
						
					}
				}
				dudu[ran].addActionListener(this);
				pdudu.add(dudu[ran]);
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	

		
	}
	

	// 클릭했을때 이벤트 ******************************************************
	@Override
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();
		
		if(btn == str){ // 시작 버튼
			 Thread th = new Thread(this);
			 th.start();
			// new Ex14();

			
		}else if(btn == end){
			System.out.println("종료하겠습니다.");
			dispose();
		}	
	}

}
