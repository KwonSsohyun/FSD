package com.hi;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;

public class Ex01 extends Frame{

	
	public Ex01(){
		// â�� ����
		// ��Ⱑ �ٸ��� ��� ��� �߳�?
		// ����� ��ǻ�� ȯ�� �ν��ϰ�, �������� �����ؾ���.

		
		// ��ġ
		// https://docs.oracle.com/javase/8/docs/api/java/awt/Point.html
		// Point p = new Point(100,100);
		// setLocation(p);
		setLocation(200, 200);
		// 1) ����� �ػ� Ȯ��
		//    https://docs.oracle.com/javase/8/docs/api/java/awt/Toolkit.html
		//    public abstract class Toolkit -> �߻�Ŭ������ -> �޼��带 ���� (static) ã�ƶ�
		//    static Toolkit ->	getDefaultToolkit()
		//    �߻�Ŭ���� �� �� �ְ� ��Ŷ �����°���.
		java.awt.Toolkit tool = Toolkit.getDefaultToolkit();
		//    �� abstract Dimension -> getScreenSize()
		//      ������� ȯ�� ����� �ػ� ���μ��� �����ü��ִ�.
		//      �Ʒ� ����,���ΰ��� ����, "Dimension" Ÿ�Ծ���.
		Dimension dim = tool.getScreenSize();

		// 2) ����� �ػ󵵿� �°� ��� ��ġ�ϱ�
		setLocation(dim.width/2-(500/2), dim.height/2-(400/2));
		// System.out.println(dim.width + ":" + dim.height);

		// +) �ü������ ��û�� -> â ���� �Ҹ������ �� .beep()
		tool.beep();
		
		
		// ������ ������ ����
		// Dimension di;
		// setSize(di);
		// ����, ������ ���� ����. (�����ڸ� ���ؼ�)
		// https://docs.oracle.com/javase/8/docs/api/java/awt/Dimension.html
		// �ݴ�� ���ο� ���� �� �� �ִ�. ��, ����Ÿ������ ��ȯ
		// ������������ ����
		// Dimension dim = new Dimension(500, 400);
		System.out.println(dim.width);
		System.out.println(dim.getHeight());
		// ��üâ���� ����
		// setSize(dim);
		setSize(500, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex01();
		
	}

}
