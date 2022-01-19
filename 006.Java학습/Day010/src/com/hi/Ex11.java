package com.hi;

class Student{
	public int num;
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	public int saySum(){
		return kor+eng+math; // 각 성적을 더해서 말해줌 (해당 메소드 호출해주면됨) -> 여기서 다 선언했기 때문
	}
}

public class Ex11 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("학생성적관리프로그램(ver 0.5.1)");
		String input = null;
		System.out.println("총원 > ");
	
		input = sc.nextLine();
		int tot = Integer.parseInt(input);
		
		Student[] data = new Student[tot];
		int cnt = 0;
		
		while(true){
			
			System.out.println("1.입력  2.출력  0.종료  > ");
			input = sc.nextLine();
			
			if(input.equals("0")){
				System.out.println("이용해주셔서 감사합니다.");
				return;
			}
			if(input.equals("1") && cnt<tot){
				Student stu = new Student(); // 객체를 생성하고
				System.out.println("학번 > ");
				input = sc.nextLine();
				stu.num = Integer.parseInt(input); // 객체에 값 넣어주고
			
				System.out.println("이름 > ");
				stu.name = sc.nextLine(); // 객체에 값 넣어주고 (스트링형이라)
				
				System.out.println("국어");
				stu.kor = Integer.parseInt(sc.nextLine()); // 객체에 값 넣어주고
				
				System.out.println("영어");
				stu.eng = Integer.parseInt(sc.nextLine());	// 객체에 값 넣어주고			
				
				System.out.println("수학");
				stu.math = Integer.parseInt(sc.nextLine()); // 객체에 값 넣어주고	
				
				data[cnt++]=stu; // 뒤부터 더해짐 // stu > new Student(); 
				// 36번에서 새롭게 객체 생성하고 -> 37~51번까지 값 데이터 넣어주고 
				// -> 57번 해당라인에서 stu는 40번라인에서 객체생성하고 변수에 넣어준거니 
				// -> data[1] = 거기가가 41번~55번까지 적은 내용 넣어준다. 
				//    (한마디로 값 넣어주는것임)
				
			}else if(input.equals("1")){
				System.out.println("입력이 끝났습니다.");
				
			}else if(input.equals("2")){
				System.out.println("-------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|합계");
				System.out.println("-------------------------------------------");
				for(int i=0; i<data.length; i++){ // 객체 배열만큼 반복
					Student stu = data[i];
					if(stu!=null){
						System.out.println(stu.num + "\t|" + stu.name + "\t|" + stu.kor + "\t|" + stu.eng + "\t|" + stu.math + "\t" + stu.saySum() );
					}
				}
				System.out.println("-------------------------------------------");
			}else{
				System.out.println("입력이 잘못되었습니다.");
			}
			
		}
	
	}

}
