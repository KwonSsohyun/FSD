package com.hi;

class Ball{	
	// 필드
	// 공넘버, 공색깔, 뽑은공인지아닌지 체크
	int num;
	String color;
	boolean check;
	
	
	
	// 생성자 
	Ball(int num){
		this.num = num;
		this.check = true; // 뽑았던 공은 false로 바꿀거임
		if(num<10){ 	  // 1 ~ 9
			color = "빨강";
		}else if(num<20){ // 10 ~ 19
			color = "주항";
		}else if(num<30){ // 20 ~ 29
			color = "노랑";
		}else if(num<40){ // 30 ~ 39
			color = "초록";
		}else{ 			  // 40 ~ 46
			color = "파랑";
		}
		
	}
	
}

public class Ex10 {

	public static void main(String[] args) {
		// Ball형타입의 45개의 공간을 만들어 준다. 
		Ball[] ball = new Ball[45];
//		System.out.println(ball[0]); -> nulls
		
		for(int i=0; i<ball.length; i++){
			// Ball형타입의 45개의 공간에 각각 객체를 생성 + 초기값 배정
			ball[i]=new Ball(i+1); // (i+1) 값
		}
//		System.out.println(ball[0].num); -> 1
		
		// 뽑을 공 6개 - 배열 생성
		Ball[] six = new Ball[6];
		
		// 무작위로 공 6개 뽑기
		for(int i=0; i<6; i++){ 						// 1
			int ran = (int)(Math.random()*45); 			// 3
			if(ball[ran].check){ // true이면 해당 		// ball[3].check -> true
				six[i] = ball[ran]; 					// six[0] -> ball[3]의 생성자의 모든 내용이 담김
				ball[ran].check = false;				// 분간해주기위해 -> ball[3].check = false;	
			}else{ // false 해당
				i--;									// 횟수를 그대로 0 ->> for의 증감식 만나서 ->> i=1
			}
		}
		
		// 공 출력
		for(int i=0; i<six.length; i++){
			System.out.println(six[i].color +" "+ six[i].num);
		}
		

	}

}
