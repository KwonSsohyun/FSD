package com.hi;

public class Ex06{

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String[] arr = {"java", "web", "db", "framework"};
		//껴
		
		int su = 0;
		
		String input = sc.nextLine();
		
		try{
			su = Integer.parseInt(input);
			System.out.println(arr[su]);
//		}catch(NumberFormatException e){
			
//		}catch(ArrayIndexOutOfBoundsException e){
			
		}catch(Exception e){ // 부모타입의 인셉션 처리하면 다 넘어간다.
			e.printStackTrace(); // 에러에 대한 디테일 출력 (인셉션 try, catch 안하면 나오는것)
			System.out.println(e);
			System.out.println(e.toString());
			// Exception 의 상위부모가 Throwable 이 메서드 갖고 있어서 친절하게 설명나온다. 
			// toString() >> .getMessage() 를 출력하고 있었던것
			System.out.println(e.getMessage());
			// void니까 참조변수 통해서 호출해야함
			
		}
	}

}