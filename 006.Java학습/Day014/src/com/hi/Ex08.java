package com.hi;

public class Ex08 {

	public static void main(String[] args) {
		// �ֹι�ȣ üũ�� (ver 0.3.0)
		String msg = "020501-4123456";
		
		
		for(int i=0; i<msg.length(); i++){
			
			char ch = msg.charAt(i);
			
			if(i==6){ // 6�� �ε����� (-) ������ -> �������϶��� �������� üũ ���ϰ� �Ѿ.
				continue; // �ٷ� �� �������� ���� 6���� i++ �������� ������ 7������ �Ʒ� �����̳�? �ϴ� �Ǻ��Ŀ� ������ ��
			}
			if(Character.isDigit(ch)){
				
			}else{
				
			}
		}

	}

}
