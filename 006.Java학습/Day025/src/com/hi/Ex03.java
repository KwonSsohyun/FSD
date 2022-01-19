package com.hi;

// OutputStream �� FileOutputStream �θ���

import java.io.ObjectOutputStream;
import java.io.OutputStream; // �߻�Ŭ���� -> Ÿ���� ����.
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

// �� < ��ü ����ȭ > �� Serializable �������̽� ���
public class Ex03 implements Serializable{ // ���� ���� ����
	
	// �ڵ����� �ٰԵǴ� serialVersionUID
	// ���ڴ� �����ϰ� ������.
	// �����ϸ� �����ϰ� ���ڰ� �ٲ��.
	// �� ���ڸ� �Ȱ��� ���߸� �ȴ�.
	// private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	// ������ �ϸ� ������ ���ڸ� �ٲٸ� �Ǵϱ�.
	// �׷� �������� ������ ������ �� �ִ�.
	// Serializable ��ӹ����� ���� ��� ���� ���� ���̴�.
	// ù��°�� (version ID) Ŭ���ϸ� ��.

	// �ҽ��ڵ� �ٲܶ����� �ٲ��ش�.
	private static final long serialVersionUID = 3L;
	// ������ ������ ���� ���ƾ���
	
	int su1 = 1111;
	
	// ��� �Ⱥ����� ������? �� transient
	// ����ȭ ��󿡼� ���ܽ�Ű�� ��
	// �д� ������ Ȯ���غ��� ����Ʈ���� 0�� ���´�.
	transient int su2 = 2222; // transient int su2;
	
	
	int su3 = 3333;
	
	 // int su = 2222;
	 // private static final long serialVersionUID = 2L;
	 // �̷��� �ϰ� Ex04���� ������ ������
	/**
	 * 
	 */
	// �޼��带 ����ȭ ��󿡼� ���ܽ�Ű�� �ʹٸ�?
	// ���� ������ �Ǵϱ� ���µ� �ǹ̰� ������
	// �޼���� �� ���ǵ� -> �׷��� ����ȭ ����� �ƴ�
	// ��ü���� �޼��尡 ����
	// �޼���� ���ÿ��� ����� (�������)
	// ���������δ� ��ü���� �ʵ�� �޼��尡 ������.
	public void func(){
		System.out.println("�޼���� ����ȭ ����� �ƴմϴ�.");
	}

	public static void main(String[] args) {
		OutputStream os = null;
		ObjectOutputStream oss = null;
		
		try {
			// �������� ���� OutputStream ����Ÿ������ �ڽ� �о�� �� �ִ�.
			// os = System.out;
			os = new FileOutputStream("test02.bin");
			oss = new ObjectOutputStream(os);
			
			// �ֻ������� ������Ʈ�� �����ϱ�
			// �ٸ� �о�ö� ĳ���� �ʿ�
			oss.writeObject("���ڿ�");
			
			///////////////////////////////////////
			// �ȵǴ°��� �ִ�.
			// �� implements Serializable
			//   ��ӹ����� �� ��ü�� �� �� �ִ�.
			Ex03 me = new Ex03();
			me.su3 = 2222;
			oss.writeObject(me);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oss.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
