package com.hi;

public class Ex01 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int me, com, a, b, c;
		me = 1;
		com = 1; 
		a=0; b=0; c=0;
		String input;

		System.out.println("가위 바위 보 게임(ver 0.1.0)");
		
		boolean boo =true;
		String[] arr = {"가위", "바위", "보"};
		
		
		while(boo){ // 무한루프돌게 함
			System.out.print("1.가위 2.바위 3.보 0.종료> ");
			input = sc.nextLine();
			me = Integer.parseInt(input);
			
			if(me==0){
				boo = false; // while문 종료
			}
			
			else if(me<1||me>3){
				System.out.println("메뉴를 다시 확인하세요.");
			}
			
			else{
				com = (int)(Math.random()*3)+1; // 1~3
				
				System.out.println("me : " + arr[me-1] + ", com : " + arr[com-1]);
				
				
				// 승률 판단
				if((me==1&&com==3)||(me==2&&com==1)||(me==3&&com==2)){
					// 가위 보 // 바위 가위 // 보 바위
					System.out.println("이겼음");
					a++;
				}
				else if((me==com)){
					System.out.println("비겼음");
					b++;
				}
				else if((me==3&&com==1)||(me==1&&com==2)||(me==2&&com==3)){
					System.out.println("겼음");
					c++;
				}
		
			}
		}
		
		System.out.println(a + "승" + b + "무" + c + "패");
		System.out.println("이용해주셔서 감사합니다.");
		
		

	}

}
