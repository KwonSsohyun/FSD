import java.util.Scanner;

public class Ex03입력함수 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in); // nextLine(), nextlnt(), nextDouble() 호출해서 쓰려고
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		System.out.print("문자열 입력 : ");
		String str = scan.nextLine();
		
		System.out.println(num);
		System.out.println(str);
	}
}
