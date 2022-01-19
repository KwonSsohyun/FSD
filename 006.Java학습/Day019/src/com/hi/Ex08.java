package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		File file = new File("test05.txt");
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			Scanner sc = new Scanner(fis);
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
