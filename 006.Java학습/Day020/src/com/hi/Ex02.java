package com.hi;

import java.awt.Frame;

public class Ex02 extends Frame{ // ��ӹ���
	
	
	// ������ ���ο��� ó�� (UI��� ó��)
	// 2���� ������� ����
	// �и��ؼ� ���ڴ�. (���� ����)
	public Ex02(){
		// â�� ���������� ��������Ѵ�. (�����Ѵ�.)
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		
		Ex02 me = new Ex02();
		// ~~~~
		System.out.println("main thread...");

	}

}
