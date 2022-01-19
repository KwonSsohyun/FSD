package com.hi;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int num;
	int kor,eng,math;
	String name;
}

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램 (ver 0.5.0)");
		Scanner sc = new Scanner(System.in);
		String input = null;
		int su = 0;
		
		// 객체타입 받으니 제네릭 바꿈 ▶ <Student>
		// 그게 나음 왜냐하면 여러가지 타입형을 받을 수 있다. ▶ 객체타입!
		// 자료형이 살아있다. 다양한 타입을 받을 수 있다.
		ArrayList<Student> list = new ArrayList<>();
		
		while(true){
			System.out.println("1.보기  2.입력  3.수정  4.삭제  0.종료  >");
			input = sc.nextLine();
			
			// 숫자를 입력하지 않았을 경우 오류 처리
			try{
				su = Integer.parseInt(input);
			}catch(NumberFormatException e){
				System.out.println("메뉴의 선택은 숫자를 이용바랍니다.");
				continue;
			}
			
			if(su==0){break;}
			if(su==1){
				System.out.println("-------------------------------------");
				System.out.println("학번\t |이름\t |국어\t |영어\t |수학\t");
				System.out.println("-------------------------------------");
				for(int i=0; i<list.size(); i++){
					Student stu = list.get(i); // get 값을 가져옴
					System.out.println(stu.num + "\t" +stu.name + "\t" +stu.kor + "\t" +stu.eng + "\t" +stu.math);
				}
				System.out.println("-------------------------------------");
				
				
			}else if(su==2){
				Student stu = new Student();
				
				System.out.println("학번 > ");
				input = sc.nextLine();
				stu.num = Integer.parseInt(input);
				
				System.out.println("이름 > ");
				input = sc.nextLine();
				stu.name = input;
				
				System.out.println("국어 > ");
				input = sc.nextLine();
				stu.kor = Integer.parseInt(input);
				
				System.out.println("영어 > ");
				input = sc.nextLine();
				stu.eng = Integer.parseInt(input);
				
				System.out.println("수학 > ");
				input = sc.nextLine();
				stu.math = Integer.parseInt(input);
				
				list.add(stu);
				
				
				
			}else if(su==3){
				System.out.println("수정할 학번 > ");
				input = sc.nextLine();
				int num = Integer.parseInt(input);
				
				for(int i=0; i<list.size(); i++){
					Student stu = list.get(i);
					if(stu.num == num){
						System.out.println("국어 > ");
						stu.kor = Integer.parseInt(sc.nextLine());
						System.out.println("영어 > ");
						stu.eng = Integer.parseInt(sc.nextLine());
						System.out.println("수학 > ");
						stu.math = Integer.parseInt(sc.nextLine());
						
						list.set(i, stu);
					}
				}
				
			}else if(su==4){
				System.out.println("삭제할 학번 > ");
				input = sc.nextLine();
				int num = Integer.parseInt(input);
				
				for(int i=0; i<list.size(); i++){
					Student stu = list.get(i);
					if(stu.num == num){
						list.remove(i);
					}
				}
				
			}else{
				// 숫자는 입력했는데 0~4가 아닌걸 입력했을때
				System.out.println("메뉴를 다시 확인하시고 입력 바랍니다.");
			}
			
		}

	}

}
