package com.room802;

public class Ex10 {

	public static void main(String[] args) {
		
		String bar = "----------------------------------------------------------------";
		// String msg = "";
		int kor, eng, math, sum;
		double avg;
		
		kor = 96;
		eng = 84;
		math = 72;
		sum = kor+eng+math;
		avg = sum*100/3/100.0;
		
		// (운영체제 부담 덜가기위해)
		// String 문자열 자료형 : 한번에 출력하기 위해서 쓴다. (운영체제에 요청하기 때문에 여러번보다는 한번만 요청하는것이 좋음)
		String msg = bar + "\n국어 : " + kor + "\t| 영어 : " + eng + "\t| 수학 : " + math + "\n";
		msg += bar + "\n합계 : " + sum + "\n평균 : " + avg + "\t(소수둘째까지 출력)\n" + bar + "\n학점 : ";		
		
		int su = (int)avg/10; // 평균값의 10의 자리 숫자
		
		if(su == 10 || su == 9){
			msg += "A"; // msg = msg + "A";
		}
		else if(su == 8){
			msg += "B"; // msg = msg + "B";
		}
		else if(su == 7){
			msg += "C"; // msg = msg + "C";
		}
		else if(su == 6){
			msg += "D"; // msg = msg + "D";
		}
		else{
			msg += "F"; // msg = msg + "F";
		}
		msg += "학점";
		
		System.out.println(msg); // 한번에 얘기하니까 컴퓨터 입장에서는 부담이 덜된다. 그래서 String(문자열) 타입을 쓴다.
        
	}

}
