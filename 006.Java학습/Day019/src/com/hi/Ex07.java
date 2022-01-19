package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		File origin = new File("99531D415E170D2918.jpg");
		File copy = new File("copy.jpg");
		
		// [8] �� ���� ���ڰ� ũ�� Ŭ���� �� ���� ����.
		// ��ǻ�� ���忡���� �޸𸮸� �� ��ŭ ����.
		// �ڿ��� �鿩�� ������ �ø���.
		// ������ ����Ʈ ������ �ϳ��ϳ��� �ߴٸ�
		// �̰� ��� �ϴ� �� ������.
		// ����Ʈ �迭 ��ü �̿�.
		byte[] buf = new byte[8];  
		// 2, 8, 16, 32, 64, ... (��ǻ�͸� �����Ѵٸ� ���� �̰� ����)
		
		try {
			// �б�
			FileInputStream fis = new FileInputStream(origin);
			// ����
			FileOutputStream fos = new FileOutputStream(copy); 
			
			while(true){
				int cnt = fis.read(buf);
				if(cnt==-1){break;}
				fos.write(buf, 0, cnt);
				// ���� ������ flush���°� ������.
				// ��, ����Ʈ���� �ϳ��� �а� �о�°� �� �׷�
				// fos.flush();
			}
			
			// �� ���� �ʾƵ� ��θ� �� �о��. (���븦 ����� ����)
			fos.flush();
			
			// close�� �� ����ȿ� �� �о��, ���� �������.
			fis.close();
			fos.close();
			System.out.println("���糡");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
