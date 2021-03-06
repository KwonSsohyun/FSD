package com.hi.step04;

import java.net.*;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

public class Client extends Frame implements ActionListener{
	
	// 필드
	static TextArea ta;  // 채팅대화
	static TextField tf; // 입력하는 곳
	static BufferedWriter bw;
	
	public Client(){
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		
		ta = new TextArea();
		tf = new TextField();
		tf.addActionListener(this);
		
		p.add(ta,BorderLayout.CENTER);
		p.add(tf,BorderLayout.SOUTH);
		
		add(p);
		setBounds(200, 200, 200, 400);
		setVisible(true);
	}
	
	// 액션리스너
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = tf.getText();
		try {
			bw.write(msg);
			bw.newLine(); // 개행
			// 쓰고나면 밀어내준다.
			bw.flush(); // IO 끊어내는거 아니니까.
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	// ▶ 다중에코서버 (Client)
	// ▶ 다중챗팅     (Client)
	
	public static void main(String[] args) {
		
		Client me = new Client();
		
		Socket sock = null;
		InputStream is =null;
		OutputStream os = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		// 라인단위로 읽고 쓰려면 버퍼 필요
		BufferedReader br = null;
		// BufferedWriter bw = null; // 필드선언
		
		
		try {
			// 클라이언트 측에서 접속할 → IP ,포트 ▶ 입력해준다.

			// ▶ 권소현 -> IP (cmd창에서 ipconfig)
			// ▶ 127.0.0.1 / "localhost" -> 나
			
			sock = new Socket("127.0.0.1" , 5000);
			// sock = new Socket("localhost" , 5000);
			
			is = sock.getInputStream();
			os = sock.getOutputStream();
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			br = new BufferedReader(isr);
			bw = new BufferedWriter(osw);
			
			while(true){
				System.out.println("입력해주세요. >>> ");
				
				// 읽는다.
				String msg2 = br.readLine(); // 개행전까지 읽음
				ta.append(msg2 + "\n"); 
				tf.setText("");
				tf.requestFocus();
			}
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
				osw.close();
				isr.close();
				os.close();
				is.close();
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}



}
