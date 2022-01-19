package com.hi;

import java.io.IOException;
import java.io.InputStream;

public class Ex09 {

	public static void main(String[] args) {
		// 1바이트만 읽으니
		// ab를 쳐도 -> 97 나옴
		InputStream is = System.in;
		
		try { // 'a' -> 97 13(\r) 10(\n)
			  //        엔터를 치면 윈도우는 (\r)(\n)
			  //        인식하기에 13,10이 나온다.
			  //        └ 엔터를 한것도 io가 읽어드린다.
			  //        └ 탭은 9
			  //        └ 스페이스바는 32
			
			// abc를 치면
			// -> 97 98 99
			//    나오지만 3개만 읽으니 뒤에 13(\r) 10(\n) 안나옴
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
