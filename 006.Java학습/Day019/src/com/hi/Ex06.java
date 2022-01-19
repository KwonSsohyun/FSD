package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		File file = new File("test05.txt"); // aaa/nbbb/nccc -> 이렇게 있다고 치자.
		
		// 한번에 5글자씩 읽어옴.
		// 한글일 경우 2바이트!!! ▶ 참조 Ex03
		byte[] buf = new byte[5];
		
		try {
			// 읽기 -> Input
			// 통로를 만들어준다.
			FileInputStream fis = new FileInputStream(file);
			
			while(true){
				//  aaa/nbbb/nccc 
				//       ▲ 여기까지 읽었다면 자동으로 안읽은 그 다음부터 읽는다.
				
				// 통로에서 읽는다. (buf) -> 5개 갯수만큼 읽는다. -> 그 갯수를 su로 줌
				int su = fis.read(buf);
				
				// -1이면 읽는게 없다는것이니까 while문 빠져나감
				if(su==-1){break;}
				
				// (5개 읽어온걸, 0, 몇개 읽었는지)를 문자열로 바꿔줌
				// 뒤에 break;가 없으니까. 다시 while 안빠져나오고 무한루프 (그러니 계속 읽음)
				System.out.println(new String(buf, 0, su));
				
				// String(byte[] bytes, int offset, int length)
				// 생성자에 써있음
				// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
				// (읽어온바이너리데이터 , 인덱스번호(처음부터0) , 갯수)
				// 약간 느낌 어레이카피랑 비슷한 내부적으로 캐릭터배열을 쓴다는걸 엿볼 수 있다.
				
				// System.out.println(su);
				// su가 갯수
				// 첫번째 5개 읽고 -> 두번째 1개 읽음
				
				// 바이트 배열을 가지고 문자열 만듬
				// System.out.println(new String(buf));
				
				// 확인해보면 없는것도 다 출력을 5개를 맞춰서 한다.
				// 배열에 담아서 읽어오니 생기는 문제
				// 사이즈가 딱 떨어지지 않으면, 기존데이터가 남는다.(쓰레기 데이터)
				// 123456 -> 1234562345

				System.out.println(Arrays.toString(buf));
				// 해당코드 배열로 아래보면, 
				// aaa -> [97, 97, 97, 13, 10]
				// 글자는 3개인데 배열로 확인해보니 5개씩 찍어내는 것을 볼 수 있다.
			}
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
