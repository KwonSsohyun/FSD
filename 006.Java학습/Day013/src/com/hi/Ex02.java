package com.hi;

// ����ȭ�� ��Ű�� ���� => �߻� abstract

// ����  ����� ���ؼ� ������ ����ȭ �Ѵ�. abstract (�߻�Ŭ����)
abstract class Machine{ // �θ� Ŭ����
	void on(){
		System.out.println("�Ѵ�");
	}
	void off(){
		System.out.println("����");
	}
//	void work(){}
	
	// ���� ����ȭ�� �Ѵ�. abstract (�߻�޼����)
	//    �������̵��ؼ� ���� �ϵ��� ����ȭ �ϴ� ����
	abstract void work();
}

class Tv extends Machine{ // �ӽ� Ŭ���� ���(�ڽ�) >> �������̵��ؼ� work() ������
	void work(){
		System.out.println("����� �����ִ�.");
	}
}

class Radio extends Machine{ // �ӽ� Ŭ���� ���(�ڽ�) >> �������̵��ؼ� work() ������
	void work(){
		System.out.println("����� ����ش�.");
	}
}

class Audio extends Machine{ // �ӽ� Ŭ���� ���(�ڽ�) >> �������̵��ؼ� work() ������
	// �������� ���ٺ��� ��� ��µȴ�....
	void work(){
		System.out.println("������ ����ش�.");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// null�̶�� �ذ� �ʱ�ȭ ���������� (�ʱ�ȭ �ȵɱ��)(else�� ���)
		Machine remote = null;
//		Machine remote = new Radio();
		// �̰Ͱ� ���� ��
		
		while(true){
			System.out.println("1.tv  2.radio  3.audio  0.����  >");
			String input = sc.nextLine();
			
			if(input.equals("1")){
				remote = new Tv(); // �ش� Tv ��ü�����ؼ� �������̵��ؼ� work����
			}else if(input.equals("2")){
				remote = new Radio();
			}else if(input.equals("3")){
				remote = new Audio();
//				remote = new Machine(); // �̷��� ����� ��ü �������ϰ� ����� ���ؼ��� ��ü ��������
			}else if(input.equals("0")){
				break;
			}
			
			remote.on();
			remote.work();
			remote.off();
			
		}
		
	}

}
