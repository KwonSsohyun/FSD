package com.hi;

public class Ex05 {

	public static void main(String[] args) {
		// �ֹι�ȣ �˻��
		// �ֹι�ȣ�� �Է��ϼ���.
		// >>> 020501-4123456
		// ����� ���� 20�� �����Դϴ�.
		////////////////////////////////
		// �ֹι�ȣ�� �Է��ϼ���.
		// >>> 990501-4123456
		// ����� ���� 23�� �����Դϴ�.
		////////////////////////////////
		// �ֹι�ȣ�� �Է��ϼ���.
		// >>> 9905011123456
		// �Է��� �ٽ� Ȯ���ϼ���. (000000-0000000)
		////////////////////////////////
		// �ֹι�ȣ�� �Է��ϼ���.
		// >>> 990501-112345
		// �Է��� �����մϴ�. (000000-0000000)
		////////////////////////////////	
		
		System.out.println("�ֹι�ȣ �˻��");
		System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String scan = sc.nextLine();
		char[] jumin = scan.toCharArray();
		
		if(jumin[6] == '1'|| jumin[6] == '3'){
			System.out.println("�����Դϴ�.");
		}else if(jumin[6] == '2' || jumin[6] == '4'){
			System.out.println("�����Դϴ�.");
		}
		
//		int su = Integer.parseInt(jumin[0]);
//		int su1 = Integer.parseInt(jumin[1]);
		
		
		
		/*
		 * int[] arr = new int[n.length()];
		 * 
		for(int i=0; i<n.length(); i++){
			arr[i] = n.charAt(i) - '0';
			System.out.println(arr[i]);
		}
		
		if(arr[6] == 1 || arr[6] == 3){
			System.out.println("�����Դϴ�.");
		}else if(arr[6] == 2 || arr[6] == 4){
			System.out.println("�����Դϴ�.");
		}
		
		System.out.println(2021 - a);
		*/
		

 		
 		
 		
		
		
		
		
		
		
	}

}
