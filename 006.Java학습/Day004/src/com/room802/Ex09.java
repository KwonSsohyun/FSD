package com.room802;

public class Ex09 {

	public static void main(String[] args) {
		
		
		int kor,eng,math,sum;
		kor = 96;
		eng = 69;
		math = 73;
		
		sum = kor + eng + math;
		System.out.println("------------------------------------------");
		System.out.println("���� : " + kor + "   | ���� : " + eng + "   | ���� : " + math);
		
		System.out.println("------------------------------------------");
		
		System.out.println("�հ� : " + sum);
		
		// ��� (�Ҽ���°�ڸ� ǥ��)
		double avg = (int)sum*100/3/100.0;
		System.out.println("��� : " + avg);
		
		System.out.println("------------------------------------------");
		
		// ���� ���ϱ�
		System.out.print("���� : ");
		switch((int)avg/10){ 
			case 10 :
			case 9 : System.out.println("A ����");
					 break;
			
			case 7 : System.out.println("C ����");
					 break;
					 
			default : System.out.println("F ���� : ������ϼ���.");
		}

	}

}
