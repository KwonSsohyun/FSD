import java.util.Scanner;

public class Ex09소문자 {
	public static void main(String[] agrs)	{
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("알파벳 한개 입력 : ");
		char ch = scan.next().charAt(0);
		
		// System.out.printf("입력한 글자 : %d\n", (int)ch); // (int) 강제형변환
		System.out.println(ch >= 'a' && ch <= 'z');
	}
}
