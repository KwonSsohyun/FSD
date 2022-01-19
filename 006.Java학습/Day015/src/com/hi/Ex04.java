package com.hi;

class Outter05{
	public static int su1 = 1111;
	public int su2 = 2222;
	
	public Outter05(){}
	
	public static void func01(final int su5){ // 메소드 호출전까지는 존재 안하니 호출해야만 class사용 가능 (해당 메서드 안에서만)
		// 로컬클래스
		class Inner05{ // 실행을 해야만 올려가지니 앞에 static 못 붙힘
			int su5 = 5555;                     // jdk 1.8부터 final 생략 가능
			// final int su5 = 5555;            // 이하버전은 무조건 final 붙혀야함
			public final static int su3 = 3333; // final 은 가능
			public int su4 = 4444;
			public Inner05(){}
			public void func03(){
				System.out.println(su4);
				System.out.println(su1);
				// 같은 non-static이면 가능했는데 su2는 불가
				// System.out.println(su2);
				System.out.println(su3);
				System.out.println(su5);
			}
			
		}
		
		// su5++; // 오류남 final을 값 바꾼다는거니까
		
		// 이렇게 해서 사용할 수는 있다. (메소드 안에서만)
		// Inner05는 non-static이니까 객체 생성
		
		// final static ->> su3 호출
		//System.out.println(Inner05.su3);
		
		// non-static ->> su4 호출
		Inner05 inn = new Inner05(); 
		// System.out.println(inn.su4);
		inn.func03();
	}
	

}

public class Ex04 {

	public static void main(String[] args) {
		Outter05.func01(6666); // 여기 5555를 값 못 바꾼다는게 아니라 해당 메서드안에서 값을 못 바꾼다는 말

	}

}
