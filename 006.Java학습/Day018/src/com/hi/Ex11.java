package com.hi;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		
		String path = "F:\\JavaWork\\Day018\\src\\com\\hi";
//		String path = ".\\src\\com\\hi";
		
		java.io.File file = new File(path);
		File file1;
		java.text.SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd- hh:mm");
		
		// System.out.println("���� : " + file.isFile());
		// System.out.println("���丮 : " + file.isDirectory());
		
		String[] list = file.list();
		// System.out.println(Arrays.toString(list));
		
		boolean boo = true;
		
		
		for(int i=0; i<list.length; i++){
			if(file.isFile()){
				System.out.print(date.format(file.lastModified()) + "\t");
				System.out.print("\t" + file.length() + "\t"); 
				System.out.print(list[i]);
				System.out.println();
				
			}else if(file.isDirectory()){
				file1 = new File(file +"\\"+list[i]);
				System.out.print(date.format(file1.lastModified()) + "\t");
				System.out.print("<DIR>" + "\n");
				// ���
				// file�� �� ��° ������ ��ΰ� �� �ڿ� "\\" ������ ������ �ش����� ������
				file1 = new File(file +"\\"+list[i]);
				// ��¥
				System.out.print(date.format(file1.lastModified()) + "\t");
				System.out.print("\t" + file1.length() + "\t"); 
				System.out.print(list[i]);
				System.out.println();
			}
		}
		

		

	}

}
