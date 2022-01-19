package com.hi;
// 클래스파일 새로 만들때
// 해당클래스를 적어놓고 클래스 파일 만들면됨

// *************** 부모클래스, super class ***************
class Lec01{
	public static int su1 = 1111;
	public int su2 = 2222;
	
	public static void func01(){
		System.out.println("Lec01 static func01() ... ");
	}
	
	public void func02(){
		System.out.println("Lec01 non-static func02()...");
//		func03(); // 상속을 받은 자식만 부모의 기능을 쓸수 있다. (상호작용이 아님)
		// ex) 내돈이 엄마돈 / 엄마돈이 내돈이지는 않음
	}
}



class Lec11 extends Lec01{} // 다중 상속 불가 (오직 하나의 클래스만 상속 받을 수 있다.)
// public class Ex01 extends Lec01, Lec11  (불가 XXXXX)
// 상속의 상속도 가능
// 근데 보통 상속을 쓴다는건 내가 만든 파일이 아닌 남들이 만든걸 가져와서 쓰니까
// 상속의 상속을 굳이 안하는게 남들이 만든거가 바이널리 파일일텐데
// 내가 코드를 굳이 수정해서 쓰지는 않을테니 말이다.



// *************** 자식클래스 ***************
// Ex01은 Lec01를 상속받음
public class Ex01 extends Lec11{ // extends Lec01 상속받음 // extends(상속을 받겠다) Lec01(부모를)
	
	// 이렇게 상속을 받으면 "class Lec01" 이렇게 있는것처럼 된다는 것. (코드의 재사용)
	/*
	public static int su1 = 1111;
	public int su2 = 2222;
	
	public static void func01(){
		System.out.println("Lec01 static func01() ... ");
	}
	
	public void func02(){
		System.out.println("Lec01 non-static func02()...");
//		func03(); // 상속을 받은 자식만 부모의 기능을 쓸수 있다. (상호작용이 아님)
		// ex) 내돈이 엄마돈 / 엄마돈이 내돈이지는 않음
	}
	*/
	
	public static void main(String[] args) {
		// 상속
		Lec01 you = new Lec01();
		System.out.println(you.su2 + "," + Lec01.su1); // 필드의 접근도 마찬가지 (non-static)
		you.func02();
		Lec01.func01();
//		you.func03(); // 부모가 자식꺼 쓸 수 없으니 오류
		
		Ex01 me = new Ex01(); // 상속받았더니 쓸 수 있다.
		System.out.println(me.su2); 
		
		
//		System.out.println(Ex01.su1); // Ex01.su1이 없잖아? > static 클래스명. 접근 // 문법상 문제는 없으나 안쓴다. // static 이라서 상속 받아서 오류 안나오는것.
		System.out.println(Lec01.su1);
		System.out.println(su1);
		me.func02();
		
		// 두가지 비교 (접근방식)
//		Ex01.func01(); // Ex01에 있다는 오해의 소지가 있다.
		Lec01.func01();
		func01(); // 그냥 호출을 하면 나한테 있거나, 상속을 받았거나 경우에 수가 존재할 수 있다. (사용자가 쉽게 판별가능)
		
		me.func03();

	}
	
	public void func03(){ // 크게 자식클래스 상속받으니 가능
		System.out.println("Ex01 func03():"+su2); // 같은 non-static이라 접근 가능
	}

}
