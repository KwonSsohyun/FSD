package com.hi;

public class Ex08 {

	public static void main(String[] args) {

		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input = null;
		System.out.println("�ֹι�ȣ > ");
		input = "�������̻���-�����̻�����"; //"951231-1123456"; // sc.nextLine();
		
		char[] arr = input.toCharArray(); // ��Ʈ�� �Է��Ѱ͵� �� ����Ÿ������ ����
		
//		for(���ڹ迭�� ���̸�ŭ �ݺ�){
//			if(�����ϳ��� '��')'1'
//			else if(�����ϳ��� '��')'2'
//			~~~
//			else if(�����ϳ��� '��')'0'
//		}
		// �ֹι�ȣ Ȯ�� (�迭�� ����)
		char[] temp1 = {'��','��','��', '��','��', '��', '��', 'ĥ', '��', '��'};
		char[] temp2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		
		for(int i=0; i<arr.length; i++){
//			char ch = arr[i];
			for(int j=0; j<temp1.length; j++){ // ��
				if(arr[i]==temp1[j]){ // ã���ڵ�
					arr[i] = temp2[j]; // �ٲ�ġ��
				}
			}
		}
		
//		input = "19"+input;
//		char[] arr = input.toCharArray();   // String -> char[]		{'9''5''1''2''3''1'.....
		
		boolean check1 = true;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == '-'){ // - ������ �����̾ ������, 20�����ε� �����̴ϱ� �ȳ��� �׸��� ��� ����
					check1 = false; // - ������ ���� �Ǹ鼭 (���� ������ŭ)���ϱ�, ������, 20������ true�ϱ� -�Է��ϼ���, �޼��� ���� 
			}
		}
		if(check1){
			System.out.println("-�� �ݵ�� �Է��ϼ���.");
		}
		if(arr[6] != '-'){
			System.out.println("�Է¿���");
			return; // ���θ޼��� ����
		}
		
		char[] arr2 = new char[4];			//						{(char)0 , (char)0 , (char)0 , (char)0}
		if(arr[7] <= (int)'2'){
			arr2[0] = '1';
			arr2[1] = '9';
		}else{
			arr2[0] = '2';
			arr2[1] = '0';
		}
		System.arraycopy(arr, 0, arr2, 2, 2);  //                    {(char)0 , (char)0 , 9 , 5}
		String year = new String(arr2);     // char[] -> String
		int su = Integer.parseInt(year);   
		
		System.out.print("����� ");
		System.out.print(2021 - su + 1);
		System.out.print("�� ");
		
		if(arr[7]%2==0){
			System.out.print("��");
		}else{
			System.out.print("��");
		} 
		//System.out.println((int)'1'); // ���ڿ� 1�� 49�ϱ� �Ȱ��� ¦�� Ȱ�� ���� -> 1,3

		System.out.println("���Դϴ�.");
		
		
	}

}
