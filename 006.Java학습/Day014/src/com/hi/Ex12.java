package com.hi;

public class Ex12 {

	public static void main(String[] args) {
		
		// ********* java.lang  >>  Class StringBuffer
		
		// StringBuffer �ڱ� �ڽŵ� ���� �ٲ�� ����
		// ���οü�� ����� ���� �ƴ� �ڱ� �ڽ��� �ٲ����� (����)
		// �޸� ȿ�� - �ٸ� �߰��ڵ带 ���鼭 üũ�� ���鼭 ��� �Ѵ�.
		
		// �ݸ� String�ϸ� ���� ���ο� ��ü�� �����, �ڱ��ڽ��� �״�� �ְ�,
		// ���Ҷ����� ���ο� ��ü�� ��
		// �ڿ����� �������� ���� �ڿ�����
		String msg1 = "java";
		StringBuffer msg2 = new StringBuffer ("java");
		System.out.println(msg2);
//		StringBuffer msg3 = msg2+"Web"; // ����
//		String msg3 = msg2+"Web";
		
		String msg5 = msg1.concat("Web");
		System.out.println(msg5);
		System.out.println(msg1);
		System.out.println("----------------------------------");
		
		StringBuffer msg3 = msg2.append("Web");
		System.out.println(msg3);
		System.out.println(msg2); // msg2 �� ���� �ٲ�.
		
		System.out.println("----------------------------------");
		
		// �� ĳ���Ͷ� �ƹ��͵� �ȳ��´�.
		// ����Ʈ�� 16 - 16��ŭ�� ������ Ȯ����
		StringBuffer msg6 = new StringBuffer(5); // 5���� ���� ���� (���ָ� 16����Ʈ)
		for(int i=0; i<13; i++){ // 5�ڱ����� �� // 6�ں��ʹ� �ȵ��ϱ� ������ ���� �ø� // 12������ ���ٰ� // 13���� �� �ø� 26
			msg6.append("a");
			System.out.println(msg6.capacity());
		}
		// 5���� ������ �þ��
		// 6��°���ʹ� 6*2 =12 
		// 13��°���ʹ� 13*2 = 26
		// 27��°���ʹ� 26*2 = 52
		// ...
		
		// ���ڸ� �ָ� + 16
		// abc + 16
		
		// .trimToSize() 
		// ����ִ� ������ ���� �߶����
		// �ڿ� �����ִ� ���۴� �α׸� ��������
		// 14���� �߸��� ������ �ø��� �� �����
		// �� �̻� Ŀ���� ������ 
		msg6.trimToSize();
		System.out.println(msg6.capacity());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
