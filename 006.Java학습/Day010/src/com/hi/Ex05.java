package com.hi;

public class Ex05 {
	
	// �ߺ��� �����ڸ� �� ��� ��� ->> this();
	// ����, �����ڿ����� ��� ����
	// ���°� �ּ� �ϳ��� �־�� ����Ѵ�. / ���ΰ� ���θ� ȣ���� ��쵵 ���Ұ�.
	// �������� �ֻ�ܿ� ��ġ�ؾ��Ѵ�.

	public String msg;
	
	public Ex05(){ // ����ȣ��ɶ��� ��ü�� �����ȴ�.
		this("hello"); // 1) ���ڸ� �޴� this (�����ڿ����� ���̰�, �ٸ� �����ڸ� ȣ���س��⸦ ���ؼ�) 
		return; // 7) ����
	}
	
	
	public Ex05(String msg){ // 2) ���ڹ����� �����ǰ�,
		/*
		this.msg = msg;
		for(int i=0; i<3; i++){
			System.out.println(msg);
		}
		*/
		this(msg,1); // 3) 2���� ���� �ٽ� 3���� Ex05(��Ʈ��, ��Ʈ) �� ����
		return; // 6) ȣ������� �ٽ� ���ư�.
	}
	
	
	public Ex05(String msg, int cnt){ // 4) ���� ���� ���� - ���⼭�� �� �������� ���⼭ ��ü����
		this.msg = msg;
		for(int i=0; i<cnt; i++){
			System.out.println(msg);
		}
		return; // 5) ȣ������� �ٽ� ���ư�.
	}
	
	public static void main(String[] args) {
		Ex05 me = new Ex05();
//		Ex05 me = new Ex05("java");
//		Ex05 me = new Ex05("easy", 5);
	}

}
