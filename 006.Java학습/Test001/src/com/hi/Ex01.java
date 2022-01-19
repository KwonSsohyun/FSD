package com.hi;
// ▶ Day008 > Ex02

public class Ex01 {
	
	// 클래스 변수 
	// "static" -> 객체생성 new 안해도됨 ▶ 참고자료 : Day008>Ex05
	public static final int end = 0;
	public static final int input = 1;
	public static final int show = 2;
	public static boolean boo = true;
	
	
	public static void main(String[] args){
		
		java.util.Scanner scan = new java.util.Scanner(System.in); // 입력받기 위한 장치
		
		System.out.println("학생성적관리프로그램 (ver 0.3.0)");
		System.out.println("총원 > ");
		int tot = allSu("총원 > ");
		
		int[] kor = new int[tot];
		int[] eng = new int[tot];
		int[] math = new int[tot];
		
		int count = 0;
		int scanner = menu("입력값");
		String flag;

		while(boo){
			
			flag = "out"; // 구분값처럼 깃발
			if(scanner==input && count!=tot){
				System.out.println("국어 > ");
				String sum = scan.nextLine();
				char[] chs = sum.toCharArray(); // 스트링 문
				for(int i=0; i<chs.length; i++){
					// 지정한 문자가 숫자인지 여부를 확인합니다.
					if(Character.isDigit(chs[i]) != true){ // 입력받은 문자열이 숫자면 true, 그외에는 false
						System.out.println("처음부터 다시시작해주세요");
						flag = "getout";
						break;		
					}
				}
				if (flag == "getout") continue; // boo로 다시 돌아감
				int sumsu = Integer.parseInt(sum);
				//int sumsu = Integer.parseInt(scan.nextLine());
				kor[count] = sumsu;
				
					
				System.out.println("영어 > ");
				sum = scan.nextLine();
				chs = sum.toCharArray();
				for(int i=0; i<chs.length; i++){
					// 지정한 문자가 숫자인지 여부를 확인합니다.
					if(Character.isDigit(chs[i]) != true){
						System.out.println("처음부터 다시시작해주세요");
						flag = "getout";
						break;		
					}
				}
				if (flag == "getout") continue;
				sumsu = Integer.parseInt(sum);
				eng[count] = sumsu;
				
				
					
				System.out.println("수학 > ");
				sum = scan.nextLine();
				chs = sum.toCharArray();
				for(int i=0; i<chs.length; i++){
					// 지정한 문자가 숫자인지 여부를 확인합니다.
					if(Character.isDigit(chs[i]) != true){
						System.out.println("처음부터 다시시작해주세요");
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
				System.out.println("국어 \t영어 \t수학");
				System.out.println("----------------------------");
				for(int i=0; i<tot; i++){
					System.out.println(kor[i] +"\t|" + eng[i] + "\t|" + math[i]);
				}
				System.out.println("----------------------------");

			} else if(scanner==end){
				System.out.println("프로그램이 종료됩니다.");
				return;
			} else if(scanner>3 || scanner<0){
				System.out.println("0~1 숫자로 다시 입력해주세요.");
				scanner = Integer.parseInt(scan.nextLine());
			} else if(count == tot){
				System.out.println("입력횟수를 초과했습니다.");
			}
			
			scanner = menu("입력값");
		}
		
	}
	
	// 메뉴 보여주기
	public static int menu(String show){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("1.입력 \t2.보기 \t0.종료");
		// String sc = scan.nextLine(); // 입력 받는 코드
		int sc = Integer.parseInt(scan.nextLine()); // 입력받는코드 & 문자열 숫자로 변환
		return sc;
	}

	
	
	// 총원 숫자 뱉어주는 곳
	public static int allSu(String total){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			if(!scan.hasNextInt()){ // 값이 숫자인지 판별
				scan.next(); // 값이 숫자가 아니면 버린다.
				System.out.println("숫자를 입력바랍니다.");
			}else{				
			int sac = scan.nextInt();
			return sac;
			}
		}
	}
	
	
	
	
}
	
	
