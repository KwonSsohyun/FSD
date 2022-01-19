package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		// ���ڿ� ��Ʈ�� �о����
		// 2byteü��
		
		File file = new File("test01.txt");
		
		// �о���϶��� ����!
		try {
			FileReader fr = new FileReader(file);
			
//			// System.out.println(fr.read()); // �� 65
//			System.out.println((char)fr.read()); // ����ȯ�ϸ� �״�� �о �� �ִ�. // �� 66
//			System.out.println(fr.read()); // �� 67
//			System.out.println(fr.read()); // 1byte 255���� // �� 54620
//			System.out.println(fr.read()); // �ѱ� 2byte    // �� 44544
//			System.out.println(fr.read()); // ������ ������ -1���� // �� -1			
			
			
			while(true){
				int su = fr.read(); // 65 | 66 | 67 | 54620 | 44544 | -1 |
				if(su == -1){break;}
				System.out.println((char)su);
			}
			
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
