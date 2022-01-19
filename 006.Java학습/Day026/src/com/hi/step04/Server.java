package com.hi.step04;

import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Server extends Thread{ // ������ ���
	
	// �� ���߿��ڼ��� (Server)
	// �� ����ê��     (Server)
	
	// �ʵ�
	static ArrayList<Socket> list = new ArrayList<>();
	Socket sock = null;
	
	
	// ���� �۾�
	public void sayAll(String msg) throws IOException{
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		for(int i=0; i<list.size(); i++){
			Socket sock = list.get(i);
			
			os = sock.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write(msg);
			bw.newLine(); // -> ������ ������ ���� �ٽ� �־���
			bw.flush();
			
		}
		
	}
	
	@Override
	public void run(){ 			
			InputStream is = null;
			OutputStream os = null;
			// ���ڿ��� �ٲٰ�
			InputStreamReader isr = null;
			OutputStreamWriter osw = null;
			// ����
			BufferedReader br = null;
			BufferedWriter bw = null;
			////////////////////////////////////
			
			try {
				is = sock.getInputStream();
				os = sock.getOutputStream();
				isr = new InputStreamReader(is);
				osw = new OutputStreamWriter(os);
				br = new BufferedReader(isr);
				bw = new BufferedWriter(osw);
				///////////////////////////////
				
				while(true){
					String msg = br.readLine(); // ��������� �о�� 
					
					// �ݺ��� ����������
					if(msg.equals("exit")){
						break;
					}
					sayAll(msg);
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					// ������ �������� Ŭ����
					bw.close();
					br.close();
					osw.close();
					isr.close();
					os.close();
					is.close();
					sock.close();
					///////////////////////////
				} catch (IOException e) {
					// e.printStackTrace(); -> �̰� �������� ���� ���� �ȳ���
				}
			}
			

		}


	

	public static void main(String[] args) {
		ServerSocket serve = null;
		// Socket sock = null; // �ʵ�� ��

		////////////////////////////////////
		
		try { // �������ϸ� ����� ����� // ���ε� �ϳ��� ������
			// ���Ӹ� ����
			serve = new ServerSocket(5000);
			
			while(true){
				Server thr = new Server();
				thr.sock = serve.accept(); // ����� ���� // ������ �����ؾ� �����̿밡��
				// ������ �������� (�����ϳ��� ������ �ϳ�)
				////////////////////////////////
				// ������ �ڵ�
				thr.start();
				list.add(thr.sock); // ���°͸��� ���
				///////////////////////////////
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				serve.close();
				///////////////////////////
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
