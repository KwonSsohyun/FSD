package com.hi;
// �� Day008 > Ex02

public class Ex01 {
	
	// Ŭ���� ���� 
	// "static" -> ��ü���� new ���ص��� �� �����ڷ� : Day008>Ex05
	public static final int end = 0;
	public static final int input = 1;
	public static final int show = 2;
	public static boolean boo = true;
	
	
	public static void main(String[] args){
		
		java.util.Scanner scan = new java.util.Scanner(System.in); // �Է¹ޱ� ���� ��ġ
		
		System.out.println("�л������������α׷� (ver 0.3.0)");
		System.out.println("�ѿ� > ");
		int tot = allSu("�ѿ� > ");
		
		int[] kor = new int[tot];
		int[] eng = new int[tot];
		int[] math = new int[tot];
		
		int count = 0;
		int scanner = menu("�Է°�");
		String flag;

		while(boo){
			
			flag = "out"; // ���а�ó�� ���
			if(scanner==input && count!=tot){
				System.out.println("���� > ");
				String sum = scan.nextLine();
				char[] chs = sum.toCharArray(); // ��Ʈ�� ��
				for(int i=0; i<chs.length; i++){
					// ������ ���ڰ� �������� ���θ� Ȯ���մϴ�.
					if(Character.isDigit(chs[i]) != true){ // �Է¹��� ���ڿ��� ���ڸ� true, �׿ܿ��� false
						System.out.println("ó������ �ٽý������ּ���");
						flag = "getout";
						break;		
					}
				}
				if (flag == "getout") continue; // boo�� �ٽ� ���ư�
				int sumsu = Integer.parseInt(sum);
				//int sumsu = Integer.parseInt(scan.nextLine());
				kor[count] = sumsu;
				
					
				System.out.println("���� > ");
				sum = scan.nextLine();
				chs = sum.toCharArray();
				for(int i=0; i<chs.length; i++){
					// ������ ���ڰ� �������� ���θ� Ȯ���մϴ�.
					if(Character.isDigit(chs[i]) != true){
						System.out.println("ó������ �ٽý������ּ���");
						flag = "getout";
						break;		
					}
				}
				if (flag == "getout") continue;
				sumsu = Integer.parseInt(sum);
				eng[count] = sumsu;
				
				
					
				System.out.println("���� > ");
				sum = scan.nextLine();
				chs = sum.toCharArray();
				for(int i=0; i<chs.length; i++){
					// ������ ���ڰ� �������� ���θ� Ȯ���մϴ�.
					if(Character.isDigit(chs[i]) != true){
						System.out.println("ó������ �ٽý������ּ���");
						flag = "getout";
						break;		
					}
				}
				if (flag == "getout") continue;
				sumsu = Integer.parseInt(sum);
				math[count] = sumsu;
				
				count++;
			} else if(scanner==show){
				System.out.println("----------------------------");
				System.out.println("���� \t���� \t����");
				System.out.println("----------------------------");
				for(int i=0; i<tot; i++){
					System.out.println(kor[i] +"\t|" + eng[i] + "\t|" + math[i]);
				}
				System.out.println("----------------------------");

			} else if(scanner==end){
				System.out.println("���α׷��� ����˴ϴ�.");
				return;
			} else if(scanner>3 || scanner<0){
				System.out.println("0~1 ���ڷ� �ٽ� �Է����ּ���.");
				scanner = Integer.parseInt(scan.nextLine());
			} else if(count == tot){
				System.out.println("�Է�Ƚ���� �ʰ��߽��ϴ�.");
			}
			
			scanner = menu("�Է°�");
		}
		
	}
	
	// �޴� �����ֱ�
	public static int menu(String show){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("1.�Է� \t2.���� \t0.����");
		// String sc = scan.nextLine(); // �Է� �޴� �ڵ�
		int sc = Integer.parseInt(scan.nextLine()); // �Է¹޴��ڵ� & ���ڿ� ���ڷ� ��ȯ
		return sc;
	}

	
	
	// �ѿ� ���� ����ִ� ��
	public static int allSu(String total){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			if(!scan.hasNextInt()){ // ���� �������� �Ǻ�
				scan.next(); // ���� ���ڰ� �ƴϸ� ������.
				System.out.println("���ڸ� �Է¹ٶ��ϴ�.");
			}else{				
			int sac = scan.nextInt();
			return sac;
			}
		}
	}
	
	
	
	
}
	
	
