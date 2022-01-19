package com.hi.step01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		// �� ����
		// ���ϸ���� �ȵ�
		// Ŭ���̾�Ʈ ��û�� ���� ���� �����ؾ���.
		// �������� ����Ѵ�.
		ServerSocket serv = null;
		Socket sock = null;
		OutputStream os = null;
		
		// �������� �����Ű��,
		// ���� Ŭ���̾�Ʈ �����Ų��.
		
		try {
			// ������ 5000��Ʈ ���� ���� �ֱ⶧����, Ŭ���̾�Ʈ�� ���� �� �ִ°�.
			serv = new ServerSocket(5000);
			System.out.println("server > Ŭ���̾�Ʈ ���� �����...");
			
			// ������ ��������鼭 ����
			// .accept() ������ �ɶ����� ���
			// ������� ������ ��ȯ ���� sock
			sock = serv.accept();
			
			InetAddress addr = sock.getInetAddress();
			// ���� �����ߴ��� �� �� ����
			System.out.println("server > " + addr.getHostAddress());
			
			// �޼��� ��� (�ƿ�ǲ��Ʈ��)
			// String msg = "ABCD";
			String msg = "ȯ���մϴ�.";
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
