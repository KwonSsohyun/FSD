package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		
//		return; // ����ٰ� ������ �ȵ�
				// �Ʒ� �ڵ���� ������ �ȵǼ� ��Ŭ�������� ����� (�� ������ �̰���)
	
		int a; 
		int b=3;
		if(b>1){
			a=1;
		}else{ // ���ຸ��
			a=0; // �� ���� ���� ���ص� a�� �� �ʱ�ȭ �Ǵϱ� ����
		}
		System.out.println(a);
		
		for(int i=0; i<10; i++){
			
			System.out.println("before : " + i);
			
			if(i>4){
//				return;  // �ش� �޼����� ����(ȣ���� ������ ���ư�)(�޸𸮷� ������ stack ���� ������) ���� �޼��� �� ��𼭳� ���� ����
				continue; // 0~4 main ���� �ش� �ݺ����� ������� ���ư� ���� �ݺ��� �������� ��밡�� (�ݺ��� Ƚ�� �� ä��) // ���ѷ����� while�������� ��� ���°��� (ex) �ٽ� ���Է����ּ���. �̷��� ������ ����
//				break; // 0~4 main ����    �ش� switch�� || �ݺ������� Ż�� ���� �ݺ���, switch ������ ��밡��
			}
			System.out.println("after : " + i);
		}
		System.out.println("main ����");
	}
	
	

}
