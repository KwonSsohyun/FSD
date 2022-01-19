package com.hi;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Ex05 {

	public static void main(String[] args) {
		// Ex04 �� �о����
		File file = new File("test04.bin");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			// ���ͽ�Ʈ�� ������ ������ ����� �о�´�.
			DataInputStream dis = new DataInputStream(fis);
			
			// ���� ������ �д� ������ ���ƾ��� (Ÿ���� �����ؾ���)
			
			// �̷��Ե� �� �� �ִ�.
			// int su = dis.read();
			// System.out.println(su);
			
			int su1;
			double su2;
			char su3;
			boolean boo;
			String msg;
			
			su1 = dis.readInt();
			su2 = dis.readDouble();
			su3 = dis.readChar();
			boo = dis.readBoolean();
			msg = dis.readUTF();
			
			System.out.println(su1);
			System.out.println(su2);
			System.out.println(su3);
			System.out.println(boo);
			System.out.println(msg);
			
			dis.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
