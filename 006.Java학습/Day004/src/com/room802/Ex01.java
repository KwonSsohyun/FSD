package com.room802;

public class Ex01 {

	public static void main(String[] args) {
		// ���(�ݺ���, 3���� - for��)
		// ��    
			/* for(���ʱ�ȭ;�����ǹ�;��������){
				 		��ݺ������� ���;
			
				}
				�� 
			 */
	    // ������� -> �� -> �� -> ��true -> �� -> �� -> ��true -> �� -> �� -> ��true -> �� ... �� -> ��false -> ��
		
		int i = 1000;

		for(i = 0; i < 5 ; i++){
			System.out.println("�ݺ�"+i);
		}
		
		// i = 1000;
		
		System.out.println(i); // i�� 5���� (22������ ���ٰ� ����)(for���� ���� ���� ����)
		// �� i �� ���ʿ����� ��밡�� (for�� �ȿ��� ����������)
		
	}

}
