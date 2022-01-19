package com.hi;

// 와일드처리
import java.io.*;

public class Ex05 {

	public static void main(String[] args) {
		// IO의 스트림간 전환
		// byteStream → StringStream ▶ 바꾸는 것
        // 자바만 제공하는 특별한 스트림 StringStream
		
		OutputStream os = null;
		
		// 문자열스트림 전환
		// OutputStreamWriter osw = null;
		// OutputStreamWriter은 extends Writer 을 상속받기에
		// Writer 가능
		Writer osw = null;
		BufferedWriter bw = null;
		
		try {
			os = new FileOutputStream("test05.txt"); // 확장자 txt > 문자열 쓰겠다는것
			// 전환됨
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			// 전환된걸 확인해볼 수 있다.
			// osw.write("문자열");
			bw.write("문자열");
			bw.newLine(); // 개행
			bw.write("문자열2");
			bw.newLine(); // 개행
	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 클로즈 꼭 해줘야함 -> 안그럼 내용 날림
				bw.close();
				osw.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
