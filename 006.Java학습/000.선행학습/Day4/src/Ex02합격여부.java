import java.util.Scanner;

public class Ex02합격여부 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요. : ");
		int score = scan.nextInt();
		
		if(score >= 60)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격입니다.");
	}
}
