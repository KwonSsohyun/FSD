package com.hi;

public class Ex09 implements Cloneable{ // implements Cloneable >> ��ӹ޾ƾ߸� �ش�Ŭ������ clone�̶�� �޼��带 ���� ����.
	
	int su  = 1;
	
	public Ex09(int su){
		this.su = su;
	}

	public static void main(String[] args) {
		
		// ********* java.lang  >>  Class Object
		// Object
		Object obj1 = new Object();
		Ex09 me = new Ex09(1);
		Ex09 you = new Ex09(1);
//		Object me1 = new Ex08(); // ������
		
		System.out.println(me==you); // ��ü�� �ٸ��� false
		System.out.println(me.equals(you)); // ������ ��
		// ������ ������ ���ϴ� ����� �� �ȳ���
		System.out.println(me.toString()); // com.hi.Ex09@15db9742// 366712642 >>�̰��� �ٽ� 16������ �ٲ㼭��
		System.out.println(me.hashCode()); // 366712642
		
		// clone() >> ��ü�� ���� ����
		// Interface Cloneable -> �� �������̽��� ��Ӹ� �ϸ� ��.
		//obj1.clone(); // ����� ���ؼ��� ��밡��
		try {
			Object me2 = me.clone(); // me�� ������ ���縦 ������ me2�� (��ü �����)
			System.out.println(me2); // 21���� �ش� �� ��ü�� �ٸ� �ּҰ��� ������ �ִ°��� �� �� ����.
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// ������ ���ϰ� �������̵���
	public boolean equals(Object obj){
//		return true;
		return su == ((Ex09)obj).su; // ĳ������
	}

}
