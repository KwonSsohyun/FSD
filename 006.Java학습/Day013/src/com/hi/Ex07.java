package com.hi;

public class Ex07 {
	
	// ��������� try, catch�� ȣ���� �ʿ� ����϶�� ���������� �ϴ°�.
	// throws Exception
	// (������ü ����) Exception ex = new Exception();
	
	// �޸��� ���ؼ� ������ ���� �� ����.
	// throws ArrayIndexOutOfBoundsException, NumberFormatException
	
	public static void func01(int a) throws InterruptedException, ClassNotFoundException { // ���� �� �� �ִٴ°� // (28������) ȣ�������� ���������� Ʈ����Ĺġ �ϵ��� ��
		String[] arr = {"a", "ab", "abc", "abcd"};
		
		// ������ü ����
		Exception ex = new Exception();

		
		// ���� �ش��ϴ� �ڵ带 ����ó�� �� �� �� ����.
//		try{
//		 if(a>-1){throw ex;} // throw�ϸ� catch�� �� // ���� �����°�
			System.out.println(arr[a]);
//		}catch(Exception e){
//			System.out.println("���� ȸ������Ʈ in");
//		}
			
		 
	}

	public static void main(String[] args) {
		System.out.println("main start");
		
		// func01(3); // �̰͸� ������ ��������. throws �����°��� �վ.
		// �Ʒ�ó�� ����ó�� �ؾ��Ѵ�. �ʼ� ������
		
		// ���� ȣ���� �ʿ��� ����ó���� �ص� �ذ��� �Ǵ���.
//		try{
			try {
				func01(3);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
//		}catch(Exception e){
//			System.out.println("���� ȸ������Ʈ out");
//		}
		
		System.out.println("main end");

	}

}
