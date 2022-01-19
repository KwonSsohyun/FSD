package com.hi.step02;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
	
	// ▶ 에코서버 (Client)

	public static void main(String[] args) {
		Socket sock = null;
		InputStream is = null;
		OutputStream os = null;
		
		// 문자스트림 변환
		OutputStreamWriter osw = null;
		InputStreamReader isr = null;
		
		try {
			sock = new Socket("localhost", 5000);
			os = sock.getOutputStream();
			is = sock.getInputStream();
			osw = new OutputStreamWriter(os);
			isr = new InputStreamReader(is);
			Scanner sc = new Scanner(System.in);
			
			int su = -1;
			// byte[] arr = "한글".getBytes();
			// String msg = "한글로 작성합니다.";
			while(true){
			String msg = sc.nextLine();
			
			// 서버가 해당내용을 받아서 나한테 다시 쏴줬다.
			// 한번만 보내는 것으로 해놧는데
			// 나도 무한루프 돌고 싶다.
			for(int i=0; i<msg.length(); i++){
					osw.write(msg.charAt(i));
					// 버퍼에 담아놓고 처리
					// 꽉차지 않거나 클로즈 안되면 안됨
					// 문자열스트림 자체가 버퍼가 생김
					// 문자를 처리하기 위한 버퍼
					// 밀어내지 않고 버퍼에만 담겨있다.
					// 서버, 클라이언트 모두 형 맞춰서 문자열스트림 해도 1바이트 체계로 읽어서
					// flush() 해줘야한다.
					// 파일을 통신하다보니 생겨나는 문제
					// 실시간으로 받아보니 생기니
					osw.flush();
					su = isr.read();
					System.out.print((char)su);
			}
			}
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
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
