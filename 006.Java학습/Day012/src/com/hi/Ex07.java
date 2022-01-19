package com.hi;

public class Ex07 {

	public static void main(String[] args) {
		
//		return; // 여기다가 적으면 안됨
				// 아래 코드들이 수행이 안되서 이클립스에서 경고날림 (왜 적었냐 이거임)
	
		int a; 
		int b=3;
		if(b>1){
			a=1;
		}else{ // 수행보장
			a=0; // 위 조건 충족 못해도 a의 값 초기화 되니까 가능
		}
		System.out.println(a);
		
		for(int i=0; i<10; i++){
			
			System.out.println("before : " + i);
			
			if(i>4){
//				return;  // 해당 메서드의 종료(호출한 측으로 돌아감)(메모리로 봤을땐 stack 영역 빼내기) ▶▶ 메서드 내 어디서나 존재 가능
				continue; // 0~4 main 종료 해당 반복문의 상단으로 돌아감 ▶▶ 반복문 내에서만 사용가능 (반복문 횟수 다 채움) // 무한루프인 while문에서는 계속 도는것임 (ex) 다시 재입력해주세요. 이럴때 쓸수도 잇음
//				break; // 0~4 main 종료    해당 switch문 || 반복문에서 탈출 ▶▶ 반복문, switch 문에서 사용가능
			}
			System.out.println("after : " + i);
		}
		System.out.println("main 종료");
	}
	
	

}
