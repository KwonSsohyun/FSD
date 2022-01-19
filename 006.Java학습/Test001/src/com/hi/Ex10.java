package com.hi;

class Ball{	
	// �ʵ�
	// ���ѹ�, ������, �����������ƴ��� üũ
	int num;
	String color;
	boolean check;
	
	
	
	// ������ 
	Ball(int num){
		this.num = num;
		this.check = true; // �̾Ҵ� ���� false�� �ٲܰ���
		if(num<10){ 	  // 1 ~ 9
			color = "����";
		}else if(num<20){ // 10 ~ 19
			color = "����";
		}else if(num<30){ // 20 ~ 29
			color = "���";
		}else if(num<40){ // 30 ~ 39
			color = "�ʷ�";
		}else{ 			  // 40 ~ 46
			color = "�Ķ�";
		}
		
	}
	
}

public class Ex10 {

	public static void main(String[] args) {
		// Ball��Ÿ���� 45���� ������ ����� �ش�. 
		Ball[] ball = new Ball[45];
//		System.out.println(ball[0]); -> nulls
		
		for(int i=0; i<ball.length; i++){
			// Ball��Ÿ���� 45���� ������ ���� ��ü�� ���� + �ʱⰪ ����
			ball[i]=new Ball(i+1); // (i+1) ��
		}
//		System.out.println(ball[0].num); -> 1
		
		// ���� �� 6�� - �迭 ����
		Ball[] six = new Ball[6];
		
		// �������� �� 6�� �̱�
		for(int i=0; i<6; i++){ 						// 1
			int ran = (int)(Math.random()*45); 			// 3
			if(ball[ran].check){ // true�̸� �ش� 		// ball[3].check -> true
				six[i] = ball[ran]; 					// six[0] -> ball[3]�� �������� ��� ������ ���
				ball[ran].check = false;				// �а����ֱ����� -> ball[3].check = false;	
			}else{ // false �ش�
				i--;									// Ƚ���� �״�� 0 ->> for�� ������ ������ ->> i=1
			}
		}
		
		// �� ���
		for(int i=0; i<six.length; i++){
			System.out.println(six[i].color +" "+ six[i].num);
		}
		

	}

}
