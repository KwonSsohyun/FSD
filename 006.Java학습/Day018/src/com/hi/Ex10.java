package com.hi;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		// IO
		// [ ��� ]
		// 	 ���� ������ / 
		//       �� F:\\JavaWork\\Day018\\src\\com\\hi\\Ex01.java
		
		//   ���� ����� (Ư������������ �����ϴ°�)
		//      ���� �ִ� ���� ��ġ���� ã��
		//      �� .\\src\\com\\hi\\Ex01.java
		//       (. �� ���� ���丮)
		
//		String path = "F:\\JavaWork\\Day018\\src\\com\\hi\\Ex01.java";
//		String path = ".\\src\\com\\hi\\Ex01.java";
//		String path = "F:\\JavaWork\\Day018\\src\\com\\hi";
		String path = "src\\com\\hi";
//		String path = "dist";
		
		java.io.File file = new File(path);
//		java.io.File file = new File(".\\src\\com\\hi\\Ex01.java");
		// ���� �ִ��� Ȯ�� �� .exists()
		// ������ �����ϴ��� (���� ���Ϸ� ��ü�� �����ص� ������ ������ �� �̷��� Ȯ���� �ض�)
		// ���丮�� Ȯ�� ���� (����) - �ü�� ���忡�� ���丮�� ������
		System.out.println(file.exists()); 
		
		// �н�(����)��� �޾Ƴ� �� �ִ�.  �� .getPath()
		System.out.println(file.getPath());
		
		// ������ ��ȯ �� .getAbsolutePath() 
		// �տ��� ���������ְ�, ���� ������ ����� ó��
		System.out.println(file.getAbsolutePath());
		
		// �Ϻ��� ������ ��ȯ �� .getCanonicalPath()
		// ��� try , catch�� �����
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// �������� ���� Ȯ��
		System.out.println("���� : " + file.isFile());
		// ���丮���� ���� Ȯ��
		System.out.println("���丮 : " + file.isDirectory());
		
		// �θ��� ���� �� .getParent()
		System.out.println(file.getParent());
		// ���ϸ� ���� �� .getName()
		System.out.println(file.getName());
		
		System.out.println("�б����(r) : " + file.canRead());
		System.out.println("�������(w) : "+ file.canWrite());
		System.out.println("�������(x) : " + file.canExecute());
		
		// ������ ������ �� ex(2,157 ����Ʈ)
		System.out.println(file.length() + "byte");
		
		// ��Ÿ���� ������ �ð� �� .lastModified()
		System.out.println(new java.util.Date(file.lastModified()));
		
		// ���� ��͵� �ִ��� ã�ƿ��� �� 
		String[] list = file.list();
		System.out.println(Arrays.toString(list));

	}

}
