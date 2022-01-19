package com.hi.step01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		// ▶ 서버
		// 소켓만들면 안됨
		// 클라이언트 요청한 만든 소켓 연결해야함.
		// 서버소켓 사용한다.
		ServerSocket serv = null;
		Socket sock = null;
		OutputStream os = null;
		
		// 서버먼저 실행시키고,
		// 다음 클라이언트 실행시킨다.
		
		try {
			// 서버가 5000포트 문을 열고 있기때문에, 클라이언트가 들어올 수 있는것.
			serv = new ServerSocket(5000);
			System.out.println("server > 클라이언트 입장 대기중...");
			
			// 소켓이 만들어지면서 등장
			// .accept() 접속이 될때까지 대기
			// 만들어진 소켓을 반환 받음 sock
			sock = serv.accept();
			
			InetAddress addr = sock.getInetAddress();
			// 누가 접속했는지 알 수 있음
			System.out.println("server > " + addr.getHostAddress());
			
			// 메세지 출력 (아웃풋스트림)
			// String msg = "ABCD";
			String msg = "환영합니다.";
			os = sock.getOutputStream();
			os.write(msg.getBytes());
			os.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				sock.close();
				serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
