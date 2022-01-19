package com.hi;

public class Ex10 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("학생성적관리프로그램(ver 0.5.0)");
		String input = null;
		System.out.println("총원 > ");
		input = sc.nextLine();
		int tot = Integer.parseInt(input); // 입력받은 총원 문자열 숫자열로 바꿈
		
		String[][] data = new String[tot][];
		int cnt = 0;
		
		
		while(true){
			System.out.println("1.입력  2.보기  0.종료 > ");
			input = sc.nextLine();
			if(input.equals("0")){
				System.out.println("이용해주셔서 감사합니다.");
				return;
			}else if(input.equals("2")){
				System.out.println("-------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학");
				System.out.println("-------------------------------------------");
				for(int i=0; i<data.length; i++){
					String[] stu = data[i]; // 옅은복사 (같은 객체를 가르킴)
					if(stu!=null){
						System.out.println(stu[0] + "\t|" + stu[1] + "\t" + stu[2] + "\t" + stu[3] + "\t" + stu[4]);
					}
				}
				System.out.println("-------------------------------------------");
			}else if(input.equals("1") && cnt<tot){
				String[] stu = new String[5]; // 값을 직접 넣을 수 없어서 stu변수에지정해서 넣음.
				System.out.println("학번 > ");
				input = sc.nextLine();
				stu[0] = input;
				System.out.println("이름 > ");
				input = sc.nextLine();
				stu[1] = input;
				System.out.println("국어 > ");
				input = sc.nextLine();
				stu[2] = input;
				System.out.println("영어 > ");
				input = sc.nextLine();
				stu[3] = input;
				System.out.println("수학 > ");
				input = sc.nextLine();
				stu[4] = input;
				
				data[cnt++] = stu;
			}
		}
	}

}
