package com.hi;

public class Ex03 {

	// 전역
	// 클래스 변수
	public static String model = "모닝";
	public static int speed = 0;
	public static int max = 100;
	
	
	public static void speedUp(){
		if(speed+12 > max){
			speed=max;
		}else{
		speed+=12;
		}
	}
	
	public static void speedDown(){
		if(speed-13 <= 0){
			speed=0;
		}else{
		speed-=13;
		}
	}
	
	public static void show(){
		System.out.println("내차" + model + "의 현재속도는" + speed + "km입니다.");
	}
	
	public static void main(String[] args) {
		show(); // 콘솔 찍어줌 (여기서는 계기판)

		for(int i=0; i<30; i++){ // 가속
			speedUp();
			show();
		}

		for(int i=0; i<40; i++){ // 브레이크
			speedDown(); 
			show();
		}
		
		model = "레이";
		max = 150; // 레이는 150km까지 달리게해줌
		show(); // 콘솔 찍어줌

		for(int i=0; i<30; i++){ // 가속
			speedUp();
			show();
		}

		for(int i=0; i<40; i++){ // 브레이크
			speedDown(); 
			show();
		}
		
	}

}
