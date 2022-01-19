package com.hi;

public class Ex08 {
	
	// 전역 변수 (클래스 변수)
	// 포문을 돌때 값이 누적
	public static int su1=0; // static
	
	// 객체의 변수 (인스턴스 변수)(맴버필드)
	public int su2=0; // non-static
	// 객체 생성을 포문안에 할경우 객체가 여러개가 되니까 누적이 아니고 초기됨

	public static void main(String[] args) {
		// func01(); >> 0 1 2
		// func01(); >> 2 3 4 // 호출할때마다 값이 누적
		/*
		Ex08 me = new Ex08();
		me.func02(); >> 0 1 2 
		me.func02(); >> 2 3 4 
		*/
		
		// 반복문
		for(int i=0; i<3; i++){
			Ex08 me = new Ex08(); // 객체를 3번 찍음 (이때 새로운객체에서 펑셩을 호출하니) 초기화됨. // 이 객체 생성을 포문에 넣으면 그럼
			me.func02(); // 이것만 넣으면 누적임
		}
		
		/*
		Ex08 me = new Ex08();
		me.func02();
		*/
	}
	
	
	public static void func01(){ // static
		System.out.println(su1);
		su1++;
		System.out.println(su1);
		su1++;
		System.out.println(su1);
	}
	
	
	public void func02(){ // non-static
		System.out.println(su2+", su1 : "+su1++); // su1++ 이건 static이니 값이 누적됨 당연함 class영역이니까
		su2++;
		System.out.println(su2+", su1 : "+su1++);
		su2++;
		System.out.println(su2+", su1 : "+su1++);
	}

}
