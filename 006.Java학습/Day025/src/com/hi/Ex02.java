package com.hi;

import java.io.*;
import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		// �о����
		
		
		FileInputStream fis = null;
		ObjectInputStream oos = null;
		
		
		
		try {
			fis = new FileInputStream("test01.bin");
			oos = new ObjectInputStream(fis);
			
			int su1 = oos.read();
			int su2 = oos.readInt();
			double su3 = oos.readDouble();
			System.out.println("su1 = " +  su1);
			System.out.println("su2 = " +  su2);
			System.out.println("su3 = " +  su3);
			
			char[] arr1 = (char[])oos.readObject();
			// (Ʈ����ĳġ - ��� ����)
			Vector vec = (Vector)oos.readObject();
			System.out.println(Arrays.toString(arr1));
			// ���������� ���� �����Ƽ�
			// Object[] arr2 = vec.toArray();
			System.out.println(vec);
			
			ArrayList list = (ArrayList)oos.readObject();
			// HashSet�� �ߺ�ó���Ǽ� �ϳ��� ����
			HashSet set = (HashSet)oos.readObject();
			HashMap map = (HashMap)oos.readObject();
			System.out.println(list);
			System.out.println(set);
			System.out.println(map);
			
			
			List<String[]> list2 = (List<String[]>)oos.readObject();
			System.out.println(Arrays.toString(list2.get(0)));
			System.out.println(Arrays.toString(list2.get(1)));
			System.out.println(Arrays.toString(list2.get(2)));
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
