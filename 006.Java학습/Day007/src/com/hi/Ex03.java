package com.hi;

public class Ex03 {
	
	public void func01(){
		System.out.println(this);
	}
	
	public void func02(Ex03 me){
		System.out.println(me);
	}

	public static void main(String[] args) {
		
		Ex03 you = new Ex03(); // °´Ã¼ ÂïÀ½
		System.out.println(you);
		
		
		Ex03 me = new Ex03(); // °´Ã¼ ÂïÀ½
		System.out.println(me);
		me.func02(me);
		me.func01();
	}

}
