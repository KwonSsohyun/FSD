package com.hi.udp;

import java.io.IOException;
import java.net.*;
import java.util.Arrays;

public class HiReceiver { // 받는 사람
	
	// ▶ 받는 사람이 먼저 열기 (지금 케이스만 해당 → 실행순서 서로가 바껴도 상관없음)
	// 찾아와도 문을 안열어주면 못들어오니까.

	public static void main(String[] args) {
		
		DatagramSocket sock = null;
		DatagramPacket pack = null;
		
		try {
			sock = new DatagramSocket(5000);
			
			// 뭘 보냈는지 모르면 받을 수가 없다. (피켓단위로 받고, 없으면 데이터 유실)
			// 보내는 쪽이 얼마를 보내는지 알아야 한다.
			// 받는쪽이 얼마를 받는지 
			// [10] 이라 적으면 -> [0,0] 추가로 된다. 이미지나 동영상이 었으면 깨진다.
			byte[] buf = new byte[4]; // 한글이면 2바이트씩
			pack = new DatagramPacket(buf, buf.length);
			sock.receive(pack);
			System.out.println(Arrays.toString(buf));
			System.out.println(new String(buf));
			
			// 2번 받음
			pack = new DatagramPacket(buf, buf.length);
			sock.receive(pack);
			System.out.println(Arrays.toString(buf));
			System.out.println(new String(buf));
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sock.close();
		}

	}

}
