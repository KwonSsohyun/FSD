package com.hi;

class Lec04<T1, T2>{ // Ÿ���� �������� ���� �����ϴ�. (�޸� ����)
	T1 obj1;
	T2 obj2;
	public void setObj(T1 obj1, T2 obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void printObj(){
		System.out.println(obj1.getClass()); // Ŭ���� ��������
		System.out.println(obj2.getClass()); // Ŭ���� ��������
	}
}

public class Ex04 {

	public static void main(String[] args) {
		int obj1 = 1111;
		String obj2 = "java";
		// StringBuffer obj2 = new StringBuffer ("java"); -> �̷� �ٸ� Ÿ�� ������ �� �ɸ�
		
		Lec04<Integer, String> lec = new Lec04<>();
		lec.setObj(obj1, obj2);
		lec.printObj();

	}

}
