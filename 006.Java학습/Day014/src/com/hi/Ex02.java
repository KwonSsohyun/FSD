package com.hi;

public class Ex02 {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/javase/8/docs/api/
		// java.lang >> Class Integer
		// Constructor ������
		
		// 10���� ���� Ÿ��
		int su1 = 1111;
		Integer su2 = new Integer(2222); 
		Integer su3 = new Integer("2222"); // ���� ��ȣ�� ���ڿ� ������ �������ش�. (���ڿ�)
		System.out.println(su2 == su3); // su2��ü ���� su3 ��ü ���δϱ� false
		System.out.println(su2.equals(su3)); // ��ü�ϱ� �� �� �ؾ� true ������
		
		System.out.println(su2+1);
		System.out.println(su3+1);
		// �빮�� -> ����� ����
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE ); // ��Ƽ���� �� ����
		System.out.println(Integer.BYTES); // �޸� ������ -> 4byte
		System.out.println(Integer.SIZE); // ��Ʈ ���� -> 32bit
		System.out.println(Integer.parseInt("1234"));
		
		int su4 = Integer.parseInt("4444");
		Integer su5 = Integer.valueOf("5555");
		Integer su6 = 128; // 6666�� �����ε� su6�� ��Ƽ�� ��üŸ������ �޾Ҵ�.
		System.out.println(su6.byteValue()); // byte�� ���ϵ� // byte�� �� �������� ��
		
		// ��������.����
		// int	>> hashCode()
		// int Ÿ������ ��ȯ(���ϵ�)
		
		// Ŭ������.���� (static�̴ϱ�)
		// static int	>> hashCode(int value)
		// int Ÿ������ ��ȯ(���ϵ�)
		
		// static String Ÿ������ ��ȯ��
		int su7 = 1;
		System.out.println(su7 + "�� 2���� = " + Integer.toBinaryString(su7));
		// �׷��� ����Ÿ���� ���ڿ��� (���ڷ� ������ ���� 4�� 2���� = 100 ���� �����ϴϱ�(4�ϱ�)
		System.out.println(su7 + "�� 8���� = " + Integer.toOctalString(su7));
		System.out.println(su7 + "�� 16���� = " + Integer.toHexString(su7));
		
		// static int  >>  reverse(int i)
		// int Ÿ������ ��ȯ(���ϵ�)
		// ��Ʈ ������ �����´�. 0 -> 1 / 1 -> 0 
		System.out.println(Integer.reverse(su7)); 
		
		// ���� �ΰ�
		// static int	>>  compare(int x, int y)
		
		// ���� �ϳ�
		// int	>>  compareTo(Integer anotherInteger)
		
		System.out.println(Integer.compare(0, 2));
		// ������ 0
		// �տ��� ũ�� 1 
		// �ڿ��� ũ�� -1
		System.out.println("-------------------------");
		Integer a = new Integer(2);
		System.out.println(a.compareTo(2));
		
		
		
	}

}
