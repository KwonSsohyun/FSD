package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		// < ���� ���� �غ��� >
		
		String msg = "aaaaabbbbbbcccccc";
		
		File file = new File("test05.txt");
		
		try {
			file.createNewFile();
			// ���� �� Output
			FileOutputStream fos = new FileOutputStream(file);
			
			byte[] buf = msg.getBytes();
			// �迭��ŭ �ѹ��� io�� �о(������ ����)
			// ����Ʈ�迭 �ް� ������
			fos.write(buf);
			
			// ��!
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
