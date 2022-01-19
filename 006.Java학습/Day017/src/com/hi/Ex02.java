package com.hi;

interface Ball{
	void play();
}

class Baseball implements Ball{
	public void play(){
		System.out.println("던지고 논다.");
	}
}

class BowlingBall implements Ball{
	public void play(){
		System.out.println("굴리고 논다.");
	}
}

class Box<T>{ // 타입이 결정됨 -> 객체 생성하는 곳에서 타입 정해줌
	// Number를 int, double가 Number을 상속받아서 Number써도됨
	// 상황에 따라서 int와 double 둘 다 쓸수 있도록 (다형성 - 상위에 Number가 있으니까)
	// 숫자, 소숫점말고도 더 다른것도 받고 싶으면 더 상위를 쓴다. 문자열등등 -> Object
	// Object obj;
	T obj;
	public void setObj(T obj){
		this.obj = obj;
	}
	public T getObj(){
		return this.obj;
	}
}


public class Ex02 {

	public static void main(String[] args) {
		// 객체생성 일때 제네릭 써보기!
		
		// 타입을 호출한 측에서(클래스를 사용하는 측) 결정하게끔 하는게 "제네릭"
		// 만약 여기서 <> 안하면 오브젝트 타입이 됨.
		// <> 객체변수 타입이어야함 int X -> Integrt 
		// 공간이 동일하다. -> 참조변수 라는 뜻
		// 기본자료형은 어떤것을 쓰느냐에 따라 int처럼 들쭉날쭉 -> 클래스 타입이어야 한다. (래퍼클래스)
		// Object타입 메모리주소를 담을 수 있는 공간 -> 사이즈 동일 
		Box<Baseball> box = new Box<Baseball>();
		Baseball ball1 = new Baseball();
		BowlingBall ball2 = new BowlingBall();
		
		// ball1 -> 농구공찍는 객체를 담고있는 주소값
		// 한마디로 ball1이 객체가 담긴것임.
		// 그래서 아래서 obj.play(); 해당의 ball1.paly() 접근 가능한것임
		box.setObj(ball1); //  생성된 객체를 담고있는 주소값을 넣음
		// Ball obj = (Ball) box.getObj(); // 타입을 바꿔놓음
		// obj.play(); // play가 Object에 없으니 오류
		Baseball obj = box.getObj();
		obj.play();
		
		
		
		
		
		
		
	}

}
