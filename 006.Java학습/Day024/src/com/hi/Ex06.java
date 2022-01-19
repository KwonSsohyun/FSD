package com.hi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Ex06 {

	public static void main(String[] args) {
		// ����Ʈ���
		File file = new File("test02.bin");
		File copy = new File("test05.bin");
		
		// �о����
		try {
			if(!copy.exists()){copy.createNewFile();}
			
			// 1����Ʈ�� �о 1����Ʈ�� ��� �ִ�. (���޸�)
			FileInputStream fis = new FileInputStream(file);
			// ������ �� �ø��� ������ ���۽�Ʈ�� �߰�.
			// �ϰ������� �а�, �ϰ������� ����. (�������)
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			// ������Ʈ �迭
			// ArrayList<Byte> list;
			
			while(true){
				int su = fis.read();
				if(su==-1){break;}
				baos.write(su);
				// list.add(null);
			}
			// list.toArray();
			
			// ByteArrayOutputStream > ����ִ°��� �ϰ������� ����Ʈ �迭�� �������.
			// ���� ��ü ����Ʈ��ŭ �迭�� ��� ��. (���ڿ�����)
			// 100����Ʈ������ �ѹ��� ����Ʈ�迭�� ��Ƽ� ���ڿ��� ó��.
			byte[] buf = baos.toByteArray();
			// System.out.println(new String(buf));
			
			//-------------------------------------------------------------------
			
			FileOutputStream fos = new FileOutputStream(copy);
			ByteArrayInputStream bais = new ByteArrayInputStream(buf);  // ����Ʈ��Ʈ�� (������ ���ϰ�)
			while(true){
				int su = bais.read();
				if(su== -1){break;}
				fos.write(su);
			}
			
			baos.close();
			bais.close();
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
