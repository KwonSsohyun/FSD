package com.hi;

public class Ex02 {
	
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("�л������������α׷� (ver 0.3.0)");
		
		System.out.println("�ѿ� > ");
		String input = sc.nextLine(); // �ѿ� �Է� ���� (���ڿ��̶� �񱳰� �ȵ�)
		int tot = changeSu(input); // ���� ���ϴ� ��ŭ ����ڴ�. (����� ����) // input(����ڰ� �Է��� �� ����) >> �Ʒ� �޼����
		// �̰� ���⼭ ���� �Ⱦ��̴� ��� ������ �� ������ �Ʒ��� �� �����. (�ٽ� �缱����ϰ� ���̴�.) >> �� ���� �ٽ� �Ⱦ��ű⶧��
		// ���� su�� ���⿡ ���� ��. �� changeSu(input) >> �� �ڸ��� ��ܼ� tot������ ���
		
		// �迭�� Ư¡ >> ������ �ڷ���, �����Ҵ�(������ ����.) -> �����Ҵ��� ���� (�÷��� �����ӿ�ũ) > é�� 15��
		// ���񺰷� ������ �� �ְ� ä�� 
		// -> �л����� ���� �� �ø��� ���ؼ�(�л��� ����) / �������� �ʴ� �������� �������� ������.(������ ����)
		int[] kor = new int[tot]; // tot ������ �迭[����] �� ��´�.
		int[] eng = new int[tot];
		int[] math = new int[tot];
		
		boolean boo = true;
		int cnt = 0; // �Է�Ƚ��
		
		while(boo){ // ���ѷ��� (Ƚ���� �������� for / �𸣸� while) �ݺ��� �ȿ����� �������� ���ƶ� >> �������� ���Ӱ� ���� �Ҵ�.
			System.out.println("1.�Է�  2.����  0.����  >"); // �޴����
			input = sc.nextLine(); // ���ڿ� �Է¹ް� // ���� ���� String input = sc.nextLine(); ->> ������ ������ �̰� ��
			int su = changeSu(input); // ���ڿ� > ���������� ��ȯ // �Ʒ� �޼��� ȣ���ؼ� ��
			
			if(su==0){
				System.out.println("���α׷��� ����˴ϴ�.");
				boo = false; // �ݺ��� Ż��
			}else if(su==1 && cnt!=tot){ // ���� �������� �Է��� �� �ְ� ��. (cnt==tot�� ������ else������ ����)
				// �Է�
				kor[cnt] = inputSu("���� > "); // �迭�� ����. su�� ���ϵȰ� >> "inputSu("���� > ")" ���ڸ��� ��ܼ�, �� ���� �ε��� ���� ����.
				eng[cnt] = inputSu("���� > ");
				math[cnt] = inputSu("���� > ");
				cnt++;
				// System.out.print("���� > ");
				// input = sc.nextLine();
				// math[cnt++] = changeSu(input); // cnt++ ������ �������� > cnt++�� ī������ �� > 1�� ���� ���� (��� ����)
				// cnt++;
			}else if(su==1){ // (su==1 && cnt==tot) // &&�� ��� �� �����ؾ��ϴϱ� 35�����ο��� ��θ������� ������ ���� else if�� 45������ �� 
				// >> �����߿�!!! ���� 45�������� 35���� �ٲ�� ���� �ȵǰ���? ������� �������ϱ� 
				// Ȥ�� ���ڵ尡 else if�� �ƴ� if���ٸ� 35���� 45���� ���ÿ� ��µǰ���? if�� ����Ǹ� ���ο�Ŵϱ� ������ �ƴϴϱ�
				System.out.println("�� �̻� �Է��Ͻ� �л��� �����ϴ�.");
			}else if(su==2){
				// ���
				System.out.println("--------------------------------------------");
				System.out.println("����\t����\t����");
				System.out.println("--------------------------------------------");
				for(int i=0; i<tot; i++){
					System.out.println(kor[i] + "\t|" + eng[i] + "\t|" + math[i]);
				}
				System.out.println("--------------------------------------------");
			}else{
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			}
		}

	}
	
	
	// ********  ���ȭ (���) >> �ڵ����� >> �޼ҵ�ȭ >> �ܺο��� ������ ����. (���� �̷��� ���� ���������ϱ�)
	// ������ ���缭 ��� (��ɺο�)
	// 1. �ڵ�����
	// 2. ���� -> ���������� �ѹ��� �����.
	
	// ������ �Է¹ް� ���� �������ִ� ��� >> �޼���
	public static int inputSu(String title){ // (String title) ��¸޽����� Ÿ��Ʋ�� �ְ� ���ڷ� ����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println(title); // ������ �����̸� ������� 
		String msg = sc.nextLine(); // �Է� ����
		int su = changeSu(msg); // ���ڿ��� ���ڷ� �ٲ��ִ� �޼��� ��� (�Ʒ� ����)
		boolean boo = true;
		// ������ ������ 0~100 ������ ���� ����
		while(boo){ // ���ѷ���
			if(su<0 || su>100){
				System.out.print("������ 0~100 ������ ���� ����\n ���Է� > ");
				msg = sc.nextLine(); // �ٽ� �Է¹ް� ��.
				su = changeSu(msg); // ���ڿ� > ���ں�ȯ (���� 100�̻� ������ ��� ���Ϲ� ���ѷ��� Ÿ�°���) // ���� �ٽ� 77���� ���°���
			}
			if(su>=0 && su<=100){
				boo = false;
			}
		}
		return su;
	}
	
	// ���ڿ��� ���ڷ� �ٲ��ִ� ��� >> �޼���
	public static int changeSu(String msg){ // static �̴ϱ� ������ ���� static�̶� �ٷ� ȣ�� ���� // ������ �����ϴϱ� ���ڿ��̶� (String msg) �Ű�����
		int su = Integer.parseInt(msg); // ���ڿ��� ���������� ��ü�� ���� �ּҶ� >> ���ڷ� �ٲ� (������)
		return su; // �ش� ���� ����
	}

}
