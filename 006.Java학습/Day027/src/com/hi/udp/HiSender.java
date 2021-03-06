package com.hi.udp;

import java.io.IOException;
import java.net.*;

public class HiSender { // 보낸 사람
	
	public static void main(String[] args){
		
		byte[] ip = {127,0,0,1};
		int port = 5000;
		DatagramSocket sock = null;
		DatagramPacket pack = null;
		// 일정한 피켓단위를 보낸다.
		// 약속을 먼저 정하고, 보낸다.
		// 데이터 사이즈를 일정하게 보내겠다. -> UDP
		// 영상쪽에서 많이 쓰인다. 순수픽셀값이라고 한다면 데이터사이즈 일정 (압축되지 않은 순수데이터)
		// 압축가공 (실시간 스트리밍)
		String msg = "한글";
		// String msg = "send udp";
		// String msg = "udp로 발송하는 메시지";
		
		try {
			InetAddress addr = InetAddress.getByAddress(ip);
			// 소켓 (UDP)
			// 각 피켓에 정보를 실어서 보낸다.
			sock = new DatagramSocket();
			// pack = new DatagramPacket(보낼데이터, 데이터의 길이, 주소 , 포트)
			pack = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, port);
			sock.send(pack);
			
			// 2번 보냄 (보통 먼저 쏜놈을 먼저 받는다.)
			msg = "보냄";
			pack = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, port);
			sock.send(pack);
		
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sock.close();
		}
		
		
	}
}
