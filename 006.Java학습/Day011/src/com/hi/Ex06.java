package com.hi;

public class Ex06 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.6.0)
		// 1 user1 1 2 3\n
		// 2 user2 44 55 66
		// 3 user3 77 88 99
		
		// 1 user1 1 2 3\n2 user2 44 55 66\n3 user3 77 88 99
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("�л������������α׷�(ver 0.6.0)");
		
		String data = "";
		String input = null;
		
		
		while(true){
			System.out.println("1.����  2.�Է�  3.����  4.����  0.���� > ");
			
			input = sc.nextLine();
			
			if(input.equals("0")){
				// ����
				return;
			}
			if(input.equals("1")){
				System.out.println("------------------------------------------");
				System.out.println("�й�\t���̸�\t������\t������\t������");
				System.out.print("------------------------------------------"); // /n (����) ��ù��°�л�
				System.out.println(data);
				System.out.println("------------------------------------------");
				
			}else if(input.equals("2")){
				// �Է�
				System.out.println("�й� > ");
				data+="\n" + sc.nextLine() + "\t��"; // ����
				System.out.println("�̸� > ");
				data+=sc.nextLine()+"\t��";
				System.out.println("���� > ");
				data+=sc.nextLine()+"\t��";
				System.out.println("���� > ");
				data+=sc.nextLine()+"\t��";
				System.out.println("���� > ");
				data+=sc.nextLine(); // ����
				
			}else if(input.equals("3")){
				// ����
				System.out.println("������ �й��� �Է����ּ���."); 
				
				input = sc.nextLine(); // ������ �й� �Է���. (���ڿ� �Է¹���)
				int startIdx = data.indexOf("\n" + input + "\t"); // ������ġ �ε��� ���� (�Ǿտ� \n�� �����ε��� ã����)
				// data+="\n"+ sc.nextLine()+"\t"; 
				int endIdx = data.indexOf("\n", startIdx+1); // +1���ؼ� �����ε��� ã�� // ������ -1
				// startIdx+1 �� �ϴϱ� 
				// ���� ��� startIdx�� 0�� �ε����ε� +1�������� �����ε����� 1�� �ε������� \n������ ã�ڴ�.
				// �ϴϱ� ���� startIndx �� \n�� �ε����� ã���ش�. (�����й��Է��ϴ� \n�� �ε����� ã���ش�!)
				
				String target; 
				
				if(endIdx==-1){ // ���� ����? (-1�� �׷��� ���ٴ°�) // �ٵ� �� -1�ϳ�? �� ������ �л��� �ڿ��� \n�� ������ �װ��� ���ϱ� ����
					target = data.substring(startIdx); // �� ������ �л��� �� �л��� �ƹ��͵� ������ ����������~������ ���о���~
				}else{
					target = data.substring(startIdx,endIdx); 
					// startIdx���� �ε������� ~ endIdx���� �̴�.
					// ���⼭ .substring()�� �ڿ� ���ڴ� �ε��� ī���� ������ 0���� �����ʰ� 1���� ������
					// ������ �߉��. 
					// endIdx�� \n �ε����� ����Ű�� ������ ��¥ ���� �� ���� �ε����� �о��ִ�
					// ������������������������������������������������������������������������������������������������������������������
					//  \n �й� \t                 \n �й� \t           
					//   ��                          ��                               
					// startIdx                   endIdx
					// ������������������������������������������������������������������������������������������������������������������
					//  \n �й� \t                 \n �й� \t           
					//   ��                        ��                     << .substring(startIdx,endIdx) �Ἥ �̿Ͱ��� ����ִ� ������ �ٲ���
					// startIdx                endIdx
					//  �̿Ͱ��� \n �� ���� ������ ���� �о��ش�.
				}
				
				data = data.replace(target, "");
				// ���� ��ĭ���� �ٲ�ġ���ϴ� ������ ���� ȿ��
				
			}else if(input.equals("4")){
				// ����
				System.out.println("������ �й��� �Է����ּ���."); 
				input = sc.nextLine(); // ������ �й� �Է���. (���ڿ� �Է¹���)
				int startIdx = data.indexOf("\n" + input + "\t"); // ������ġ �ε��� ����
				// data+="\n"+ sc.nextLine()+"\t"; 
				int endIdx = data.indexOf("\n", startIdx+1); // +1���ؼ� �����ε��� ã�� // ������ -1
				
				String target; 
				if(endIdx==-1){
					target = data.substring(startIdx); // �� ������ �л� �����ÿ��� ������ ���� �л��� ����, �й� �տ� \n�� �����ϱ�
				}else{
					target = data.substring(startIdx,endIdx);
				}
				
				input = "\n" + input + "\t��";
				System.out.println("�̸� > ");
				input+=sc.nextLine()+"\t��";
				System.out.println("���� > ");
				input+=sc.nextLine()+"\t��";
				System.out.println("���� > ");
				input+=sc.nextLine()+"\t��";
				System.out.println("���� > ");
				input+=sc.nextLine();
				
				data = data.replace(target, input);
				// ���� �ش��Է°����� �ٽ� ���÷��̽� �ϴ� �ش�.
			}
			
		}

	}

}
