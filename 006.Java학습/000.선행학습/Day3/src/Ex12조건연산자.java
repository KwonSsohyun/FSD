import java.util.Scanner;

public class Ex12조건연산자 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = scan.nextInt(); // nextInt() 정수를 입력받는 함수
		
		System.out.print("두 번째 정수 : ");
		int num2 = scan.nextInt();
		
		int max = num1 > num2 ? num1 : num2; // num1이 num2보다 크냐? ▶ 크면 num1(true) / 안크면 num2(false)
		// max는 항상 큰 수만 출력하게 된다.
		
		System.out.println(num1 + "과" + num2 + "중 큰 수는" + max + "입니다.");
	}
}
