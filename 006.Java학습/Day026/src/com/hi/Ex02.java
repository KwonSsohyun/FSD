package com.hi;

import java.io.*;
import java.net.*;


public class Ex02 {

	public static void main(String[] args) {
		// < 웹크롤링 >
		//   : URLConnection 을 이용해서 해당 주소로 접속해서
		//     바이트스트림을 -> 문자열스트림으로 바꿔서
		//     F12 개발자도구 보는 것처럼 소스보기했을때 나오는것 다 긁어갔고 온다.
		//     콘솔에서 다 안보이면 마우스 우클릭  ▶  preferences  ▶  Console buffer size(characters) : 800000 변경
		
		// java.net > Class URLConnection
		// https://docs.oracle.com/javase/8/docs/api/java/net/URLConnection.html
		
	
		URL url = null;
		InputStream is = null;
		// 바이트스트림 → 문자열스트림
		InputStreamReader isr = null;
		BufferedReader br = null;
		// 파일로 저장 (안깨지게하려면 바이트스트림 이용)
		Writer fw = null;
		PrintWriter pw = null;
		
		try {
			url = new URL("https://www.naver.com/");
			
			// URLConnection → (주소 접속하는것)
			URLConnection conn = url.openConnection();
			is = conn.getInputStream();
			isr = new InputStreamReader(is, "UTF8"); // 바이트스트림 → 문자열스트림 바껴짐 // ▶ "UTF8" 한글도 안깨지고 나옴
			br= new BufferedReader(isr);  // 버퍼에 담아서 바로 쓴다.
			
			// 파일로 저장
			fw = new FileWriter("naver.html");
			pw = new PrintWriter(fw);
			
			String msg = null;
			while((msg = br.readLine())!=null){ // 읽을게 있으면 계속 와일문 돔
				pw.println(msg);
			}
			
			pw.close();
			fw.close();
			br.close();
			isr.close();
			is.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
