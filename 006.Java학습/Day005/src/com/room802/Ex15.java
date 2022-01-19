package com.room802;

public class Ex15 {
	
	public static int myparse(String msg){ /// 1234
		char[] arr = msg.toCharArray(); // 문자열을 단일문자열로 분해함
		
		int sum = 0;
		int temp = 1;
		
		for(int i=0; i<arr.length; i++){
			
			sum+=(arr[arr.length-1-i]-48)*temp; // 1의 자리  // 3 2 1 0
			
			temp = temp*10; // 10의자리, 100의자리 ...
			// (arr[i]-48)*10; // 10의 자리
			// (arr[i]-48)*100; // 100의 자리
		}
		/*
		arr[0]-48; // 0
				// '0' 48
				// '1' 49
				// '2' 50
				 */
		return sum;
	}
	
	public static int func01(String msg){
		return 0;
	}

	public static void main(String[] args) {
		
		int su0 = Ex15.func01("문자열");
		System.out.println(su0);
		
		
		
		// 문자열을 숫자로 변환
		String msg = "1234"; // 반드시 숫자로만 구성되어있어야 한다.(+소숫점도안됨) (문자들어가는 순간 오류)
		//int su = Integer.parseInt(msg); // Integer의 클래스의 	parseInt 메소드 (///) -> 괄호안에 적은거 반환해줌
		// 								   static 메서드란 뜻 (new생성자 안쓰고 바로 호출해서 쓰니 말이다)
		int su = myparse(msg);
		System.out.println(su);
		// System.out.println(su+1);

	}

}
