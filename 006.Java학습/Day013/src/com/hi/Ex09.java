package com.hi;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("main start");
		
		String[] arr = {"a", "ab", "abc"};
		// try, catch ����ó��
		// finally ���ຸ��
		try{
			int su3 = 3;
			System.out.println(arr[su3]);
			return; // ������ ���θż��� �����ε�, finally ����ݵ�� ���� �������ش�. 
//		}catch(Exception e){
			
		}finally{ // ���������� ������ ���� - try�� ���� �����.
			// ���ຸ�� (
			System.out.println("main end");
		}

	}

}
