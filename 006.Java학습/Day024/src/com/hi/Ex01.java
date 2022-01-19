package com.hi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// << IO - ���� >>
		// ���ϴ� 1:1�� ���� �Ⱦ���� �Ѵ�.
		// origin �̹��� ����
		File origin = new File("origin.jpg");
		// origin ������ ����
		File  file = new File("copy1.jpg");
		// File  file = new File("test01.bin");
		
		
		if(!file.exists()){ // ������ ������
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// ���� �� ������ �ϱ�
		// ���������� ������ �� ������
		byte[] buf = new byte[2];
		
		try {
			// �о�°��� ���°� �� FileInputStream �� FileOutputStream
			// ���ϴ� 1:1�� ���� �Ⱦ���� �Ѵ�.
			FileInputStream fis = new FileInputStream(origin); // �� �Է�
			FileOutputStream fos = new FileOutputStream(file); // �� ���
			
			// --------------------------------------------------------------------------
			// ���� ������ �ϱ�
			// 1����Ʈ�� �дµ�, (���ϰ� �������ġ���� �о����, ĳ���� ���� �о)
			// ���ۿ��� �̸� �о��ٴ°��� (�׷��� �������̰� ��)
			// ��ǲ�� ���۴ޱ�
			BufferedInputStream bis = new BufferedInputStream(fis);
			// �ƿ�ǲ�� ���۴ޱ� (�갡 ���� Ŭ����ǰ� ������ Ŭ���� �Ǿ���)
			// �̹� ������ ����� �����Ǿ��ִ�. (8192�� �а� 8192��)
			// IO ����� ������ ����
			// read�� ���ؼ� �о�Դµ� ���ư�������. (�о�ͼ� ���ۿ� ��Ƴ��´�)
			// ���ʹۿ� ���븦 �� ���� (������ ���Ἲ)
			// ��Ȯ�� �а� ���������.
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// << ���۴޾ƺ��� >>
			// ���۸� ��ƿͼ� ��
			// BufferedOutputStream bos = new BufferedOutputStream(fos);
			// bos.write("���۸� �޾Ƽ� �ۼ��մϴ�.".getBytes());
			// bos.close();
			
			// �ð����� (�۵��� �ð�)
			long before = System.currentTimeMillis();
			
			// << ���۾��� �Ẹ�� >>
			while(true){
				// �ϳ��� �а�
				// int su = fis.read();
				// int su = bis.read();
				int su = bis.read(buf);
	
				if(su == -1){break;} // ������ ���°�. // ������� 100����Ʈ �����̴�. 101�� ������ -1
				// �ϳ��� ����ض�. 
				// fos.write(su);
				// bos.write(su);
				bos.write(buf, 0 , su); // ���⼭ su�� ����
			}
			// �ð����� (�۵��� �ð�)
			long after = System.currentTimeMillis();
			
			// ���۰� Ŭ����ǰ� -> ������ Ŭ����
			// ��Ȯ�� �а� ���������.
			bis.close();
			bos.close();
			
			fis.close();
			fos.close();
			
			//// �ð����� (���ð����� �Ľð� ���� : �ҿ�ð�)
			System.out.println(after-before + "ms");
			// ���ι��۸� ����ؼ� �ϴٺ��ϱ� �������̰� ����.
	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
