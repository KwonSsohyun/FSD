package com.hi;

// ���ϵ�ó��
import java.io.*;

public class Ex05 {

	public static void main(String[] args) {
		// IO�� ��Ʈ���� ��ȯ
		// byteStream �� StringStream �� �ٲٴ� ��
        // �ڹٸ� �����ϴ� Ư���� ��Ʈ�� StringStream
		
		OutputStream os = null;
		
		// ���ڿ���Ʈ�� ��ȯ
		// OutputStreamWriter osw = null;
		// OutputStreamWriter�� extends Writer �� ��ӹޱ⿡
		// Writer ����
		Writer osw = null;
		BufferedWriter bw = null;
		
		try {
			os = new FileOutputStream("test05.txt"); // Ȯ���� txt > ���ڿ� ���ڴٴ°�
			// ��ȯ��
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			// ��ȯ�Ȱ� Ȯ���غ� �� �ִ�.
			// osw.write("���ڿ�");
			bw.write("���ڿ�");
			bw.newLine(); // ����
			bw.write("���ڿ�2");
			bw.newLine(); // ����
	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// Ŭ���� �� ������� -> �ȱ׷� ���� ����
				bw.close();
				osw.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
