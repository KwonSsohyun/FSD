package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		
		// ������ ���� �ڷᱸ��
		// java.util  >>  Interface Set<E>
		
		// java.util  >>  Class HashSet<E>
//		java.util.Set set = new java.util.HashSet();
		java.util.Set set = new java.util.TreeSet();
		
		// .HashSet();
		// �ߺ����� false (�� ������������� �ߺ��� �˻� �Ѵ�)
		// ��Ƽ����ü �ؽ��ڵ� ������ ���� ���
		// ���� ��ü�� �ؽ��ڵ�ϱ� �ڿ����� �ߺ��� �ɸ�
		// ������ ������ 3��°�� ���� �� ����.
		// �ߺ��� ������� �ʴ´�.
		// �� 1111 -> ������ ���� �ȿ��� �������̷� ������ �� �ѹ��� ���´�.
		// ���� �׹�°  1111  �ι�° -> size() �� 3���� ���� ����..
		//    4���� �ִµ� ���̴�... (�ߺ��� �˻簡 �ʿ����.) �̰� ���� ���̴�.
		//    ex) �ζǻ̱� - ������ �ߺ� �ȵǰ� �̱�
		//    ������ �ִ�. (����) -> �츮������ ������ ���������, ��ǻ�ʹ� ������ �ִ�.
//		set.add(1111);
//		set.add("�ι�°");
//		set.add(1111);
//		set.add("�׹�°");
		
		// .TreeSet()
		// ���������� �ȴ�.
		set.add("A");
		set.add(new Ex10()); 
		set.add(1111);
		set.add("b");
		set.add("c");
		set.add("D");
		
		System.out.println("size : " + set.size());
		
		// ������ ����
		// set�� ���ؼ� ��ü�� �޾ƿ°Ŷ� ����ü���� �����ص�
		// ������ ������ �Ұ�
		java.util.Iterator ite = set.iterator();
		
		// ����ų�� �ִ��� üũ���� �� .hasNext()
		while(ite.hasNext()){
			// �� Ȯ�� �� .next()
			System.out.println(ite.next());
		}
		
		// ���Ӱ� ����Ű�� �ʹٸ� ����ü ������ ��.
//		java.util.Iterator ite2 = set.iterator();
//		
//		while(ite2.hasNext()){
//			System.out.println(ite2.next());
//		}
		/*
		System.out.println(ite.hasNext());
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		*/
	}

}
