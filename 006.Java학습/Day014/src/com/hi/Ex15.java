package com.hi;

// �������� �̿��ϱ� ���ؼ� �������̽� �����
interface Remote{
	void on();
	void off();
	void work();
}

class Tv implements Remote{ // ���
	public void on(){
		System.out.println("tv�� �Ѵ�.");
	}
	public void off(){
		System.out.println("tv�� ����.");
	}
	public void work(){
		System.out.println("���ȭ���� �����ִ�.");
	}
}

class Radio implements Remote{ // ���
	public void on(){
		System.out.println("������ �Ѵ�.");
	}
	public void off(){
		System.out.println("������ ����.");
	}
	public void work(){
		System.out.println("����� ����ִ�.");
	}
}

public class Ex15 {

	public static void main(String[] args) throws Exception{
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String input = null;
		// �Ʒ� esle�� ���⿡ �ʱ�ȭ�� �ȵǴϱ� null�� �ʱⰪ �ش�.
		Remote remote = null;
		
		while(true){
			System.out.println("����(exit)  > ");
			input = sc.nextLine();
			
			if(input.equals("exit")){
				break;
			}
			
			// com.hi.Tv
			// com.hi.Radio
			
			// << ���÷����� ���� >>
			// <��������> - �̹� ������� Ex15�� ���� �ִٸ� ���߿� �߰��Ǹ� Ex15�� �ٽ� �����ϴ°� �ƴ϶� ���߿� ����͵� �߰��� �ϸ��.
		
			// TV / Radio  �� ������ ������ �ִ�. (�ʵ�, �޼���) (������������ ��� �ִ� Ŭ����)
			Class clz = Class.forName(input); 
			// Object Ÿ���� ���ο� �ν��Ͻ�(��ü)�� ������ش�. (���������� ������ �׶� ��ü�� ��)
			// ������Ʈ�ϱ� ĳ������
			// ���� �µ�, ������, ��ũ �޼��尡 ������Ʈ���� �׷� �޼��尡 ������, (Remote)�� ����ȯ�Ѵ�.
			remote = (Remote)(clz.newInstance());
			
			/*
			else if(input.equals("1")){
				// TV �� ������ ������ �ִ�. (�ʵ�, �޼���)
				Class clz = Class.forName("com.hi.Tv");
				// Object Ÿ���� ���ο� �ν��Ͻ�(��ü)�� ������ش�.
				remote = (Remote)(clz.newInstance());
//				remote = new Tv();
			}else if(input.equals("2")){
				Class clz = Class.forName("com.hi.Radio");
				remote = (Remote)(clz.newInstance());
//				remote = new Radio();
			}
			*/
			remote.on();
			remote.work();
			remote.off();
			
			
		}
		
		
	}

}
