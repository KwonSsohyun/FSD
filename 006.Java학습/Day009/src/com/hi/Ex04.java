package com.hi;

class Car{
	// ����������� 1,2,3 ���� �Ѵ�.
	public static final int MORNING = 1; // �빮�ڷ� �� ������ ����������� �����Ѵ�.
	public static final int K3= 2;
	public static final int K5 = 3;

	public static int number; // ������ȣ // static�� ���Ƿν� ���� ����Ƿ�, ���� �ٸ��� �����ȴ�. (��ü������ Ư��) (��ü ������)
	
	public String color;
	public final String name; // ����� ���� - �� �� �ٲ�
	public int speed;
	public int max;
	
	// ��� ����
	public Car(int mod){
		number+=1111;;
		if(mod==1){
			color = "";
			name = "���";
			max = 120;
		}else if(mod==2){
			color = "";
			name = "k3";
			max = 150;
		}else if(mod==3){
			color = "";
			name = "k5";
			max = 180;
		}else{
			color = "";
			name = "�غ���";
			max = 100;
		}
	}
	
	public Car(String a, int b){ // �������� �����ε� (�̸��� �����ϱ�) Ÿ��, ����,
		color = ""; // null�� ���� �ʰ� ��ĭ �ʱ�ȭ
		name = a;
		max = b;
	}
	
	// ������ (�� �ʱⰪ �ַ���)
	public Car(String a, String b, int c){ // ������ ������ ���� ������ ���� - ������ �����ε�
		color = a;
		name = b;
		max = c;
	}
	
	public void speedUp(){
		if(speed+10 > max){
			speed = max;
		}else{
			speed += 10;
		}
	}
	public void speedDown(){
		if(speed-10<0){
			speed=0;
		}else{
			speed-=10;
		}
	}
	public void speedShow(){
		System.out.println("������ȣ " + number +" ���� " + name + "�� " + speed + "km�� �޸���.");
	}
}


public class Ex04 {

	public static void main(String[] args) {
		
		Car mycar = new Car(Car.MORNING); // �� �ִ� ������ �ο� // �� �� �� ���ټ��� ����  // ������ �����ε带 ���� ���� 2���� �˾Ƽ� ã�´�.
//		mycar.color = "������";
//		mycar.name = "���"; // ���� ������ null�� �ȴ�.
//		mycar.max = 120; // ���� ������ 0���� ������ �ȴ�.
		mycar.speedShow();
		
		for(int i=0; i<20; i++){
			mycar.speedUp();
			mycar.speedShow();
		}
		
//		mycar.color = "�����"; // �߰��� �� �ٲ�
//		mycar.name = "���������� ���"; // final�� ������ �����ؼ� �� �ٲ�
		
		for(int i=0; i<20; i++){
			mycar.speedDown();
			mycar.speedShow();
		}
	
	
		mycar = new Car(Car.K3); // ���� ���� // ������ü �������, ���οü�� �����ߴ�.
//		mycar.color = "���";
//		mycar.name = "k3";
//		mycar.max = 180;
		
		for(int i=0; i<20; i++){
			mycar.speedUp();
			mycar.speedShow();
		}
		for(int i=0; i<20; i++){
			mycar.speedDown();
			mycar.speedShow();
		}
		
		mycar = new Car(Car.K5);
		mycar.speedShow();
		
	}	

}
