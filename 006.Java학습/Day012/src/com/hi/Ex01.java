package com.hi;
// Ŭ�������� ���� ���鶧
// �ش�Ŭ������ ������� Ŭ���� ���� ������

// *************** �θ�Ŭ����, super class ***************
class Lec01{
	public static int su1 = 1111;
	public int su2 = 2222;
	
	public static void func01(){
		System.out.println("Lec01 static func01() ... ");
	}
	
	public void func02(){
		System.out.println("Lec01 non-static func02()...");
//		func03(); // ����� ���� �ڽĸ� �θ��� ����� ���� �ִ�. (��ȣ�ۿ��� �ƴ�)
		// ex) ������ ������ / �������� ���������� ����
	}
}



class Lec11 extends Lec01{} // ���� ��� �Ұ� (���� �ϳ��� Ŭ������ ��� ���� �� �ִ�.)
// public class Ex01 extends Lec01, Lec11  (�Ұ� XXXXX)
// ����� ��ӵ� ����
// �ٵ� ���� ����� ���ٴ°� ���� ���� ������ �ƴ� ������ ����� �����ͼ� ���ϱ�
// ����� ����� ���� ���ϴ°� ������ ����Ű� ���̳θ� �������ٵ�
// ���� �ڵ带 ���� �����ؼ� ������ �����״� ���̴�.



// *************** �ڽ�Ŭ���� ***************
// Ex01�� Lec01�� ��ӹ���
public class Ex01 extends Lec11{ // extends Lec01 ��ӹ��� // extends(����� �ްڴ�) Lec01(�θ�)
	
	// �̷��� ����� ������ "class Lec01" �̷��� �ִ°�ó�� �ȴٴ� ��. (�ڵ��� ����)
	/*
	public static int su1 = 1111;
	public int su2 = 2222;
	
	public static void func01(){
		System.out.println("Lec01 static func01() ... ");
	}
	
	public void func02(){
		System.out.println("Lec01 non-static func02()...");
//		func03(); // ����� ���� �ڽĸ� �θ��� ����� ���� �ִ�. (��ȣ�ۿ��� �ƴ�)
		// ex) ������ ������ / �������� ���������� ����
	}
	*/
	
	public static void main(String[] args) {
		// ���
		Lec01 you = new Lec01();
		System.out.println(you.su2 + "," + Lec01.su1); // �ʵ��� ���ٵ� �������� (non-static)
		you.func02();
		Lec01.func01();
//		you.func03(); // �θ� �ڽĲ� �� �� ������ ����
		
		Ex01 me = new Ex01(); // ��ӹ޾Ҵ��� �� �� �ִ�.
		System.out.println(me.su2); 
		
		
//		System.out.println(Ex01.su1); // Ex01.su1�� ���ݾ�? > static Ŭ������. ���� // ������ ������ ������ �Ⱦ���. // static �̶� ��� �޾Ƽ� ���� �ȳ����°�.
		System.out.println(Lec01.su1);
		System.out.println(su1);
		me.func02();
		
		// �ΰ��� �� (���ٹ��)
//		Ex01.func01(); // Ex01�� �ִٴ� ������ ������ �ִ�.
		Lec01.func01();
		func01(); // �׳� ȣ���� �ϸ� ������ �ְų�, ����� �޾Ұų� ��쿡 ���� ������ �� �ִ�. (����ڰ� ���� �Ǻ�����)
		
		me.func03();

	}
	
	public void func03(){ // ũ�� �ڽ�Ŭ���� ��ӹ����� ����
		System.out.println("Ex01 func03():"+su2); // ���� non-static�̶� ���� ����
	}

}
