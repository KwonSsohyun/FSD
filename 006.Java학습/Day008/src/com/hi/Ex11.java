package com.hi;

public class Ex11 {

	public static void main(String[] args) {
		// ���ڿ� String 
		// �ּ��� ������� �ٸ��� ������ ��������
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String msg1;
		
		msg1 = "java"; // ���ڿ� �ٲٸ� ���ο� ��ü�� ���� ��´�.
		//System.out.println(msg1);
		
		msg1 = "���ڿ�";
		//System.out.println(msg1);
		
		
		msg1 = new String("java"); // java ��� ���ڸ� ��ü�� �����ؼ� msg1�� ��´�.
		System.out.println(msg1);
		String msg2 = new String("java");
		System.out.println(msg2);
		System.out.println(msg1==msg2); // false (19����, 22���� > new �����߱⿡ ���� �ٸ� ��ü -> ���� ���� ���ڿ��� �ᵵ ���̴�.)
        // �ٸ� ��ü�̱� ������, �ٸ� ��ü�ϱ�
		
		
		String msg3 = "java";
		String msg4 = "java";
		System.out.println(msg3 == msg4); // true (���� ���ڿ��̴ϱ� �Ȱ��� �ּҰ��� ����Ų��)
		
		
		//String msg5 = sc.nextLine(); >> �� �Է����� �𸣴� ���ο� ��ü ���� (�� ������ �� ���⿡) (����� �� �ø��� �����ϴϸ��̴�)
		//System.out.println(msg3 == msg5); // false
		
		int a =1;
		
		System.out.println("java1" == "java" + a); // ������ ���ޱ⶧���� ��ȭ�� ��û�ϸ�, ���ο� ��ü�� �����س� �׷��� false // ���� �����̱� ������
		System.out.println("java" == "ja" + "va"); // �̸� ��������� �����ϰ� �ø� �׷��� java >> true // ex) ���� > int a = 3+5; >> 8�� ����� �ö�
		System.out.println(msg1);

	}

}
