package com.hi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		// << ���ڿ� ��Ʈ�� >>
		// ���ڿ��� �� ������
		// �ڹٴ� 2����Ʈ�� -> ��¿���� 1����Ʈ / ��¿���� 2����Ʈ
		// �ڹٴ� �������� ����
		
		// ������ ���ڴϱ� txt
		File file = new File("test01.txt");
		
		if(!file.exists()){
			try {
				file.createNewFile();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// ���ڿ���Ʈ�� ����
		// ���Ŵϱ� Writer
		// ���Ͽ� ���Ŵϱ� FileWriter
		try {
			FileWriter fw = new FileWriter(file);
			
			// ���ڿ� ��Ʈ���̴� >> ���ڸ� �����
			// ���� ���ڿ��� �̿��Ҷ��� �����.
			// �̹���,���� �̷��� �ȵ�.
			char ch = 'A';
			fw.write(ch);
			fw.write('B');
			fw.write('C');
			fw.write('��');
			fw.write('��');
			
			
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
