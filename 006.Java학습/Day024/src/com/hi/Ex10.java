package com.hi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) {
		File file = new File("test01.txt");
		
		String msg = "�ѱ۷� �ۼ��ص� ����\r\n �ۼ��� ������ ���� ���ڿ� ��Ʈ���Դϴ�.";
		char[] buff = msg.toCharArray();
		
		try {
			// �ƿ�ǲ��Ʈ�� (��Ī) �� FileWriter
			FileWriter fw = new FileWriter(file);
			fw.write(buff);
		
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
