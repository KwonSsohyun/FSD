package com.hi;

interface Inter{
	// ���ǰ� ���־�� ȣ�Ⱑ��
	void func02();
}

class Lec05{
	public static Inter func01(){
		class Local implements Inter{ // non-static Ŭ���� // �������̽� ��ӹ���
			public void func02(){
				System.out.println("����Ŭ���� ���");
			}
		}
		// ȣ���Ϸ���.
//		Local local = new Local();
//		local.func();
		// new Local().func02();
		return new Local();
	}
}

public class Ex05 {

	public static void main(String[] args) {
//		Lec05.func01();
//		.func02();
		Inter local = Lec05.func01();
		local.func02();

	}

}
