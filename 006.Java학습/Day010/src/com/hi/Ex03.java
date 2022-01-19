package com.hi;

public class Ex03 {
	
	public Ex03 func(){
		System.out.println("실행");
		return this;
	}
	
	public int func2(int su){
		System.out.println("실행");
		if(su==0){
			return 0;
		}else{
			su--;
			return func2(su); // 재귀호출 (자기 자신을 재 호출)
		}
	}

	public static void main(String[] args) {
		Ex03 me = new Ex03();
//		me.func().func().func(); // 체인을 잘 안한다.
//		me.func(me).func(me).func(me);
		
		me.func2(1);
	}

}
