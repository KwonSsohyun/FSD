import java.util.Scanner;

public class Ex06학점출력 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요. : ");
		int score = scan.nextInt();
		
		switch (score/10) { // ▶ /10 나누기 ▶ 둘다 int 정수이기 때문에 결과는 소숫점이 아닌 정수가 나온다. 97÷10 = 9
		// 이렇게 나누는 이유는 97점이건, 95점이건 9점으로 포함이 되기때문
		    case 10 : // 100점은 9점으로 자연스럽게 포함되게하려고, break를 안쓴다. 그래야 다음에 포함되니까
			case 9 : 
				System.out.println("A학점");
				break;
				
			case 8 :
				System.out.println("B학점");
				break;
				
			case 7 :
				System.out.println("B학점");
				break;
				
			case 6 :
				System.out.println("B학점");
				break;
				
			default :
				System.out.println("F학점");
				break;
				
		
		}
		
		
	}
}
