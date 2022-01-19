package com.hi;

import java.net.*;
import java.util.Arrays;

public class Ex16 {

	public static void main(String[] args) {
		// <통신>
		InetAddress net = null;
		InetAddress[] nets = null;
		
		byte[] arr = {(byte)127, (byte)0, (byte)0, (byte)0};
		
		try {
			// 통신이어서 익셉션 발생시킴
			
			// 내 컴퓨터 이름 : LAPTOP-59HI99L2
			//// net = InetAddress.getByName("LAPTOP-59HI99L2");
			//// nets = InetAddress.getAllByName("LAPTOP-59HI99L2");
			///net = InetAddress.getByAddress(arr);
			
			// 내 컴퓨터를 가르키는 IP(본인자기 자신)
			// 운영체제 자기 자신한테 먼저 물어봄
			// host파일 위변조 -> C:\Windows\System32\drivers\etc
			////net = InetAddress.getByName("localhost");
			////nets = InetAddress.getAllByName("localhost");
			
			net = InetAddress.getByName("naver.com");
			nets = InetAddress.getAllByName("naver.com");

			//nets = InetAddress.getAllByName("naver.com");
			// 해외에서 국내 IP접속할때 (www)
			// 국내용 2개와 해외용 2개인것을 볼 수 있다.
			// nets = InetAddress.getAllByName("www.naver.com");
			
			// 도메인 이름 시스템(DNS) 
			// DNS서버 (통신사가 제공해줌)
			// ▶ DNS서버를 통해서, 가장 빠른 IP서버의 주소를 알려줌
			// naver.com이라 쳤을때 223.130.195.95 가도록 해줌
			// 구글DNS서버 8.8.8.8 쓰기도 한다.
			// dns 223.130.195.200 -> 응답해주면 브라우저는 치고 접속
			System.out.println(net.getHostName()); // naver.com
			
			// 네이버 IP서버의 주소 (0~255까지 → byte값인것임 | 대신 양수)
			// 4바이트 배열로 나타낸게 IP서버의 주소를 나타낸것임
			System.out.println(net.getHostAddress()); // 223.130.195.95
			
			// byte -> 128부터는 다시 돌아가니까
			// 위의 IP서버의 주소가 byte배열로 나온것임
			byte[] arr1 = net.getAddress();
			System.out.println(Arrays.toString(arr1)); // [-33, -126, -61, 95]
			System.out.println((byte)223);
			System.out.println((byte)130);
			System.out.println((byte)195);
			
			
			// 네이버가 하나의 서버주소만 가지고 있을 것이 아니다.
			// 다 네이버 IP서버의 주소인것을 확인할 수 있다.
			for(int i=0; i<nets.length; i++){
				net = nets[i];
				System.out.println(net.getHostName());
				System.out.println(net.getHostAddress());
			}
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
