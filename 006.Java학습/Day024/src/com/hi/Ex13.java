package com.hi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex13 {

	public static void main(String[] args) {
		File file = new File("test01.txt");
		
		
		try {
			FileWriter fw = new FileWriter(file);
			// ����Ʈ�� �ƿ�ǲ ��Ʈ���� �ִ�.
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("�׳� ������");
			pw.println("���� ���ø� �˴ϴ�.");
			pw.print("����Ʈ�� �ϸ� ");
			pw.print("������ �����ؼ� �ۼ���");
			
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
