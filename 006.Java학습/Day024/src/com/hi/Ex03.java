package com.hi;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex03 {

	public static void main(String[] args) {
		File file = new File("text03.txt");
		
		if(!file.exists()){
			try {
				file.createNewFile();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileOutputStream fos= new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos); // 버퍼를 사용해서 성능을 높이겠다.
			PrintStream ps = new PrintStream(bos); // 문자열을 쉽게 쓰겠다는것.
			
			// 해당내용대로 text03.txt ▶ 써진것을 볼 수 있다.
			// 문자열만 적어야 한다.
			// bos.write("문자열".getBytes());
			// bos.write("\r\n".getBytes()); // -> 개행 (윈도우: "\r\n") (나머지 : "\n")
			// bos.write("문자열".getBytes());
			
			// 성능이 높은 문자열을 쉽게쓰겠다.
			// println print 은 프린트스트림만 쓸수 있는 메서드
			ps.println("문자열"); // 개행 알아서 해줌 (해당 운영제체에 맞춰서)
			ps.print("문자열");
			
			// 빨대꽂은 역순으로 클로즈
			ps.close();
			bos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
