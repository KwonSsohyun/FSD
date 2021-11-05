import java.util.Scanner;

public class Ex03홀짝판단 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scan변수는 참조형임!
		
		System.out.println("홀짝판단 : ");
		int num = scan.nextInt(); 
		
		if(num%2 == 0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");

	}

}
