package com.hi;

import java.net.*;

public class Ex01 {

	public static void main(String[] args) {
		// 통신
		// java.net > Class URI
		// https://docs.oracle.com/javase/8/docs/api/java/net/URI.html
		
		URL url = null;
		
		// 기본          ▶ 프로토콜://도메인
		// 주소 기본요소 ▶ 프로토콜://도메인:포트번호/패~~~스?쿼리&스트링#플래그
		//                 → 패스는 계속 올 수 있다. 요청하는거니까
		//                 → 여러개 있다면 & 연결 -> 쿼리스트링
		
		try {
			url = new URL("http://naver.com");
			
			// 항목이 없으면 안나옴
			System.out.println(url.getProtocol());    // ▶ 프로토콜 
			                                          //   : 프로토콜과 :// 도메인을 구분하는게 → "://"
			System.out.println(url.getHost());        // ▶ 도메인 or IP
			System.out.println(url.getPort());        // ▶ 포트 (http(80), https(443) → 디폴트포트 -1) // 안쓰면 명시적으로 포트번호 마킹해줘야함 : 8080
			System.out.println(url.getDefaultPort()); // ▶ 디폴트 포트번호
			
			System.out.println(url.getPath());        // ▶ 요청 (어떤페이지를 요청하는지)(요청하는페이지,뎁스도 들어감디렉토리안에 파일)
			System.out.println(url.getQuery());       // ▶ 쿼리스트링 → 프로토컬(http).도메인(naver.com)./패스.? ////// → 쿼리 스트링 
			                                          //   ▶▶ ? 다음 등장하는 것
			                                          //        : https://search.naver.com/search.naver?query=%EC%95%88%EB%85%95 (전달하고 싶은 값) ?query=안녕
			                                          //          패스랑 '?' 쿼리스트링을 구분하는게 → "?(물음표)"
			System.out.println(url.getRef());         // ▶▶ # 다음 등장하는 것
			                                          //      : 한페이지에 다 있는데 클릭하면 그 위치로 가는것 ex) 탑버튼
                                                      //        페이지를 새로 요청하는 것이 아니라, 페이지에서 그 위치로 찾아가는 것			
			                                          //        쿼리스트링과 '#' 플래그를 구분하는게 → "#(샵)"
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		

	}

}
