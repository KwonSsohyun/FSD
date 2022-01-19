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
						// 디렉토리는 용량 사이즈 안나오니 <DIR> 만 나오게!
						System.out.print("<DIR>" + "\t" + "\t" );
					}
					if(temp.isFile()){
						// 파일일때만 출력
						System.out.print("\t" + temp.length() + "\t");
					}
					System.out.println(temp.getName());
				}
			}else{
				System.out.println("입력을 다시 확인하세요.");
			}
		}else{
			System.out.println("입력을 다시 확인하세요.");
		}

	}

}
