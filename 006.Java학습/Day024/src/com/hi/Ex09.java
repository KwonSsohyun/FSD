package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		File file = new File("test01.txt");
		
		try {
			// ��ǲ ��Ʈ�� (��Ī) �� FileReader
			FileReader fr = new FileReader(file);
			
			// �а���� ������ŭ �о���� �ȴ�.
			char[] buff = new char[3]; // 3���ھ� �о�´�.
			
			// ���۰� ĳ���� �迭 -> 2����Ʈ ü��ϱ�
			while(true){
				// �о�帰 ���� -> su
				int su = fr.read(buff);
				if(su == -1){break;}
				System.out.println(new String(buff, 0 ,su)); 
				// (buff, 0 ,su) �����Ƿν� 2����Ʈ�ϱ� �ѱ۵� ���� ���� ����
			}
			// fr.read(buff);
			
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
