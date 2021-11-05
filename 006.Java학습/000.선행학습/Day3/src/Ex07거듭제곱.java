import java.util.Scanner;

// 한개의 정수를 입력받아, 거듭제곱을 계산 및 출력.
// Math.pow()
public class Ex07거듭제곱 {
	public static void main(String[] args)	{
		Scanner scan = new Scanner(System.in); // ctrl +shift + O >> 단축키 그럼 import 바로 나옴!
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		int result = (int)Math.pow(num, 2); // 입력받은 2승을 줘라 
		// 강제적으로 (int) 강제형변환한다. 같은 int형이라는 것. (캐스팅)
		// 캐스팅은 강제성을 띈다. 의미적으로 길거리캐스팅처럼 나는 의지가 없는데 데려가는것 서로 의지가 있고 하자 하는건 프로모션
		System.out.println(num + "의 제곱 = " + result);
		
		
	}
}
