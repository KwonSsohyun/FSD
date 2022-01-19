package com.hi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		File file = new File("test01.txt");
		
		
		try {
			FileReader fr = new FileReader(file);
			// ���۴ޱ�
			BufferedReader br = new BufferedReader(fr);
			
			
//			// ������ �о��(������������) �� .readLine()
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine()); // ������ > null
			
			while(true){
				// ������ �о��(������������) �� .readLine()
				String msg = br.readLine();
				if(msg == null){break;}
				System.out.println(msg);
			}
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
