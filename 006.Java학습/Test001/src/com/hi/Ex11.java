package com.hi;

public class Ex11 {

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
		
		System.out.println("메모장 만들기 (ver 0.1.0)");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input;
		String[] memo = new String[0];
		int idx = 0;
		
		while(true){
			System.out.println("1.작성  2.보기  3.삭제  0.종료  >");
			input = sc.nextLine();
			
			if(input.equals("1")){
				System.out.println("작성해주세요.");
				
				/// 1
				String[] temp = new String[memo.length+1];
				System.arraycopy(memo, 0, temp, 0, memo.length);
				
				temp[memo.length] = sc.nextLine();
				memo = temp;
				
				continue;
			}else if(input.equals("2")){
				System.out.println("---------------------------------------------");
				System.out.println("글번호 \t | 내용");
				System.out.println("---------------------------------------------");
				System.out.println(java.util.Arrays.toString(memo));
//				for(int i=0; i<memo3.length; i++){
//					System.out.println(memo3[i]);
//				}
				System.out.println("---------------------------------------------");
				continue;
			}else if(input.equals("3")){
				System.out.println("삭제할 번호를 입력해주세요.");
				idx = Integer.parseInt(sc.nextLine());
				String[] temp = new String[memo.length-1];
				System.arraycopy(memo, 0, temp, 0, idx);
				System.arraycopy(memo, idx+1, temp, idx, temp.length-idx);
				memo = temp;
//				String[] arr1 = Arrays.copyOfRange(memo, 0, idx);
//				String[] arr2 = Arrays.copyOfRange(memo,  idx,  memo.length);
				
				
				continue;
			}else if(input.equals("0")){
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			
			
			
			
			
			
		}

	}

}
