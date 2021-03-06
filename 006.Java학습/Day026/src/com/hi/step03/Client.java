package com.hi.step03;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client {

	// ▶ 다중에코서버 (Client)
	// ▶ 다중챗팅     (Client)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket sock = null;
		InputStream is =null;
		OutputStream os = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		// 라인단위로 읽고 쓰려면 버퍼 필요
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		try {
			// 클라이언트 측에서 접속할 → IP ,포트 ▶ 입력해준다.
			// 선생님 컴터 연결 
			sock = new Socket("192.168.0.105", 5000);
			
			is = sock.getInputStream();
			os = sock.getOutputStream();
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);
			br = new BufferedReader(isr);
			bw = new BufferedWriter(osw);
			
			while(true){
				System.out.println("입력해주세요. >>> ");
				String msg = sc.nextLine();
				
				bw.write(msg);
				bw.newLine(); // 개행
				// 쓰고나면 밀어내준다.
				bw.flush(); // IO 끊어내는거 아니니까.

				// 반복문 빠져나가기
				if(msg.equals("exit")){
					break;
				}
				
				// 읽는다.
				String msg2 = br.readLine(); // 개행전까지 읽음
				System.out.println(msg2);
				
				
				
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
