package com.hi;

public class Ex02 {

	public static void main(String[] args) {
		// String Ŭ������ ������ �ִ� ��ɾ�
		String msg = "abcdefgc"; 
		
		
		System.out.println("----------------------------------------------------");
		System.out.println(".charAt() >> �ش� ���� ���");
		
		// ���� .charAt() >> �ش� ���� ���
		char ch1 = msg.charAt(2); // 2��° ������ ����ϰڴ�. (0������ ����)
		System.out.println(ch1);
		
		System.out.println("----------------------------------------------------");
		System.out.println(".concat() >> ���ڿ��� ���ڿ� ������");
		
		// ���� ���ڿ��� ���ڿ��� �����ִ� ��� �� .concat() �� �̹� �������� ����� �ö󰣴�.
		String result1 = msg.concat("ABCD");
//		String result2 = msg+"ABCD";
		System.out.println(result1); 
//		System.out.println(result2); 
		System.out.println(msg);  	
//		System.out.println(msg+"ABCD"); 
		// ���ϴ� ���� ���ο� ��ü�� �����Ѵ�.
		
		System.out.println("----------------------------------------------------");
		System.out.println(".indexOf >> �ش繮���� �ε��� ��ȣ ã����");
		
		// ���� .indexOf >> �ش繮���� �ε��� ��ȣ�� ��ȯ����
		System.out.println(msg);
		System.out.println(msg.indexOf('c')); // �ش��ȣ�� �ε��� ��ȣ�� ��ȯ���� // ������ -1
		System.out.println(msg.indexOf(97)); // 97�� a // �ƽ�Ű�ڵ� 
		System.out.println(msg.indexOf('c',3)); // �˻��� ���� �ε��� (�� �ڿ� �ִ� c�� ã���Ŷ� 2���� �ε����� ����ġ�� �;)
		System.out.println(msg.indexOf("fc")); // �ش��ϴ� �� �ܾ��� ���� �ε��� (���� ������ -1)
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".length() >> ���ڿ� ���̸� ��ȯ����");
		
		// ���� .length() >> ���ڿ� ���̸� ��ȯ���� 
		//     			   ���� : ���Ϲ��ڷ� �迭 �̾Ƽ� �� �� .toCharArray()
		System.out.println(msg.length()); // ���̴� 1���� �� (���̴ϱ�) // 8���
		
		for(int i=0; i<msg.length(); i++){
			System.out.println(msg.charAt(i));
		}

		System.out.println("----------------------------------------------------");	
		System.out.println(".replace() >> �ٲ��ִ� ��");
		
		// ���� .replace() >> �ٲٴ°� 
//		String msg = "abcdefgc";
		String result3 = msg.replace('d', 'D'); // �ش��ϴ� �͵� �ѹ��� ���� �ٲ���
		String result4 = msg.replace('b', 'B');
		String result5 = msg.replace("c", "C"); // ���ڿ��� ����
		
		String result6 = msg.replace("abcde", "cABCDe"); // ���� �������.
		String result7 = msg.replace("abc", "ab"); // ����
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".substring() >> �ش��ε������� �߶� ���");
		
		// ���� .substring()
		// �ε�����ȣ���� ���� >> �߶��� ���ο� ���ڿ��� ���� ������
		// ó���� ���� ��Ÿ���� �������� >> ó���� 0���� ����, �ڿ������ʹ� 1���� ����.
//		String msg = "abcdefgc";
		String result8 = msg.substring(3); // defgc
		String result9 = msg.substring(2,5); // ó�� 0 ���� ����, �ڡڡڵڿ��� 1���� ���� (endIndex -1) cde
		System.out.println(result8);
		System.out.println(result9);
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".toString() >> �ش��ڽ��� �̾Ƴ���");
		
		// ���� .toString()
		// �ش��ڽ��� �̾Ƴ���
		// �⺻ ����� �� ������ ����ؼ� ������ش�.
		System.out.println(msg.toString());
		
		System.out.println("----------------------------------------------------");	
		System.out.println(".valueOf() >> � �ڷ����̴���, ���ڿ��� ��ȯ���ش�.");
		
		// ���� .valueOf()
		// � �ڷ����̴���, ���ڿ��� ��ȯ�� �ش�. (� ���̵� ����)
		// ��� �ڷ����� �����ϴµ� �� .valueOf() ��� ���� �̸��� ���� ������? 
		//  �� �����ε� �Ǿ��ֱ� ������ valueOf �� ���� �̸��� �� �� �ִ�.

		String result10 = String.valueOf(3.14);
		String result11 = String.valueOf(new byte[]{65,66,67});
		System.out.println(result10+1); // ���ڿ��� result10 ��ȯ��⿡ +1 �ص� ���ڿ�ó�� �ڿ� ������
		System.out.println(result11);
		
		System.out.println("----------------------------------------------------");	
		
		
	}

}
