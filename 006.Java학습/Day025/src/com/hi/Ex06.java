package com.hi;

import java.io.*;

import javax.imageio.stream.FileImageInputStream;

public class Ex06 {

	public static void main(String[] args) {
		// IO의 스트림간 전환
		// byteStream → StringStream ▶ 바꾸는 것
        // 자바만 제공하는 특별한 스트림 StringStream
		
		// 읽어들이기
		
		InputStream is = null;
		Reader isr = null;
		BufferedReader br = null;
		
		try {
			is = new FileInputStream("test05.txt");
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			System.out.println(br.readLine()); // 개행 단위로 읽어와라
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
