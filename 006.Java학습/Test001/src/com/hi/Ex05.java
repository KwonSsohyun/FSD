package com.hi;

class Student{ // �л��� ��ü��!
	// �й� / �̸� / ���� / ���� / ����
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
		
		System.out.println("�л������������α׷�(ver 0.5.1)");
		System.out.print("�ѿ� > ");
		String sc = scan.nextLine();
		int tot = Integer.parseInt(sc);
		
		Student[] data = new Student[tot]; // �ѿ��� 3 �̸� �� ��ü�� 3�� ���� �� �ִ� ������ ����ڴ�.
		// �迭�� ���� ��� ���� ���� (���� ���� ��ŭ)
		// �Ϲ� ������ �� �ϳ�����, �迭�� �� ������ ���� �� �ִ�.
		int count = 0;
		
		while(true){
			System.out.println("1.�Է�  2.���  0.����  > ");
			sc = scan.nextLine(); // ��ĳ�ʷ� �Է¹����� �� �Է����� ���� ��ü ���� ������
			
			if(sc.equals("1")){
				// �Է�
				Student Stu = new Student(); // class �л� ��ü ����!
				System.out.println("�й� > ");
				sc = scan.nextLine();
				Stu.hakbun = Integer.parseInt(sc);
				
				System.out.println("�̸� > ");
				Stu.name = scan.nextLine();
				
				System.out.println("���� > ");
				sc = scan.nextLine();
				Stu.kor = Integer.parseInt(sc);
				
				System.out.println("���� > ");
				sc = scan.nextLine();
				Stu.eng = Integer.parseInt(sc);
				
				System.out.println("���� > ");
				sc = scan.nextLine();
				Stu.math = Integer.parseInt(sc);
				
				data[count++] = Stu;
				
			}else if(sc.equals("2")){
				System.out.println("----------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�");
				System.out.println("----------------------------------------");
				for(int i=0; i<data.length; i++){
					Student tt = data[i]; // ���� ���� 
					// Student �� ���� ����Ѵ�. int > int ���� �� �ֵ���
					// tt ��ü�� ���Ӱ� ���� 
					// data[i] >> data[0] , data[1] , data[2] ... ������ ��ü �Ȱ��� �ּҸ� ����Ų��. (���� ����)
					if(tt!=null){ // ��ü�� �������� null�̸� ����Ű�°� ���°��� (�ƿ� ������ ��¾��ϰ�, ������ ����ϰڴ�)
						System.out.println(tt.hakbun + "\t" + tt.name + "\t" + tt.kor + "\t" + tt.eng + "\t" + tt.math + "\t" + tt.saySu());
					}
				}
				System.out.println("----------------------------------------");
				
			}else if(sc.equals("0")){
				System.out.println("���α׷� �����մϴ�.");
				return;
			}
			
			
			
			
			
		}
		
		
		
		
		
		
	}

}
