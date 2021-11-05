import java.util.Scanner;

public class Ex03무한루프중지 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 와일문밖에 한 이유는 인스턴스를 무한정생성할게 아니라 하나만 생성하면 되기 때문
		// 스캐너라는 클래스를 메모리를 한번만 생성했다. 
		
		String exit = "a";
		
		while(!exit.equals("q")) { // q가 아니면 돌아라. q를 입력하면 종료됨 (트루면 계속 돌고, 거짓이면 와일안들어옴)
			System.out.print("알파벳 한개 입력하세요. : "); 
			// System.out.print("test....\n"); 입력하면 계속 도니까 아래 빨간색 박스 눌러서 멈춰준다.
			// println이 아니기때문에 \n써서 개행해줌 
			
			exit = scan.nextLine();
		}
		System.out.println("프로그램 종료.");
	}
}
