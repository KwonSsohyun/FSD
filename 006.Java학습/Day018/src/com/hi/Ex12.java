package com.hi;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("path > ");
		
		String input = sc.nextLine();
		
		File file = new File(input);
		
		if(file.exists()){
			if(file.isDirectory()){
				String[] list = file.list();
				for(int i=0; i<list.length; i++){
					File temp = new File(file.getAbsolutePath()+"\\"+list[i]);
					long time = temp.lastModified();
					Date dt = new Date(time);
					
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
					String msg = sdf.format(dt);
					System.out.print(msg + "\t");
					
					if(temp.isDirectory()){
						// ���丮�� �뷮 ������ �ȳ����� <DIR> �� ������!
						System.out.print("<DIR>" + "\t" + "\t" );
					}
					if(temp.isFile()){
						// �����϶��� ���
						System.out.print("\t" + temp.length() + "\t");
					}
					System.out.println(temp.getName());
				}
			}else{
				System.out.println("�Է��� �ٽ� Ȯ���ϼ���.");
			}
		}else{
			System.out.println("�Է��� �ٽ� Ȯ���ϼ���.");
		}

	}

}
