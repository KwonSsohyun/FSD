package com.room802;

public class Ex11 {

	public static void main(String[] args) {
		// 조건문 - switch문
		/*  switch(조건값){
                 	case 값 : 실행문; 	break;
                 	case 값 : 실행문;	break;
                 	case 값 : 실행문;	break;
                 	...
                 	default : 실행문;
             }
        */
		// 조건 - value 값
		// 각 case 값(조건x, 연산x ..)
		// default (if문의 else과 똑같)(switch문의 맨끝에 들어가야하고 꼭 안들어가도 됨)
		// 조건과 case 의 모든 값의 자료형이 일치해야한다.
		// int , char 만 쓸 수 있다.
		
		int su = 1;
		switch(su){ // 괄호안에는 실직적인 값이 들어가야 한다. ex) 3<5 안됨 / 1+1은 2로 값이 되니까 됨
			case 2 : 
				System.out.println("2입니다.");
				break;
				
			case 1 : 
				System.out.println("1입니다.");
				break;
				
			case 0 :
				System.out.println("0입니다.");
				break;
					
			default :
				System.out.println("2~0사이의 값이 아닙니다.");
		}
		
		
	}

}
