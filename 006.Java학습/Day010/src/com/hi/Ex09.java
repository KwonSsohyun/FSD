package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.4.1)
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String input = null;
		
		System.out.println("�л������������α׷�(ver 0.4.1)");
		System.out.print("�ѿ�  > ");
		input = sc.nextLine();
		int tot = Integer.parseInt(input);
		String[] kor = new String[tot];
		String[] eng = new String[tot];
		String[] math = new String[tot];
		int idx = 0;
		
		for(int i=0; i<tot; i++){ // null �⺻�� �Ⱥ��̰� �ϱ�
			kor[i] = "-";
			eng[i] = "-";
			math[i] = "-";
		}
		
		while(true){
			System.out.println("1.�Է�  2.����  0.����  >");
			input = sc.nextLine();
			
			if(input.equals("0")){
				System.out.println("�̿����ּż� �����մϴ�.");
				return;
			}else if(input.equals("1")){
				// �Է�
					System.out.println("�й� > ");
					input = sc.nextLine(); // �й��� 1������ ����
					int num = Integer.parseInt(input);
					if(num<=tot){
						System.out.println("���� > ");
						input = sc.nextLine();
						kor[num-1] = input;
						System.out.println("���� > ");
						input = sc.nextLine();
						eng[num-1] = input;
						System.out.println("���� > ");
						input = sc.nextLine();
						math[num-1] = input; // ������ ���� ++
					}
				}else if(input.equals("2")){
				System.out.println("--------------------------------------------------");
				System.out.println("����\t|����\t|����\t|�հ�");
				System.out.println("--------------------------------------------------");
				for(int i=0; i<tot; i++){
					if(!kor[i].equals("-")){
						int a = Integer.parseInt(kor[i]); // ���ڿ��̴ϱ� �����ؾ��Ѵ�.
						int b = Integer.parseInt(eng[i]);
						int c = Integer.parseInt(math[i]);
						int sum = a+b+c;
						System.out.println(kor[i] + "\t|" + eng[i] + "\t|" + math[i] + "\t|" + sum);
					}else{
						System.out.println(kor[i] + "\t|" + eng[i] + "\t|" + math[i] + "\t|-");
					}
				}
				System.out.println("--------------------------------------------------");
			}
		}
	}
}
