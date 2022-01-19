package com.hi;

public class Ex09 {
	
	public void func(Ex09 me){
		System.out.println(me==this);
	}

	public static void main(String[] args) {
		Ex09 me = new Ex09();
		me.func(me);

	}

}
