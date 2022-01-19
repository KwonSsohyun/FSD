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
		// 바이트어레이
		File file = new File("test02.bin");
		File copy = new File("test05.bin");
		
		// 읽어들임
		try {
			if(!copy.exists()){copy.createNewFile();}
			
			// 1바이트씩 읽어서 1바이트씩 담고 있다. (대상메모리)
			FileInputStream fis = new FileInputStream(file);
			// 성능을 더 올리고 싶으면 버퍼스트림 추가.
			// 일괄적으로 읽고, 일괄적으로 쓴다. (성능향상)
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			// 오브젝트 배열
			// ArrayList<Byte> list;
			
			while(true){
				int su = fis.read();
				if(su==-1){break;}
				baos.write(su);
				// list.add(null);
			}
			// list.toArray();
			
			// ByteArrayOutputStream > 담겨있는것을 일괄적으로 바이트 배열로 만들었다.
			// 파일 전체 바이트만큼 배열로 담는 것. (문자열제어)
			// 100바이트파일을 한번에 바이트배열로 담아서 문자열로 처리.
			byte[] buf = baos.toByteArray();
			// System.out.println(new String(buf));
			
			//-------------------------------------------------------------------
			
			FileOutputStream fos = new FileOutputStream(copy);
			ByteArrayInputStream bais = new ByteArrayInputStream(buf);  // 프린트스트림 (읽을때 편하게)
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
