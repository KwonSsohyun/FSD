package com.hi;

public class Ex03 {

	public static void main(String[] args) {
		
		String msg1 = "abcd";
		String msg2 = "abcabcd";
		String msg3 = "";
		String msg4 = "AaBbCcDd";
		String msg5 = "        java web framwork     db      ";
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".contains() >> ���ϴ� ���ڿ��� �ִ��� ������ Ȯ��");
		
		// ���� .contains()
		// ���ԉ���� Ȯ��
		// ���ϴ� ���ڿ��� �ִ��� ������ Ȯ�� (.indexOf ��� : �ٸ� ������ -1�� ��ȯ)
		// true, false�� ��ȯ
		System.out.println(msg1.contains("bc"));
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".startsWith() >> �ش繮�ڷ� �����ϴ��� Ȯ��");
		
		// ���� .startsWith()
		// �ش繮�ڷ� ������ �ϴ��� Ȯ��
		// ���ڿ� �˻��Ҷ� ���
		// true, false�� ��ȯ
		System.out.println(msg1.startsWith("bc"));
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".endsWith() >> �ش繮�ڷ� �������� Ȯ��");
		// ���� .endsWith()
		// �ش繮�ڷ� �������� Ȯ��
		// true, false�� ��ȯ
		System.out.println(msg2.endsWith("cd"));
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".isEmpty() >> ���� �ִ��� Ȯ��");
		
		// ���� .isEmpty() 
		// ���� �ִ��� Ȯ��
		System.out.println(msg3.length()==0); // �Ϲ������� �� (���ڱ��̸� ��ȯ���ش�.) msg1 -> 4 / msg2 -> 5
		 								      // msg3�� ���̰� 0���� �ƹ��͵� ���ٴ°�
		System.out.println(msg3.isEmpty()); 
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".lastIndexOf() >> �Ǹ������������� �ش� ���ڹ�ȣ �ε��� ���");
		System.out.println(" \t\t ('a',3) -> 0~3������ �ε������� �ȿ��� �Ǹ������������� a�� ã�Ƽ� �ش� �ε��� ���");
		
		// ���� .lastIndexOf()
		// �ϳ��� ���� ���� �Ǹ������� �ִ� �ش� ���ڹ�ȣ �ε��� ���
		// �ΰ��� ���� ���� ("a",3) -> 0~3������ ������ �ε��� �ȿ��� �� ������ a�� ã�ƶ�
		msg2 = "abfdcafbcd";
		System.out.println(msg2.lastIndexOf('d')); // ������ -1
		System.out.println(msg2.lastIndexOf('f', 6)); // 0���� �����ؼ� 2������ �������� - �Ǹ������������� �����ؼ� f�� �ε����� ã�ƶ�
		System.out.println(msg2.lastIndexOf("abcd", 6));
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".toUpperCase() >> ��� �빮�� �ٲ��ش�. ");
		System.out.println(".toLowerCase() >> ��� �ҹ��� �ٲ��ش�.");
		
		// ���� .toUpperCase() >> ��� �빮�� �ٲ��ش�. 
		// ���� .toLowerCase() >> ��� �ҹ��� �ٲ��ش�.
		System.out.println(msg4.toUpperCase());
		System.out.println(msg4.toLowerCase());
		
		System.out.println("----------------------------------------------------");	
		
		// ���� .trim()
		// �յ��� ������ �����ش�.
		// ������� ����� ������� �а����� ����. �׷��� ������ ����
		System.out.println(">>>" + msg5 + "<<<");
		System.out.println(msg5.trim());
		
		System.out.println("----------------------------------------------------");	
		
	}

}
