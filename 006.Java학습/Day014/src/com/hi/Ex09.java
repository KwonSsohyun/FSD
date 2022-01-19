package com.hi;

public class Ex09 implements Cloneable{ // implements Cloneable >> 상속받아야만 해당클래스는 clone이라는 메서드를 쓸수 있음.
	
	int su  = 1;
	
	public Ex09(int su){
		this.su = su;
	}

	public static void main(String[] args) {
		
		// ********* java.lang  >>  Class Object
		// Object
		Object obj1 = new Object();
		Ex09 me = new Ex09(1);
		Ex09 you = new Ex09(1);
//		Object me1 = new Ex08(); // 다형성
		
		System.out.println(me==you); // 객체가 다르니 false
		System.out.println(me.equals(you)); // 벨류값 비교
		// 쓸수는 있지만 원하는 출력이 잘 안나옴
		System.out.println(me.toString()); // com.hi.Ex09@15db9742// 366712642 >>이것을 다시 16진수로 바꿔서임
		System.out.println(me.hashCode()); // 366712642
		
		// clone() >> 객체를 깊은 복사
		// Interface Cloneable -> 이 인터페이스를 상속만 하면 됨.
		//obj1.clone(); // 상속을 통해서만 사용가능
		try {
			Object me2 = me.clone(); // me를 가지고 복사를 했지만 me2임 (객체 복사됨)
			System.out.println(me2); // 21번과 해당 이 객체는 다른 주소값을 가지고 있는것을 볼 수 있음.
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 벨류값 비교하게 오버라이딩함
	public boolean equals(Object obj){
//		return true;
		return su == ((Ex09)obj).su; // 캐스팅함
	}

}
