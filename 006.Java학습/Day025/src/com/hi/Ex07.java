package com.hi;

import java.io.*;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// ����Ʈ ��Ʈ��.
		// �̰� ���ڿ���Ʈ������ ��ȯ�ϸ�?
		// ��ĳ�� �����ھȿ� (System.in) -> Scanner scan = new Scanner(System.in);
		InputStream inn = System.in; // ����ڰ� ���� �о���̴°�. 
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		isr = new InputStreamReader(inn);
		br = new BufferedReader(isr);
		
		try {
			// ��ĳ�� ������
			// scan.nextLine() -> ���ڿ� ���� �� �ִ°� readLine();
			System.out.println(br.readLine()); // �Է¹��� ���� ���
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			br.close();
			isr.close();
			inn.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
