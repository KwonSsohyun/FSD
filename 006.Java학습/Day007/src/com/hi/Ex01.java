package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int me, com, a, b, c;
		me = 1;
		com = 1; 
		a=0; b=0; c=0;
		String input;

		System.out.println("���� ���� �� ����(ver 0.1.0)");
		
		boolean boo =true;
		String[] arr = {"����", "����", "��"};
		
		
		while(boo){ // ���ѷ������� ��
			System.out.print("1.���� 2.���� 3.�� 0.����> ");
			input = sc.nextLine();
			me = Integer.parseInt(input);
			
			if(me==0){
				boo = false; // while�� ����
			}
			
			else if(me<1||me>3){
				System.out.println("�޴��� �ٽ� Ȯ���ϼ���.");
			}
			
			else{
				com = (int)(Math.random()*3)+1; // 1~3
				
				System.out.println("me : " + arr[me-1] + ", com : " + arr[com-1]);
				
				
				// �·� �Ǵ�
				if((me==1&&com==3)||(me==2&&com==1)||(me==3&&com==2)){
					// ���� �� // ���� ���� // �� ����
					System.out.println("�̰���");
					a++;
				}
				else if((me==com)){
					System.out.println("�����");
					b++;
				}
				else if((me==3&&com==1)||(me==1&&com==2)||(me==2&&com==3)){
					System.out.println("����");
					c++;
				}
		
			}
		}
		
		System.out.println(a + "��" + b + "��" + c + "��");
		System.out.println("�̿����ּż� �����մϴ�.");
		
		

	}

}
