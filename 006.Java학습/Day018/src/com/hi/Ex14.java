package com.hi;

import java.io.File;

public class Ex14 {

	public static void main(String[] args) {
		
		// ���� dist ���丮(����) �����
		//    ���� �ش� ���� �ȿ� ������ �ִٸ� ��������
		//    (���丮�� ������� �ʱ� ����)
		//    �� ���丮 ���� ����� �����ϸ� ��.
		
//		File file = new File("test2.txt");
		File file = new File("dist2");
		
		if(file.exists()){
			boolean boo = file.delete();
			// �������� true;
			System.out.println(boo);
		}else{
			System.out.println("������ �����ϴ�.");
		}
		
		// ���� ���̵�ٿ��� ���� ������ ���� Ȯ���ϰ� �ʹٸ�
		// ������ Ŀ�� 

	}

}
