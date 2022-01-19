package com.hi;

class Machine{
	public void on(){
		System.out.println("�Ѵ�.");
	}
	public void off(){
		System.out.println("����.");
	}
	public void work(){
		// �ϴ� �ϸ��� �ٸ��� ����
		System.out.println("�ȳ�"); // �̰� ��¾ȵ� >> ���� �Ʒ��� �ش��ϴ� ���� �޼��� �������̵���� work�޼���� ������ ���� ����
	}
}

class Tv extends Machine{ // extends Machine >> ��ӹ���
	/* �θ����� �ִ°Ŵϱ� �ּ�
	public void on(){
		System.out.println("�Ѵ�.");
	}
	public void off(){
		System.out.println("����.");
	}
	*/
	
	// �ϴ��ϸ� �ٸ��� �������̵� 
	// �߰��Ǵ� �͵鸸 �����Ѵ�. (�̰� �������̵带 �� Ȱ���ϴ� ����)
	// (Machine Ŭ�����ȿ� �޼���� �� work �����̸� �޼���ϱ� �������̵��� == �����̸� �޼��常 ���)
	public void work(){
		System.out.println("������ �����ش�.");
	}
}

class Radio extends Machine{ // extends Machine >> ��ӹ���
	/*
	public void on(){
		System.out.println("�Ѵ�.");
	}
	public void off(){
		System.out.println("����.");
	}
	*/
	
	// �ϴ��ϸ� �ٸ��� �������̵�
	public void work(){
		System.out.println("���ļ��� ��Ƽ� �Ҹ��� ����ش�.");
	}
}

class Audio extends Machine{
	public void work(){
		System.out.println("������ ����ش�.");
	}
}

public class Ex05 {

	public static void main(String[] args) {
//		Tv tv = new Tv();
//		tv.on();
//		tv.work();
//		tv.off();
		
//		Radio ra = new Radio();
//		ra.on();
//		ra.work();
//		ra.off();
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("1.tv������  2.radio������  3.audio������  > ");
		String input = sc.nextLine();
		
		
		// ������!!!
//		Object remote; // �ۿ��� ���� // ����Ÿ������ �ϸ� ��� �ذ�
		Machine remote = null;
		
		// �������� �������̵带 �̿��� ��ü������ ������ 
		if(input.equals("1")){
			remote = new Tv(); // �ȿ��� ����
		}else if(input.equals("2")){
			remote = new Radio();
		}else if(input.equals("3")){
			remote = new Audio();
		}
		
		remote.on();
		remote.work();
		remote.off();
		
		

	}

}
