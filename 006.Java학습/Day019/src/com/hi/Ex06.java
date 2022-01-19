package com.hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		File file = new File("test05.txt"); // aaa/nbbb/nccc -> �̷��� �ִٰ� ġ��.
		
		// �ѹ��� 5���ھ� �о��.
		// �ѱ��� ��� 2����Ʈ!!! �� ���� Ex03
		byte[] buf = new byte[5];
		
		try {
			// �б� -> Input
			// ��θ� ������ش�.
			FileInputStream fis = new FileInputStream(file);
			
			while(true){
				//  aaa/nbbb/nccc 
				//       �� ������� �о��ٸ� �ڵ����� ������ �� �������� �д´�.
				
				// ��ο��� �д´�. (buf) -> 5�� ������ŭ �д´�. -> �� ������ su�� ��
				int su = fis.read(buf);
				
				// -1�̸� �д°� ���ٴ°��̴ϱ� while�� ��������
				if(su==-1){break;}
				
				// (5�� �о�°�, 0, � �о�����)�� ���ڿ��� �ٲ���
				// �ڿ� break;�� �����ϱ�. �ٽ� while �Ⱥ��������� ���ѷ��� (�׷��� ��� ����)
				System.out.println(new String(buf, 0, su));
				
				// String(byte[] bytes, int offset, int length)
				// �����ڿ� ������
				// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
				// (�о�¹��̳ʸ������� , �ε�����ȣ(ó������0) , ����)
				// �ణ ���� ���ī�Ƕ� ����� ���������� ĳ���͹迭�� ���ٴ°� ���� �� �ִ�.
				
				// System.out.println(su);
				// su�� ����
				// ù��° 5�� �а� -> �ι�° 1�� ����
				
				// ����Ʈ �迭�� ������ ���ڿ� ����
				// System.out.println(new String(buf));
				
				// Ȯ���غ��� ���°͵� �� ����� 5���� ���缭 �Ѵ�.
				// �迭�� ��Ƽ� �о���� ����� ����
				// ����� �� �������� ������, ���������Ͱ� ���´�.(������ ������)
				// 123456 -> 1234562345

				System.out.println(Arrays.toString(buf));
				// �ش��ڵ� �迭�� �Ʒ�����, 
				// aaa -> [97, 97, 97, 13, 10]
				// ���ڴ� 3���ε� �迭�� Ȯ���غ��� 5���� ���� ���� �� �� �ִ�.
			}
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
