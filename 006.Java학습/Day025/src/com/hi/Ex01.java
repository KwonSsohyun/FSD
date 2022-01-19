package com.hi;

// ���� ����Ʈ -> ���ϵ�(*)
import java.io.*;
import java.util.*;


public class Ex01 {

	public static void main(String[] args) {
		// ������Ʈ ��Ʈ�� (���ڿ� �ƴϸ� ������ ����Ʈ��Ʈ��)
		
		// File file = new File(uri); -> �̰� �����ִ°� ������ġ��
		// �� ������ �ۿ��� �����, �����ڿ� �������ִ°� �����ϴ�.
		
		// Ʈ���� �ȿ��� ���� �ۿ��� �������� ���� (���̳θ��Ҷ��� ������)
		// �ۿ��� ����� �ʱ�ȭ �ϰ�, �ȿ��� �����ؼ� ��
		FileOutputStream fos =null;
		ObjectOutputStream oos = null ;
		
		
		try {
			fos = new FileOutputStream("test01.bin"); // �̰� ���ϱ� ������, ���� �����.
			oos = new ObjectOutputStream(fos);
			
			// �����ͽ�Ʈ���� ���� ���
			// �������� ������Ʈ�� �ְ� ���� �� �ִ�.
			// �ڷᱸ������
			// �ڷᱸ���� ��°�� ����, �а�͹����� �ȴ�.
			oos.write(65);
			oos.writeInt(65);
			oos.writeDouble(3.14);
			
			char[] arr1 = {'a', 'b', 'c'};
			oos.writeObject(arr1);
			
			// ������ �ڷᱸ�� (���� ��̸���Ʈ)
			Vector vec = new Vector();
			vec.add(1111);
			vec.add(3.14);
			vec.add("���ڿ�");
			oos.writeObject(vec);
			
			// ��̸���Ʈ (���׸� �Ƚᵵ �������ϴµ� �ظ��ϸ� ���ش�)
			ArrayList list = new ArrayList();
			list.add(2222);
			list.add(4.14);
			oos.writeObject(list);
			
			HashSet set = new HashSet();
			set.add(3333);
			set.add(5.14);
			set.add(3333);
			oos.writeObject(set);
			
			HashMap map = new HashMap();
			map.put("key1", "val1");
			map.put("key2", "val2");
			oos.writeObject(map);
			
			
			ArrayList<String[]> list2 = new ArrayList();
			list2.add(new String[]{"a"});
			list2.add(new String[]{"a", "ab"});
			list2.add(new String[]{"a", "ab", "abc"});
			oos.writeObject(list2);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{ // �ݵ�� ����
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
