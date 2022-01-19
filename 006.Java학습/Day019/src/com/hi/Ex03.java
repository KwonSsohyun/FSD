package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		File file = new File("test01.bin");
		
		if(file.exists()){
			try {
				// ▶ 읽기 ▶▶ Input
				FileInputStream is = new java.io.FileInputStream(file);
				int su = -1;
				// 한글이니까 2바이트씩 읽음
				// 근데 만약 띄어쓰기 있거나 하면 띄어쓰기는 아스키코드이니 상황에 따라 다른 것.
				// ㄹㅇ 찐 한글일때 2바이트라는 것.
				// [4] ▶ 2글자 | [6] ▶ 3글자 
				// [5] ▶ 쓰면 한글은 2바이트니까 이상한 문자 불러 들임.
				byte[] arr = new byte[4];
				
				for(int i=0; i<arr.length; i++){
					// 일어올땐 read
					su = is.read();
					
					// if(su==-1){break;}
					arr[i] = (byte)su;
					// 여기서 (byte)su 를 한 이유가
					// 22번 라인에 ▶ su = is.read();
					// 읽어온 값을 su에 대입하니
					// 읽어온 값인 su를 arr[i]에 대입해준다.
					
					// 읽어올때도 한글은 문제
					// 1바이트씩 읽어버리니 문제 -> 한글은 2바이트
					// System.out.println((char)su); // (char) 캐스팅해줌
				}
				// 생성자에 넣어주면 문자열로 만들어줌
				// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
				// 배열을 받을 수 있다. 생성자 >> String(byte[] bytes)
				String msg = new String(arr);
				System.out.println(msg);
				// 꼭 닫아준다.
				is.close();
				
				// su = is.read();
				// System.out.println(su);

				// su = is.read();
				// System.out.println(su);
	
				// 더 이상 읽을게 없으면 ▶ -1 출력
				// su = is.read();
				// System.out.println(su);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
