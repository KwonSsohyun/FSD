package com.room802;

public class Ex07 {

	public static void main(String[] args) {
		
		// Q4. 1+3+5+7+9의 합계를 출력하시오.
		int sum = 0;
		
		for(int i = 1; i <10; i+=2){
				sum+=i;
				if(i!=1){System.out.print('+');} // 맨 앞에는 +가 나오면 안되기 때문에, 시작점이 아니면이라는 조건식을 넣음
				System.out.print(i);
		}
		
		System.out.print('=');
		System.out.println(sum);
		
		System.out.println("------------------------------------------------------");
		
		sum = 0;
		for(int i=1; i<=10; i++){

			if(i%2!=0){
				System.out.print(i);
				sum+=i;
			}
			else if(i!=10){
				System.out.print("+");
			}
			else{
				System.out.print("=");
			}
		}
		System.out.println(sum);
			
		System.out.println("------------------------------------------------------");
		
		String msg =""; // 문자열
		System.out.println(msg);
		
		sum = 0;
		
		for(int i =1; i<10; i++){
			if(i%2!=0){
				msg += i;
				sum += i;
			}
			else{
				msg += '+';
			}
		}
		msg += "=";
		
		System.out.println(msg+sum);
	}

}


