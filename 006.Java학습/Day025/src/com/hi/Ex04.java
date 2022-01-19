package com.hi;
// 최상위에는 InputStream
// import java.io.InputStream;
import java.io.*;

public class Ex04 { // 읽어옴

	public static void main(String[] args) {
		InputStream is = null;
		ObjectInputStream ois = null;
		
		// 받는측에서 실행가능한 클래스 Ex03이 있어야 한다.
		// 썻을때의 파일이 아니다.
		// Serializable 직렬화는 된다. (허용했을때와 다르게 받게 되있다.)
		
		// 동일한 클래스인데 왜 안되냐.
		// 동일하지 않다.
		// Serializable ▶ serialVersionUID 을 붙히게 되어있다.
		
		try {
			// 다형성에 따라 InputStream 엄마타입으로 자식 읽어올 수 있다.
			// is = System.in;
			is = new FileInputStream("test02.bin");
			ois = new ObjectInputStream(is);
			
			String msg = (String)ois.readObject();
			System.out.println(msg);
			
			// 캐스팅하는하는거랑 같은 소스 코드인지 비교
			// public static int serialVersionUID = 1; 숫자로 같은지 판별
			// ★ 받는측에서 ▶ Ex03((컴파일된 클래스 파일))이 있어야 ▶ 캐스팅 가능 (쓸때와 동일해야함)
			// 보장성을 만들어주는게 ▶ private static final long serialVersionUID = 1L;
			// private static final long serialVersionUID = 1L;
			// 숫자를 똑같이 맞추면 된다.
			Ex03 me = (Ex03)ois.readObject();
			System.out.println(me.su1);
			// 값을 안보내는거지, 자료형은 살아있어서 > 0 
			// 디폴트값
			System.out.println(me.su2);
			System.out.println(me.su3);
			// 메서드 호출
			me.func();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) { // 트라이캐치가 자동생성된다.
			e.printStackTrace();
		} finally{
			
			try {
				ois.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
