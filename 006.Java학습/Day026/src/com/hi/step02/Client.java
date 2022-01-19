package com.hi.step02;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
	
	// �� ���ڼ��� (Client)

	public static void main(String[] args) {
		Socket sock = null;
		InputStream is = null;
		OutputStream os = null;
		
		// ���ڽ�Ʈ�� ��ȯ
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
			// byte[] arr = "�ѱ�".getBytes();
			// String msg = "�ѱ۷� �ۼ��մϴ�.";
			while(true){
			String msg = sc.nextLine();
			
			// ������ �ش系���� �޾Ƽ� ������ �ٽ� �����.
			// �ѹ��� ������ ������ �؇J�µ�
			// ���� ���ѷ��� ���� �ʹ�.
			for(int i=0; i<msg.length(); i++){
					osw.write(msg.charAt(i));
					// ���ۿ� ��Ƴ��� ó��
					// ������ �ʰų� Ŭ���� �ȵǸ� �ȵ�
					// ���ڿ���Ʈ�� ��ü�� ���۰� ����
					// ���ڸ� ó���ϱ� ���� ����
					// �о�� �ʰ� ���ۿ��� ����ִ�.
					// ����, Ŭ���̾�Ʈ ��� �� ���缭 ���ڿ���Ʈ�� �ص� 1����Ʈ ü��� �о
					// flush() ������Ѵ�.
					// ������ ����ϴٺ��� ���ܳ��� ����
					// �ǽð����� �޾ƺ��� �����
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
