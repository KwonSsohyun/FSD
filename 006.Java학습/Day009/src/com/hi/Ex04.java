package com.hi;

class Car{
	// 상수형변수로 1,2,3 뭔지 한다.
	public static final int MORNING = 1; // 대문자로 다 적으면 상수형변수로 구분한다.
	public static final int K3= 2;
	public static final int K5 = 3;

	public static int number; // 차량번호 // static을 쓰므로써 값을 덮어쓰므로, 값이 다르게 누적된다. (객체공통의 특성) (객체 밖으로)
	
	public String color;
	public final String name; // 상수형 변수 - 값 못 바꿈
	public int speed;
	public int max;
	
	// 모드 선정
	public Car(int mod){
		number+=1111;;
		if(mod==1){
			color = "";
			name = "모닝";
			max = 120;
		}else if(mod==2){
			color = "";
			name = "k3";
			max = 150;
		}else if(mod==3){
			color = "";
			name = "k5";
			max = 180;
		}else{
			color = "";
			name = "붕붕이";
			max = 100;
		}
	}
	
	public Car(String a, int b){ // 생성자의 오버로드 (이름이 같으니까) 타입, 순서,
		color = ""; // null이 되지 않게 빈칸 초기화
		name = a;
		max = b;
	}
	
	// 생성자 (꼭 초기값 주려고)
	public Car(String a, String b, int c){ // 인자의 유무에 따라 생성자 구분 - 생성자 오버로드
		color = a;
		name = b;
		max = c;
	}
	
	public void speedUp(){
		if(speed+10 > max){
			speed = max;
		}else{
			speed += 10;
		}
	}
	public void speedDown(){
		if(speed-10<0){
			speed=0;
		}else{
			speed-=10;
		}
	}
	public void speedShow(){
		System.out.println("차량번호 " + number +" 내차 " + name + "은 " + speed + "km로 달린다.");
	}
}


public class Ex04 {

	public static void main(String[] args) {
		
		Car mycar = new Car(Car.MORNING); // 값 넣는 강제성 부여 // 꼭 값 다 안줄수도 있음  // 생성자 오버로드를 통해 인자 2개를 알아서 찾는다.
//		mycar.color = "빨간색";
//		mycar.name = "모닝"; // 값이 빠지면 null이 된다.
//		mycar.max = 120; // 값이 빠지면 0으로 깡통이 된다.
		mycar.speedShow();
		
		for(int i=0; i<20; i++){
			mycar.speedUp();
			mycar.speedShow();
		}
		
//		mycar.color = "노란색"; // 중간에 값 바꿈
//		mycar.name = "로켓추진력 모닝"; // final로 위에서 선언해서 못 바꿈
		
		for(int i=0; i<20; i++){
			mycar.speedDown();
			mycar.speedShow();
		}
	
	
		mycar = new Car(Car.K3); // 새차 뽑음 // 기존객체 사라지고, 새로운객체를 생성했다.
//		mycar.color = "쥐색";
//		mycar.name = "k3";
//		mycar.max = 180;
		
		for(int i=0; i<20; i++){
			mycar.speedUp();
			mycar.speedShow();
		}
		for(int i=0; i<20; i++){
			mycar.speedDown();
			mycar.speedShow();
		}
		
		mycar = new Car(Car.K5);
		mycar.speedShow();
		
	}	

}
