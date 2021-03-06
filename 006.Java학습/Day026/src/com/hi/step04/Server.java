package com.hi.step04;

import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Server extends Thread{ // 쓰레드 상속
	
	// ▶ 다중에코서버 (Server)
	// ▶ 다중챗팅     (Server)
	
	// 필드
	static ArrayList<Socket> list = new ArrayList<>();
	Socket sock = null;
	
	
	// 쓰는 작업
	public void sayAll(String msg) throws IOException{
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		for(int i=0; i<list.size(); i++){
			Socket sock = list.get(i);
			
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write(msg);
			bw.newLine(); // -> 개행이 빠져서 개행 다시 넣어줌
			bw.flush();
			
		}
		
	}
	
	@Override
	public void run(){ 			
			InputStream is = null;
			OutputStream os = null;
			// 문자열로 바꾸고
			InputStreamReader isr = null;
			OutputStreamWriter osw = null;
			// 버퍼
			BufferedReader br = null;
			BufferedWriter bw = null;
			////////////////////////////////////
			
			try {
				is = sock.getInputStream();
				os = sock.getOutputStream();
				isr = new InputStreamReader(is);
				osw = new OutputStreamWriter(os);
				br = new BufferedReader(isr);
				bw = new BufferedWriter(osw);
				///////////////////////////////
				
				while(true){
					String msg = br.readLine(); // 개행단위로 읽어옴 
					
					// 반복문 빠져나가기
					if(msg.equals("exit")){
						break;
					}
					sayAll(msg);
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					// 생성의 역순으로 클로즈
					bw.close();
					br.close();
					osw.close();
					isr.close();
					os.close();
					is.close();
					sock.close();
					///////////////////////////
				} catch (IOException e) {
					// e.printStackTrace(); -> 이거 안찍으면 빨간 글자 안나옴
				}
			}
			

		}


	

	public static void main(String[] args) {
		ServerSocket serve = null;
		// Socket sock = null; // 필드로 뺌

		////////////////////////////////////
		
		try { // 서버소켓만 남기고 지우기 // 메인도 하나의 쓰레드
			// 접속만 받음
			serve = new ServerSocket(5000);
			
			while(true){
				Server thr = new Server();
				thr.sock = serve.accept(); // 연결된 소켓 // 여러번 연결해야 다중이용가능
				// 별도로 돌려야함 (접속하나당 쓰레드 하나)
				////////////////////////////////
				// 쓰레드 코드
				thr.start();
				list.add(thr.sock); // 들어온것마다 담김
				///////////////////////////////
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				serve.close();
				///////////////////////////
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
