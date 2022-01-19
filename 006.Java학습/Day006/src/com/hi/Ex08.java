package com.hi;

public class Ex08 {

	public static void main(String[] args) {
		
		// 가위 바위 보 게임(ver 0.1.0)
		
		// 게임을 시작합니다.
		// 1.가위 2.바위 3.보 > 1
		// 당신 : 가위, 컴:바위
		// 졌습니다.

		// 1.가위 2.바위 3.보 > 2
		// 당신 : 바위, 컴:가위
		// 이겼습니다.
		
		// 1.가위 2.바위 3.보 > 3
		// 당신 : 보, 컴:보
		// 비겼습니다.
		
		// 1.가위 2.바위 3.보 0.종료 >
		// 전적 1승 1무 1패
		// 이용해 주셔서 감사합니다.
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("가위 바위 보 게임(ver 0.1.0)");
		System.out.println("게임을 시작합니다.");
		
		// 밖에 선언
		int boo = 0; // 비긴거
		int win = 0; // 이긴거
		int lose = 0; // 진거
		
		for(int i=1; i<=3; i++){
			System.out.println("1.가위 2.바위 3.보 0.종료 >");
			String sn = scan.nextLine();
			int su = Integer.parseInt(sn);
			System.out.println(su);
			
		
			if(su==1){
				System.out.println("당신 : 가위");
			}
			else if(su==2){
				System.out.println("당신 : 바위");
			}
			else if(su==3){
				System.out.println("당신 : 보");
			}
			else if(su==0){
				break;
			}
			else{
				System.out.println("1~3까지 다시 재입력해주세요.");
				i--;
				continue;
			}
		
		
			int ran = (int)(Math.random()*3)+1;
			if(ran==1){
				System.out.println("컴퓨터 : 가위");
			}
			else if(ran==2){
				System.out.println("컴퓨터 : 바위");
			}
			else{
				System.out.println("컴퓨터 : 보");
			}
		
			
			// 결과
			if(su-ran==0){
				System.out.println("비겼습니다.");
				boo++;
			}
		
			else if(su-ran==-2 || su-ran==1){
				System.out.println("이겼습니다.");
				win++;
			}
		
			else{
				System.out.println("졌습니다.");
				lose++;
			}
			
			
		}
		System.out.println("전적" + win + "승" + boo + "무" + lose + "패");
		System.out.println("이용해주셔서 감사합니다.");
		
		

			
		
		

		
		
		
		

	}

}
