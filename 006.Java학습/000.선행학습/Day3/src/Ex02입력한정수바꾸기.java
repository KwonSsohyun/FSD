import java.util.Scanner;

public class Ex02입력한정수바꾸기 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // ctrl +shift + O >> 단축키 그럼 import 바로 나옴!
		
		System.out.print("첫번째 정수 : ");
		int num1 = input.nextInt(); // 변수에 정수를 담을거니까 데이터타입을 int로 하고 지은 이름 num1
		// 위에 지은 변수명 input쓰고, nextInt() >> 키보드로부터 정수를 입력받아라
		
		System.out.print("두번째 정수 : ");
		int num2 = input.nextInt(); 
 		
		System.out.println("첫 번째 정수 : "+num1);
		System.out.println("두 번째 정수 : "+num2);
		
		// 두 정수의 값을 맞바꾸는 곳
		int tmp = num1; // 백업
		num1 = num2;
		num2 = tmp;
		
		System.out.println("첫 번째 정수 : "+num1);
		System.out.println("두 번째 정수 : "+num2);
		
	}
}
