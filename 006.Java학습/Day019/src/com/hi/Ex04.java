package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		
		// < ���� �����غ���! >
		
		// �ѱ� ������ �ƴ�
		// 1) ���Ͽ� ���̳ʸ� �����͸� �о
		File file = new File("F:\\JavaWork\\Day019\\src\\com\\hi\\Ex01.java");
		File copy = new File("F:\\JavaWork\\Day019\\src\\com\\hi\\Ex05.java");
		// File copy = new File("copy.jpg");
		
		
		
		try{
			
			// ���Ϻ��� .createNewFile()
			copy.createNewFile();
			
			// 2) �Ȱ��� ����.
			// �� �б� ���� Input
			FileInputStream is = new FileInputStream(file);
			// �� �ۼ��ҰŴϱ� ���� Output
			FileOutputStream os = new FileOutputStream(copy);
			
			while(true){
				// 3) 1����Ʈ�� �о �״�� ���� �ִ�.
				int su = is.read();
				if(su==-1){break;}
				os.write(su);
			}
			// �� ���� ���� io ����
			is.close();
			os.close();
			System.out.println("���� �Ϸ�...");
			
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
