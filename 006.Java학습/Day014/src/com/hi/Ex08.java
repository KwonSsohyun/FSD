package com.hi;

public class Ex08 {

	public static void main(String[] args) {
		// 주민번호 체크기 (ver 0.3.0)
		String msg = "020501-4123456";
		
		
		for(int i=0; i<msg.length(); i++){
			
			char ch = msg.charAt(i);
			
			if(i==6){ // 6번 인덱스는 (-) 하이픈 -> 하이픈일때는 숫자인지 체크 안하고 넘어감.
				continue; // 바로 위 포문으로 가서 6번이 i++ 증감식을 만나서 7번부터 아래 숫자이냐? 하는 판별식에 들어가도록 함
			}
			if(Character.isDigit(ch)){
				
			}else{
				
			}
		}

	}

}
