package com.hi;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		// �ڷ��� �״�� ����, �ڷ��� �״�� �޾ƺ��� (������ ��Ʈ��)
		File file = new File("test04.bin");
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			// ���ʹ�
			DataOutputStream dos = new DataOutputStream(fos);
			
			// �̷��� �ᵵ ������
			// dos.write(65);
			
			// �ڷ����� �°� ���� �ȴ�.!
			// ���� ��� ����Ŀ� ���� �� ������ ���缭 ����� �Ѵ�
			// ����� �о���� (�� �ڷ����� �״�� �츱 ���ִ�)
			// �� write�ڷ���();
			int su1= 97;
			dos.writeInt(su1);
			
			double su2 = 3.14;
			dos.writeDouble(su2);
			
			char su3 = '#';
			dos.writeChar(su3);
			
			boolean boo = true;
			dos.writeBoolean(boo);
			
			// ���ڿ��� UTF
			String msg = "���ڿ�";
			dos.writeUTF(msg);
			
			dos.close();
			fos.close();
			
			System.out.println("�ۼ���");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
