package com.hi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		File file = new File("test01.bin"); // ������ �������
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		// ����Ʈ ü��� 1byte -> �ѱ۾��� 2����Ʈ�� 1����Ʈ�� ��
		String msg = "�߿��̱�����";
		try{
			// �� ���� ���� Output
			FileOutputStream out = new java.io.FileOutputStream(file);
			
			// ����Ʈ ü���ϱ� �̰� ���� �ȵ�.
			// char[] arr = msg.toCharArray();
			
			// ����Ʈ Ÿ������ �ϸ� �� �ۼ��Ǵ� ���� �� �� �ִ�.
			byte[] arr = msg.getBytes();
			
			for(int i=0; i<arr.length; i++){
				out.write(arr[i]);
			}
			
			// out.write(65);
			// ����ĳ���� Ȱ��
			// out.write('a');
            // out.write('b');
			// out.write('c');
			// Ŭ���� �ؼ� �ݾ�����Ѵ�. (���븦 �̾�����Ѵ�. ���������� ��� ������.)
			out.close();
			System.out.println("�ۼ��Ϸ�");
			
		}catch(java.io.FileNotFoundException e){
			e.printStackTrace();
			// new java.io.FileOutputStream(file);
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}

}
