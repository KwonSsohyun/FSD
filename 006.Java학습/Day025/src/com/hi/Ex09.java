package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		InputStream inn;
		try {
			inn = new FileInputStream("test05.txt");
			
			// InputStream inn = System.in;
			// (System.in) ��ǲ��Ʈ���� ������
			// Scanner sc = new Scanner(inn);
			Scanner sc = new Scanner(new File("test05.txt"));
			
			// ���� ���� �� �������� �����
			// nextLine() ����������� �о��
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			
			System.out.println(sc.nextInt()+1);
			System.out.println(sc.nextInt());
			
			inn.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
