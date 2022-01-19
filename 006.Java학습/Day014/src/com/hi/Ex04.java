package com.hi;

public class Ex04 {

	public static void main(String[] args) {
		// 10���� �Ǽ� Ÿ��
		// ******** java.lang >> Class Double
		
		double su1 = 3.14;
		Double su2 = new Double(3.14);
		Double su3 = new Double("3.14"); // �Ҽ������ 314.0���� �Ǽ��� ���
		System.out.println(su3);
		
		System.out.println(Double.MAX_VALUE); // E308 >> 10�� 308��
		System.out.println(su2.intValue()); // �Ҽ��� ���ư� >> 3.14 �� 3
		
		// static double  >>  parseDouble(String s)
		System.out.println(Double.parseDouble("3.14")); // ���ڿ��� �Ǽ�Ÿ������ ����
		
		
		// üũ�ϱ� ���� ��� ����
		// isInfinite() -> ����Ŀ���� ��Ȳ(����)
		// inNaN() -> ����� �� �� ������ (ǥ���Ұ���)
//		double su4 = 1.0/0.0; // Infinity
		Double su4 = 0.0/0.0; 
		System.out.println(su4.isInfinite());  // true
		// ����� �� �� ������ (ǥ���Ұ���) -> inNaN()
		System.out.println(su4.isNaN());
		
		
		System.out.println("------------------------------------------------------");
		
		// ******** java.lang >> Class Float
		
		// Float(double value) -> ����Ÿ������ ��� ����
		Float su5 = new Float(3.14);
		// Float(float value)
		Float su6 = new Float(3.14F);
		// Float(String s)
		Float su7 = new Float("3.14");
		
		
		
		
		
	}

}
