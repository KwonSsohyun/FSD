package com.hi;

public class Ex03 {

	// ����
	// Ŭ���� ����
	public static String model = "���";
	public static int speed = 0;
	public static int max = 100;
	
	
	public static void speedUp(){
		if(speed+12 > max){
			speed=max;
		}else{
		speed+=12;
		}
	}
	
	public static void speedDown(){
		if(speed-13 <= 0){
			speed=0;
		}else{
		speed-=13;
		}
	}
	
	public static void show(){
		System.out.println("����" + model + "�� ����ӵ���" + speed + "km�Դϴ�.");
	}
	
	public static void main(String[] args) {
		show(); // �ܼ� ����� (���⼭�� �����)

		for(int i=0; i<30; i++){ // ����
			speedUp();
			show();
		}

		for(int i=0; i<40; i++){ // �극��ũ
			speedDown(); 
			show();
		}
		
		model = "����";
		max = 150; // ���̴� 150km���� �޸�������
		show(); // �ܼ� �����

		for(int i=0; i<30; i++){ // ����
			speedUp();
			show();
		}

		for(int i=0; i<40; i++){ // �극��ũ
			speedDown(); 
			show();
		}
		
	}

}
