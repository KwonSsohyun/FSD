package com.hi;

class Student {
	// �й� / �̸� / ���� / ���� / ����
	public String num;
	public String name; // ����Ű�°� �����ϱ�. // �ʱⰪ ����Ѵ�. null
	public String kor;
	public String eng;
	public String math;
	
	Student(){
		num = "";
		name = ""; // �� �����ڿ��� ��
		kor = "";
		eng = "";
		math = "";
	}
}

public class Ex05 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.6.0)
		// String data;
		// 1.����  2.�Է�  3.���� (4.����)  0.���� >
		
		System.out.println("�л������������α׷�(ver 0.6.0)");
		System.out.println("�ѿ� > ");
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String sc = scan.nextLine();
		int tot = Integer.parseInt(sc);
		
		Student[] stu = new Student[tot];
		int count = 0;
		
		while(true){
			System.out.println("1.����  2.�Է�  3.����  0.���� > ");
			sc = scan.nextLine();
			
			if(sc.equals("1")){
				// ����
				System.out.println("----------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|���� ");
				System.out.println("----------------------------------------------");
				for(int i=0; i<stu.length; i++){
					Student tt = stu[i]; // ��ü�ϱ� // int������ [] ������ �ϴµ� ��ü�ϱ� �Ⱥ���
					// Student��ü ��ü�� stu[i]�� �� �����ϴ� ������ϱ�.
					if(tt!=null){
						System.out.println(tt.num +"\t"+ tt.name +"\t"+ tt.kor +"\t"+ tt.eng +"\t"+ tt.math);
					}
				}
				System.out.println("----------------------------------------------");
				
			}else if(sc.equals("2")){
				// �Է�
				Student stt = new Student();
				System.out.println("�й� > ");
				stt.num = stt.num.concat(scan.nextLine());
				
				System.out.print("�̸� > ");
				stt.name = stt.name.concat(scan.nextLine());
				
				System.out.println("���� > ");
				stt.kor = stt.kor.concat(scan.nextLine());
				
				System.out.println("���� > ");
				stt.eng = stt.eng.concat(scan.nextLine());
				
				System.out.println("���� > ");
				stt.math = stt.math.concat(scan.nextLine());
				
				stu[count++] = stt;
				
			}else if(sc.equals("3")){
				// ���� 
				
			}else if(sc.equals("0")){
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}else if(sc.equals("4")){
				// ����
				System.out.println("��� �л��� �����ϰڽ��ϱ�?");
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
