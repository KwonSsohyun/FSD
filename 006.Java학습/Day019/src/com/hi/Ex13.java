package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		System.out.println("�л������������α׷�(ver 0.7.0)");
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		File file = new File("data.bin");
		// ������ ����.
		
		while(true){
			System.out.println("1.����  2.�Է�  0.����  > ");
			input = sc.nextLine();
			
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("-------------------------------");
				System.out.println("�й�\t |����\t |����\t |����\t ");
				System.out.println("-------------------------------");
				try {
					FileInputStream fis = new FileInputStream(file);
					while(true){
						int su = fis.read();
						if(su==-1){break;}
						System.out.print((char)su);
					}
					
					fis.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("-------------------------------");
				
			}else if(input.equals("2")){
				System.out.println("�й� > ");
				input = sc.nextLine() + "\t";
				
				System.out.println("���� > ");
				input += sc.nextLine() + "\t";
				
				System.out.println("���� > ");
				input += sc.nextLine() + "\t";
				
				System.out.println("���� > ");
				input += sc.nextLine() + "\n";
				try {
				////
					byte[] before = new byte[(int)file.length()];
					FileInputStream fis = new FileInputStream(file);
					// �о�°��� ������
					fis.read(before);
					fis.close();
				////
				
					FileOutputStream fos = new FileOutputStream(file);
					// fos.write(fis.read()); // ���ѷ����� // 1����Ʈ���� �����
					// �� ������
					fos.write(before);
					// �̷��Ը� ���� ������ ������ �� ����.
					fos.write(input.getBytes());
					fos.flush();
					fos.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
