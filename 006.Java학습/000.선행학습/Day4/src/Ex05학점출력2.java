import java.util.Scanner;

public class Ex05학점출력2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요. : ");
		int score = scan.nextInt();
		
		char grade = ' ', opt = '0';
		if (score >= 90) {
			grade = 'A';
			
			if(score >= 95) 
				opt = '+';
			else
				opt = '-';
		}
		
		else if( score >= 80 ) {
			grade = 'B';
			
			if(score >= 85)
				opt = '+';
			else
				opt = '-';
			
		}
		
		else 
			grade = 'C';
			
	}
}
