import java.util.Scanner;

public class Ex01조건삼항연산자 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = scan.nextInt();
		
		// int max = num1 > num2 ? num1 : num2; >> 삼항연산자
		
		int max;
		if(num1 > num2) max = num1;
		else max = num2;
		
		System.out.println("큰 수 : " + max);

	}

}
