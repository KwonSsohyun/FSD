package com.hi;

public class Ex05 {
	
	// ��� �޼��� ���� ������ ����
	// ���θ޼��尡 �ƴѰ�쿡 return ������ ���� void �ڸ��� return ���� Ÿ���� ����.
	
	public static int func01(){
		System.out.println("func01()");
		func02();
		System.out.println("func01 end");
		return 0;
	}

	public static void main(String[] args) {
		
		// Ex04.func01(); // �ܺο��� �ҷ��� �� �� �ִ�. (�޼ҵ�)
		
		/// < �ݺ����� �޼ҵ��� ���� >
		///   �ݺ����� �����̰�.
		///   �޼ҵ�� �ܺο����� ȣ���ؼ� �� �� �ִ�. (�ڹ� �ھ��� �κ�)
		
		System.out.println("main start");
		// System.exit(0); // �����ڵ带 ���� , ���� ���� ��� (JVM�� �� �ݾƹ����ϱ�) ���� �۾� ���ϰ� ���� (���������� ���� ������)
		func01();
		
		if(1+2>0){
			return; // ���⼭ ���α׷� ���� �ڡڡ�(���θ���)�� ���� ���� ���� ���
		}
		
		System.out.println("main end"); // ���� �ڵ�
		return; // void �̸� �ڵ����� ���ϵ� (�����ϰ������� �ڵ����� �������� ����ϰ� �������Ѵ�.)
		// ������ �ڵ� - �ּ����ܽ�Ű�� ������ ���� 
		// return; (���� return -> ���α׷� ����)

	}
	
	public static void func02(){
		System.out.println("func02()");
		return;
	}

}
