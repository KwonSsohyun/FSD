package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		
		// ******** java.lang >> Class Character
		// ���ڿ������� Ȯ���Ҷ� ���� ����.
		
		// �ʵ� -> Ư�����ڸ� �̾Ƴ��� �͵��� ����
		// Character.MIN_VALUE -> '\u0000'
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.FORMAT); // ����
		
		// ������
		// Constructor Summary
		// Character(char value)
		char ch1 = '@';
		Character ch2 = new Character('A');
//		Character ch3 = new Character(65); // �׳� ���ڸ� ������ �ȵ�.
		Character ch3 = new Character((char)65);
		
		
		// ���ڷ� ������? �� .isAlphabetic()
		// ���ڱ������� >> ����, ����(���ĺ�, �ѱ�), Ư������
		System.out.println(ch1 + "�� �����ڵ� ��? " + Character.isDefined(ch1));
		System.out.println(ch1 + "�� ���� ��? " + Character.isAlphabetic(ch1));
		System.out.println(ch1 + "�� ���� ��? " + Character.isLetter(ch1));
		
		System.out.println(ch1 + "�� ���� ��? " + Character.isDigit(ch1));

		// ���鿡 �ش��ϴ� ���ڵ� >> \t / \n 
		// isWhitespace(char ch)
		System.out.println(ch1 + "�� ���� ��?" + Character.isWhitespace(ch1));
		System.out.println(ch1 + "�� ���� ��?" + Character.isSpace(ch1)); // ������
		
		// �빮�ڳ�? �ҹ��ڳ�? �ε�
		// ���߿� �����? �Ҷ��� üŷ�� �� �ִ°�.
		// ���Ϲ��ڴϱ� �̰� �빮�ڳ� �ҹ��ڳ� �ϸ� ����ϱ�. (���� ���� �ش��ϸ� ���̴�.)
		System.out.println(ch1 + "�� �빮�� ��?" + Character.isUpperCase(ch1));
		System.out.println(ch1 + "�� �ҹ��� ��?" + Character.isLowerCase(ch1));
		
		
		
		
		
		
		
		
		
		
		
	}

}
