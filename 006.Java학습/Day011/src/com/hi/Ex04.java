package com.hi;

public class Ex04 {

	public static void main(String[] args) {
		// �ؽ��Լ�
		// �ٿ�ε� ������ �ؽ��ڵ� ������ �ִ�.
		// ��Ʈ���� 0101 �� ���ڷ� �ٲ㼭 �������� �ٽ� ���� ��ȯ�ؼ�  8���� >> 16������ ��ȯ�ؼ� Ȯ �پ���.
		// Ư�����ڷ� ���� �� �پ���, �� ���� �� �پ��� >> "�ؽ��Լ�"
		// ���� ��������� Ư�������� ������ �Ѵ�. (���� ���δ�.)
		// "�ؽ��Լ�" ���ؼ� ���ϰ��� >> "�ؽ��ڵ�"
		// ���ȶ���(��ȣȭ)

		Ex04 me = new Ex04();
		System.out.println(me); 
		// com.hi.Ex04@15db9742
		// Ŭ�������� �� com.hi.Ex04 // ��ü�� �ؽ��ڵ尪 �� @15db9742
		
		// ���� hashCode();
		// ��ü�� �ּҰ��� �ƴ�����, ���� ��ü���� �ƴ��� �Ǻ��ϱ� ���ؼ�. 
		// (���� Ȯ���� ������� ��)
		// == �� ������ �Ŵ� �ƴϰ�
		// hashCode�� ������ ���� �پ��ϱ�.
		
		System.out.println("----------------------------------------------------");
		System.out.println(".split() >> �Է��� ������ �߶󳻼� ���ڿ� �迭�� �����.");
		
		// ���� .split()
		// �߶��ش�. > �������� string���� �������ش�.
		String msg = "java, web, db, framwork, app";
		String[] arr = msg.split(","); // ���б����� �ذ��� // ,�� ������ �ĸ��� �߶����
		// ���°� ��������� �״�� ���´�.
		// ���� ���⸦ " "��ĭ ��µ�
		// msg���� ��ĭ ���� ��ĭ�� �������� ��ĭ�� ���ڿ��� �����
		
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"|");
		}
		
		System.out.println(); 
		
		// Ư������ ǥ�� & �ȵǴ� ���� �� \\
		String msg1 = "java|web|db|framwork|app";
		String[] arr1 = msg1.split("\\|"); // �ȵǴ� ����Ư������ \\ �տ� ������.
		System.out.println(arr1.length);
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]);
		}
		System.out.println(); 
		
		
		System.out.println("----------------------------------------------------");
		System.out.println(".compareTo() >> ������ �ٸ���, ���ڷ� ����");
		
		// ���� .compareTo()
		// ������ �ٸ���, �ٸ��� �󸶳� �ٸ��� ����
		// �󸶳� �ٸ��� ��ȯ���ش�.(�����ؼ� ���ڷ� ����)
		
		
		// [ �� �켱���� ]
		//   1) ĳ���ͷ� �̾Ƽ�, ������ ���ؼ� �󸶳� �ٸ���
		//   2) ���̰� �ٸ��� �󸶳� �ٸ��� 
	
		
		// [ �� ��� ] 
		//   0 : ����.
		//   -1 : ��ȣ�ȿ� ������ ũ�� �󸶳� ū�� ����
		//   1 
		
		String msg2 = "abc";
		String msg3 = "abdefg";
		System.out.println(msg2.compareTo(msg3)); // msg2 �� ����  // msg3�� this
		
		System.out.println(func(msg2, msg3));
		
		
		System.out.println("----------------------------------------------------");
		
		
	}
	
	
	public static int func(String a, String b){
		if(a.length()==b.length()){ // ���� ���̰� ����?
			char[] arr1 = a.toCharArray(); // �ѱ��ھ� �̾Ƽ�
			char[] arr2 = b.toCharArray();
			for(int i=0; i<a.length(); i++){
				if(arr1[i] - arr2[i]!=0){ // ���� �ٸ��� 
					return arr1[i] - arr2[i]; // ������ ���� �����ϸ鼭 ������
				}
			}
			return 0; // ����
		}else{
			return a.length()-b.length(); // ���� ���̰� �ٸ���? >> �󸶳� ���̰� �ٸ��� ����
		}
		
	}

}
