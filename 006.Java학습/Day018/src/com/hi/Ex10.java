package com.hi;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		// IO
		// [ 경로 ]
		// 	 ▶▶ 절대경로 / 
		//       ▶ F:\\JavaWork\\Day018\\src\\com\\hi\\Ex01.java
		
		//   ▶▶ 상대경로 (특정기준점으로 접근하는것)
		//      내가 있는 파일 위치에서 찾음
		//      ▶ .\\src\\com\\hi\\Ex01.java
		//       (. → 현재 디렉토리)
		
//		String path = "F:\\JavaWork\\Day018\\src\\com\\hi\\Ex01.java";
//		String path = ".\\src\\com\\hi\\Ex01.java";
//		String path = "F:\\JavaWork\\Day018\\src\\com\\hi";
		String path = "src\\com\\hi";
//		String path = "dist";
		
		java.io.File file = new File(path);
//		java.io.File file = new File(".\\src\\com\\hi\\Ex01.java");
		// 파일 있는지 확인 ▶ .exists()
		// 파일이 존재하느냐 (없는 파일로 객체를 생성해도 문제는 없으나 꼭 이렇게 확인을 해라)
		// 디렉토리도 확인 가능 (폴더) - 운영체제 입장에선 디렉토리도 파일임
		System.out.println(file.exists()); 
		
		// 패스(파일)경로 받아낼 수 있다.  ▶ .getPath()
		System.out.println(file.getPath());
		
		// 절대경로 반환 ▶ .getAbsolutePath() 
		// 앞에만 절대경로해주고, 내가 적어준 상대경로 처리
		System.out.println(file.getAbsolutePath());
		
		// 완벽한 절대경로 반환 ▶ .getCanonicalPath()
		// 대신 try , catch로 써야함
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일존재 여부 확인
		System.out.println("파일 : " + file.isFile());
		// 디렉토리존재 여부 확인
		System.out.println("디렉토리 : " + file.isDirectory());
		
		// 부모경로 얻어내기 ▶ .getParent()
		System.out.println(file.getParent());
		// 파일명 얻어내기 ▶ .getName()
		System.out.println(file.getName());
		
		System.out.println("읽기권한(r) : " + file.canRead());
		System.out.println("쓰기권한(w) : "+ file.canWrite());
		System.out.println("실행권한(x) : " + file.canExecute());
		
		// 파일의 사이즈 → ex(2,157 바이트)
		System.out.println(file.length() + "byte");
		
		// 롱타입의 수정한 시간 ▶ .lastModified()
		System.out.println(new java.util.Date(file.lastModified()));
		
		// 파일 어떤것들 있는지 찾아오기 ▶ 
		String[] list = file.list();
		System.out.println(Arrays.toString(list));

	}

}
