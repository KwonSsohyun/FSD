package com.hi;

import java.io.File;

public class Ex14 {

	public static void main(String[] args) {
		
		// ▶▶ dist 디렉토리(폴더) 지우기
		//    만약 해당 폴더 안에 파일이 있다면 안지워짐
		//    (디렉토리가 비어있지 않기 때문)
		//    → 디렉토리 들어가서 지우고 실행하면 됨.
		
//		File file = new File("test2.txt");
		File file = new File("dist2");
		
		if(file.exists()){
			boolean boo = file.delete();
			// 지워지면 true;
			System.out.println(boo);
		}else{
			System.out.println("파일이 없습니다.");
		}
		
		// 왼쪽 사이드바에서 파일 지워진 것을 확인하고 싶다면
		// 오른쪽 커서 

	}

}
