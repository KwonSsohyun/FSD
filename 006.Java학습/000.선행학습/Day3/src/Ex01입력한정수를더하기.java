import java.util.Scanner;

public class Ex01입력한정수를더하기 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in); // 기본 위치에 없어서 import한다. Scanner에 마우스 대면 뜬다.
		// 데이터타입 같은 형태로 한다.(Scanner 클래스타입) 변수로 담는 이뉴는 new를 가르킨다.
		// 참조형은 번지를 가진다.
		
		System.out.print("첫 번째 정수 : "); // 자바점 랭에 기본위치에 들어있으니 import 안함.
		int num1 = key.nextInt(); // 접근을해서 계속 담아두고 쓰려고 변수로 담아둔다.
		
		System.out.print("두 번째 정수 : "); 
		int num2 = key.nextInt();
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2); // 문자열을 출력할때 씀 >> printf
	}
}
