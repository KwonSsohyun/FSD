package com.hi;

import java.io.File;

public class Ex15 {

	public static void main(String[] args) {
		
		// ���� dist ���丮(����) �����
		
		File file = new File("./dist2"); // �����ο� �ش�.
		
		if(file.exists()){
			System.out.println("���� ������ �����մϴ�.");
		}else{
			// ������ ���丮(����) �����
			boolean boo = file.mkdir();
			System.out.println(boo);
		}

	}

}
