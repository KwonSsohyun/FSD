package com.hi;
// Ű���� Ŭ����
public class Ex14 {

	int su = 1234;
	
	public static void main(String[] args) {
		
		Ex14 me = new Ex14();
		System.out.println(me.su);
		
		// �ڹ� ���÷���
		// Ŭ���� �����ʿ�
		String info = "com.hi.Ex14";
		// �� ���ڿ��� �̿��ؼ�
		
		// Ŭ������ ������ ������ �ִ� Ŭ����
//		Class cls = Class.forName(info);
		
		try {
			// .forName() >> class ��� class�� �����.
			// ��ü�� �����Ѵ�.
			// Ex14�� ������ ������ �ִ�. (�ʵ�, �޼���)
			Class cls = Class.forName(info);
			
			
			// ���ο� �ν��Ͻ�(��ü)�� ������ش�.
//			System.out.println(cls.newInstance());
			
			
			// ���ο� �ν��Ͻ�(��ü)�� ������ش�.
			// ��ü�� ������, Ÿ���� �ٸ���. (������ ����Ű�� �ִ�.)
			// �ٸ� ��ü�� Ÿ���� Object ��.
			Object obj = cls.newInstance();
			// �ٵ� Object�� ĳ���� �� �� �ִ�.
			Ex14 me2 = (Ex14)obj;
			
			
			// .getDeclaredFields -> s�� �ڿ� ������ ������ ���´�.
			System.out.println(cls.getDeclaredField("su").getName());

		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
