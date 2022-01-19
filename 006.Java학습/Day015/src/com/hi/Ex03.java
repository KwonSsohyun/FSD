package com.hi;

class Outter04{
	// 필드 (static / non-static)
	public static int su1 = 1111;
	public int su2 = 2222;
	
	// 생성자
	public Outter04(){
		
	}
	
	// 메서드 (static / non-static)
	public static void func01(){
		// static 에서 non-static 접근
		// 내 자신 먼저 객체 찍기
		Outter04 outt = new Outter04();
		
		Inner04 inn; 				
		inn = outt.new Inner04();   
		
		System.out.println(inn.su2);     //  ▶ 4444
	}
	public void func02(){
		// non-static 같은 라서 바로 접근 가능
		// non-static 접근 - 객체찍고, 참조변수로 접근 가능 (non-static)
		Inner04 inn = new Inner04();
		System.out.println(inn.su2);    //  ▶ 4444
	}
	
	// non - static 내부클래스
	class Inner04{ // final만 static 허용
		// 필드 (static / non-static)
		// static 사용 불가
//		public static int su3 = 3333; // class Inner04 >> class자체가 non - static 이니까 올려놓지 않는데 static이 될리 없다.
		public final static int su3 = 3333; // 상수형 변수 (값은 상수형에 냅두고 가르키키만 하면 된다.)(공간 할당 안함) // 예외적 허용
		public int su2 = 4444;
		
		// 생성자
		public Inner04(){
			
		}
		
		// 메서드 (static / non-static)
		// static 사용 불가
//		public static void func03(){}
		public void func04(){
//			System.out.println(Outter04.su1);
			System.out.println(su1);															//  ▶ 1111
			// 이너클래스 자체가 non-static이니까 이미 객체가 찍혀진 상태였으니 생략 가능 
			// 마치 비슷한 느낌은 상속 super() 느낌 같은것. 부모거 쓸 수 있는것 (바깥 아우터)
			System.out.println(su2);															//  ▶ 4444
//			Outter04 outt = new Outter04(); // 객체를 찍어버리면 다른 객체의 접근이 되는것
//			System.out.println(outt.su2);
			
			// su2가 non-static이니까 새객체 생성 >> 하게 되면 새객체임....
			// 상속이었으면 super.su2
			// 상속에서는 메서드만 오버라이딩
			// ▶▶ 내부클래스에서는 필드와 메서드가 오버라이딩되는 효과. (덮어써버리니)
			//    바깥에 필드값 모름 >> 그래서 내꺼 밖에 모름
			//    반면 이름이 다르면 상관없음
			System.out.println(this.su2);														//  ▶ 4444
		}
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// 내부클래스 호출하기
		// ▶▶ Outter04가 static이든 non-static이든 상관없이
		//    Inner04 가 non-static이기 때문에 객체 생성하는 것임
		Outter04 outt = new Outter04();
		Outter04.Inner04 inn = outt.new Inner04();
		System.out.println(inn.su2);

	}

}
