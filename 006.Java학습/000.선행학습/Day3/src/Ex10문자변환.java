import java.util.Scanner;

public class Ex10문자변환 {
	public static void main(String[] args)	{
		Scanner scan = new Scanner(System.in); // (System.in) ▶ 표준입력장치이다.(키보드) 아래서 nextLine() 입력이 있기 때문 ex)바코드찍는것
		                                       // new ▶ 메모리 할당연산자이다. 입력할 수 있게 해주려고 new를 쓰는것임. 
                                               // 뭘 쓸진 몰라도 메모리에 올려야 하기 때문에 new를 쓴다.	
											   // Scanner 랭lang(기본)에 없기 때문에 상단에 import를 쓴다.
		
		System.out.print("문자열 입력 : ");
		String str = scan.nextLine(); // nextLine() 한줄입력 ｜ next() 여러줄 ｜ nextInt() 정수를 입력받는 함수
		
		str = str.toUpperCase(); // toUpperCase() 대문자 입력 (대문자입력처럼 변환하는건 : 메모리번지가 바뀌기 떄문에 다시 변수를 선언해줘야함) >> str = 이렇게
		System.out.print(str);
	}
}
