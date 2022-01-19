package com.hi;

import java.io.File;

public class Ex15 {

	public static void main(String[] args) {
		
		// ▶▶ dist 디렉토리(폴더) 만들기
		
		File file = new File("./dist2"); // 현재경로에 준다.
		
		if(file.exists()){
			System.out.println("동일 폴더가 존재합니다.");
		}else{
			// 없으면 디렉토리(폴더) 만들기
			boolean boo = file.mkdir();
			System.out.println(boo);
		}

	}

}
