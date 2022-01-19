package com.hi;
// �ֻ������� InputStream
// import java.io.InputStream;
import java.io.*;

public class Ex04 { // �о��

	public static void main(String[] args) {
		InputStream is = null;
		ObjectInputStream ois = null;
		
		// �޴������� ���డ���� Ŭ���� Ex03�� �־�� �Ѵ�.
		// �������� ������ �ƴϴ�.
		// Serializable ����ȭ�� �ȴ�. (����������� �ٸ��� �ް� ���ִ�.)
		
		// ������ Ŭ�����ε� �� �ȵǳ�.
		// �������� �ʴ�.
		// Serializable �� serialVersionUID �� ������ �Ǿ��ִ�.
		
		try {
			// �������� ���� InputStream ����Ÿ������ �ڽ� �о�� �� �ִ�.
			// is = System.in;
			is = new FileInputStream("test02.bin");
			ois = new ObjectInputStream(is);
			
			String msg = (String)ois.readObject();
			System.out.println(msg);
			
			// ĳ�����ϴ��ϴ°Ŷ� ���� �ҽ� �ڵ����� ��
			// public static int serialVersionUID = 1; ���ڷ� ������ �Ǻ�
			// �� �޴������� �� Ex03((�����ϵ� Ŭ���� ����))�� �־�� �� ĳ���� ���� (������ �����ؾ���)
			// ���强�� ������ִ°� �� private static final long serialVersionUID = 1L;
			// private static final long serialVersionUID = 1L;
			// ���ڸ� �Ȱ��� ���߸� �ȴ�.
			Ex03 me = (Ex03)ois.readObject();
			System.out.println(me.su1);
			// ���� �Ⱥ����°���, �ڷ����� ����־ > 0 
			// ����Ʈ��
			System.out.println(me.su2);
			System.out.println(me.su3);
			// �޼��� ȣ��
			me.func();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) { // Ʈ����ĳġ�� �ڵ������ȴ�.
			e.printStackTrace();
		} finally{
			
			try {
				ois.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
