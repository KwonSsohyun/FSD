package com.hi;

public class Ex02 {

	public static void main(String[] args) {
		// String 클래스가 가지고 있는 명령어
		String msg = "abcdefgc"; 
		
		
		System.out.println("----------------------------------------------------");
		System.out.println(".charAt() >> 해당 번수 출력");
		
		// ▶▶ .charAt() >> 해당 번수 출력
		char ch1 = msg.charAt(2); // 2번째 번수만 출력하겠다. (0번부터 시작)
		System.out.println(ch1);
		
		System.out.println("----------------------------------------------------");
		System.out.println(".concat() >> 문자열과 문자열 더해줌");
		
		// ▶▶ 문자열과 문자열을 더해주는 기능 ▶ .concat() ▶ 이미 더해진게 상수에 올라간다.
		String result1 = msg.concat("ABCD");
//		String result2 = msg+"ABCD";
		System.out.println(result1); 
//		System.out.println(result2); 
		System.out.println(msg);  	
//		System.out.println(msg+"ABCD"); 
		// 더하는 순간 새로운 객체를 생성한다.
		
		System.out.println("----------------------------------------------------");
		System.out.println(".indexOf >> 해당문자의 인덱스 번호 찾아줌");
		
		// ▶▶ .indexOf >> 해당문자의 인덱스 번호를 반환해줌
		System.out.println(msg);
		System.out.println(msg.indexOf('c')); // 해당번호의 인덱스 번호를 반환해줌 // 없으면 -1
		System.out.println(msg.indexOf(97)); // 97은 a // 아스키코드 
		System.out.println(msg.indexOf('c',3)); // 검색의 시작 인덱스 (난 뒤에 있는 c를 찾을거라서 2번에 인덱스는 지나치고 싶어서)
		System.out.println(msg.indexOf("fc")); // 해당하는 두 단어의 시작 인덱스 (만약 없으면 -1)
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".length() >> 문자열 길이를 반환해줌");
		
		// ▶▶ .length() >> 문자열 길이를 반환해줌 
		//     			   원리 : 단일문자로 배열 뽑아서 셈 ▷ .toCharArray()
		System.out.println(msg.length()); // 길이는 1부터 셈 (길이니까) // 8출력
		
		for(int i=0; i<msg.length(); i++){
			System.out.println(msg.charAt(i));
		}

		System.out.println("----------------------------------------------------");	
		System.out.println(".replace() >> 바꿔주는 것");
		
		// ▶▶ .replace() >> 바꾸는것 
//		String msg = "abcdefgc";
		String result3 = msg.replace('d', 'D'); // 해당하는 것들 한번에 몽땅 바꿔줌
		String result4 = msg.replace('b', 'B');
		String result5 = msg.replace("c", "C"); // 문자열도 가능
		
		String result6 = msg.replace("abcde", "cABCDe"); // 길이 상관없다.
		String result7 = msg.replace("abc", "ab"); // 삭제
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".substring() >> 해당인덱스부터 잘라서 출력");
		
		// ▶▶ .substring()
		// 인덱스번호부터 리턴 >> 잘라진 새로운 문자열을 갖고 싶을때
		// 처음과 끝을 나타내고 싶을때는 >> 처음은 0부터 세고, 뒤에서부터는 1부터 센다.
//		String msg = "abcdefgc";
		String result8 = msg.substring(3); // defgc
		String result9 = msg.substring(2,5); // 처음 0 으로 세고, ★★★뒤에는 1부터 세고 (endIndex -1) cde
		System.out.println(result8);
		System.out.println(result9);
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".toString() >> 해당자신을 뽑아내줌");
		
		// ▶▶ .toString()
		// 해당자신을 뽑아내줌
		// 기본 출력이 이 원리를 사용해서 출력해준다.
		System.out.println(msg.toString());
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".valueOf() >> 어떤 자료형이던지, 문자열로 반환해준다.");
		
		// ▶▶ .valueOf()
		// 어떤 자료형이던지, 문자열로 반환해 준다. (어떤 형이든 가능)
		// 모든 자료형을 포함하는데 왜 .valueOf() 라고 같은 이름을 쓸수 있을까? 
		//  → 오버로드 되어있기 때문에 valueOf 를 같은 이름을 쓸 수 있다.

		String result10 = String.valueOf(3.14);
		String result11 = String.valueOf(new byte[]{65,66,67});
		System.out.println(result10+1); // 문자열로 result10 반환됬기에 +1 해도 문자열처럼 뒤에 더해짐
		System.out.println(result11);
		
		System.out.println("----------------------------------------------------");	
		
		
	}

}
