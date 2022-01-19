package com.hi;

import java.io.File;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) {
		
		File file = new File("test2.txt");
		if(file.exists()){
			System.out.println("존재합니다.");
		}else{
			try{
				// 파일 생성하는 여부 측정
				boolean boo = file.createNewFile();
				if(boo){
					System.out.println("파일생성");
				}else{
					System.out.println("파일생성실패");
				}
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}

	}

}
