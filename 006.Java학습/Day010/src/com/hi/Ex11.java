package com.hi;

class Student{
	public int num;
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	public int saySum(){
		return kor+eng+math; // �� ������ ���ؼ� ������ (�ش� �޼ҵ� ȣ�����ָ��) -> ���⼭ �� �����߱� ����
	}
}

public class Ex11 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("�л������������α׷�(ver 0.5.1)");
		String input = null;
		System.out.println("�ѿ� > ");
	
		input = sc.nextLine();
		int tot = Integer.parseInt(input);
		
		Student[] data = new Student[tot];
		int cnt = 0;
		
		while(true){
			
			System.out.println("1.�Է�  2.���  0.����  > ");
			input = sc.nextLine();
			
			if(input.equals("0")){
				System.out.println("�̿����ּż� �����մϴ�.");
				return;
			}
			if(input.equals("1") && cnt<tot){
				Student stu = new Student(); // ��ü�� �����ϰ�
				System.out.println("�й� > ");
				input = sc.nextLine();
				stu.num = Integer.parseInt(input); // ��ü�� �� �־��ְ�
			
				System.out.println("�̸� > ");
				stu.name = sc.nextLine(); // ��ü�� �� �־��ְ� (��Ʈ�����̶�)
				
				System.out.println("����");
				stu.kor = Integer.parseInt(sc.nextLine()); // ��ü�� �� �־��ְ�
				
				System.out.println("����");
				stu.eng = Integer.parseInt(sc.nextLine());	// ��ü�� �� �־��ְ�			
				
				System.out.println("����");
				stu.math = Integer.parseInt(sc.nextLine()); // ��ü�� �� �־��ְ�	
				
				data[cnt++]=stu; // �ں��� ������ // stu > new Student(); 
				// 36������ ���Ӱ� ��ü �����ϰ� -> 37~51������ �� ������ �־��ְ� 
				// -> 57�� �ش���ο��� stu�� 40�����ο��� ��ü�����ϰ� ������ �־��ذŴ� 
				// -> data[1] = �űⰡ�� 41��~55������ ���� ���� �־��ش�. 
				//    (�Ѹ���� �� �־��ִ°���)
				
			}else if(input.equals("1")){
				System.out.println("�Է��� �������ϴ�.");
				
			}else if(input.equals("2")){
				System.out.println("-------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�");
				System.out.println("-------------------------------------------");
				for(int i=0; i<data.length; i++){ // ��ü �迭��ŭ �ݺ�
					Student stu = data[i];
					if(stu!=null){
						System.out.println(stu.num + "\t|" + stu.name + "\t|" + stu.kor + "\t|" + stu.eng + "\t|" + stu.math + "\t" + stu.saySum() );
					}
				}
				System.out.println("-------------------------------------------");
			}else{
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			}
			
		}
	
	}

}
