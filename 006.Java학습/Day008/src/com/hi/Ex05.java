package com.hi;

public class Ex05 {
	
	// ���� (�޼��� �ۿ� ������ �� ������)

	// ********** �ɹ��ʵ� (��ü�� ����)(�ν��Ͻ� ����) - "non static" -> ��ü���� new �ؾ���
	public final int su; // ����� ���� ���� > �̰� �����ΰ�, �Ʒ� Ex05 me = new Ex05(1234); ��ü �����Ҷ� �����ڸ� ȣ���ϹǷ�, �����ھȿ� �ִ� �ʵ� �� �ʱ�ȭ��
	// �� �����ڸ� ���ؼ� �ʱ�ȭ �Ǵϱ�. 
	// public static final int su; ->> �̰� �ȵ� >> �ֳ��ϸ� �̹� �̸� ����� ���� ����Ʈ�� �ö󰡱� ����
	public int su3; 
//	public int su3 = 4321; // ���� ����� �� �ʱ�ȭ
	
	//********* Ŭ���� ���� - "static" -> ��ü���� new ���ص���
	public static final int su5 = 5555; // final �̶� �� �� �ٲ�
//	public static final int su6; // ����Ʈ ���� ���� �־ > �ٵ� ���Ϸ� ����������� ������ؼ� �ǹ̰� ��� "����"
	
	
	// ������ �� ��ü ���� ������ �ϰ��� �ϴ��� �� >> �ʵ尪 �ʱ�ȭ
	public Ex05(int su2){
		su3 = 3333;
		su = su2; // �ʵ� ���� �ʱ�ȭ (���� �ٲٴ°��� �ƴ�)
//	    su3 = su2; // �� �ٲٴ°Ŷ� ����
	}
	
	
	public static void main(String[] args) {
		
		final int su4; // final Ű����� ����� ���� > su4�� ���� > �����Ҵ� 
		// final Ű���� >> ����� ���� �ǹ̸� �ο� >> ������ �ǹ̰� ����. (���� �� �ٲ�!!!)
		su4 = 4444; // �ʱ�ȭ -> ��� 
		// su4 = 5555;
		System.out.println(su4);
		
		Ex05 me = new Ex05(1234); // ��ü�����ϸ鼭 �� ����
		System.out.println(me.su);
		System.out.println(me.su3);
		
		// me.su3 = 54321;
	}

}
