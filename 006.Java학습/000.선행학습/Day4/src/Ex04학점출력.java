import java.util.Scanner;

public class Ex04학점출력 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수채점 : ");
		int score = scan.nextInt();
		
		if(score >= 90 && score <= 100)
			System.out.println("A학점");
		
		else if(score >= 80)
			System.out.println("B학점");
		
		else if(score >= 70)
			System.out.println("C학점");
		
		else if(score >= 60)
			System.out.println("D학점");
		
		else if(score >= 0 && score < 60)
			System.out.println("F학점");
		
		
		
	}
}
