package com.hi.step02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	// ▶ 에코서버 (Server)
	
	public static void main(String[] args) {
		int port = 5000;
		ServerSocket serv = null;
		Socket sock = null;
		InputStream is = null;
		OutputStream os = null;
		
		// 문자열스트림으로
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		try {
			serv = new ServerSocket(5000);
			sock = serv.accept();
			
			is = sock.getInputStream();
			os = sock.getOutputStream();
			
			isr = new InputStreamReader(is);
			osw = new OutputStreamWriter(os);

			while(true){
				// 1바이트만 읽고 쓴다.
				// 클라이언트는 2바이트 보낸다.
				// 미스매칭 나니까 문제
				int su = isr.read();
				osw.write(su);
				osw.flush();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				is.close();
				serv.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
