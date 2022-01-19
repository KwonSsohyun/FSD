package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		File file = new File("test01.bin");
		
		if(file.exists()){
			try {
				// �� �б� ���� Input
				FileInputStream is = new java.io.FileInputStream(file);
				int su = -1;
				// �ѱ��̴ϱ� 2����Ʈ�� ����
				// �ٵ� ���� ���� �ְų� �ϸ� ����� �ƽ�Ű�ڵ��̴� ��Ȳ�� ���� �ٸ� ��.
				// ���� �� �ѱ��϶� 2����Ʈ��� ��.
				// [4] �� 2���� | [6] �� 3���� 
				// [5] �� ���� �ѱ��� 2����Ʈ�ϱ� �̻��� ���� �ҷ� ����.
				byte[] arr = new byte[4];
				
				for(int i=0; i<arr.length; i++){
					// �Ͼ�ö� read
					su = is.read();
					
					// if(su==-1){break;}
					arr[i] = (byte)su;
					// ���⼭ (byte)su �� �� ������
					// 22�� ���ο� �� su = is.read();
					// �о�� ���� su�� �����ϴ�
					// �о�� ���� su�� arr[i]�� �������ش�.
					
					// �о�ö��� �ѱ��� ����
					// 1����Ʈ�� �о������ ���� -> �ѱ��� 2����Ʈ
					// System.out.println((char)su); // (char) ĳ��������
				}
				// �����ڿ� �־��ָ� ���ڿ��� �������
				// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
				// �迭�� ���� �� �ִ�. ������ >> String(byte[] bytes)
				String msg = new String(arr);
				System.out.println(msg);
				// �� �ݾ��ش�.
				is.close();
				
				// su = is.read();
				// System.out.println(su);

				// su = is.read();
				// System.out.println(su);
	
				// �� �̻� ������ ������ �� -1 ���
				// su = is.read();
				// System.out.println(su);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
