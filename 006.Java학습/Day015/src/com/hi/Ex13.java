package com.hi;

import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
		// �޸��� ����� (ver 0.1.0)
		// 1.�ۼ�  2.����  [3.����]  0.����  >  1
		// >> �ȳ��ϼ���.

		// 1.�ۼ�  2.����  [3.����]  0.����  >  1
		// >> �ι�° ��
		
		// 1.�ۼ�  2.����  [3.����]  0.����  >  2
		// ---------------------------------------------
		// �۹�ȣ | ����
		// ---------------------------------------------
		// 1 		�ȳ��ϼ���
		// 2        �ι�° ��
		// ---------------------------------------------
		// 1.�ۼ�  2.����  [3.����]  0.����  >  
		
		// ��Ʈ���迭 �̿��Ұ�.
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String push;
//		String[] memo = new String[]{};
		List<Object> memoArray = new ArrayList<Object>();

		
		System.out.println("�޸��� ����� (ver 0.1.0)");
		
		while(true){
			System.out.println("1.�ۼ�  2.����  [3.����]  0.����  >");
			push = sc.nextLine();
			
			if(push.equals("0")){
				System.out.println("�����մϴ�.");
				return;
			}
			if(push.equals("1")){
				System.out.println("�޸��ϼ���.");
				memoArray.add(sc.nextLine());
				continue;
				
			}else if(push.equals("2")){
				System.out.println("�޸��Ͻ� �����Դϴ�.");
				System.out.println("---------------------------------------------");
				System.out.println("�۹�ȣ \t | ����");
				System.out.println("---------------------------------------------");
				for(int i=0; i<memoArray.size(); i++){
					System.out.format(i + "\t" + memoArray.get(i)+"\n");
				}
				System.out.println("---------------------------------------------");
				continue;
			}
				
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
