package com.room802;

public class Ex13 {

	public static void main(String[] args) {
		// �л��������� ���α׷� (ver 0.0.1)
		// kor=96, eng=69, math=73;
		// �հ� ��� ����
		// ���� ��� 90�̻� -> A����
		//           80�̻� -> B����
		//           70�̻� -> C����
		//           60�̻� -> D����
		//           60�̸� -> F���� (����� �ϼ���.)
		// -------------------------------------------------
		// ���� : 96	| ���� : 69		| ����:73
		// -------------------------------------------------
		// �հ� : 0000
		// ��� : 00.00 ( �Ҽ���°�ڸ����� ���)
		// -------------------------------------------------
		// ���� : F 
		//        ����� �ϼ���.
		// -------------------------------------------------
		
		int kor = 96;
		int eng = 69;
		int math = 73;
		
		double sum = kor+eng+math;
		
		System.out.println("--------------------------------------");
		System.out.println("���� : "+ kor + "  | ���� : "+ eng + "  | ���� : "+ math);
		System.out.println("--------------------------------------");
		System.out.println("�հ� : " + (int)sum);
		
		if(true){
			sum /=3; 
			System.out.println("���: "+ sum);
		}

		System.out.println("--------------------------------------");		
		
		
		switch((int)sum){
			case 100:
			case 90:
				System.out.println("A����");
				break;
			case 80:
				System.out.println("B����");
				break;
			case 79:
				System.out.println("C����");
				break;
			case 60:
				System.out.println("D����");
				break;
			default:
				System.out.println("F");
		}
	}

}
