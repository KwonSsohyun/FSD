package com.hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		// ������ �аų� ���� ���ش�.
		File file = new File("test01.bin");
	
		try {
			FileOutputStream fot = new FileOutputStream(file);
			fot.write(98);
			
			
//			if(!file.exists()){ // ���縦 ���ϸ�
//				file.createNewFile();
//			}else{
//				fot.write(97);
//			}
			
			fot.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
