package com.hi;

public class Ex08 {
	
	// public  : ����������
	// static  : ��ü ��������
	// void    : ���ϰ� ������
	// main    : ���� �޼���
	// (String[] args) : cmd���� ������ �迭 (����� ����)

	public static void main(String[] args) { // (String[] args) ���д��� ����
		// ������ ��Ʈ������ �ϰ�, ��Ʈ�� �迭�� ��´�.
		// �ɼ��� �������� �ټ� �ձ� ���� (������ ����)
		// �����Ҷ� �ٸ� ���ڿ��� ������ ���� �� �� �ִ°Ŵϱ�.
		// cmdâ���� java Ex08 -version �̷���  -> �׷� 1�� �����ϴ±��� �̷���
		
		// java.util >> Class Scanner
		
		// ��ĳ���߿� io -> input�� ���� ���ִ� ��ƿ
		java.util.Scanner sc= null;
//		sc = new java.util.Scanner("abcd\n�ѱ�\n1234");
		sc = new java.util.Scanner("ab,cd\tcd\n�ѱ�\n1234");

		// ���� ��������� �о��� \n >> .nextLine()
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());

		// \t \r \n ���� ������ �о���
		// \r\n -> ������ ����
		System.out.println(sc.next());  // ab,cd
		System.out.println(sc.hasNext());  // true, false �Ǻ� (�ڿ� �� �ֳ�)
		System.out.println(sc.next());  // cd
		sc.nextLine();						// nextó�� �۵�
//		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine()); //�ѱ�
		System.out.println(sc.nextInt()); //1234
		System.out.println(sc.hasNext()); /// false
		
		while(sc.hasNext()){ // �ִ� ��ŭ �о���̱�.
			System.out.println(sc.nextLine());
		}

	}

}
