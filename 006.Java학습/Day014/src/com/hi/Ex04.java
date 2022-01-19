package com.hi;

public class Ex04 {

	public static void main(String[] args) {
		// 10진수 실수 타입
		// ******** java.lang >> Class Double
		
		double su1 = 3.14;
		Double su2 = new Double(3.14);
		Double su3 = new Double("3.14"); // 소숫점없어도 314.0으로 실수로 출력
		System.out.println(su3);
		
		System.out.println(Double.MAX_VALUE); // E308 >> 10의 308승
		System.out.println(su2.intValue()); // 소수점 날아감 >> 3.14 ▶ 3
		
		// static double  >>  parseDouble(String s)
		System.out.println(Double.parseDouble("3.14")); // 문자열을 실수타입으로 변경
		
		
		// 체크하기 위한 기능 제공
		// isInfinite() -> 점점커지는 상황(무한)
		// inNaN() -> 계산을 할 수 없을때 (표현불가능)
//		double su4 = 1.0/0.0; // Infinity
		Double su4 = 0.0/0.0; 
		System.out.println(su4.isInfinite());  // true
		// 계산을 할 수 없을때 (표현불가능) -> inNaN()
		System.out.println(su4.isNaN());
		
		
		System.out.println("------------------------------------------------------");
		
		// ******** java.lang >> Class Float
		
		// Float(double value) -> 더블타입으로 적어도 무방
		Float su5 = new Float(3.14);
		// Float(float value)
		Float su6 = new Float(3.14F);
		// Float(String s)
		Float su7 = new Float("3.14");
		
		
		
		
		
	}

}
