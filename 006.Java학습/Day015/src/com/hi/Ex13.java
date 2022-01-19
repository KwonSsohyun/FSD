package com.hi;

import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
		// 메모장 만들기 (ver 0.1.0)
		// 1.작성  2.보기  [3.삭제]  0.종료  >  1
		// >> 안녕하세요.

		// 1.작성  2.보기  [3.삭제]  0.종료  >  1
		// >> 두번째 글
		
		// 1.작성  2.보기  [3.삭제]  0.종료  >  2
		// ---------------------------------------------
		// 글번호 | 내용
		// ---------------------------------------------
		// 1 		안녕하세요
		// 2        두번째 글
		// ---------------------------------------------
		// 1.작성  2.보기  [3.삭제]  0.종료  >  
		
		// 스트링배열 이용할것.
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String push;
//		String[] memo = new String[]{};
		List<Object> memoArray = new ArrayList<Object>();

		
		System.out.println("메모장 만들기 (ver 0.1.0)");
		
		while(true){
			System.out.println("1.작성  2.보기  [3.삭제]  0.종료  >");
			push = sc.nextLine();
			
			if(push.equals("0")){
				System.out.println("종료합니다.");
				return;
			}
			if(push.equals("1")){
				System.out.println("메모하세요.");
				memoArray.add(sc.nextLine());
				continue;
				
			}else if(push.equals("2")){
				System.out.println("메모하신 내용입니다.");
				System.out.println("---------------------------------------------");
				System.out.println("글번호 \t | 내용");
				System.out.println("---------------------------------------------");
				for(int i=0; i<memoArray.size(); i++){
					System.out.format(i + "\t" + memoArray.get(i)+"\n");
				}
				System.out.println("---------------------------------------------");
				continue;
			}
				
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
