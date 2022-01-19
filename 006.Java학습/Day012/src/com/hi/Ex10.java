package com.hi;

// �ѹ������� �ϳ��� public Ŭ������ ���� �� �ִ�.

// ���������� 
// public > protected >= default > private

class Lec10{ // Ŭ������ private ���� �ٵ�
	// �ʵ嵵 �������� ����
	public static int su1 = 1111;    // public ������ - ��� ���� ���
	static int su2 = 2222;		     // default ������ - ������Ű�� ���ο����� �������
	private static int su3 = 3333;   // private ������ - �ش�Ŭ���� ���ο����� ��� (���⼭�� Lec10�ȿ���)
	protected static int su4 = 4444; // protected ������ - default �� ���� >> ���� "���"�� ���ؼ��� ���� ���
	/*
	// ********** ���������� (�̱��� ����) **************************************
	 * 	 ��ü ���к��ϰ� ���°� ���Ƴ� (�ϳ��� ��ü�� ���)
	// < �ڵ� ���� >
	//   1) private Lec10(){ } 
	        ���θ޼��忡�� new�� �����ؼ� ��ü�� �����ؾ��ϴµ�
	        private �̴ϱ� ������ �Ұ� (�ش�Ŭ���� �ȿ����� �����ϴϱ�)
	       
	     2) ��ü�� �׷� ��� ���� ���ΰ�?
	        public static Lec10 newInstance(){ 
	        	Lec10 me = new Lec10();
	         	return me;
	      	}
	      	�� �ڵ�ó�� ��ü�� ��� �޼��带 �����.
	      	��ü�� ����� �ڵ带 �ش� �޼��� �ȿ��� �����ϰ�,
	      	return �Ѵ�.
	      	return �� ȣ���Ѱ����� ����. �׷� 3������ ����.
	      	
	      3) �׷� ȣ���� �ؾ߰���?
	         ���θ޼��忡��
	         Lec10 you2;
	    	 you2 = Lec10.newInstance();
	    	 �̷��� ȣ�����ش�.
	    	 
	    	 �ٵ� ������ ��ü�� ��°� ���� �̰ž�
	    	 �ٵ� ���к��ϰ� ��� ��ü�� ������ ������
	    	 you2 = Lec10.newInstance(); �̰� ������ ��� 
	    	 �ϳ��� ��ü�� ����ϰ� ������ ��� �ұ�?
	    	 
	      4) �Ʊ� 2������ ���� �޼����߿���
	         Lec10 me = new Lec10(); �� ���� ���� ����
	         �� �տ� private static �� ������.
	         
	         static�� static ���� ������ �����ϴϱ� ���� static ����.
	         2���޼��忡 ���� ���� me�� ������
	         �� me��  
	         private static Lec10 me = new Lec10(); -> �ּҰ� �ְ� ���θ޼���� ���� �ּҰ���������
	         
	         private �� �ش�Ŭ�����ȿ����� ���������� 
	         ��ü�� ������ �������� ����.
	         ���������� ��ü�� �ϳ��� ��� ���� ����.
	*/
	private static Lec10 me = new Lec10(); // ��ü�����ؼ� �����ų ����� ����. 
	// ���������� ��ü�� �ϳ��� ��� ���� ����. (��ü�� ���к��ϰ� �����ϴ°� ���´�.)
//	private static String msg = "hello";
	
	
	private Lec10(){// ����Ʈ ������ �� ���� >> ��ü ������ �ȵ�
		// ���������� ���� �ʿ䰡 ���� static�̴�.
	}
	
	public static Lec10 newInstance(){ // ��ü ��������
//		Lec10 me = new Lec10(); // �����ڸ� ������� 
		return me;
	}
	
	
	// �޼��嵵 ����
	public static void func1(){ // �޼��嵵 �ش��� �ȴ�. public ��� ����
		System.out.println(su3);
	}
	
	static void func02(){ // public - ������Ű�� ���ٰ��� 

	}
	
	private static void func03(){ // private - �ش� Ŭ���� ���� ���ٰ���
		
	}
}


public class Ex10 extends com.bit.Ex10{ // main�� ���� �޼��忡�� public��� // ���

	public static void main(String[] args) {
		// ����������
		Ex10 me = new Ex10();
		System.out.println(me.su1);
//		System.out.println(me.su2);
//		System.out.println(me.su3);
		System.out.println(me.su4);
		System.out.println("---------------------------------------------");
		System.out.println(Lec10.su1);
		System.out.println(Lec10.su2);
//		System.out.println(Lec10.su3);
		System.out.println(Lec10.su4);
		System.out.println("---------------------------------------------");
		System.out.println(com.bit.Ex10.su1);
// 		System.out.println(com.bit.Ex10.su2);
//		System.out.println(com.bit.Ex10.su4);
		System.out.println("---------------------------------------------");
		com.bit.Ex10 you = new com.bit.Ex10(); // new com.bit.Ex10(); ������ ȣ��
		
		Lec10 you2;
//		you2 = new Lec10();
//		you2 = new Lec10(); // private ������Ű�� �������� �����ؾ��ϴϱ� �ȵ�
		// ��ü �������� ����ϴ� Ŭ������
		you2 = Lec10.newInstance(); // ��ü�� ��������°� ���� �� �ִ�.
		System.out.println(you2); 
//		you2 = new Lec10();
		you2 = Lec10.newInstance(); // .newInstance() �� ������ static���� ����߱� ������ >> Lec10���� �ٷ� ���� ����
		System.out.println(you2);
	}

}
