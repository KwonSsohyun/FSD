package com.room802;

public class Ex06 {

	public static void main(String[] args) {
		
		// Q3. 1,3,5,7,9 를 출력하시오.
		for(int su = 2; su <= 10; su+=2){
			if(su!=2){ // 초기값(시작값)이 아니면 (처음에 나올때 컴마 안찍히게 하려고)
				System.out.println(",");
			}
			System.out.print(su-1);
		}
		System.out.println("\n---------------------------------------------");
		
		for(int su=1; su*2<=10; su++){
			if(su!=1){System.out.println(",");}
			System.out.print(su*2-1);
		}
		
		System.out.println("\n---------------------------------------------");
		
		boolean boo = false; // 초기값 시작부터 컴마 안찍히게 하고 싶으니, false로 설정해서 처음에는 컴마안찍고
		for(int i =1; i<=10; i++){
			if(i%2!=0){
				if(boo){System.out.println(",");}
				System.out.print(i);
				boo = true; // 돌고 나서부터 true 바꿔서, 컴마 찍히게 해준다.
			}
		}		

	}

}
