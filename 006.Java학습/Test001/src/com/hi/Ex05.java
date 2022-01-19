package com.hi;

class Student{ // 학생을 객체로!
	// 학번 / 이름 / 국어 / 영어 / 수학
	public int hakbun;
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	public int saySu(){
		return kor+eng+math;
	}
}

public class Ex05 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("학생성적관리프로그램(ver 0.5.1)");
		System.out.print("총원 > ");
		String sc = scan.nextLine();
		int tot = Integer.parseInt(sc);
		
		Student[] data = new Student[tot]; // 총원이 3 이면 ▶ 객체를 3개 만들 수 있는 공간을 만들겠다.
		// 배열은 값을 담기 위한 공간 (갯수 정한 만큼)
		// 일반 변수는 값 하나지만, 배열은 값 여러개 넣을 수 있다.
		int count = 0;
		
		while(true){
			System.out.println("1.입력  2.출력  0.종료  > ");
			sc = scan.nextLine(); // 스캐너로 입력받으면 뭘 입력할지 몰라서 객체 새로 생성함
			
			if(sc.equals("1")){
				// 입력
				Student Stu = new Student(); // class 학생 객체 생성!
				System.out.println("학번 > ");
				sc = scan.nextLine();
				Stu.hakbun = Integer.parseInt(sc);
				
				System.out.println("이름 > ");
				Stu.name = scan.nextLine();
				
				System.out.println("국어 > ");
				sc = scan.nextLine();
				Stu.kor = Integer.parseInt(sc);
				
				System.out.println("영어 > ");
				sc = scan.nextLine();
				Stu.eng = Integer.parseInt(sc);
				
				System.out.println("수학 > ");
				sc = scan.nextLine();
				Stu.math = Integer.parseInt(sc);
				
				data[count++] = Stu;
				
			}else if(sc.equals("2")){
				System.out.println("----------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계");
				System.out.println("----------------------------------------");
				for(int i=0; i<data.length; i++){
					Student tt = data[i]; // 옅은 복사 
					// Student 는 형을 얘기한다. int > int 넣을 수 있듯이
					// tt 객체를 새롭게 만들어서 
					// data[i] >> data[0] , data[1] , data[2] ... 맨위에 객체 똑같은 주소를 가르킨다. (옅은 복사)
					if(tt!=null){ // 객체나 참조형은 null이면 가르키는게 없는거임 (아예 없으면 출력안하고, 있으면 출력하겠다)
						System.out.println(tt.hakbun + "\t" + tt.name + "\t" + tt.kor + "\t" + tt.eng + "\t" + tt.math + "\t" + tt.saySu());
					}
				}
				System.out.println("----------------------------------------");
				
			}else if(sc.equals("0")){
				System.out.println("프로그램 종료합니다.");
				return;
			}
			
			
			
			
			
		}
		
		
		
		
		
		
	}

}
