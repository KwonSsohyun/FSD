package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		// �ֹι�ȣ üũ�� (ver 0.3.0)
		// 9 5 0 1 1 6 - 2 0 3   1  8   1   6
		// 0 1 2 3 4 5 6 7 8 9  10  11  12  13
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String sc;
		char[] arr;
		

		while(true){
			System.out.println("�ֹι�ȣ �Է����ּ���.");
			sc = scan.nextLine();
			arr = sc.toCharArray(); 
		
			for(int i=0; i<arr.length; i++){
				if(!(Character.isDigit(arr[i]))){ // ���ڰ� �ƴϸ�
					if(arr[6] == '-'){
						continue;
					}
					System.out.println("���ڸ� �־ ���Է� ��Ź�帳�ϴ�.");
					break;
				}
				if(!(arr[6] == '-')){
					System.out.println("�������� �־ ���Է� ��Ź�帳�ϴ�.");
					break;
				}
			}
			

			
			
			
			
			
		}
		
	
		


	}

}
