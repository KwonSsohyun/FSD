package com.hi;

public class Ex11 {

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
		
		System.out.println("�޸��� ����� (ver 0.1.0)");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input;
		String[] memo = new String[0];
		int idx = 0;
		
		while(true){
			System.out.println("1.�ۼ�  2.����  3.����  0.����  >");
			input = sc.nextLine();
			
			if(input.equals("1")){
				System.out.println("�ۼ����ּ���.");
				
				/// 1
				String[] temp = new String[memo.length+1];
				System.arraycopy(memo, 0, temp, 0, memo.length);
				
				temp[memo.length] = sc.nextLine();
				memo = temp;
				
				continue;
			}else if(input.equals("2")){
				System.out.println("---------------------------------------------");
				System.out.println("�۹�ȣ \t | ����");
				System.out.println("---------------------------------------------");
				System.out.println(java.util.Arrays.toString(memo));
//				for(int i=0; i<memo3.length; i++){
//					System.out.println(memo3[i]);
//				}
				System.out.println("---------------------------------------------");
				continue;
			}else if(input.equals("3")){
				System.out.println("������ ��ȣ�� �Է����ּ���.");
				idx = Integer.parseInt(sc.nextLine());
				String[] temp = new String[memo.length-1];
				System.arraycopy(memo, 0, temp, 0, idx);
				System.arraycopy(memo, idx+1, temp, idx, temp.length-idx);
				memo = temp;
//				String[] arr1 = Arrays.copyOfRange(memo, 0, idx);
//				String[] arr2 = Arrays.copyOfRange(memo,  idx,  memo.length);
				
				
				continue;
			}else if(input.equals("0")){
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
			
			
			
			
			
			
			
		}

	}

}
