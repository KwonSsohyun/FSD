package com.hi;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex03 {

	public static void main(String[] args) {
		File file = new File("text03.txt");
		
		if(!file.exists()){
			try {
				file.createNewFile();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileOutputStream fos= new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos); // ���۸� ����ؼ� ������ ���̰ڴ�.
			PrintStream ps = new PrintStream(bos); // ���ڿ��� ���� ���ڴٴ°�.
			
			// �ش系���� text03.txt �� �������� �� �� �ִ�.
			// ���ڿ��� ����� �Ѵ�.
			// bos.write("���ڿ�".getBytes());
			// bos.write("\r\n".getBytes()); // -> ���� (������: "\r\n") (������ : "\n")
			// bos.write("���ڿ�".getBytes());
			
			// ������ ���� ���ڿ��� ���Ծ��ڴ�.
			// println print �� ����Ʈ��Ʈ���� ���� �ִ� �޼���
			ps.println("���ڿ�"); // ���� �˾Ƽ� ���� (�ش� ���ü�� ���缭)
			ps.print("���ڿ�");
			
			// ������� �������� Ŭ����
			ps.close();
			bos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
