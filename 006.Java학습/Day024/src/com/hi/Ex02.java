package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex02 {

	public static void main(String[] args) {
		File file = new File("test02.bin");
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			// ����Ʈ��Ʈ���� �ƿ�ǲ��Ʈ���� �ִ�.
			PrintStream ps = new PrintStream(fos);
			// ps.write(1111);
			
			// test02.bin >> �ۼ��Ȱ��� �� �� �ִ�.
			// ���ڿ��� �����ϴ°�
			////// 13.14true���ڿ�1 
			////// ���ڿ�2
			// -> ���ڿ� 1�� ���Ű� ���ڿ� 3.14�� ���Ŵ�. �� ���ڿ�
			ps.print(1); // 65�� ��ٰ� A�� �����°� �ƴ϶� 65�� �����°��� ���ڿ��̶�°�
			ps.print(3.14);
			ps.print(true);
			ps.println("���ڿ�1");
			ps.println("���ڿ�2");
			
			ps.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
