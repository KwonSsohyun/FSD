import java.util.Scanner;

public class Ex08Char입력 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 입력할 수 있게 해주려고 new를 쓰는것임. next() 메모리에 올리려고
		// ★★★ Scanner 쓰고 ▶▶ "ctrl + space바" 누르면 어디 위치에 있는 클래스인지 나온다. 확인하고 엔터! 하면 import 나옴!
		
		char ch = scan.next().charAt(0); // charAt(0) 0번째 첫글자 뜯어옴 
		
		System.out.println("입력한 글자 : " + ch); // 입력한 글자를 막 적어도 첫글자만 따온다.
	}
}
