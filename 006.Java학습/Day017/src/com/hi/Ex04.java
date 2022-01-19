package com.hi;

class Lec04<T1, T2>{ // 타입을 여러가지 선언 가능하다. (콤마 기준)
	T1 obj1;
	T2 obj2;
	public void setObj(T1 obj1, T2 obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void printObj(){
		System.out.println(obj1.getClass()); // 클래스 정보보기
		System.out.println(obj2.getClass()); // 클래스 정보보기
	}
}

public class Ex04 {

	public static void main(String[] args) {
		int obj1 = 1111;
		String obj2 = "java";
		// StringBuffer obj2 = new StringBuffer ("java"); -> 이런 다른 타입 적으면 락 걸림
		
		Lec04<Integer, String> lec = new Lec04<>();
		lec.setObj(obj1, obj2);
		lec.printObj();

	}

}
