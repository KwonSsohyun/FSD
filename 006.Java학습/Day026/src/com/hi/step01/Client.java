package com.hi.step01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		// ▶ 클라이언트
		// 서버에 접속 -> "IP, 포트번호" 필요
		
		
		String ip = "127.0.0.1";
		// 클라이언트도 서버랑 똑같이 5000포트로 적어줘야 서버 접속 가능
		int port = 5000; // ~1024 (기존에 있는 포트번호는 건들면 안됨) ▶ ~2000번 이후로 써야함 
		
		Socket sock = null;
		InputStream is =null;
		InputStreamReader isr = null;
		
		// IO 수반하니까 트라이 캐치
		try {
			sock = new Socket(ip,port);
			System.out.println("client > 접속요청했습니다.");
			
			// 인풋스트림으로 얻어옴
			is = sock.getInputStream();
			// System.out.println(is.read()); // A → 65
			// System.out.println(is.read()); // B → 66
			// System.out.println(is.read()); // C → 67
			// System.out.println(is.read()); // D → 68
			// System.out.println(is.read()); // 읽을게 없으면 → -1
			
			// 받는쪽에서 한글 받을 수 있게 ▶ 바이트스트림 → 문자열스트림으로 변환 ▶ InputStreamReader
			isr = new InputStreamReader(is);
			
			int su = -1; // 읽을게 없으면 → -1
			while((su=isr.read())!=-1){
				System.out.print((char)su); // 단일문자로 나오게 형변환
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				isr.close();
				is.close();
				sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
