package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		
		// ********* java.lang  >>  Class System
		
		// 	arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//  arraycopy  �� �迭�� ���� ����
		
		
		// �ð��� �� Ÿ������ ���޵�
		// 1000���� 1�̴ϱ� 1�ʴ� 1000�� ���� �þ
		// �ð��� ������ �ʿ��Ҷ� ��
//		System.out.println(System.currentTimeMillis());
		long before = System.currentTimeMillis();
		for(int i=0; i<1000000; i++){
			Ex10 me = new Ex10();
		}
		long after = System.currentTimeMillis();
		System.out.println(before);
		
		
		
		// ������ �ü������ �ٸ��⶧���� 
		// lineSeparator()
		// "\r\n" -> ������
		// "\n"   -> ��, ������
		// �˾Ƽ� ���� �� �ü���� ���缭
		System.out.println(System.lineSeparator()); // ���� ����
		String newLine = System.lineSeparator(); // �̷��� ������ ��Ƽ� ���� �Ҷ����� �ᵵ ��
		
		
		System.out.println(after);
		System.out.println(after - before); // 0.004�� �ɸ� (��ü ���µ� �ɸ� �ð�)

	}

}
