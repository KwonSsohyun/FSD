package com.hi;

public class Ex04 {

	public static void main(String[] args) {
		// 해쉬함수
		// 다운로드 옆에는 해쉬코드 값들이 있다.
		// 비트단위 0101 을 숫자로 바꿔서 이진수를 다시 진법 변환해서  8진수 >> 16진수로 변환해서 확 줄어든다.
		// 특정숫자로 나눠 또 줄어들고, 또 나눠 또 줄어들고 >> "해쉬함수"
		// 값을 지어넣으면 특정값으로 연산을 한다. (값을 줄인다.)
		// "해쉬함수" 통해서 리턴값이 >> "해쉬코드"
		// 보안때문(암호화)

		Ex04 me = new Ex04();
		System.out.println(me); 
		// com.hi.Ex04@15db9742
		// 클래스정보 ▶ com.hi.Ex04 // 객체의 해쉬코드값 ▶ @15db9742
		
		// ▶▶ hashCode();
		// 객체의 주소값은 아니지만, 같은 객체인지 아닌지 판별하기 위해서. 
		// (같은 확률이 높은경우 비교)
		// == 은 깨끗한 거는 아니고
		// hashCode는 깨끗한 수가 줄어드니까.
		
		System.out.println("----------------------------------------------------");
		System.out.println(".split() >> 입력한 값으로 잘라내서 문자열 배열로 만든다.");
		
		// ▶▶ .split()
		// 잘라준다. > 여러개의 string으로 리턴해준다.
		String msg = "java, web, db, framwork, app";
		String[] arr = msg.split(","); // 구분기준을 준거임 // ,를 넣으면 컴마를 잘라버림
		// 없는거 집어넣으면 그대로 나온다.
		// 만약 띄어쓰기를 " "한칸 줬는데
		// msg에서 두칸 띄어쓰면 한칸은 없어지고 한칸은 빈문자열로 출력함
		
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"|");
		}
		
		System.out.println(); 
		
		// 특수문자 표현 & 안되는 문자 ▶ \\
		String msg1 = "java|web|db|framwork|app";
		String[] arr1 = msg1.split("\\|"); // 안되는 문자특수던지 \\ 앞에 붙힌다.
		System.out.println(arr1.length);
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]);
		}
		System.out.println(); 
		
		
		System.out.println("----------------------------------------------------");
		System.out.println(".compareTo() >> 같은지 다른지, 숫자로 리턴");
		
		// ▶▶ .compareTo()
		// 같은지 다른지, 다르면 얼마나 다른지 리턴
		// 얼마나 다른지 반환해준다.(연산해서 숫자로 리턴)
		
		
		// [ 비교 우선순위 ]
		//   1) 캐릭터로 뽑아서, 연산을 통해서 얼마나 다른지
		//   2) 길이가 다르면 얼마나 다른지 
	
		
		// [ 비교 결과 ] 
		//   0 : 같다.
		//   -1 : 괄호안에 적힌게 크면 얼마나 큰지 리턴
		//   1 
		
		String msg2 = "abc";
		String msg3 = "abdefg";
		System.out.println(msg2.compareTo(msg3)); // msg2 가 기준  // msg3는 this
		
		System.out.println(func(msg2, msg3));
		
		
		System.out.println("----------------------------------------------------");
		
		
	}
	
	
	public static int func(String a, String b){
		if(a.length()==b.length()){ // ▶▶ 길이가 같냐?
			char[] arr1 = a.toCharArray(); // 한글자씩 뽑아서
			char[] arr2 = b.toCharArray();
			for(int i=0; i<a.length(); i++){
				if(arr1[i] - arr2[i]!=0){ // 서로 다르면 
					return arr1[i] - arr2[i]; // 각각의 값을 대조하면서 연산함
				}
			}
			return 0; // 같다
		}else{
			return a.length()-b.length(); // ▶▶ 길이가 다르냐? >> 얼마나 길이가 다른지 연산
		}
		
	}

}
