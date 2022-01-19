package com.hi;

// 다형성을 이용하기 위해서 인터페이스 사용함
interface Remote{
	void on();
	void off();
	void work();
}

class Tv implements Remote{ // 상속
	public void on(){
		System.out.println("tv를 켜다.");
	}
	public void off(){
		System.out.println("tv를 끄다.");
	}
	public void work(){
		System.out.println("방송화면을 보여주다.");
	}
}

class Radio implements Remote{ // 상속
	public void on(){
		System.out.println("라디오를 켜다.");
	}
	public void off(){
		System.out.println("라디오를 끄다.");
	}
	public void work(){
		System.out.println("방송을 들려주다.");
	}
}

public class Ex15 {

	public static void main(String[] args) throws Exception{
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String input = null;
		// 아래 esle가 없기에 초기화가 안되니까 null로 초기값 준다.
		Remote remote = null;
		
		while(true){
			System.out.println("종료(exit)  > ");
			input = sc.nextLine();
			
			if(input.equals("exit")){
				break;
			}
			
			// com.hi.Tv
			// com.hi.Radio
			
			// << 리플렉션의 의의 >>
			// <배포시점> - 이미 사람들이 Ex15를 쓰고 있다면 나중에 추가되면 Ex15을 다시 배포하는게 아니라 나중에 만든것도 추가만 하면됨.
		
			// TV / Radio  의 정보를 가지고 있다. (필드, 메서드) (▶▶정보만을 담고 있는 클래스)
			Class clz = Class.forName(input); 
			// Object 타입이 새로운 인스턴스(객체)를 만들어준다. (▶▶정보를 가지고 그때 객체를 찍어냄)
			// 오브젝트니까 캐스팅함
			// ▶▶ 온도, 오프도, 워크 메서드가 오브젝트에는 그런 메서드가 없으니, (Remote)로 형변환한다.
			remote = (Remote)(clz.newInstance());
			
			/*
			else if(input.equals("1")){
				// TV 의 정보를 가지고 있다. (필드, 메서드)
				Class clz = Class.forName("com.hi.Tv");
				// Object 타입이 새로운 인스턴스(객체)를 만들어준다.
				remote = (Remote)(clz.newInstance());
//				remote = new Tv();
			}else if(input.equals("2")){
				Class clz = Class.forName("com.hi.Radio");
				remote = (Remote)(clz.newInstance());
//				remote = new Radio();
			}
			*/
			remote.on();
			remote.work();
			remote.off();
			
			
		}
		
		
	}

}
