package com.hi;

interface Ball{
	void play();
}

class Baseball implements Ball{
	public void play(){
		System.out.println("������ ���.");
	}
}

class BowlingBall implements Ball{
	public void play(){
		System.out.println("������ ���.");
	}
}

class Box<T>{ // Ÿ���� ������ -> ��ü �����ϴ� ������ Ÿ�� ������
	// Number�� int, double�� Number�� ��ӹ޾Ƽ� Number�ᵵ��
	// ��Ȳ�� ���� int�� double �� �� ���� �ֵ��� (������ - ������ Number�� �����ϱ�)
	// ����, �Ҽ������� �� �ٸ��͵� �ް� ������ �� ������ ����. ���ڿ���� -> Object
	// Object obj;
	T obj;
	public void setObj(T obj){
		this.obj = obj;
	}
	public T getObj(){
		return this.obj;
	}
}


public class Ex02 {

	public static void main(String[] args) {
		// ��ü���� �϶� ���׸� �Ẹ��!
		
		// Ÿ���� ȣ���� ������(Ŭ������ ����ϴ� ��) �����ϰԲ� �ϴ°� "���׸�"
		// ���� ���⼭ <> ���ϸ� ������Ʈ Ÿ���� ��.
		// <> ��ü���� Ÿ���̾���� int X -> Integrt 
		// ������ �����ϴ�. -> �������� ��� ��
		// �⺻�ڷ����� ����� �����Ŀ� ���� intó�� ���߳��� -> Ŭ���� Ÿ���̾�� �Ѵ�. (����Ŭ����)
		// ObjectŸ�� �޸��ּҸ� ���� �� �ִ� ���� -> ������ ���� 
		Box<Baseball> box = new Box<Baseball>();
		Baseball ball1 = new Baseball();
		BowlingBall ball2 = new BowlingBall();
		
		// ball1 -> �󱸰���� ��ü�� ����ִ� �ּҰ�
		// �Ѹ���� ball1�� ��ü�� ������.
		// �׷��� �Ʒ��� obj.play(); �ش��� ball1.paly() ���� �����Ѱ���
		box.setObj(ball1); //  ������ ��ü�� ����ִ� �ּҰ��� ����
		// Ball obj = (Ball) box.getObj(); // Ÿ���� �ٲ����
		// obj.play(); // play�� Object�� ������ ����
		Baseball obj = box.getObj();
		obj.play();
		
		
		
		
		
		
		
	}

}
