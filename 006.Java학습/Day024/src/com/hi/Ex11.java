package com.hi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		File file = new File("test01.txt");
		
		String msg = "�ѱ۷� �ۼ��ϵ�\r\n�������� �ۼ��ϵ�\r\nABCD\r\n�� �ۼ��˴ϴ�.@#";
		// char[] buff = msg.toCharArray();
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			// ���ۿ� ��Ƽ� �ٷ� ����.
			// ĳ���͹迭�� ���� �ʿ䰡 ���� ���ۿ� �ٷ� ��ƹ�����.
			bw.write("�ѱ۷� �ۼ��ϵ�");
			bw.newLine(); // ����
			// bw.write("\r\n");
			bw.write("�������� �ۼ��ϵ�");
			bw.newLine();
			bw.write("ABCD");
			bw.newLine();
			bw.write("�� �ۼ��˴ϴ�.@#");
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
