package com.hi;
// �� Day010 > Ex08
public class Ex02 {

	public static void main(String[] args) {
		// ���ڿ� ã��
		System.out.println("�ѱ۷� ���� �Է����ּ���. > ");
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String sc = scan.nextLine();
		char[] ch = sc.toCharArray(); // String(���ڿ�) -> char(���Ϲ���) �迭�� ������ ����
		
		char[] ko = new char[]{'��', '��', '��', '��', '��', '��', '��', 'ĥ', '��', '��'};
		char[] su = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		for(int i=0; i<ch.length; i++){
			for(int j=0; j<ko.length; j++){ 
				if(ch[i] == ko[j]){ // �� ã���ڵ�
					ch[i] = su[j]; // �ٲ�ġ��
				}
			}
		}
		
		System.out.println(ch);
		
		

	}

}
