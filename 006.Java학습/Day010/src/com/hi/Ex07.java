package com.hi;

public class Ex07 {
	
	public static final int input = 1;
	public static final int show = 2;
	public static final int end = 3;
	
	public static void main(String[] args) {
		// �л������������α׷� (ver 0.5.0)
		// �ѿ� > 
		// 1.�Է�  2.����  0.����  > 1
		
		// �й� >
		// �̸� >
		
		// ���� >
		// ���� >
		// ���� >
		
		// 1.�Է�  2.����  0.����  > 1
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
        System.out.println("�л������������α׷� (ver 0.5.0)");
        System.out.println("�ѿ� > ");
        
        int sc = Integer.parseInt(scan.nextLine());
        int tot = sc;
        int[][] stu = new int[tot][5];
        int count = 0;
        
        while(true){
        	System.out.println("1.�Է�  2.����  0.����  >");
        	sc = Integer.parseInt(scan.nextLine());
        	
        	if(sc == 1 && tot!=count){
        		System.out.println("�й� > ");
        		sc = Integer.parseInt(scan.nextLine());
        		stu[count][0] = sc;
        		
        		System.out.println("�̸� > ");
        		sc = Integer.parseInt(scan.nextLine());
        		stu[count][1] = sc;
        		
        		System.out.println("���� > ");
        		sc = Integer.parseInt(scan.nextLine());
        		stu[count][2] = sc;
        		
        		System.out.println("���� > ");
        		sc = Integer.parseInt(scan.nextLine());
        		stu[count][3] = sc;
        		
        		System.out.println("���� > ");
        		sc = Integer.parseInt(scan.nextLine());
        		stu[count][4] = sc;
        		
        		count++;
        		continue;
        		
        	}//else if(tot==count){
//        		System.out.println("�Է�Ƚ�� �ʰ��߽��ϴ�.");
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
