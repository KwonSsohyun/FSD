package com.hi;

import java.io.*;

import javax.imageio.stream.FileImageInputStream;

public class Ex06 {

	public static void main(String[] args) {
		// IO�� ��Ʈ���� ��ȯ
		// byteStream �� StringStream �� �ٲٴ� ��
        // �ڹٸ� �����ϴ� Ư���� ��Ʈ�� StringStream
		
		// �о���̱�
		
		InputStream is = null;
		Reader isr = null;
		BufferedReader br = null;
		
		try {
			is = new FileInputStream("test05.txt");
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			System.out.println(br.readLine()); // ���� ������ �о�Ͷ�
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();	
				isr.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

	}

}
