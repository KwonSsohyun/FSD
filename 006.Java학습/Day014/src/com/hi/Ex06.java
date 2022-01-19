package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		
		// ******** java.lang >> Class Character
		// 문자열가지고 확인할때 많이 사용됨.
		
		// 필드 -> 특정문자를 뽑아놓은 것들을 놓음
		// Character.MIN_VALUE -> '\u0000'
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.FORMAT); // 범위
		
		// 생성자
		// Constructor Summary
		// Character(char value)
		char ch1 = '@';
		Character ch2 = new Character('A');
//		Character ch3 = new Character(65); // 그냥 숫자만 적으면 안됨.
		Character ch3 = new Character((char)65);
		
		
		// 문자로 적었냐? ▶ .isAlphabetic()
		// 문자구성범위 >> 숫자, 글자(알파벳, 한글), 특수문자
		System.out.println(ch1 + "은 유니코드 냐? " + Character.isDefined(ch1));
		System.out.println(ch1 + "은 글자 냐? " + Character.isAlphabetic(ch1));
		System.out.println(ch1 + "은 글자 냐? " + Character.isLetter(ch1));
		
		System.out.println(ch1 + "은 숫자 냐? " + Character.isDigit(ch1));

		// 공백에 해당하는 문자들 >> \t / \n 
		// isWhitespace(char ch)
		System.out.println(ch1 + "은 띄어쓰기 냐?" + Character.isWhitespace(ch1));
		System.out.println(ch1 + "은 띄어쓰기 냐?" + Character.isSpace(ch1)); // 없어짐
		
		// 대문자냐? 소문자냐? 인데
		// 나중에 영어냐? 할때도 체킹할 수 있는것.
		// 단일문자니까 이게 대문자냐 소문자냐 하면 영어니까. (둘중 어디든 해당하면 말이다.)
		System.out.println(ch1 + "은 대문자 냐?" + Character.isUpperCase(ch1));
		System.out.println(ch1 + "은 소문자 냐?" + Character.isLowerCase(ch1));
		
		
		
		
		
		
		
		
		
		
		
	}

}
