package com.hi;

public class Ex07 {
	
	public static final int input = 1;
	public static final int show = 2;
	public static final int end = 3;
	
	public static void main(String[] args) {
		// 학생성적관리프로그램 (ver 0.5.0)
		// 총원 > 
		// 1.입력  2.보기  0.종료  > 1
		
		// 학번 >
		// 이름 >
		
		// 국어 >
		// 영어 >
		// 수학 >
		
		// 1.입력  2.보기  0.종료  > 1
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
        System.out.println("학생성적관리프로그램 (ver 0.5.0)");
        System.out.println("총원 > ");
        
        int sc = Integer.parseInt(scan.nextLine());
        int tot = sc;
        int[][] stu = new int[tot][5];
        int count = 0;
        
        while(true){
        	System.out.println("1.입력  2.보기  0.종료  >");
        	sc = Integer.parseInt(scan.nextLine());
        	
        	if(sc == 1 && tot!=count){
        		System.out.println("학번 > ");
        		sc = Integer.parseInt(scan.nextLine());
        		stu[count][0] = sc;
        		
        		System.out.println("이름 > ");
        		sc = Integer.parseInt(scan.nextLine());
        		stu[count][1] = sc;
        		
        		System.out.println("국어 > ");
        		sc = Integer.parseInt(scan.nextLine());
        		stu[count][2] = sc;
        		
        		System.out.println("영어 > ");
        		sc = Integer.parseInt(scan.nextLine());
        		stu[count][3] = sc;
        		
        		System.out.println("수학 > ");
        		sc = Integer.parseInt(scan.nextLine());
        		stu[count][4] = sc;
        		
        		count++;
        		continue;
        		
        	}//else if(tot==count){
//        		System.out.println("입력횟수 초과했습니다.");
        	else if(sc == 2){
        		for(int i=0; i<stu.length; i++){
        			for(int j=0; j<stu[i].length; j++){
        				System.out.print(stu[i][j] + "\t");
        			}
        			System.out.println();
        		}
        	}
        	
        	
        	
        	
        }
        
        

	}

}
