package com.room802;

public class Ex16 {

	public static void main(String[] args) {
		
		com.room802.Ex16 me;
		
		java.lang.String msg2; // java.lang. ��Ű�� ��ΰ� �ִ�. 
		// �տ� ��Ű�� ��ΰ� �����Ǿ������� >> ù��°�δ� ��Ű�� ���com.room802 �� ã�� >> �⺻�� java lang���� ã�´�.
		// �������� ��δ� �����ؾ��Ѵ�.
		java.lang.Integer.parseInt("1234");
		java.lang.System.out.println();
		
		
		// ����� �Է�
		java.util.Scanner sc = new java.util.Scanner(System.in); // �Է¹ޱ� ���� ��ġ �غ�
		
		for(int i=0; i<3; i++){ // �Է� 3�� ����
		
			System.out.print("�Է� : ");
			String msg = sc.nextLine(); // �Է¹޴� �ڵ� (�Է¹ޱ� �������� �����) : �����ڵ� ���� ����
			Integer.parseInt(msg); // ���ڿ� ���ڷ� ��ȯ
			System.out.println(msg);
		}
		
	}

}
