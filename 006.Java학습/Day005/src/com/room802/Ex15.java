package com.room802;

public class Ex15 {
	
	public static int myparse(String msg){ /// 1234
		char[] arr = msg.toCharArray(); // ���ڿ��� ���Ϲ��ڿ��� ������
		
		int sum = 0;
		int temp = 1;
		
		for(int i=0; i<arr.length; i++){
			
			sum+=(arr[arr.length-1-i]-48)*temp; // 1�� �ڸ�  // 3 2 1 0
			
			temp = temp*10; // 10���ڸ�, 100���ڸ� ...
			// (arr[i]-48)*10; // 10�� �ڸ�
			// (arr[i]-48)*100; // 100�� �ڸ�
		}
		/*
		arr[0]-48; // 0
				// '0' 48
				// '1' 49
				// '2' 50
				 */
		return sum;
	}
	
	public static int func01(String msg){
		return 0;
	}

	public static void main(String[] args) {
		
		int su0 = Ex15.func01("���ڿ�");
		System.out.println(su0);
		
		
		
		// ���ڿ��� ���ڷ� ��ȯ
		String msg = "1234"; // �ݵ�� ���ڷθ� �����Ǿ��־�� �Ѵ�.(+�Ҽ������ȵ�) (���ڵ��� ���� ����)
		//int su = Integer.parseInt(msg); // Integer�� Ŭ������ 	parseInt �޼ҵ� (///) -> ��ȣ�ȿ� ������ ��ȯ����
		// 								   static �޼���� �� (new������ �Ⱦ��� �ٷ� ȣ���ؼ� ���� ���̴�)
		int su = myparse(msg);
		System.out.println(su);
		// System.out.println(su+1);

	}

}
