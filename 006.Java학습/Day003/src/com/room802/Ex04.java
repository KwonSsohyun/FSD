package com.room802;

public class Ex04 {

	public static void main(String[] args) {
		// ���� ������(++, --)
		int a;
		a = 2;
		
		// ++a;
		// a++; // a = a+1; // a += 1
		
		// a--;
		// a = a-1;
		
		// System.out.println(a++); // 2
		// System.out.println(++a); // 3
		// System.out.println((a++)+(++a)); // 2+4 = 6
		
		// System.out.println(a--); // 2
		// System.out.println(--a); // 1

		
		byte b;
		b = 127;
		b++; // b = b+1 (�̰� �ȵ� �ֳ��ϸ� +1�̴ϱ� int�ε� �ٽ� byte�� �����ϱ�)
		System.out.println(b); // �Ѿ�ϱ� -128
		
		byte c,d,e;
		c = 1;
		d = 2;
		// e = c+d; // int�� �⺻ �����ϱ� ������ ������ 
		
		// �� ���� ������ �ҰŸ� int
		// �� �Ǽ� ������ �ҰŸ� double
		
		double su1, su2, su3; // �Ǽ��� ������ �ǵ��� ���ϴ°��� ����.
		su1 = 1.00000000000000001;
		su2 = 2.00000000000000001;
		su3 = su1 + su2;
		System.out.println(su3); // �ٻ簪�� ǥ���ϱ� ������ �������� �߻�
		
		
		
	}

}
