package com.hi;

class Student {
	// 학번 / 이름 / 국어 / 영어 / 수학
	public String num;
	public String name; // 가르키는거 없으니까. // 초기값 줘야한다. null
	public String kor;
	public String eng;
	public String math;
	
	Student(){
		num = "";
		name = ""; // 걍 생성자에서 줌
		kor = "";
		eng = "";
		math = "";
	}
}

public class Ex05 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.6.0)
		// String data;
		// 1.보기  2.입력  3.삭제 (4.수정)  0.종료 >
		
		System.out.println("학생성적관리프로그램(ver 0.6.0)");
		System.out.println("총원 > ");
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String sc = scan.nextLine();
		int tot = Integer.parseInt(sc);
		
		Student[] stu = new Student[tot];
		int count = 0;
		
		while(true){
			System.out.println("1.보기  2.입력  3.삭제  0.종료 > ");
			sc = scan.nextLine();
			
			if(sc.equals("1")){
				// 보기
				System.out.println("----------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학 ");
				System.out.println("----------------------------------------------");
				for(int i=0; i<stu.length; i++){
					Student tt = stu[i]; // 객체니까 // int였으면 [] 붙혀야 하는데 객체니까 안붙힘
					// Student객체 자체가 stu[i]를 다 포함하는 사이즈니까.
					if(tt!=null){
						System.out.println(tt.num +"\t"+ tt.name +"\t"+ tt.kor +"\t"+ tt.eng +"\t"+ tt.math);
					}
				}
				System.out.println("----------------------------------------------");
				
			}else if(sc.equals("2")){
				// 입력
				Student stt = new Student();
				System.out.println("학번 > ");
				stt.num = stt.num.concat(scan.nextLine());
				
				System.out.print("이름 > ");
				stt.name = stt.name.concat(scan.nextLine());
				
				System.out.println("국어 > ");
				stt.kor = stt.kor.concat(scan.nextLine());
				
				System.out.println("영어 > ");
				stt.eng = stt.eng.concat(scan.nextLine());
				
				System.out.println("수학 > ");
				stt.math = stt.math.concat(scan.nextLine());
				
				stu[count++] = stt;
				
			}else if(sc.equals("3")){
				// 삭제 
				
			}else if(sc.equals("0")){
				System.out.println("프로그램은 종료합니다.");
				return;
			}else if(sc.equals("4")){
				// 수정
				System.out.println("몇번 학생을 수정하겠습니까?");
				tot = Integer.parseInt(scan.nextLine());
				for(int i=0; i<stu.length; i++){
					Student tt = stu[i];
					if(tot==1){
//						tt.num = tt.num.replace(stt.num, );
					}
				}
				
			}
			
			
			
			
		}
		

	}

}
