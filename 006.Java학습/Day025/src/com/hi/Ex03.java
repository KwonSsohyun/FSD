package com.hi;

// OutputStream 이 FileOutputStream 부모임

import java.io.ObjectOutputStream;
import java.io.OutputStream; // 추상클래스 -> 타겟이 없다.
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

// ★ < 객체 직렬화 > → Serializable 인터페이스 상속
public class Ex03 implements Serializable{ // 쓰기 위한 파일
	
	// 자동으로 붙게되는 serialVersionUID
	// 숫자는 랜덤하게 찍힌다.
	// 수정하면 랜덤하게 숫자가 바뀐다.
	// 이 숫자를 똑같이 맞추면 된다.
	// private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	// 수정을 하면 버전을 숫자를 바꾸면 되니까.
	// 그럼 수정본과 원본을 구분할 수 있다.
	// Serializable 상속받으면 옆에 노란 전구 보일 것이다.
	// 첫번째거 (version ID) 클릭하면 됨.

	// 소스코드 바꿀때마다 바꿔준다.
	private static final long serialVersionUID = 3L;
	// 쓸때와 읽을때 버전 같아야함
	
	int su1 = 1111;
	
	// 얘는 안보내고 싶으면? ▶ transient
	// 직렬화 대상에서 제외시키는 것
	// 읽는 곳에서 확인해보면 디폴트값인 0이 나온다.
	transient int su2 = 2222; // transient int su2;
	
	
	int su3 = 3333;
	
	 // int su = 2222;
	 // private static final long serialVersionUID = 2L;
	 // 이렇게 하고 Ex04에서 읽으면 오류남
	/**
	 * 
	 */
	// 메서드를 직렬화 대상에서 제외시키고 싶다면?
	// 값은 변경이 되니까 쓰는데 의미가 있지만
	// 메서드는 뭘 쓸건데 -> 그래서 직렬화 대상이 아님
	// 객체에는 메서드가 없음
	// 메서드는 스택에서 실행됨 (가운데영역)
	// 문서상으로는 객체에는 필드와 메서드가 찍힌다.
	public void func(){
		System.out.println("메서드는 직렬화 대상이 아닙니다.");
	}

	public static void main(String[] args) {
		OutputStream os = null;
		ObjectOutputStream oss = null;
		
		try {
			// 다형성에 따라 OutputStream 엄마타입으로 자식 읽어올 수 있다.
			// os = System.out;
			os = new FileOutputStream("test02.bin");
			oss = new ObjectOutputStream(os);
			
			// 최상위에는 오브젝트가 있으니까
			// 다만 읽어올때 캐스팅 필요
			oss.writeObject("문자열");
			
			///////////////////////////////////////
			// 안되는것이 있다.
			// ▶ implements Serializable
			//   상속받으면 내 객체도 쓸 수 있다.
			Ex03 me = new Ex03();
			me.su3 = 2222;
			oss.writeObject(me);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oss.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
