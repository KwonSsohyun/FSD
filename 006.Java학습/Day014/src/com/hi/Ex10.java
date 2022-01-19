package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		
		// ********* java.lang  >>  Class System
		
		// 	arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//  arraycopy  ▶ 배열의 깊은 복사
		
		
		// 시간이 롱 타입으로 전달됨
		// 1000분의 1이니까 1초당 1000씩 숫자 늘어남
		// 시간의 연산이 필요할때 씀
//		System.out.println(System.currentTimeMillis());
		long before = System.currentTimeMillis();
		for(int i=0; i<1000000; i++){
			Ex10 me = new Ex10();
		}
		long after = System.currentTimeMillis();
		System.out.println(before);
		
		
		
		// 개행이 운영체제마다 다르기때문에 
		// lineSeparator()
		// "\r\n" -> 윈도우
		// "\n"   -> 맥, 리눅스
		// 알아서 개행 씀 운영체제에 맞춰서
		System.out.println(System.lineSeparator()); // 한줄 개행
		String newLine = System.lineSeparator(); // 이렇게 변수에 담아서 개행 할때마다 써도 됨
		
		
		System.out.println(after);
		System.out.println(after - before); // 0.004초 걸림 (객체 찍어내는데 걸린 시간)

	}

}
