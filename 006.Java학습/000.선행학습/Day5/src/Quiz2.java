import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 행 : ");
		int num = scan.nextInt();
		
		
		for(int i = 1; i <= num ; i++) { // 전체적 포문
			
			for(int z=1; z <= num ; z++) { // 공백찍는 포문
				num -= z;
				System.out.print(" ");
			}
			
			for(int j = num ; j == num ; j++) { // 별을 계속 반복출력
				System.out.print("*");
			}
			// System.out.print();
		}
		
			

	}

}
