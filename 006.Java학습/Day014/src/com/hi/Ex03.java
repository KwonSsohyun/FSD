package com.hi;

public class Ex03 {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/
		// ******** java.lang >> Class Byte
		
		// Constructor ������
		Byte su1 = new Byte("127");
		// Byte(byte value) -> �⺻�����ڷ� byte ���޸� ����
		byte su3 = 127; 
		Byte su2 = new Byte(su3);
		
		// parseByte(String s)
		// ���ڿ��� byte�� �ٲٰ� ������
		System.out.println("------------------------------------------------------");
		
		// ******** java.lang >> Class Short
		short su4 = 12;
		// Short(short value)  -> �⺻�����ڷ� short ���޸� ����
		Short su5 = new Short(su4);
		Short su6 = new Short("12");
		
		System.out.println("------------------------------------------------------");
		
		// ******** java.lang >> Class Long
		long su7 = 1111L; // L�Ⱥ����� �ȴ�. (����ĳ����) �⺻�� int���̴�
		Long su8 = new Long(1111);
		Long su9 = new Long(su7);
		Long su10 = new Long("1111");
		// ����ȯ Long ���� �ٲ��ָ鼭 ���ڿ� 1111L ���ִ� ���� "1111L" ����!!!!
		

	}

}
