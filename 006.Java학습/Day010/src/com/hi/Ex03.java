package com.hi;

public class Ex03 {
	
	public Ex03 func(){
		System.out.println("����");
		return this;
	}
	
	public int func2(int su){
		System.out.println("����");
		if(su==0){
			return 0;
		}else{
			su--;
			return func2(su); // ���ȣ�� (�ڱ� �ڽ��� �� ȣ��)
		}
	}

	public static void main(String[] args) {
		Ex03 me = new Ex03();
//		me.func().func().func(); // ü���� �� ���Ѵ�.
//		me.func(me).func(me).func(me);
		
		me.func2(1);
	}

}
