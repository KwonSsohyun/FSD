package com.hi;

// 쉽게 임폴트 -> 와일드(*)
import java.io.*;
import java.util.*;


public class Ex01 {

	public static void main(String[] args) {
		// 오브젝트 스트림 (문자열 아니면 무조건 바이트스트림)
		
		// File file = new File(uri); -> 이걸 적어주는게 안전장치임
		// └ 파일을 밖에서 만들고, 생성자에 주입해주는게 안전하다.
		
		// 트라이 안에서 쓰면 밖에서 참조변수 못씀 (파이널리할때도 쓰려고)
		// 밖에서 선언과 초기화 하고, 안에서 대입해서 씀
		FileOutputStream fos =null;
		ObjectOutputStream oos = null ;
		
		
		try {
			fos = new FileOutputStream("test01.bin"); // 이건 편하긴 하지만, 파일 덮어쓴다.
			oos = new ObjectOutputStream(fos);
			
			// 데이터스트림과 느낌 비슷
			// 차이점은 오브젝트를 주고 받을 수 있다.
			// 자료구조가능
			// 자료구조를 통째로 쓰고, 읽고와버리면 된다.
			oos.write(65);
			oos.writeInt(65);
			oos.writeDouble(3.14);
			
			char[] arr1 = {'a', 'b', 'c'};
			oos.writeObject(arr1);
			
			// 원시형 자료구조 (기존 어레이리스트)
			Vector vec = new Vector();
			vec.add(1111);
			vec.add(3.14);
			vec.add("문자열");
			oos.writeObject(vec);
			
			// 어레이리스트 (제네릭 안써도 동작은하는데 왠만하면 써준다)
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
		} finally{ // 반드시 수행
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
