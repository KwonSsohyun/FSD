package com.room802;

public class Ex10 {

	public static void main(String[] args) {
		// if���� else if�� else���� ���� �� �ִµ�
		// else if���� 0�� �̻�
		// else���� 0 �Ǵ� 1��
		// 1���� ������ �����ϴ� ���� ������ �ϰ� ����������.
		
		// su = 5;
		// su�� ����̸� "����Դϴ�" ���
		// su�� �����̸� "�����Դϴ�" ���

		int su;
		su = (int)(Math.random()*10)+1;
		System.out.println(su);
		
		if(su > 0){
			System.out.println("��� �Դϴ�.");
		}
		
		if(!(su > 0)){
			System.out.println("���� �Դϴ�.");
		}
		
		System.out.println("------------------------------------");
		
		
		if(su>0){
			System.out.println("0���� Ů�ϴ�.");
		}
		else{
			System.out.println("0���� ���ų� �۽��ϴ�.");
		}
		
		System.out.println("------------------------------------");
		
		if(su>0){
			System.out.println("0���� Ů�ϴ�."); // su�� ���� 0���� ũ�� ->> �Ѵ� ���� (switch case���� ����)
		}
		// ���� ������ �������� �ʰ� �׸���, su>-1�� �����ϴ�
		if(!(su>0) && su>-1){
			System.out.println("0 �Դϴ�.");
		}
		if(su>=0){
			System.out.println("0 �Դϴ�.");  // su�� ���� 0���� ũ�� ->> �Ѵ� ���� (switch case���� ����)
		}
		if(su<0){
			System.out.println("0���� �۽��ϴ�.");
		}
		
		System.out.println("------------------------------------");
		
		// ������ ����
		if(su>0){
			System.out.println("0���� Ů�ϴ�."); // su�� ���� 0���� ũ�� ->> if, else if, else �߿� �����Ѱ͸� ������ ��������
		}
		else if(su>-1){ 
			System.out.println("0 �Դϴ�."); 
		}
		else{
			System.out.println("0���� �۽��ϴ�.");
		}
	}

}
