package com.hi;

// non-static : ��ü���� ������ �ִ� �� 
// static : �����Ǵ� �� 

public class Ex02 {

	public int su = 1111;
	
	public void func01(){
		System.out.println(su); // this.su (this ����)
	}
	
	public void func02(){
		su++;
		func01();
	}
	
	public void func03(){
		su++; // this.su++ 
		Ex02 me = new Ex02(); // ���ο� ��ü ������
		me.func01(); // 1111 ����� // ���οü�� su�� (me.su)
		// this.func01(); �̸� 1112 �����
	}
	
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		me.func03();
	}

}
