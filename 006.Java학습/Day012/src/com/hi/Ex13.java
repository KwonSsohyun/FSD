package com.hi;

public class Ex13 {

	public static void main(String[] args) {
		String[] msg = {"0", "1", "��", "3"};
		
		try{
		for(int i=0; i<msg.length; i++){
			int su = Integer.parseInt(msg[i]); // ���ڿ� ���������� �ٲ�
			System.out.println(su);
		}
		}catch(java.lang.NumberFormatException e){
			System.out.println("�����߻�");
		}

	}

}
