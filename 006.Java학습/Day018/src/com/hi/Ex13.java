package com.hi;

import java.io.File;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) {
		
		File file = new File("test2.txt");
		if(file.exists()){
			System.out.println("�����մϴ�.");
		}else{
			try{
				// ���� �����ϴ� ���� ����
				boolean boo = file.createNewFile();
				if(boo){
					System.out.println("���ϻ���");
				}else{
					System.out.println("���ϻ�������");
				}
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}

	}

}
