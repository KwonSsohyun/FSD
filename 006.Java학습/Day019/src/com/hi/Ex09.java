package com.hi;

import java.io.IOException;
import java.io.InputStream;

public class Ex09 {

	public static void main(String[] args) {
		// 1����Ʈ�� ������
		// ab�� �ĵ� -> 97 ����
		InputStream is = System.in;
		
		try { // 'a' -> 97 13(\r) 10(\n)
			  //        ���͸� ġ�� ������� (\r)(\n)
			  //        �ν��ϱ⿡ 13,10�� ���´�.
			  //        �� ���͸� �Ѱ͵� io�� �о�帰��.
			  //        �� ���� 9
			  //        �� �����̽��ٴ� 32
			
			// abc�� ġ��
			// -> 97 98 99
			//    �������� 3���� ������ �ڿ� 13(\r) 10(\n) �ȳ���
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
