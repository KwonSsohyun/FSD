// ������ ���� ����
package com.hi;

// Ŭ������ �����.
import java.awt.Frame;
import java.util.Scanner;

public class Ex08{
	
	public static void main(String[] args) {
		
		Frame f = new Frame("�������� ����");
		// �����ڸ� ���ؼ��� â �̸� ���� ���� �ֵ�.
		
		// â�� �̸�
		// f.setTitle("�������� ����");
		
		f.setLocation(200,200);
		// f.setLocation(200-1920,200);
		f.setSize(300,300);
		f.setVisible(true);
		
		// ���� Ȯ���� ���� �ִ�.
		System.out.println(f.getWidth() + "," + f.getHeight());
		System.out.println(f.isVisible());
		
		Scanner sc = new Scanner(System.in);
		// ���⼭ "�߿����� �Ϸ�" ����
		String msg = sc.nextLine();
		System.out.println(f.getWidth() + "," + f.getHeight());
		System.out.println(f.getX() + "," + f.getY());
		// â �̸��� �ٲ�� �� �� �ִ�.
		f.setTitle(msg);
	}

}
