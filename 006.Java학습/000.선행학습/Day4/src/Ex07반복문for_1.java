import java.util.Scanner;

public class Ex07반복문for_1 {

	public static void main(String[] args) {
		// 정수를 입력받아, 그 정수만큼 "*"반복 출력.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자입력 : ");
		int num = scan.nextInt();
		
		for(int i = 1 ; i <= num ; i++) // int i ▶ for문안에서만 쓰는 변수
			System.out.print("*");
	}

}
