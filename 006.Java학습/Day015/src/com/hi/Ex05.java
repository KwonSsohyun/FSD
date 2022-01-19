package com.hi;

interface Inter{
	// 정의가 되있어야 호출가능
	void func02();
}

class Lec05{
	public static Inter func01(){
		class Local implements Inter{ // non-static 클래스 // 인터페이스 상속받음
			public void func02(){
				System.out.println("로컬클래스 기능");
			}
		}
		// 호출하려고.
//		Local local = new Local();
//		local.func();
		// new Local().func02();
		return new Local();
	}
}

public class Ex05 {

	public static void main(String[] args) {
//		Lec05.func01();
//		.func02();
		Inter local = Lec05.func01();
		local.func02();

	}

}
